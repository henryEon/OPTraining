/**
 */
package com.ifpen.school.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.ifpen.school.MSchoolPackage
 * @generated
 */
public class SchoolAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MSchoolPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchoolAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MSchoolPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchoolSwitch<Adapter> modelSwitch =
		new SchoolSwitch<Adapter>() {
			@Override
			public Adapter caseClassGroup(MClassGroup object) {
				return createClassGroupAdapter();
			}
			@Override
			public Adapter caseStudent(MStudent object) {
				return createStudentAdapter();
			}
			@Override
			public Adapter caseClassLevel(MClassLevel object) {
				return createClassLevelAdapter();
			}
			@Override
			public Adapter caseTeacher(MTeacher object) {
				return createTeacherAdapter();
			}
			@Override
			public Adapter caseSchoolYear(MSchoolYear object) {
				return createSchoolYearAdapter();
			}
			@Override
			public Adapter caseRoom(MRoom object) {
				return createRoomAdapter();
			}
			@Override
			public Adapter caseNewEClass7(MNewEClass7 object) {
				return createNewEClass7Adapter();
			}
			@Override
			public <T extends MRoom> Adapter casestore(Mstore<T> object) {
				return createstoreAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link com.ifpen.school.MClassGroup <em>Class Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ifpen.school.MClassGroup
	 * @generated
	 */
	public Adapter createClassGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ifpen.school.MStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ifpen.school.MStudent
	 * @generated
	 */
	public Adapter createStudentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ifpen.school.MClassLevel <em>Class Level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ifpen.school.MClassLevel
	 * @generated
	 */
	public Adapter createClassLevelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ifpen.school.MTeacher <em>Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ifpen.school.MTeacher
	 * @generated
	 */
	public Adapter createTeacherAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ifpen.school.MSchoolYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ifpen.school.MSchoolYear
	 * @generated
	 */
	public Adapter createSchoolYearAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ifpen.school.MRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ifpen.school.MRoom
	 * @generated
	 */
	public Adapter createRoomAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ifpen.school.MNewEClass7 <em>New EClass7</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ifpen.school.MNewEClass7
	 * @generated
	 */
	public Adapter createNewEClass7Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.ifpen.school.Mstore <em>store</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.ifpen.school.Mstore
	 * @generated
	 */
	public Adapter createstoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SchoolAdapterFactory
