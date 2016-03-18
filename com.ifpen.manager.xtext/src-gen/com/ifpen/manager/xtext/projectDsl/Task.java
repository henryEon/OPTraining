/**
 * generated by Xtext 2.9.2
 */
package com.ifpen.manager.xtext.projectDsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.ifpen.manager.xtext.projectDsl.Task#getName <em>Name</em>}</li>
 *   <li>{@link com.ifpen.manager.xtext.projectDsl.Task#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see com.ifpen.manager.xtext.projectDsl.ProjectDslPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.ifpen.manager.xtext.projectDsl.ProjectDslPackage#getTask_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.ifpen.manager.xtext.projectDsl.Task#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link com.ifpen.manager.xtext.projectDsl.taskType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see com.ifpen.manager.xtext.projectDsl.taskType
   * @see #setType(taskType)
   * @see com.ifpen.manager.xtext.projectDsl.ProjectDslPackage#getTask_Type()
   * @model
   * @generated
   */
  taskType getType();

  /**
   * Sets the value of the '{@link com.ifpen.manager.xtext.projectDsl.Task#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see com.ifpen.manager.xtext.projectDsl.taskType
   * @see #getType()
   * @generated
   */
  void setType(taskType value);

} // Task