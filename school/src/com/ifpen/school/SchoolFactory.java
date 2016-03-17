package com.ifpen.school;

import com.ifpen.school.impl.SchoolFactoryImpl;

/** This factory  overrides the generated factory and returns the new generated interfaces */
public interface SchoolFactory extends MSchoolFactory 
{
	
	/** Specialize the eINSTANCE initialization with the new interface type 
	  * (overridden in the override_factory extension)
	*/
	SchoolFactory eINSTANCE = SchoolFactoryImpl.init();
				
	public ClassGroup createClassGroup();
	public Student createStudent();
	public ClassLevel createClassLevel();
	public Teacher createTeacher();
	public SchoolYear createSchoolYear();
	public Room createRoom();
	public NewEClass7 createNewEClass7();
	public store createstore();
}
