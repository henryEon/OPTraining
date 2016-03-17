

/**
 */
package com.ifpen.school.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import com.ifpen.school.MRoom;
import com.ifpen.school.MSchoolPackage;
import com.ifpen.school.Mstore;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.ifpen.school.impl.MstoreImpl#getLastIn <em>Last In</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
 public class MstoreImpl<T extends MRoom> extends MinimalEObjectImpl.Container implements Mstore<T> {
	/**
	 * The cached value of the '{@link #getLastIn() <em>Last In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastIn()
	 * @generated
	 * @ordered
	 */
	protected T lastIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MstoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MSchoolPackage.Literals.STORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public T getLastIn() {
		return lastIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastIn(T newLastIn) {
		T oldLastIn = lastIn;
		lastIn = newLastIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MSchoolPackage.STORE__LAST_IN, oldLastIn, lastIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MSchoolPackage.STORE__LAST_IN:
				return getLastIn();
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
			case MSchoolPackage.STORE__LAST_IN:
				setLastIn((T)newValue);
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
			case MSchoolPackage.STORE__LAST_IN:
				setLastIn((T)null);
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
			case MSchoolPackage.STORE__LAST_IN:
				return lastIn != null;
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
		result.append(" (lastIn: ");
		result.append(lastIn);
		result.append(')');
		return result.toString();
	}

} //MstoreImpl
