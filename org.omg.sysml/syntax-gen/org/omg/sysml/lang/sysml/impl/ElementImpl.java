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
package org.omg.sysml.lang.sysml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.UUID;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.eclipse.uml2.common.util.SubsetSupersetEDataTypeUniqueEList;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.Documentation;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TextualRepresentation;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.NonNotifyingEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwningRelationship <em>Owning Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwnedRelationship <em>Owned Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getAliasId <em>Alias Id</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwningMembership <em>Owning Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwningNamespace <em>Owning Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwnedAnnotation <em>Owned Annotation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getDocumentationComment <em>Documentation Comment</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getOwnedTextualRepresentation <em>Owned Textual Representation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getEffectiveName <em>Effective Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementImpl#getHumanId <em>Human Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementImpl extends MinimalEObjectImpl.Container implements Element {
	/**
	 * The cached value of the '{@link #getOwnedRelationship() <em>Owned Relationship</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> ownedRelationship;

	/**
	 * The cached value of the '{@link #getAliasId() <em>Alias Id</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasId()
	 * @generated
	 * @ordered
	 */
	protected EList<String> aliasId;

	/**
	 * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdentifier()
	 * @generated
	 * @ordered
	 */
	protected String identifier = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQualifiedName()
	 * @generated
	 * @ordered
	 */
	protected static final String QUALIFIED_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getEffectiveName() <em>Effective Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffectiveName()
	 * @generated
	 * @ordered
	 */
	protected static final String EFFECTIVE_NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHumanId() <em>Human Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanId()
	 * @generated
	 * @ordered
	 */
	protected static final String HUMAN_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHumanId() <em>Human Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumanId()
	 * @generated
	 * @ordered
	 */
	protected String humanId = HUMAN_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ELEMENT;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Relationship getOwningRelationship() {
		EObject container = eInternalContainer();
		return container instanceof Relationship && ((Relationship)container).getOwnedRelatedElement().contains(this)? (Relationship)container: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelationship(Relationship newOwningRelationship, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRelationship, SysMLPackage.ELEMENT__OWNING_RELATIONSHIP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelationship(Relationship newOwningRelationship) {
		if (newOwningRelationship != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.ELEMENT__OWNING_RELATIONSHIP && newOwningRelationship != null)) {
			if (EcoreUtil.isAncestor(this, newOwningRelationship))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningRelationship != null)
				msgs = ((InternalEObject)newOwningRelationship).eInverseAdd(this, SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT, Relationship.class, msgs);
			msgs = basicSetOwningRelationship(newOwningRelationship, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ELEMENT__OWNING_RELATIONSHIP, newOwningRelationship, newOwningRelationship));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwner() {
		Element owner = basicGetOwner();
		return owner != null && owner.eIsProxy() ? (Element)eResolveProxy((InternalEObject)owner) : owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Element basicGetOwner() {
		Relationship owningRelationship = getOwningRelationship();
		return owningRelationship != null && owningRelationship.getOwnedRelatedElement().contains(this)? 
						owningRelationship.getOwningRelatedElement(): null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwner(Element newOwner) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Membership getOwningMembership() {
		Membership owningMembership = basicGetOwningMembership();
		return owningMembership != null && owningMembership.eIsProxy() ? (Membership)eResolveProxy((InternalEObject)owningMembership) : owningMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Membership basicGetOwningMembership() {
		Relationship owningRelationship = getOwningRelationship();
		return owningRelationship instanceof Membership? (Membership)owningRelationship: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwningMembership(Membership newOwningMembership) {
		setOwningRelationship(newOwningMembership);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getAliasId() {
		if (aliasId == null) {
			aliasId = new SubsetSupersetEDataTypeUniqueEList<String>(String.class, this, SysMLPackage.ELEMENT__ALIAS_ID, null, ALIAS_ID_ESUBSETS);
		}
		return aliasId;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getAliasId() <em>Alias Id</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAliasId()
	 * @generated
	 * @ordered
	 */
	protected static final int[] ALIAS_ID_ESUBSETS = new int[] {SysMLPackage.ELEMENT__HUMAN_ID};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace getOwningNamespace() {
		Namespace owningNamespace = basicGetOwningNamespace();
		return owningNamespace != null && owningNamespace.eIsProxy() ? (Namespace)eResolveProxy((InternalEObject)owningNamespace) : owningNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Namespace basicGetOwningNamespace() {
		Membership membership = getOwningMembership();
		return membership == null? null: membership.getMembershipOwningNamespace();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setOwningNamespace(Namespace newOwningNamespace) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BasicEList<Element> getOwnedElement() {
		BasicEList<Element> ownedElements = new NonNotifyingEObjectEList<>(Element.class, this, SysMLPackage.ELEMENT__OWNED_ELEMENT);
		ownedElements.addAllUnique(getOwnedRelationship().stream().
				flatMap(relationship->relationship.getOwnedRelatedElement().stream()).collect(Collectors.toList()));
		return ownedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Comment> getDocumentationComment() {
		EList<Comment> documentationComments = new NonNotifyingEObjectEList<>(Comment.class, this, SysMLPackage.ELEMENT__DOCUMENTATION_COMMENT);
		getDocumentation().stream().
			map(Documentation::getDocumentingComment).
			forEachOrdered(documentationComments::add);
		return documentationComments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<TextualRepresentation> getOwnedTextualRepresentation() {
		EList<TextualRepresentation> ownedTextualRepresentations = new NonNotifyingEObjectEList<>(TextualRepresentation.class, this, SysMLPackage.ELEMENT__OWNED_TEXTUAL_REPRESENTATION);
		getOwnedAnnotation().stream().
			map(Annotation::getAnnotatingElement).
			filter(TextualRepresentation.class::isInstance).
			map(TextualRepresentation.class::cast).
			forEachOrdered(ownedTextualRepresentations::add);
		return ownedTextualRepresentations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getHumanId() {
		return humanId;
	}
	
	@Override
	public void setHumanId(String newHumanId) {
		setHumanIdGen(ElementUtil.unescapeString(newHumanId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHumanIdGen(String newHumanId) {
		String oldHumanId = humanId;
		humanId = newHumanId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ELEMENT__HUMAN_ID, oldHumanId, humanId));
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newHumanId != null) {
				EList<String> aliasId = getAliasId();
				if (!aliasId.contains(newHumanId)) {
					aliasId.add(newHumanId);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * If no identifier has been set, then generate a random UUID and set the identifier to that.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getIdentifier() {
		if (identifier == null) {
			identifier = UUID.randomUUID().toString();
		}
		return identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIdentifier(String newIdentifier) {
		String oldIdentifier = identifier;
		identifier = newIdentifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ELEMENT__IDENTIFIER, oldIdentifier, identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getName() {
		String name = this.basicGetName();
		if (name != null) {
			return name;
		} else {
			Membership owningMembership = this.getOwningMembership();
			return owningMembership == null? null: ((MembershipImpl)owningMembership).basicGetMemberName(); 
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setName(String newName) {
		Membership owningMembership = this.getOwningMembership();
		if (owningMembership != null) {
			owningMembership.setMemberName(newName);
			this.basicSetName(null);
		} else {
			this.basicSetName(ElementUtil.unescapeString(newName));
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relationship> getOwnedRelationship() {
		if (ownedRelationship == null) {
			ownedRelationship = new EObjectContainmentWithInverseEList<Relationship>(Relationship.class, this, SysMLPackage.ELEMENT__OWNED_RELATIONSHIP, SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT);
		}
		return ownedRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Documentation> getDocumentation() {
		return new DerivedEObjectEList<Documentation>(Documentation.class, this, SysMLPackage.ELEMENT__DOCUMENTATION, new int[] {SysMLPackage.ELEMENT__OWNED_RELATIONSHIP});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Annotation> getOwnedAnnotation() {
		return new DerivedEObjectEList<Annotation>(Annotation.class, this, SysMLPackage.ELEMENT__OWNED_ANNOTATION, new int[] {SysMLPackage.ELEMENT__OWNED_RELATIONSHIP});
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedAnnotation() <em>Owned Annotation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAnnotation()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ANNOTATION_ESUPERSETS = new int[] {SysMLPackage.ELEMENT__OWNED_RELATIONSHIP};


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getQualifiedName() {
		Namespace owningNamespace = getOwningNamespace();
		if (owningNamespace == null) {
			return null;
		} else if (owningNamespace.getOwner() == null) {
			return escapedName();
		} else {
			String qualification = ((ElementImpl)owningNamespace).getQualifiedName();
			if (qualification == null) {
				return null;
			} else {
				return qualification + "::" + escapedName();
			}
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setQualifiedName(String newQualifiedName) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Get the effective name for this element, which by default is just its regular name.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getEffectiveName() {
		return effectiveName();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setEffectiveName(String newEffectiveName) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String escapedName() {
		return ElementUtil.escapeName(getName());
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String effectiveName() {
		return getName();
	}

	// Additional
	
	String name;
	
	/**
	 * Get the locally stored value for the element name.
	 */
	public String basicGetName() {
		return name;
	}
	
	/**
	 * Set the locally stored value for the element name.
	 */
	public void basicSetName(String newName) {
		name = newName;
	}
	
	//
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.ELEMENT__OWNING_RELATIONSHIP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningRelationship((Relationship)otherEnd, msgs);
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelationship()).basicAdd(otherEnd, msgs);
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
			case SysMLPackage.ELEMENT__OWNING_RELATIONSHIP:
				return basicSetOwningRelationship(null, msgs);
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP:
				return ((InternalEList<?>)getOwnedRelationship()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SysMLPackage.ELEMENT__OWNING_RELATIONSHIP:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT, Relationship.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.ELEMENT__OWNING_RELATIONSHIP:
				return getOwningRelationship();
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP:
				return getOwnedRelationship();
			case SysMLPackage.ELEMENT__ALIAS_ID:
				return getAliasId();
			case SysMLPackage.ELEMENT__OWNING_MEMBERSHIP:
				if (resolve) return getOwningMembership();
				return basicGetOwningMembership();
			case SysMLPackage.ELEMENT__OWNING_NAMESPACE:
				if (resolve) return getOwningNamespace();
				return basicGetOwningNamespace();
			case SysMLPackage.ELEMENT__IDENTIFIER:
				return getIdentifier();
			case SysMLPackage.ELEMENT__NAME:
				return getName();
			case SysMLPackage.ELEMENT__OWNER:
				if (resolve) return getOwner();
				return basicGetOwner();
			case SysMLPackage.ELEMENT__OWNED_ELEMENT:
				return getOwnedElement();
			case SysMLPackage.ELEMENT__DOCUMENTATION:
				return getDocumentation();
			case SysMLPackage.ELEMENT__OWNED_ANNOTATION:
				return getOwnedAnnotation();
			case SysMLPackage.ELEMENT__DOCUMENTATION_COMMENT:
				return getDocumentationComment();
			case SysMLPackage.ELEMENT__OWNED_TEXTUAL_REPRESENTATION:
				return getOwnedTextualRepresentation();
			case SysMLPackage.ELEMENT__QUALIFIED_NAME:
				return getQualifiedName();
			case SysMLPackage.ELEMENT__EFFECTIVE_NAME:
				return getEffectiveName();
			case SysMLPackage.ELEMENT__HUMAN_ID:
				return getHumanId();
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
			case SysMLPackage.ELEMENT__OWNING_RELATIONSHIP:
				setOwningRelationship((Relationship)newValue);
				return;
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP:
				getOwnedRelationship().clear();
				getOwnedRelationship().addAll((Collection<? extends Relationship>)newValue);
				return;
			case SysMLPackage.ELEMENT__ALIAS_ID:
				getAliasId().clear();
				getAliasId().addAll((Collection<? extends String>)newValue);
				return;
			case SysMLPackage.ELEMENT__OWNING_MEMBERSHIP:
				setOwningMembership((Membership)newValue);
				return;
			case SysMLPackage.ELEMENT__OWNING_NAMESPACE:
				setOwningNamespace((Namespace)newValue);
				return;
			case SysMLPackage.ELEMENT__IDENTIFIER:
				setIdentifier((String)newValue);
				return;
			case SysMLPackage.ELEMENT__NAME:
				setName((String)newValue);
				return;
			case SysMLPackage.ELEMENT__OWNER:
				setOwner((Element)newValue);
				return;
			case SysMLPackage.ELEMENT__OWNED_ELEMENT:
				getOwnedElement().clear();
				getOwnedElement().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.ELEMENT__DOCUMENTATION:
				getDocumentation().clear();
				getDocumentation().addAll((Collection<? extends Documentation>)newValue);
				return;
			case SysMLPackage.ELEMENT__OWNED_ANNOTATION:
				getOwnedAnnotation().clear();
				getOwnedAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case SysMLPackage.ELEMENT__DOCUMENTATION_COMMENT:
				getDocumentationComment().clear();
				getDocumentationComment().addAll((Collection<? extends Comment>)newValue);
				return;
			case SysMLPackage.ELEMENT__OWNED_TEXTUAL_REPRESENTATION:
				getOwnedTextualRepresentation().clear();
				getOwnedTextualRepresentation().addAll((Collection<? extends TextualRepresentation>)newValue);
				return;
			case SysMLPackage.ELEMENT__QUALIFIED_NAME:
				setQualifiedName((String)newValue);
				return;
			case SysMLPackage.ELEMENT__EFFECTIVE_NAME:
				setEffectiveName((String)newValue);
				return;
			case SysMLPackage.ELEMENT__HUMAN_ID:
				setHumanId((String)newValue);
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
			case SysMLPackage.ELEMENT__OWNING_RELATIONSHIP:
				setOwningRelationship((Relationship)null);
				return;
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP:
				getOwnedRelationship().clear();
				return;
			case SysMLPackage.ELEMENT__ALIAS_ID:
				getAliasId().clear();
				return;
			case SysMLPackage.ELEMENT__OWNING_MEMBERSHIP:
				setOwningMembership((Membership)null);
				return;
			case SysMLPackage.ELEMENT__OWNING_NAMESPACE:
				setOwningNamespace((Namespace)null);
				return;
			case SysMLPackage.ELEMENT__IDENTIFIER:
				setIdentifier(IDENTIFIER_EDEFAULT);
				return;
			case SysMLPackage.ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SysMLPackage.ELEMENT__OWNER:
				setOwner((Element)null);
				return;
			case SysMLPackage.ELEMENT__OWNED_ELEMENT:
				getOwnedElement().clear();
				return;
			case SysMLPackage.ELEMENT__DOCUMENTATION:
				getDocumentation().clear();
				return;
			case SysMLPackage.ELEMENT__OWNED_ANNOTATION:
				getOwnedAnnotation().clear();
				return;
			case SysMLPackage.ELEMENT__DOCUMENTATION_COMMENT:
				getDocumentationComment().clear();
				return;
			case SysMLPackage.ELEMENT__OWNED_TEXTUAL_REPRESENTATION:
				getOwnedTextualRepresentation().clear();
				return;
			case SysMLPackage.ELEMENT__QUALIFIED_NAME:
				setQualifiedName(QUALIFIED_NAME_EDEFAULT);
				return;
			case SysMLPackage.ELEMENT__EFFECTIVE_NAME:
				setEffectiveName(EFFECTIVE_NAME_EDEFAULT);
				return;
			case SysMLPackage.ELEMENT__HUMAN_ID:
				setHumanId(HUMAN_ID_EDEFAULT);
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
			case SysMLPackage.ELEMENT__OWNING_RELATIONSHIP:
				return getOwningRelationship() != null;
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP:
				return ownedRelationship != null && !ownedRelationship.isEmpty();
			case SysMLPackage.ELEMENT__ALIAS_ID:
				return aliasId != null && !aliasId.isEmpty();
			case SysMLPackage.ELEMENT__OWNING_MEMBERSHIP:
				return basicGetOwningMembership() != null;
			case SysMLPackage.ELEMENT__OWNING_NAMESPACE:
				return basicGetOwningNamespace() != null;
			case SysMLPackage.ELEMENT__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
			case SysMLPackage.ELEMENT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case SysMLPackage.ELEMENT__OWNER:
				return basicGetOwner() != null;
			case SysMLPackage.ELEMENT__OWNED_ELEMENT:
				return !getOwnedElement().isEmpty();
			case SysMLPackage.ELEMENT__DOCUMENTATION:
				return !getDocumentation().isEmpty();
			case SysMLPackage.ELEMENT__OWNED_ANNOTATION:
				return !getOwnedAnnotation().isEmpty();
			case SysMLPackage.ELEMENT__DOCUMENTATION_COMMENT:
				return !getDocumentationComment().isEmpty();
			case SysMLPackage.ELEMENT__OWNED_TEXTUAL_REPRESENTATION:
				return !getOwnedTextualRepresentation().isEmpty();
			case SysMLPackage.ELEMENT__QUALIFIED_NAME:
				return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
			case SysMLPackage.ELEMENT__EFFECTIVE_NAME:
				return EFFECTIVE_NAME_EDEFAULT == null ? getEffectiveName() != null : !EFFECTIVE_NAME_EDEFAULT.equals(getEffectiveName());
			case SysMLPackage.ELEMENT__HUMAN_ID:
				return HUMAN_ID_EDEFAULT == null ? humanId != null : !HUMAN_ID_EDEFAULT.equals(humanId);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.ELEMENT___ESCAPED_NAME:
				return escapedName();
			case SysMLPackage.ELEMENT___EFFECTIVE_NAME:
				return effectiveName();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (identifier: ");
		result.append(identifier);
		result.append(", aliasId: ");
		result.append(aliasId);
		result.append(", humanId: ");
		result.append(humanId);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
