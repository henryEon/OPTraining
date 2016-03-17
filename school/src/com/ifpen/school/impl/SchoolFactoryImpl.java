package com.ifpen.school.impl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.ifpen.school.ClassGroup;
import com.ifpen.school.Student;
import com.ifpen.school.ClassLevel;
import com.ifpen.school.Teacher;
import com.ifpen.school.SchoolYear;
import com.ifpen.school.Room;
import com.ifpen.school.NewEClass7;
import com.ifpen.school.store;
import com.ifpen.school.SchoolFactory;


// This factory  overrides the generated factory and returns the new generated interfaces
public class SchoolFactoryImpl extends MSchoolFactoryImpl implements SchoolFactory
{
	
	public static SchoolFactory init() {
		
		try {
			Object fact = MSchoolFactoryImpl.init();
			if ((fact != null) && (fact instanceof SchoolFactory))
					return (SchoolFactory) fact;
			}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SchoolFactoryImpl(); 
		 }
	
	public ClassGroup createClassGroup()
	{
		ClassGroup result = new ClassGroupImpl();
		return result;
	}
	public Student createStudent()
	{
		Student result = new StudentImpl();
		return result;
	}
	public ClassLevel createClassLevel()
	{
		ClassLevel result = new ClassLevelImpl();
		return result;
	}
	public Teacher createTeacher()
	{
		Teacher result = new TeacherImpl();
		return result;
	}
	public SchoolYear createSchoolYear()
	{
		SchoolYear result = new SchoolYearImpl();
		return result;
	}
	public Room createRoom()
	{
		Room result = new RoomImpl();
		return result;
	}
	public NewEClass7 createNewEClass7()
	{
		NewEClass7 result = new NewEClass7Impl();
		return result;
	}
	public store createstore()
	{
		store result = new storeImpl();
		return result;
	}
}
