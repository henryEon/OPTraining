

/**
 */
package com.ifpen.school;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.ifpen.school.Mstore#getLastIn <em>Last In</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.ifpen.school.MSchoolPackage#getstore()
 * @model
 * @generated
 */
public interface Mstore<T extends MRoom> extends EObject {
	/**
	 * Returns the value of the '<em><b>Last In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last In</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last In</em>' attribute.
	 * @see #setLastIn(MRoom)
	 * @see com.ifpen.school.MSchoolPackage#getstore_LastIn()
	 * @model
	 * @generated
	 */
	T getLastIn();

	/**
	 * Sets the value of the '{@link com.ifpen.school.Mstore#getLastIn <em>Last In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last In</em>' attribute.
	 * @see #getLastIn()
	 * @generated
	 */
	void setLastIn(T value);

} // Mstore
