

/**
 */
package com.ifpen.school.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import com.ifpen.school.ClassLevel;
import com.ifpen.school.MClassGroup;
import com.ifpen.school.MSchoolPackage;
import com.ifpen.school.Room;
import com.ifpen.school.Student;
import com.ifpen.school.Teacher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ifpen.school.impl.MClassGroupImpl#getEleves <em>Eleves</em>}</li>
 *   <li>{@link com.ifpen.school.impl.MClassGroupImpl#getProf <em>Prof</em>}</li>
 *   <li>{@link com.ifpen.school.impl.MClassGroupImpl#getNiveau <em>Niveau</em>}</li>
 *   <li>{@link com.ifpen.school.impl.MClassGroupImpl#getSalle <em>Salle</em>}</li>
 *   <li>{@link com.ifpen.school.impl.MClassGroupImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 public class MClassGroupImpl extends MinimalEObjectImpl.Container implements MClassGroup {
	/**
	 * The cached value of the '{@link #getEleves() <em>Eleves</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEleves()
	 * @generated
	 * @ordered
	 */
	protected EList<Student> eleves;

	/**
	 * The cached value of the '{@link #getProf() <em>Prof</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProf()
	 * @generated
	 * @ordered
	 */
	protected EList<Teacher> prof;

	/**
	 * The cached value of the '{@link #getNiveau() <em>Niveau</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNiveau()
	 * @generated
	 * @ordered
	 */
	protected ClassLevel niveau;

	/**
	 * The cached value of the '{@link #getSalle() <em>Salle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalle()
	 * @generated
	 * @ordered
	 */
	protected Room salle;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MClassGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MSchoolPackage.Literals.CLASS_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Student> getEleves() {
		if (eleves == null) {
			eleves = new EObjectResolvingEList<Student>(Student.class, this, MSchoolPackage.CLASS_GROUP__ELEVES);
		}
		return eleves;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Teacher> getProf() {
		if (prof == null) {
			prof = new EObjectResolvingEList<Teacher>(Teacher.class, this, MSchoolPackage.CLASS_GROUP__PROF);
		}
		return prof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassLevel getNiveau() {
		if (niveau != null && niveau.eIsProxy()) {
			InternalEObject oldNiveau = (InternalEObject)niveau;
			niveau = (ClassLevel)eResolveProxy(oldNiveau);
			if (niveau != oldNiveau) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MSchoolPackage.CLASS_GROUP__NIVEAU, oldNiveau, niveau));
			}
		}
		return niveau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassLevel basicGetNiveau() {
		return niveau;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNiveau(ClassLevel newNiveau) {
		ClassLevel oldNiveau = niveau;
		niveau = newNiveau;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MSchoolPackage.CLASS_GROUP__NIVEAU, oldNiveau, niveau));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room getSalle() {
		if (salle != null && salle.eIsProxy()) {
			InternalEObject oldSalle = (InternalEObject)salle;
			salle = (Room)eResolveProxy(oldSalle);
			if (salle != oldSalle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MSchoolPackage.CLASS_GROUP__SALLE, oldSalle, salle));
			}
		}
		return salle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Room basicGetSalle() {
		return salle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalle(Room newSalle) {
		Room oldSalle = salle;
		salle = newSalle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MSchoolPackage.CLASS_GROUP__SALLE, oldSalle, salle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MSchoolPackage.CLASS_GROUP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MSchoolPackage.CLASS_GROUP__ELEVES:
				return getEleves();
			case MSchoolPackage.CLASS_GROUP__PROF:
				return getProf();
			case MSchoolPackage.CLASS_GROUP__NIVEAU:
				if (resolve) return getNiveau();
				return basicGetNiveau();
			case MSchoolPackage.CLASS_GROUP__SALLE:
				if (resolve) return getSalle();
				return basicGetSalle();
			case MSchoolPackage.CLASS_GROUP__NAME:
				return getName();
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
			case MSchoolPackage.CLASS_GROUP__ELEVES:
				getEleves().clear();
				getEleves().addAll((Collection<? extends Student>)newValue);
				return;
			case MSchoolPackage.CLASS_GROUP__PROF:
				getProf().clear();
				getProf().addAll((Collection<? extends Teacher>)newValue);
				return;
			case MSchoolPackage.CLASS_GROUP__NIVEAU:
				setNiveau((ClassLevel)newValue);
				return;
			case MSchoolPackage.CLASS_GROUP__SALLE:
				setSalle((Room)newValue);
				return;
			case MSchoolPackage.CLASS_GROUP__NAME:
				setName((String)newValue);
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
			case MSchoolPackage.CLASS_GROUP__ELEVES:
				getEleves().clear();
				return;
			case MSchoolPackage.CLASS_GROUP__PROF:
				getProf().clear();
				return;
			case MSchoolPackage.CLASS_GROUP__NIVEAU:
				setNiveau((ClassLevel)null);
				return;
			case MSchoolPackage.CLASS_GROUP__SALLE:
				setSalle((Room)null);
				return;
			case MSchoolPackage.CLASS_GROUP__NAME:
				setName(NAME_EDEFAULT);
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
			case MSchoolPackage.CLASS_GROUP__ELEVES:
				return eleves != null && !eleves.isEmpty();
			case MSchoolPackage.CLASS_GROUP__PROF:
				return prof != null && !prof.isEmpty();
			case MSchoolPackage.CLASS_GROUP__NIVEAU:
				return niveau != null;
			case MSchoolPackage.CLASS_GROUP__SALLE:
				return salle != null;
			case MSchoolPackage.CLASS_GROUP__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MClassGroupImpl
