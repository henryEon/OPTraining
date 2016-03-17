/**
 */
package com.ifpen.school.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.ifpen.school.MClassGroup;
import com.ifpen.school.MClassLevel;
import com.ifpen.school.MNewEClass7;
import com.ifpen.school.MRoom;
import com.ifpen.school.MSchoolFactory;
import com.ifpen.school.MSchoolPackage;
import com.ifpen.school.MSchoolYear;
import com.ifpen.school.MStudent;
import com.ifpen.school.MTeacher;
import com.ifpen.school.Mstore;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MSchoolFactoryImpl extends EFactoryImpl implements MSchoolFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MSchoolFactory init() {
		try {
			MSchoolFactory theSchoolFactory = (MSchoolFactory)EPackage.Registry.INSTANCE.getEFactory(MSchoolPackage.eNS_URI);
			if (theSchoolFactory != null) {
				return theSchoolFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MSchoolFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSchoolFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MSchoolPackage.CLASS_GROUP: return createClassGroup();
			case MSchoolPackage.STUDENT: return createStudent();
			case MSchoolPackage.CLASS_LEVEL: return createClassLevel();
			case MSchoolPackage.TEACHER: return createTeacher();
			case MSchoolPackage.SCHOOL_YEAR: return createSchoolYear();
			case MSchoolPackage.ROOM: return createRoom();
			case MSchoolPackage.NEW_ECLASS7: return createNewEClass7();
			case MSchoolPackage.STORE: return createstore();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MClassGroup createClassGroup() {
		MClassGroupImpl classGroup = new MClassGroupImpl();
		return classGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MStudent createStudent() {
		MStudentImpl student = new MStudentImpl();
		return student;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MClassLevel createClassLevel() {
		MClassLevelImpl classLevel = new MClassLevelImpl();
		return classLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTeacher createTeacher() {
		MTeacherImpl teacher = new MTeacherImpl();
		return teacher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSchoolYear createSchoolYear() {
		MSchoolYearImpl schoolYear = new MSchoolYearImpl();
		return schoolYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MRoom createRoom() {
		MRoomImpl room = new MRoomImpl();
		return room;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MNewEClass7 createNewEClass7() {
		MNewEClass7Impl newEClass7 = new MNewEClass7Impl();
		return newEClass7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends MRoom> Mstore<T> createstore() {
		MstoreImpl<T> store = new MstoreImpl<T>();
		return store;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MSchoolPackage getSchoolPackage() {
		return (MSchoolPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MSchoolPackage getPackage() {
		return MSchoolPackage.eINSTANCE;
	}

} //MSchoolFactoryImpl
