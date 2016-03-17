

/**
 */
package com.ifpen.school;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ifpen.school.MClassGroup#getEleves <em>Eleves</em>}</li>
 *   <li>{@link com.ifpen.school.MClassGroup#getProf <em>Prof</em>}</li>
 *   <li>{@link com.ifpen.school.MClassGroup#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link com.ifpen.school.MClassGroup#getSalle <em>Salle</em>}</li>
 *   <li>{@link com.ifpen.school.MClassGroup#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ifpen.school.MSchoolPackage#getClassGroup()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='checkName checkChose'"
 * @generated
 */
public interface MClassGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Eleves</b></em>' reference list.

	 
	 * The list contents are of type {@link com.ifpen.school.MStudent}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eleves</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eleves</em>' reference list.
	 * @see com.ifpen.school.MSchoolPackage#getClassGroup_Eleves()
	 * @model
	 * @generated
	 */
	EList<Student> getEleves();

	/**
	 * Returns the value of the '<em><b>Prof</b></em>' reference list.

	 
	 * The list contents are of type {@link com.ifpen.school.MTeacher}. 
	
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prof</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prof</em>' reference list.
	 * @see com.ifpen.school.MSchoolPackage#getClassGroup_Prof()
	 * @model
	 * @generated
	 */
	EList<Teacher> getProf();

	/**
	 * Returns the value of the '<em><b>Niveau</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Niveau</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Niveau</em>' reference.
	 * @see #setNiveau(MClassLevel)
	 * @see com.ifpen.school.MSchoolPackage#getClassGroup_Niveau()
	 * @model required="true"
	 * @generated
	 */
	ClassLevel getNiveau();

	/**
	 * Sets the value of the '{@link com.ifpen.school.MClassGroup#getNiveau <em>Niveau</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Niveau</em>' reference.
	 * @see #getNiveau()
	 * @generated
	 */
	void setNiveau(ClassLevel value);

	/**
	 * Returns the value of the '<em><b>Salle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salle</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salle</em>' reference.
	 * @see #setSalle(MRoom)
	 * @see com.ifpen.school.MSchoolPackage#getClassGroup_Salle()
	 * @model
	 * @generated
	 */
	Room getSalle();

	/**
	 * Sets the value of the '{@link com.ifpen.school.MClassGroup#getSalle <em>Salle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salle</em>' reference.
	 * @see #getSalle()
	 * @generated
	 */
	void setSalle(Room value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.ifpen.school.MSchoolPackage#getClassGroup_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.ifpen.school.MClassGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // MClassGroup
