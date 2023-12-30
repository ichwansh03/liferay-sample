<%@ include file="../init.jsp" %>

<portlet:renderURL var="addEntryURL">
    <portlet:param name="mvcPath" value="/edit_entry.jsp"></portlet:param>
</portlet:renderURL>

<p>
	<b><liferay-ui:message key="guestbook.caption"/></b>
</p>

<jsp:useBean id="entries" class="java.util.ArrayList" scope="request"/>

<liferay-ui:search-container>
    <liferay-ui:search-container-results results="<%= entries %>" />

    <liferay-ui:search-container-row
        className="com.liferay.docs.guestbook.model.Entry"
        modelVar="entry">

        <liferay-ui:search-container-column-text property="name" />

        <liferay-ui:search-container-column-text property="email" />

        <liferay-ui:search-container-column-text property="age" />

        <liferay-ui:search-container-column-text property="address" />

    </liferay-ui:search-container-row>

    <liferay-ui:search-iterator />
</liferay-ui:search-container>

<aui:button-row>
    <aui:button onClick="<%= addEntryURL.toString() %>" value="Add Entry"></aui:button>
</aui:button-row>