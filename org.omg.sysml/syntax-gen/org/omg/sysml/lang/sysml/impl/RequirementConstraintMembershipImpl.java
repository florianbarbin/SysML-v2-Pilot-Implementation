/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *  
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/
/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.RequirementConstraintKind;
import org.omg.sysml.lang.sysml.RequirementConstraintMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.FeatureUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Constraint Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RequirementConstraintMembershipImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RequirementConstraintMembershipImpl#getOwnedConstraint <em>Owned Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RequirementConstraintMembershipImpl#getReferencedConstraint <em>Referenced Constraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementConstraintMembershipImpl extends FeatureMembershipImpl implements RequirementConstraintMembership {

	/**
	 * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected static final RequirementConstraintKind KIND_EDEFAULT = RequirementConstraintKind.ASSUMPTION;

	/**
	 * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKind()
	 * @generated
	 * @ordered
	 */
	protected RequirementConstraintKind kind = KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementConstraintMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.REQUIREMENT_CONSTRAINT_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementConstraintKind getKind() {
		return kind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKind(RequirementConstraintKind newKind) {
		RequirementConstraintKind oldKind = kind;
		kind = newKind == null ? KIND_EDEFAULT : newKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__KIND, oldKind, kind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintUsage getOwnedConstraint() {
		ConstraintUsage ownedConstraint = basicGetOwnedConstraint();
		return ownedConstraint != null && ownedConstraint.eIsProxy() ? (ConstraintUsage)eResolveProxy((InternalEObject)ownedConstraint) : ownedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ConstraintUsage basicGetOwnedConstraint() {
		Feature ownedMemberFeature = super.basicGetOwnedMemberFeature();
		return ownedMemberFeature instanceof ConstraintUsage? (ConstraintUsage)ownedMemberFeature: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwnedConstraint(ConstraintUsage newOwnedConstraint) {
		super.setOwnedMemberFeature(newOwnedConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedConstraint() {
		return basicGetOwnedConstraint() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConstraintUsage getReferencedConstraint() {
		ConstraintUsage referencedConstraint = basicGetReferencedConstraint();
		return referencedConstraint != null && referencedConstraint.eIsProxy() ? (ConstraintUsage)eResolveProxy((InternalEObject)referencedConstraint) : referencedConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ConstraintUsage basicGetReferencedConstraint() {
		return FeatureUtil.getReferencedFeatureOf(getOwnedConstraint(), ConstraintUsage.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setReferencedConstraint(ConstraintUsage newReferencedConstraint) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getOwnedMemberFeature() {
		return getOwnedConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature basicGetOwnedMemberFeature() {
		return basicGetOwnedConstraint();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMemberFeature(Feature newOwnedMemberFeature) {
		if (newOwnedMemberFeature != null && !(newOwnedMemberFeature instanceof ConstraintUsage)) {
			throw new IllegalArgumentException("newOwnedMemberFeature must be an instance of ConstraintUsage");
		}
		setOwnedConstraint((ConstraintUsage) newOwnedMemberFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMemberFeature() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__KIND:
				return getKind();
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__OWNED_CONSTRAINT:
				if (resolve) return getOwnedConstraint();
				return basicGetOwnedConstraint();
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__REFERENCED_CONSTRAINT:
				if (resolve) return getReferencedConstraint();
				return basicGetReferencedConstraint();
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
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__KIND:
				setKind((RequirementConstraintKind)newValue);
				return;
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__OWNED_CONSTRAINT:
				setOwnedConstraint((ConstraintUsage)newValue);
				return;
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__REFERENCED_CONSTRAINT:
				setReferencedConstraint((ConstraintUsage)newValue);
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
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__KIND:
				setKind(KIND_EDEFAULT);
				return;
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__OWNED_CONSTRAINT:
				setOwnedConstraint((ConstraintUsage)null);
				return;
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__REFERENCED_CONSTRAINT:
				setReferencedConstraint((ConstraintUsage)null);
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
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__OWNED_MEMBER_FEATURE:
				return isSetOwnedMemberFeature();
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__KIND:
				return kind != KIND_EDEFAULT;
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__OWNED_CONSTRAINT:
				return isSetOwnedConstraint();
			case SysMLPackage.REQUIREMENT_CONSTRAINT_MEMBERSHIP__REFERENCED_CONSTRAINT:
				return basicGetReferencedConstraint() != null;
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (kind: ");
		result.append(kind);
		result.append(')');
		return result.toString();
	}

} //RequirementConstraintMembershipImpl
