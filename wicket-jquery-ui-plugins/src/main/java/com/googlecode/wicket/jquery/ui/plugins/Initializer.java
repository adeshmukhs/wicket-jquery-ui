/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.googlecode.wicket.jquery.ui.plugins;

import org.apache.wicket.Application;
import org.apache.wicket.IInitializer;
import org.apache.wicket.markup.html.IPackageResourceGuard;
import org.apache.wicket.markup.html.SecurePackageResourceGuard;
import org.apache.wicket.markup.html.SecurePackageResourceGuard.SearchPattern;

/**
 * Provides the {@link IInitializer} for this module
 *
 * @author Sebastien Briquet - sebfz1
 */
public class Initializer implements IInitializer
{
	@Override
	public void init(Application application)
	{
		// Wysiwyg Plugin //
		IPackageResourceGuard packageResourceGuard = application.getResourceSettings().getPackageResourceGuard();

		if (packageResourceGuard instanceof SecurePackageResourceGuard)
		{
			SecurePackageResourceGuard guard = (SecurePackageResourceGuard) packageResourceGuard;

			if (!guard.getPattern().contains(new SearchPattern("+*.eot")))
			{
				guard.addPattern("+*.eot");
				guard.addPattern("+*.woff");
				guard.addPattern("+*.ttf");
			}
		}
	}

	@Override
	public void destroy(Application application)
	{
		// noop
	}

	@Override
	public String toString()
	{
		return "Wicket extensions initializer (wicket-jquery-ui-plugins)";
	}
}
