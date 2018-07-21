/*
 * Copyright (C) 2017 Marc Magon
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
package com.jwebmp.plugins.jqueryui.themes;

import com.jwebmp.core.base.references.CSSReference;
import com.jwebmp.core.htmlbuilder.css.themes.Theme;

/**
 * Implements the UI Darkness Theme
 *
 * @author MMagon
 * @version 1.0
 * @since 2014/07/05
 */
class VaderThemeNestable
		extends Theme
{

	public VaderThemeNestable()
	{
		super("Vader", "uivader", "css/theming/images/theme_30_vader.png", "", "css/theming/images/theme_90_vader.png");
		getCssReferences().add(
				new CSSReference("vaderTheme", 1.114, "css/theming/ui_vader_theme.css", "https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.4/themes/vader/jquery-ui.css"));
	}

}