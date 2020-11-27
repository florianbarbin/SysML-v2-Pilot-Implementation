/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020 Model Driven Solutions, Inc.
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 * 
 * Contributors:
 *  Zoltan Ujhelyi
 * 
 *****************************************************************************/
package org.omg.sysml.util;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectEList;

public class NonNotifyingEcoreEList<T> extends EObjectEList<T> {

	private static final long serialVersionUID = -189113090526844372L;

	public NonNotifyingEcoreEList(Class<?> dataClass, InternalEObject owner, int featureID) {
		super(dataClass, owner, featureID);
	}

	@Override
	protected boolean isNotificationRequired() {
		return false;
	}

}