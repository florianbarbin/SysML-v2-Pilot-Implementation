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
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Viewpoint Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A ViewpointUsage is a usage of a ViewpointDefinition.</p>
 * 
 * <p>A ViewpointUsage must subset, directly or indirectly, the base ViewpointUsage <code>viewpoints</code> from the Systems model library.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewpointUsage#getViewpointDefinition <em>Viewpoint Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ViewpointUsage#getViewpointStakeholder <em>Viewpoint Stakeholder</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewpointUsage()
 * @model
 * @generated
 */
public interface ViewpointUsage extends RequirementUsage {
	/**
	 * Returns the value of the '<em><b>Viewpoint Definition</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.RequirementUsage#getRequirementDefinition() <em>Requirement Definition</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ViewpointDefinition that defines this ViewUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Viewpoint Definition</em>' reference.
	 * @see #setViewpointDefinition(ViewpointDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewpointUsage_ViewpointDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='definedViewpoint'"
	 *        annotation="redefines"
	 * @generated
	 */
	ViewpointDefinition getViewpointDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ViewpointUsage#getViewpointDefinition <em>Viewpoint Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Viewpoint Definition</em>' reference.
	 * @see #getViewpointDefinition()
	 * @generated
	 */
	void setViewpointDefinition(ViewpointDefinition value);

	/**
	 * Returns the value of the '<em><b>Viewpoint Stakeholder</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.PartUsage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The features that identify the stakeholders with concerns addressed by this ViewpointUsage, derived as the owned and inherited <code>stakeholderParameters</code> of the <code>framedConcerns</code> of this ViewpointUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Viewpoint Stakeholder</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getViewpointUsage_ViewpointStakeholder()
	 * @model transient="true" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='viewpointForStakeholder'"
	 * @generated
	 */
	EList<PartUsage> getViewpointStakeholder();

} // ViewpointUsage
