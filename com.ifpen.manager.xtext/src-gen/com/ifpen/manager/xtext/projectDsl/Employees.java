/**
 * generated by Xtext 2.9.2
 */
package com.ifpen.manager.xtext.projectDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Employees</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ifpen.manager.xtext.projectDsl.Employees#getEmployees <em>Employees</em>}</li>
 * </ul>
 *
 * @see com.ifpen.manager.xtext.projectDsl.ProjectDslPackage#getEmployees()
 * @model
 * @generated
 */
public interface Employees extends EObject
{
  /**
   * Returns the value of the '<em><b>Employees</b></em>' containment reference list.
   * The list contents are of type {@link com.ifpen.manager.xtext.projectDsl.Employee}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Employees</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Employees</em>' containment reference list.
   * @see com.ifpen.manager.xtext.projectDsl.ProjectDslPackage#getEmployees_Employees()
   * @model containment="true"
   * @generated
   */
  EList<Employee> getEmployees();

} // Employees
