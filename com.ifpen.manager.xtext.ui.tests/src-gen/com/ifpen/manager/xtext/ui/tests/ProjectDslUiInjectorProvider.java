/*
 * generated by Xtext 2.9.2
 */
package com.ifpen.manager.xtext.ui.tests;

import com.google.inject.Injector;
import com.ifpen.manager.xtext.ui.internal.XtextActivator;
import org.eclipse.xtext.junit4.IInjectorProvider;

public class ProjectDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return XtextActivator.getInstance().getInjector("com.ifpen.manager.xtext.ProjectDsl");
	}

}
