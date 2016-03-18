/*
 * generated by Xtext 2.9.2
 */
package com.ifpen.manager.xtext.tests

import com.google.inject.Inject
import com.ifpen.manager.xtext.projectDsl.Company
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(XtextRunner)
@InjectWith(ProjectDslInjectorProvider)
class ProjectDslParsingTest{

	@Inject
	ParseHelper<Company> parseHelper;

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}
