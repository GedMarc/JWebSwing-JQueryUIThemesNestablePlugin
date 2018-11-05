package com.jwebmp.plugins.jqueryui.themesnested.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class JQueryUINestableThemesExclusionsModule
		implements IGuiceScanModuleExclusions<JQueryUINestableThemesExclusionsModule>,
				           IGuiceScanJarExclusions<JQueryUINestableThemesExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-jquery-ui-themes-nestable-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.jqueryui.themes.nestable");
		return strings;
	}
}
