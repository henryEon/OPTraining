

/**
 */
package com.ifpen.school;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ifpen.school.MSchoolYear#getEcole <em>Ecole</em>}</li>
 *   <li>{@link com.ifpen.school.MSchoolYear#getEleves <em>Eleves</em>}</li>
 *   <li>{@link com.ifpen.school.MSchoolYear#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link com.ifpen.school.MSchoolYear#getYear <em>Year</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ifpen.school.MSchoolPackage#getSchoolYear()
 * @model
 * @generated
 */
public interface MSchoolYear extends EObject {
	/**
	 * Returns the value of the '<em><b>Ecole</b></em>' containment reference list.

	 
	 * The list contents are of type {@link com.ifpen.school.MClassGroup}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ecole</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ecole</em>' containment reference list.
	 * @see com.ifpen.school.MSchoolPackage#getSchoolYear_Ecole()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassGroup> getEcole();

	/**
	 * Returns the value of the '<em><b>Eleves</b></em>' containment reference list.

	 
	 * The list contents are of type {@link com.ifpen.school.MStudent}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eleves</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eleves</em>' containment reference list.
	 * @see com.ifpen.school.MSchoolPackage#getSchoolYear_Eleves()
	 * @model containment="true"
	 * @generated
	 */
	EList<Student> getEleves();

	/**
	 * Returns the value of the '<em><b>Niveau</b></em>' containment reference list.

	 
	 * The list contents are of type {@link com.ifpen.school.MClassLevel}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau</em>' containment reference list.
	 * @see com.ifpen.school.MSchoolPackage#getSchoolYear_Niveau()
	 * @model containment="true"
	 * @generated
	 */
	EList<ClassLevel> getNiveau();

	/**
	 * Returns the value of the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Year</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' attribute.
	 * @see #setYear(Date)
	 * @see com.ifpen.school.MSchoolPackage#getSchoolYear_Year()
	 * @model
	 * @generated
	 */
	Date getYear();

	/**
	 * Sets the value of the '{@link com.ifpen.school.MSchoolYear#getYear <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Year</em>' attribute.
	 * @see #getYear()
	 * @generated
	 */
	void setYear(Date value);

} // MSchoolYear
