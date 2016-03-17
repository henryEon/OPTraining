package com.ifpen.school.gen.tests;

import java.io.File;
import java.io.IOException;
import java.util.Collections;

import org.eclipse.emf.common.util.BasicMonitor;
import org.junit.Before;
import org.junit.Test;

import com.ifpen.school.ClassGroup;
import com.ifpen.school.SchoolFactory;
import com.ifpen.school.SchoolYear;
import com.ifpen.school.gen.main.Generate;

public class TestGenHtml {
	
	private SchoolYear school;

	@Before
	public void setUp() throws Exception {
		SchoolFactory sf = SchoolFactory.eINSTANCE;
		school = sf.createSchoolYear();
		
//		ClassGroup cl = sf.createClassGroup();
		
	}

	@Test
	public void test() {
		Generate gen;
		
		try {
			gen = new Generate(school, new File("c:/tmp"), Collections.emptyList());
			gen.doGenerate(new BasicMonitor());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
