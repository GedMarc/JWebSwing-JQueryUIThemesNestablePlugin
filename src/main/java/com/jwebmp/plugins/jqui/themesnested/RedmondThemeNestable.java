/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.jwebmp.plugins.jqui.themesnested;

import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.htmlbuilder.css.themes.Theme;

/**
 * The Dark Hive theme to JQuery UI
 *
 * @author MMagon
 * @since 2012/02/04
 */
class RedmondThemeNestable
		extends Theme
{

	public RedmondThemeNestable()
	{
		super("Redmond", "uiredmond", "css/theming/images/theme_30_redmond.png", "", "css/theming/images/theme_90_redmond.png");
		getCssReferences().add(
				new CSSReference("redmondTheme", 1.114, "css/theming/ui_redmond_theme.css", "https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/redmond/jquery-ui.css"));

	}

}
