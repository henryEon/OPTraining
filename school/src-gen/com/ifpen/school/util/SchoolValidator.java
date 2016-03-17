/**
 */
package com.ifpen.school.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EObjectValidator;

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
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see com.ifpen.school.MSchoolPackage
 * @generated
 */
public class SchoolValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final SchoolValidator INSTANCE = new SchoolValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "com.ifpen.school";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchoolValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return MSchoolPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case MSchoolPackage.CLASS_GROUP:
				return validateClassGroup((MClassGroup)value, diagnostics, context);
			case MSchoolPackage.STUDENT:
				return validateStudent((MStudent)value, diagnostics, context);
			case MSchoolPackage.CLASS_LEVEL:
				return validateClassLevel((MClassLevel)value, diagnostics, context);
			case MSchoolPackage.TEACHER:
				return validateTeacher((MTeacher)value, diagnostics, context);
			case MSchoolPackage.SCHOOL_YEAR:
				return validateSchoolYear((MSchoolYear)value, diagnostics, context);
			case MSchoolPackage.ROOM:
				return validateRoom((MRoom)value, diagnostics, context);
			case MSchoolPackage.NEW_ECLASS7:
				return validateNewEClass7((MNewEClass7)value, diagnostics, context);
			case MSchoolPackage.STORE:
				return validatestore((Mstore<?>)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassGroup(MClassGroup classGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(classGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(classGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(classGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(classGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(classGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(classGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(classGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(classGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(classGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassGroup_checkName(classGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateClassGroup_checkChose(classGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the checkName constraint of '<em>Class Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassGroup_checkName(MClassGroup classGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "checkName", getObjectLabel(classGroup, context) },
						 new Object[] { classGroup },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the checkChose constraint of '<em>Class Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassGroup_checkChose(MClassGroup classGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "checkChose", getObjectLabel(classGroup, context) },
						 new Object[] { classGroup },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStudent(MStudent student, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(student, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassLevel(MClassLevel classLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classLevel, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTeacher(MTeacher teacher, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(teacher, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchoolYear(MSchoolYear schoolYear, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schoolYear, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoom(MRoom room, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(room, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNewEClass7(MNewEClass7 newEClass7, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(newEClass7, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatestore(Mstore<?> store, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(store, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //SchoolValidator
