/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.wicket.jquery.ui.calendar.settings;

import org.apache.wicket.request.resource.ResourceReference;
import org.apache.wicket.settings.IJavaScriptLibrarySettings;

/**
 * Provides library settings for fullcalendar resource references<br/>
 * <br/>
 * Usage:
 * <pre><code>
 * public class MyApplication extends WebApplication
 * {
 * 	public void init()
 * 	{
 * 		super.init();
 *
 * 		this.getMarkupSettings().setStripWicketTags(true);
 * 		this.setJavaScriptLibrarySettings(new MyJQueryLibrarySettings());
 * 	}
 *
 * 	static class MyJQueryLibrarySettings extends JQueryLibrarySettings implements ICalendarLibrarySettings
 * 	{
 * 		private static ResourceReference STYLESHEET_RR = new CssResourceReference(...);
 * 		private static ResourceReference JAVASCRIPT_RR = new JavaScriptResourceReference(...);
 *
 * 		public ResourceReference getCalendarStyleSheetReference()
 * 		{
 * 			return STYLESHEET_RR;
 * 		}
 *
 * 		public ResourceReference getCalendarJavaScriptReference()
 * 		{
 * 			return JAVASCRIPT_RR;
 * 		}
 *
 * 		public ResourceReference getGCalJavaScriptReference()
 * 		{
 * 			return null; //loads default (embedded) gcal.js
 * 		}
 * 	}
 * }
 * </code></pre>
 *
 * @author Sebastien Briquet - sebfz1
 *
 */
public interface ICalendarLibrarySettings extends IJavaScriptLibrarySettings
{
	/**
	 * Gets the fullcalendar's stylesheet resource reference
	 *
	 * @return the {@link ResourceReference}
	 */
	ResourceReference getCalendarStyleSheetReference();

	/**
	 * Gets the fullcalendar's javascript resource reference
	 *
	 * @return the {@link ResourceReference}
	 */
	ResourceReference getCalendarJavaScriptReference();

	/**
	 * Gets the fullcalendar's javascript resource reference
	 *
	 * @return the {@link ResourceReference}
	 */
	ResourceReference getGCalJavaScriptReference();
}
