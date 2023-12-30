package com.liferay.docs.guestbook.portlet.portlet;

import com.liferay.docs.guestbook.model.Entry;
import com.liferay.docs.guestbook.portlet.constants.GuestbookPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;

import com.liferay.portal.kernel.util.ParamUtil;
import org.osgi.service.component.annotations.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author CodeAcademy
 */
@Component(
	property = {
		"com.liferay.portlet.display-category=category.bootcamp",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Guestbook",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + GuestbookPortletKeys.GUESTBOOK,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class GuestbookPortlet extends MVCPortlet {

	public void addEntry(ActionRequest request, ActionResponse response){
		try {
			PortletPreferences prefs = request.getPreferences();
			String[] guestbookEntries = prefs.getValues("guestbook-entries", new String[3]);
			ArrayList<String> entries = new ArrayList<>();

			if (guestbookEntries[0] != null) {
				entries = new ArrayList<>(Arrays.asList(prefs.getValues("guestbook-entries", new String[3])));
			}

			String userName = ParamUtil.getString(request, "name");
			String email = ParamUtil.getString(request, "email");
			String age = ParamUtil.getString(request, "age");
			String address = ParamUtil.getString(request, "address");
			String entry = userName + " ^ " + email + " ^ " + age + " ^ " + address;

			entries.add(entry);

			String[] array = entries.toArray(new String[entries.size()]);
			prefs.setValues("guestbook-entries", array);

			try {
				prefs.store();
			} catch (ValidatorException | IOException e) {
				Logger.getLogger(GuestbookPortlet.class.getName()).log(
						Level.SEVERE, null, e);
            }
        } catch (ReadOnlyException e) {
			Logger.getLogger(GuestbookPortlet.class.getName()).log(
					Level.SEVERE, null, e);
        }
    }

	private List<Entry> parseEntries(String[] guestbookEntries){
		List<Entry> entries = new ArrayList<>();

		for (String entry : guestbookEntries) {
			String[] parts = entry.split("\\^",4);
			Entry gbEntry = new Entry(parts[0], parts[1], parts[2], parts[3]);
			entries.add(gbEntry);
		}

		return entries;
	}

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

		PortletPreferences prefs = renderRequest.getPreferences();
		String[] guestbookEntries = prefs.getValues("guestbook-entries", new String[3]);

		if (guestbookEntries[0] != null) {
			List<Entry> entries = parseEntries(guestbookEntries);
			renderRequest.setAttribute("entries", entries);
		}

		super.render(renderRequest, renderResponse);
	}
}