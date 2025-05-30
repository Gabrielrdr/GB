package com.liferay.h7g5.web.internal.portlet;

import com.liferay.h7g5.service.H7G5EntryService;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.GenericPortlet;
import javax.portlet.Portlet;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(property = {
		"com.liferay.portlet.display-category=category.sample",
		"javax.portlet.display-name=H7G5"
}, service = Portlet.class)
public class H7G5Portlet extends GenericPortlet {

	public H7G5Portlet() {
		System.out.println("Constructing H7G5Portlet");
	}

	@Override
	protected void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException {

		System.out.println("Invoking H7G5Portlet#doView");

		PrintWriter printWriter = renderResponse.getWriter();

		printWriter.println("Hello, H7G5!");

		System.out.println(
				"There are " + _EntryService.getH7G5EntriesCount() +
						" entries.");

		int count = _EntryService.getH7G5EntriesCount();
		printWriter.println("<p>Total Entries: " + count + "</p>");


		// A buttom to create a new entry. That makes more sense than add a new entry just refreshing the page.

		String actionURL = renderResponse.createActionURL().toString();

		printWriter.println("<form method='post' action='" + actionURL + "'>");
		printWriter.println("<input type='submit' value='Create new entry' />");
		printWriter.println("</form>");

		System.out.println(
				"After adding a new entry, there are now " +
						_EntryService.getH7G5EntriesCount() + " entries.");
	}

	
	public void processAction(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException {
		System.out.println("Invoking H7G5Portlet#processAction");
		_EntryService.addMyCustomH7G5Entry(
				com.liferay.portal.kernel.util.StringUtil.randomString(),
				com.liferay.portal.kernel.util.StringUtil.randomString());
	}

	@Reference
	private H7G5EntryService _EntryService;
}