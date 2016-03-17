/**
 */
package com.ifpen.school.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

import com.ifpen.school.MClassGroup;
import com.ifpen.school.MClassLevel;
import com.ifpen.school.MNewEClass7;
import com.ifpen.school.MRoom;
import com.ifpen.school.MSchoolPackage;
import com.ifpen.school.MSchoolYear;
import com.ifpen.school.MStudent;
import com.ifpen.school.MTeacher;
import com.ifpen.school.Mstore;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see com.ifpen.school.MSchoolPackage
 * @generated
 */
public class SchoolSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MSchoolPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchoolSwitch() {
		if (modelPackage == null) {
			modelPackage = MSchoolPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MSchoolPackage.CLASS_GROUP: {
				MClassGroup classGroup = (MClassGroup)theEObject;
				T1 result = caseClassGroup(classGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MSchoolPackage.STUDENT: {
				MStudent student = (MStudent)theEObject;
				T1 result = caseStudent(student);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MSchoolPackage.CLASS_LEVEL: {
				MClassLevel classLevel = (MClassLevel)theEObject;
				T1 result = caseClassLevel(classLevel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MSchoolPackage.TEACHER: {
				MTeacher teacher = (MTeacher)theEObject;
				T1 result = caseTeacher(teacher);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MSchoolPackage.SCHOOL_YEAR: {
				MSchoolYear schoolYear = (MSchoolYear)theEObject;
				T1 result = caseSchoolYear(schoolYear);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MSchoolPackage.ROOM: {
				MRoom room = (MRoom)theEObject;
				T1 result = caseRoom(room);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MSchoolPackage.NEW_ECLASS7: {
				MNewEClass7 newEClass7 = (MNewEClass7)theEObject;
				T1 result = caseNewEClass7(newEClass7);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MSchoolPackage.STORE: {
				Mstore<?> store = (Mstore<?>)theEObject;
				T1 result = casestore(store);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseClassGroup(MClassGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Student</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Student</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStudent(MStudent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Level</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Level</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseClassLevel(MClassLevel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Teacher</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Teacher</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTeacher(MTeacher object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Year</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Year</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSchoolYear(MSchoolYear object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Room</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Room</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRoom(MRoom object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New EClass7</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New EClass7</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseNewEClass7(MNewEClass7 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>store</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>store</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends MRoom> T1 casestore(Mstore<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //SchoolSwitch
