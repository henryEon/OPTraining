/*
 * generated by Xtext 2.9.2
 */
package com.ifpen.manager.xtext.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractProjectDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(com.ifpen.manager.xtext.projectDsl.ProjectDslPackage.eINSTANCE);
		return result;
	}
	
}
