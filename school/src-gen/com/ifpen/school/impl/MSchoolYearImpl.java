

/**
 */
package com.ifpen.school.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.ifpen.school.ClassGroup;
import com.ifpen.school.ClassLevel;
import com.ifpen.school.MSchoolPackage;
import com.ifpen.school.MSchoolYear;
import com.ifpen.school.Student;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ifpen.school.impl.MSchoolYearImpl#getEcole <em>Ecole</em>}</li>
 *   <li>{@link com.ifpen.school.impl.MSchoolYearImpl#getEleves <em>Eleves</em>}</li>
 *   <li>{@link com.ifpen.school.impl.MSchoolYearImpl#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link com.ifpen.school.impl.MSchoolYearImpl#getYear <em>Year</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 public class MSchoolYearImpl extends MinimalEObjectImpl.Container implements MSchoolYear {
	/**
	 * The cached value of the '{@link #getEcole() <em>Ecole</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEcole()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassGroup> ecole;

	/**
	 * The cached value of the '{@link #getEleves() <em>Eleves</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEleves()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> eleves;

	/**
	 * The cached value of the '{@link #getNiveau() <em>Niveau</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveau()
	 * @generated
	 * @ordered
	 */
	protected EList<ClassLevel> niveau;

	/**
	 * The default value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected static final Date YEAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected Date year = YEAR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MSchoolYearImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MSchoolPackage.Literals.SCHOOL_YEAR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassGroup> getEcole() {
		if (ecole == null) {
			ecole = new EObjectContainmentEList<ClassGroup>(ClassGroup.class, this, MSchoolPackage.SCHOOL_YEAR__ECOLE);
		}
		return ecole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getEleves() {
		if (eleves == null) {
			eleves = new EObjectContainmentEList<Student>(Student.class, this, MSchoolPackage.SCHOOL_YEAR__ELEVES);
		}
		return eleves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClassLevel> getNiveau() {
		if (niveau == null) {
			niveau = new EObjectContainmentEList<ClassLevel>(ClassLevel.class, this, MSchoolPackage.SCHOOL_YEAR__NIVEAU);
		}
		return niveau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getYear() {
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYear(Date newYear) {
		Date oldYear = year;
		year = newYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MSchoolPackage.SCHOOL_YEAR__YEAR, oldYear, year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MSchoolPackage.SCHOOL_YEAR__ECOLE:
				return ((InternalEList<?>)getEcole()).basicRemove(otherEnd, msgs);
			case MSchoolPackage.SCHOOL_YEAR__ELEVES:
				return ((InternalEList<?>)getEleves()).basicRemove(otherEnd, msgs);
			case MSchoolPackage.SCHOOL_YEAR__NIVEAU:
				return ((InternalEList<?>)getNiveau()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MSchoolPackage.SCHOOL_YEAR__ECOLE:
				return getEcole();
			case MSchoolPackage.SCHOOL_YEAR__ELEVES:
				return getEleves();
			case MSchoolPackage.SCHOOL_YEAR__NIVEAU:
				return getNiveau();
			case MSchoolPackage.SCHOOL_YEAR__YEAR:
				return getYear();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MSchoolPackage.SCHOOL_YEAR__ECOLE:
				getEcole().clear();
				getEcole().addAll((Collection<? extends ClassGroup>)newValue);
				return;
			case MSchoolPackage.SCHOOL_YEAR__ELEVES:
				getEleves().clear();
				getEleves().addAll((Collection<? extends Student>)newValue);
				return;
			case MSchoolPackage.SCHOOL_YEAR__NIVEAU:
				getNiveau().clear();
				getNiveau().addAll((Collection<? extends ClassLevel>)newValue);
				return;
			case MSchoolPackage.SCHOOL_YEAR__YEAR:
				setYear((Date)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MSchoolPackage.SCHOOL_YEAR__ECOLE:
				getEcole().clear();
				return;
			case MSchoolPackage.SCHOOL_YEAR__ELEVES:
				getEleves().clear();
				return;
			case MSchoolPackage.SCHOOL_YEAR__NIVEAU:
				getNiveau().clear();
				return;
			case MSchoolPackage.SCHOOL_YEAR__YEAR:
				setYear(YEAR_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MSchoolPackage.SCHOOL_YEAR__ECOLE:
				return ecole != null && !ecole.isEmpty();
			case MSchoolPackage.SCHOOL_YEAR__ELEVES:
				return eleves != null && !eleves.isEmpty();
			case MSchoolPackage.SCHOOL_YEAR__NIVEAU:
				return niveau != null && !niveau.isEmpty();
			case MSchoolPackage.SCHOOL_YEAR__YEAR:
				return YEAR_EDEFAULT == null ? year != null : !YEAR_EDEFAULT.equals(year);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (year: ");
		result.append(year);
		result.append(')');
		return result.toString();
	}

} //MSchoolYearImpl
