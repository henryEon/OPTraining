/**
 */
package com.ifpen.school;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.ifpen.school.MSchoolPackage
 * @generated
 */
public interface MSchoolFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MSchoolFactory eINSTANCE = com.ifpen.school.impl.MSchoolFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Class Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Group</em>'.
	 * @generated
	 */
	MClassGroup createClassGroup();

	/**
	 * Returns a new object of class '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Student</em>'.
	 * @generated
	 */
	MStudent createStudent();

	/**
	 * Returns a new object of class '<em>Class Level</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Level</em>'.
	 * @generated
	 */
	MClassLevel createClassLevel();

	/**
	 * Returns a new object of class '<em>Teacher</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Teacher</em>'.
	 * @generated
	 */
	MTeacher createTeacher();

	/**
	 * Returns a new object of class '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Year</em>'.
	 * @generated
	 */
	MSchoolYear createSchoolYear();

	/**
	 * Returns a new object of class '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room</em>'.
	 * @generated
	 */
	MRoom createRoom();

	/**
	 * Returns a new object of class '<em>New EClass7</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New EClass7</em>'.
	 * @generated
	 */
	MNewEClass7 createNewEClass7();

	/**
	 * Returns a new object of class '<em>store</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>store</em>'.
	 * @generated
	 */
	<T extends MRoom> Mstore<T> createstore();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MSchoolPackage getSchoolPackage();

} //MSchoolFactory
