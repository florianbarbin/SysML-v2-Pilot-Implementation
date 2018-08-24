/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.EndFeatureMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Feature Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.EndFeatureMembershipImpl#getOwningAssociation <em>Owning Association</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EndFeatureMembershipImpl extends FeatureMembershipImpl implements EndFeatureMembership {
	/**
	 * The cached value of the '{@link #getOwningAssociation() <em>Owning Association</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningAssociation()
	 * @generated
	 * @ordered
	 */
	protected Association owningAssociation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndFeatureMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.END_FEATURE_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getOwningAssociation() {
		if (owningAssociation != null && owningAssociation.eIsProxy()) {
			InternalEObject oldOwningAssociation = (InternalEObject)owningAssociation;
			owningAssociation = (Association)eResolveProxy(oldOwningAssociation);
			if (owningAssociation != oldOwningAssociation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.END_FEATURE_MEMBERSHIP__OWNING_ASSOCIATION, oldOwningAssociation, owningAssociation));
			}
		}
		return owningAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetOwningAssociation() {
		return owningAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningAssociation(Association newOwningAssociation, NotificationChain msgs) {
		Association oldOwningAssociation = owningAssociation;
		owningAssociation = newOwningAssociation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.END_FEATURE_MEMBERSHIP__OWNING_ASSOCIATION, oldOwningAssociation, newOwningAssociation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningAssociation(Association newOwningAssociation) {
		if (newOwningAssociation != owningAssociation) {
			NotificationChain msgs = null;
			if (owningAssociation != null)
				msgs = ((InternalEObject)owningAssociation).eInverseRemove(this, SysMLPackage.ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP, Association.class, msgs);
			if (newOwningAssociation != null)
				msgs = ((InternalEObject)newOwningAssociation).eInverseAdd(this, SysMLPackage.ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP, Association.class, msgs);
			msgs = basicSetOwningAssociation(newOwningAssociation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.END_FEATURE_MEMBERSHIP__OWNING_ASSOCIATION, newOwningAssociation, newOwningAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.END_FEATURE_MEMBERSHIP__OWNING_ASSOCIATION:
				if (owningAssociation != null)
					msgs = ((InternalEObject)owningAssociation).eInverseRemove(this, SysMLPackage.ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP, Association.class, msgs);
				return basicSetOwningAssociation((Association)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.END_FEATURE_MEMBERSHIP__OWNING_ASSOCIATION:
				return basicSetOwningAssociation(null, msgs);
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
			case SysMLPackage.END_FEATURE_MEMBERSHIP__OWNING_ASSOCIATION:
				if (resolve) return getOwningAssociation();
				return basicGetOwningAssociation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.END_FEATURE_MEMBERSHIP__OWNING_ASSOCIATION:
				setOwningAssociation((Association)newValue);
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
			case SysMLPackage.END_FEATURE_MEMBERSHIP__OWNING_ASSOCIATION:
				setOwningAssociation((Association)null);
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
			case SysMLPackage.END_FEATURE_MEMBERSHIP__OWNING_ASSOCIATION:
				return owningAssociation != null;
		}
		return super.eIsSet(featureID);
	}

} //EndFeatureMembershipImpl