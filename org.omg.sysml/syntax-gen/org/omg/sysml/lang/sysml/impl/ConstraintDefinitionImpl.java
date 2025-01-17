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

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.ConstraintDefinition;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.Predicate;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.NonNotifyingEObjectEList;
import org.omg.sysml.util.TypeUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConstraintDefinitionImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConstraintDefinitionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConstraintDefinitionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConstraintDefinitionImpl#isModelLevelEvaluable <em>Is Model Level Evaluable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintDefinitionImpl extends OccurrenceDefinitionImpl implements ConstraintDefinition {
	
	/**
	 * The default value of the '{@link #isModelLevelEvaluable() <em>Is Model Level Evaluable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isModelLevelEvaluable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_MODEL_LEVEL_EVALUABLE_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONSTRAINT_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT // derived
	 */
	public EList<Feature> getParameter() {
		EList<Feature> parameters = new NonNotifyingEObjectEList<>(Feature.class, this, SysMLPackage.ACTION_DEFINITION__PARAMETER);
		parameters.addAll(TypeUtil.getAllParametersOf(this));
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParameter() {
		return !getParameter().isEmpty();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	@Override
	public EList<Expression> getExpression() {
		return new DerivedEObjectEList<Expression>(Expression.class, this, SysMLPackage.FUNCTION__EXPRESSION,
				new int[] { SysMLPackage.TYPE__FEATURE });
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExpression() {
		return !getExpression().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getResult() {
		Feature result = basicGetResult();
		return result != null && result.eIsProxy() ? (Feature)eResolveProxy((InternalEObject)result) : result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT // derived
	 */
	public Feature basicGetResult() {
		return TypeUtil.getOwnedResultParameterOf(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setResult(Feature newResult) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isModelLevelEvaluable() {
		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setIsModelLevelEvaluable(boolean newIsModelLevelEvaluable) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Step> getStep() {
		@SuppressWarnings("unchecked")
		EList<Step> expression = (EList<Step>)((EList<?>)getExpression());
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStep() {
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
			case SysMLPackage.CONSTRAINT_DEFINITION__STEP:
				return getStep();
			case SysMLPackage.CONSTRAINT_DEFINITION__PARAMETER:
				return getParameter();
			case SysMLPackage.CONSTRAINT_DEFINITION__EXPRESSION:
				return getExpression();
			case SysMLPackage.CONSTRAINT_DEFINITION__RESULT:
				if (resolve) return getResult();
				return basicGetResult();
			case SysMLPackage.CONSTRAINT_DEFINITION__IS_MODEL_LEVEL_EVALUABLE:
				return isModelLevelEvaluable();
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
			case SysMLPackage.CONSTRAINT_DEFINITION__STEP:
				getStep().clear();
				getStep().addAll((Collection<? extends Step>)newValue);
				return;
			case SysMLPackage.CONSTRAINT_DEFINITION__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CONSTRAINT_DEFINITION__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends Expression>)newValue);
				return;
			case SysMLPackage.CONSTRAINT_DEFINITION__RESULT:
				setResult((Feature)newValue);
				return;
			case SysMLPackage.CONSTRAINT_DEFINITION__IS_MODEL_LEVEL_EVALUABLE:
				setIsModelLevelEvaluable((Boolean)newValue);
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
			case SysMLPackage.CONSTRAINT_DEFINITION__STEP:
				getStep().clear();
				return;
			case SysMLPackage.CONSTRAINT_DEFINITION__PARAMETER:
				getParameter().clear();
				return;
			case SysMLPackage.CONSTRAINT_DEFINITION__EXPRESSION:
				getExpression().clear();
				return;
			case SysMLPackage.CONSTRAINT_DEFINITION__RESULT:
				setResult((Feature)null);
				return;
			case SysMLPackage.CONSTRAINT_DEFINITION__IS_MODEL_LEVEL_EVALUABLE:
				setIsModelLevelEvaluable(IS_MODEL_LEVEL_EVALUABLE_EDEFAULT);
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
			case SysMLPackage.CONSTRAINT_DEFINITION__DIRECTED_FEATURE:
				return isSetDirectedFeature();
			case SysMLPackage.CONSTRAINT_DEFINITION__STEP:
				return isSetStep();
			case SysMLPackage.CONSTRAINT_DEFINITION__PARAMETER:
				return isSetParameter();
			case SysMLPackage.CONSTRAINT_DEFINITION__EXPRESSION:
				return isSetExpression();
			case SysMLPackage.CONSTRAINT_DEFINITION__RESULT:
				return basicGetResult() != null;
			case SysMLPackage.CONSTRAINT_DEFINITION__IS_MODEL_LEVEL_EVALUABLE:
				return isModelLevelEvaluable() != IS_MODEL_LEVEL_EVALUABLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Behavior.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONSTRAINT_DEFINITION__STEP: return SysMLPackage.BEHAVIOR__STEP;
				case SysMLPackage.CONSTRAINT_DEFINITION__PARAMETER: return SysMLPackage.BEHAVIOR__PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == Function.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONSTRAINT_DEFINITION__EXPRESSION: return SysMLPackage.FUNCTION__EXPRESSION;
				case SysMLPackage.CONSTRAINT_DEFINITION__RESULT: return SysMLPackage.FUNCTION__RESULT;
				case SysMLPackage.CONSTRAINT_DEFINITION__IS_MODEL_LEVEL_EVALUABLE: return SysMLPackage.FUNCTION__IS_MODEL_LEVEL_EVALUABLE;
				default: return -1;
			}
		}
		if (baseClass == Predicate.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Behavior.class) {
			switch (baseFeatureID) {
				case SysMLPackage.BEHAVIOR__STEP: return SysMLPackage.CONSTRAINT_DEFINITION__STEP;
				case SysMLPackage.BEHAVIOR__PARAMETER: return SysMLPackage.CONSTRAINT_DEFINITION__PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == Function.class) {
			switch (baseFeatureID) {
				case SysMLPackage.FUNCTION__EXPRESSION: return SysMLPackage.CONSTRAINT_DEFINITION__EXPRESSION;
				case SysMLPackage.FUNCTION__RESULT: return SysMLPackage.CONSTRAINT_DEFINITION__RESULT;
				case SysMLPackage.FUNCTION__IS_MODEL_LEVEL_EVALUABLE: return SysMLPackage.CONSTRAINT_DEFINITION__IS_MODEL_LEVEL_EVALUABLE;
				default: return -1;
			}
		}
		if (baseClass == Predicate.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getDirectedFeature() {
		return getParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDirectedFeature() {
  		return false;
	}

} //ConstraintDefinitionImpl
