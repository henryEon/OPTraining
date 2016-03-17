/**
 */
package com.ifpen.school;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.ifpen.school.MSchoolFactory
 * @model kind="package"
 * @generated
 */
public interface MSchoolPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "school";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://com.ifpen.school/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "school";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MSchoolPackage eINSTANCE = com.ifpen.school.impl.MSchoolPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.ifpen.school.impl.MClassGroupImpl <em>Class Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ifpen.school.impl.MClassGroupImpl
	 * @see com.ifpen.school.impl.MSchoolPackageImpl#getClassGroup()
	 * @generated
	 */
	int CLASS_GROUP = 0;

	/**
	 * The feature id for the '<em><b>Eleves</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_GROUP__ELEVES = 0;

	/**
	 * The feature id for the '<em><b>Prof</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_GROUP__PROF = 1;

	/**
	 * The feature id for the '<em><b>Niveau</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_GROUP__NIVEAU = 2;

	/**
	 * The feature id for the '<em><b>Salle</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_GROUP__SALLE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_GROUP__NAME = 4;

	/**
	 * The number of structural features of the '<em>Class Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_GROUP_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Class Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.ifpen.school.impl.MStudentImpl <em>Student</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ifpen.school.impl.MStudentImpl
	 * @see com.ifpen.school.impl.MSchoolPackageImpl#getStudent()
	 * @generated
	 */
	int STUDENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Student</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STUDENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.ifpen.school.impl.MClassLevelImpl <em>Class Level</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ifpen.school.impl.MClassLevelImpl
	 * @see com.ifpen.school.impl.MSchoolPackageImpl#getClassLevel()
	 * @generated
	 */
	int CLASS_LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LEVEL__LEVEL = 0;

	/**
	 * The number of structural features of the '<em>Class Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LEVEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Class Level</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LEVEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.ifpen.school.impl.MTeacherImpl <em>Teacher</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ifpen.school.impl.MTeacherImpl
	 * @see com.ifpen.school.impl.MSchoolPackageImpl#getTeacher()
	 * @generated
	 */
	int TEACHER = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER__ROOM = 1;

	/**
	 * The number of structural features of the '<em>Teacher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Teacher</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEACHER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.ifpen.school.impl.MSchoolYearImpl <em>Year</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ifpen.school.impl.MSchoolYearImpl
	 * @see com.ifpen.school.impl.MSchoolPackageImpl#getSchoolYear()
	 * @generated
	 */
	int SCHOOL_YEAR = 4;

	/**
	 * The feature id for the '<em><b>Ecole</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_YEAR__ECOLE = 0;

	/**
	 * The feature id for the '<em><b>Eleves</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_YEAR__ELEVES = 1;

	/**
	 * The feature id for the '<em><b>Niveau</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_YEAR__NIVEAU = 2;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_YEAR__YEAR = 3;

	/**
	 * The number of structural features of the '<em>Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_YEAR_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Year</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_YEAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.ifpen.school.impl.MRoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ifpen.school.impl.MRoomImpl
	 * @see com.ifpen.school.impl.MSchoolPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 5;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__LOCATION = 0;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Affect Teacher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM___AFFECT_TEACHER__MTEACHER = 0;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.ifpen.school.impl.MNewEClass7Impl <em>New EClass7</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ifpen.school.impl.MNewEClass7Impl
	 * @see com.ifpen.school.impl.MSchoolPackageImpl#getNewEClass7()
	 * @generated
	 */
	int NEW_ECLASS7 = 6;

	/**
	 * The number of structural features of the '<em>New EClass7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS7_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>New EClass7</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_ECLASS7_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.ifpen.school.impl.MstoreImpl <em>store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.ifpen.school.impl.MstoreImpl
	 * @see com.ifpen.school.impl.MSchoolPackageImpl#getstore()
	 * @generated
	 */
	int STORE = 7;

	/**
	 * The feature id for the '<em><b>Last In</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE__LAST_IN = 0;

	/**
	 * The number of structural features of the '<em>store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.ifpen.school.MClassGroup <em>Class Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Group</em>'.
	 * @see com.ifpen.school.MClassGroup
	 * @generated
	 */
	EClass getClassGroup();

	/**
	 * Returns the meta object for the reference list '{@link com.ifpen.school.MClassGroup#getEleves <em>Eleves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Eleves</em>'.
	 * @see com.ifpen.school.MClassGroup#getEleves()
	 * @see #getClassGroup()
	 * @generated
	 */
	EReference getClassGroup_Eleves();

	/**
	 * Returns the meta object for the reference list '{@link com.ifpen.school.MClassGroup#getProf <em>Prof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Prof</em>'.
	 * @see com.ifpen.school.MClassGroup#getProf()
	 * @see #getClassGroup()
	 * @generated
	 */
	EReference getClassGroup_Prof();

	/**
	 * Returns the meta object for the reference '{@link com.ifpen.school.MClassGroup#getNiveau <em>Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Niveau</em>'.
	 * @see com.ifpen.school.MClassGroup#getNiveau()
	 * @see #getClassGroup()
	 * @generated
	 */
	EReference getClassGroup_Niveau();

	/**
	 * Returns the meta object for the reference '{@link com.ifpen.school.MClassGroup#getSalle <em>Salle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Salle</em>'.
	 * @see com.ifpen.school.MClassGroup#getSalle()
	 * @see #getClassGroup()
	 * @generated
	 */
	EReference getClassGroup_Salle();

	/**
	 * Returns the meta object for the attribute '{@link com.ifpen.school.MClassGroup#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ifpen.school.MClassGroup#getName()
	 * @see #getClassGroup()
	 * @generated
	 */
	EAttribute getClassGroup_Name();

	/**
	 * Returns the meta object for class '{@link com.ifpen.school.MStudent <em>Student</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Student</em>'.
	 * @see com.ifpen.school.MStudent
	 * @generated
	 */
	EClass getStudent();

	/**
	 * Returns the meta object for the attribute '{@link com.ifpen.school.MStudent#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ifpen.school.MStudent#getName()
	 * @see #getStudent()
	 * @generated
	 */
	EAttribute getStudent_Name();

	/**
	 * Returns the meta object for class '{@link com.ifpen.school.MClassLevel <em>Class Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Level</em>'.
	 * @see com.ifpen.school.MClassLevel
	 * @generated
	 */
	EClass getClassLevel();

	/**
	 * Returns the meta object for the attribute '{@link com.ifpen.school.MClassLevel#getLevel <em>Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level</em>'.
	 * @see com.ifpen.school.MClassLevel#getLevel()
	 * @see #getClassLevel()
	 * @generated
	 */
	EAttribute getClassLevel_Level();

	/**
	 * Returns the meta object for class '{@link com.ifpen.school.MTeacher <em>Teacher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Teacher</em>'.
	 * @see com.ifpen.school.MTeacher
	 * @generated
	 */
	EClass getTeacher();

	/**
	 * Returns the meta object for the attribute '{@link com.ifpen.school.MTeacher#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.ifpen.school.MTeacher#getName()
	 * @see #getTeacher()
	 * @generated
	 */
	EAttribute getTeacher_Name();

	/**
	 * Returns the meta object for the reference '{@link com.ifpen.school.MTeacher#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see com.ifpen.school.MTeacher#getRoom()
	 * @see #getTeacher()
	 * @generated
	 */
	EReference getTeacher_Room();

	/**
	 * Returns the meta object for class '{@link com.ifpen.school.MSchoolYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Year</em>'.
	 * @see com.ifpen.school.MSchoolYear
	 * @generated
	 */
	EClass getSchoolYear();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ifpen.school.MSchoolYear#getEcole <em>Ecole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ecole</em>'.
	 * @see com.ifpen.school.MSchoolYear#getEcole()
	 * @see #getSchoolYear()
	 * @generated
	 */
	EReference getSchoolYear_Ecole();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ifpen.school.MSchoolYear#getEleves <em>Eleves</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Eleves</em>'.
	 * @see com.ifpen.school.MSchoolYear#getEleves()
	 * @see #getSchoolYear()
	 * @generated
	 */
	EReference getSchoolYear_Eleves();

	/**
	 * Returns the meta object for the containment reference list '{@link com.ifpen.school.MSchoolYear#getNiveau <em>Niveau</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Niveau</em>'.
	 * @see com.ifpen.school.MSchoolYear#getNiveau()
	 * @see #getSchoolYear()
	 * @generated
	 */
	EReference getSchoolYear_Niveau();

	/**
	 * Returns the meta object for the attribute '{@link com.ifpen.school.MSchoolYear#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Year</em>'.
	 * @see com.ifpen.school.MSchoolYear#getYear()
	 * @see #getSchoolYear()
	 * @generated
	 */
	EAttribute getSchoolYear_Year();

	/**
	 * Returns the meta object for class '{@link com.ifpen.school.MRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see com.ifpen.school.MRoom
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the attribute '{@link com.ifpen.school.MRoom#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see com.ifpen.school.MRoom#getLocation()
	 * @see #getRoom()
	 * @generated
	 */
	EAttribute getRoom_Location();

	/**
	 * Returns the meta object for the '{@link com.ifpen.school.MRoom#AffectTeacher(com.ifpen.school.MTeacher) <em>Affect Teacher</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Affect Teacher</em>' operation.
	 * @see com.ifpen.school.MRoom#AffectTeacher(com.ifpen.school.MTeacher)
	 * @generated
	 */
	EOperation getRoom__AffectTeacher__MTeacher();

	/**
	 * Returns the meta object for class '{@link com.ifpen.school.MNewEClass7 <em>New EClass7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New EClass7</em>'.
	 * @see com.ifpen.school.MNewEClass7
	 * @generated
	 */
	EClass getNewEClass7();

	/**
	 * Returns the meta object for class '{@link com.ifpen.school.Mstore <em>store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>store</em>'.
	 * @see com.ifpen.school.Mstore
	 * @generated
	 */
	EClass getstore();

	/**
	 * Returns the meta object for the attribute '{@link com.ifpen.school.Mstore#getLastIn <em>Last In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last In</em>'.
	 * @see com.ifpen.school.Mstore#getLastIn()
	 * @see #getstore()
	 * @generated
	 */
	EAttribute getstore_LastIn();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MSchoolFactory getSchoolFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.ifpen.school.impl.MClassGroupImpl <em>Class Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ifpen.school.impl.MClassGroupImpl
		 * @see com.ifpen.school.impl.MSchoolPackageImpl#getClassGroup()
		 * @generated
		 */
		EClass CLASS_GROUP = eINSTANCE.getClassGroup();

		/**
		 * The meta object literal for the '<em><b>Eleves</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_GROUP__ELEVES = eINSTANCE.getClassGroup_Eleves();

		/**
		 * The meta object literal for the '<em><b>Prof</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_GROUP__PROF = eINSTANCE.getClassGroup_Prof();

		/**
		 * The meta object literal for the '<em><b>Niveau</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_GROUP__NIVEAU = eINSTANCE.getClassGroup_Niveau();

		/**
		 * The meta object literal for the '<em><b>Salle</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS_GROUP__SALLE = eINSTANCE.getClassGroup_Salle();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_GROUP__NAME = eINSTANCE.getClassGroup_Name();

		/**
		 * The meta object literal for the '{@link com.ifpen.school.impl.MStudentImpl <em>Student</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ifpen.school.impl.MStudentImpl
		 * @see com.ifpen.school.impl.MSchoolPackageImpl#getStudent()
		 * @generated
		 */
		EClass STUDENT = eINSTANCE.getStudent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STUDENT__NAME = eINSTANCE.getStudent_Name();

		/**
		 * The meta object literal for the '{@link com.ifpen.school.impl.MClassLevelImpl <em>Class Level</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ifpen.school.impl.MClassLevelImpl
		 * @see com.ifpen.school.impl.MSchoolPackageImpl#getClassLevel()
		 * @generated
		 */
		EClass CLASS_LEVEL = eINSTANCE.getClassLevel();

		/**
		 * The meta object literal for the '<em><b>Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_LEVEL__LEVEL = eINSTANCE.getClassLevel_Level();

		/**
		 * The meta object literal for the '{@link com.ifpen.school.impl.MTeacherImpl <em>Teacher</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ifpen.school.impl.MTeacherImpl
		 * @see com.ifpen.school.impl.MSchoolPackageImpl#getTeacher()
		 * @generated
		 */
		EClass TEACHER = eINSTANCE.getTeacher();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEACHER__NAME = eINSTANCE.getTeacher_Name();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEACHER__ROOM = eINSTANCE.getTeacher_Room();

		/**
		 * The meta object literal for the '{@link com.ifpen.school.impl.MSchoolYearImpl <em>Year</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ifpen.school.impl.MSchoolYearImpl
		 * @see com.ifpen.school.impl.MSchoolPackageImpl#getSchoolYear()
		 * @generated
		 */
		EClass SCHOOL_YEAR = eINSTANCE.getSchoolYear();

		/**
		 * The meta object literal for the '<em><b>Ecole</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHOOL_YEAR__ECOLE = eINSTANCE.getSchoolYear_Ecole();

		/**
		 * The meta object literal for the '<em><b>Eleves</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHOOL_YEAR__ELEVES = eINSTANCE.getSchoolYear_Eleves();

		/**
		 * The meta object literal for the '<em><b>Niveau</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHOOL_YEAR__NIVEAU = eINSTANCE.getSchoolYear_Niveau();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHOOL_YEAR__YEAR = eINSTANCE.getSchoolYear_Year();

		/**
		 * The meta object literal for the '{@link com.ifpen.school.impl.MRoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ifpen.school.impl.MRoomImpl
		 * @see com.ifpen.school.impl.MSchoolPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM__LOCATION = eINSTANCE.getRoom_Location();

		/**
		 * The meta object literal for the '<em><b>Affect Teacher</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM___AFFECT_TEACHER__MTEACHER = eINSTANCE.getRoom__AffectTeacher__MTeacher();

		/**
		 * The meta object literal for the '{@link com.ifpen.school.impl.MNewEClass7Impl <em>New EClass7</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ifpen.school.impl.MNewEClass7Impl
		 * @see com.ifpen.school.impl.MSchoolPackageImpl#getNewEClass7()
		 * @generated
		 */
		EClass NEW_ECLASS7 = eINSTANCE.getNewEClass7();

		/**
		 * The meta object literal for the '{@link com.ifpen.school.impl.MstoreImpl <em>store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.ifpen.school.impl.MstoreImpl
		 * @see com.ifpen.school.impl.MSchoolPackageImpl#getstore()
		 * @generated
		 */
		EClass STORE = eINSTANCE.getstore();

		/**
		 * The meta object literal for the '<em><b>Last In</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORE__LAST_IN = eINSTANCE.getstore_LastIn();

	}

} //MSchoolPackage
