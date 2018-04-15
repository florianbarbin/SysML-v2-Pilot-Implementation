/**
 */
package org.omg.sysml.groups.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.omg.sysml.behaviors.BehaviorsPackage;

import org.omg.sysml.behaviors.impl.BehaviorsPackageImpl;

import org.omg.sysml.classification.ClassificationPackage;

import org.omg.sysml.classification.impl.ClassificationPackageImpl;

import org.omg.sysml.core.CorePackage;

import org.omg.sysml.core.impl.CorePackageImpl;

import org.omg.sysml.groups.ElementGroup;
import org.omg.sysml.groups.GroupImport;
import org.omg.sysml.groups.GroupMember;
import org.omg.sysml.groups.GroupsFactory;
import org.omg.sysml.groups.GroupsPackage;
import org.omg.sysml.groups.Namespace;
import org.omg.sysml.groups.NamespaceImport;
import org.omg.sysml.groups.NamespaceMember;
import org.omg.sysml.groups.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GroupsPackageImpl extends EPackageImpl implements GroupsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namespaceMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupMemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum visibilityKindEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.omg.sysml.groups.GroupsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GroupsPackageImpl() {
		super(eNS_URI, GroupsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link GroupsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GroupsPackage init() {
		if (isInited) return (GroupsPackage)EPackage.Registry.INSTANCE.getEPackage(GroupsPackage.eNS_URI);

		// Obtain or create and register package
		GroupsPackageImpl theGroupsPackage = (GroupsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GroupsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GroupsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BehaviorsPackageImpl theBehaviorsPackage = (BehaviorsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BehaviorsPackage.eNS_URI) instanceof BehaviorsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BehaviorsPackage.eNS_URI) : BehaviorsPackage.eINSTANCE);
		ClassificationPackageImpl theClassificationPackage = (ClassificationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI) instanceof ClassificationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClassificationPackage.eNS_URI) : ClassificationPackage.eINSTANCE);
		CorePackageImpl theCorePackage = (CorePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) instanceof CorePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI) : CorePackage.eINSTANCE);

		// Create package meta-data objects
		theGroupsPackage.createPackageContents();
		theBehaviorsPackage.createPackageContents();
		theClassificationPackage.createPackageContents();
		theCorePackage.createPackageContents();

		// Initialize created meta-data
		theGroupsPackage.initializePackageContents();
		theBehaviorsPackage.initializePackageContents();
		theClassificationPackage.initializePackageContents();
		theCorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGroupsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GroupsPackage.eNS_URI, theGroupsPackage);
		return theGroupsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespace() {
		return namespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_NamespaceMember() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespace_NamespaceImport() {
		return (EReference)namespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespace__NameOf__Element() {
		return namespaceEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespaceImport() {
		return namespaceImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespaceImport_ImportingNamespace() {
		return (EReference)namespaceImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespaceImport_ImportedNamespace() {
		return (EReference)namespaceImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespaceImport_Visibility() {
		return (EAttribute)namespaceImportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespaceImport__ImportedMembers() {
		return namespaceImportEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementGroup() {
		return elementGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementGroup_Member() {
		return (EReference)elementGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementGroup_GroupImport() {
		return (EReference)elementGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementGroup_ImportedMember() {
		return (EReference)elementGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementGroup_OwnedMember() {
		return (EReference)elementGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementGroup_GroupMember() {
		return (EReference)elementGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupImport() {
		return groupImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupImport_ImportedGroup() {
		return (EReference)groupImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupImport_ImportingGroup() {
		return (EReference)groupImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupImport_Selecter() {
		return (EReference)groupImportEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGroupImport__ImportedMembers() {
		return groupImportEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamespaceMember() {
		return namespaceMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespaceMember_MemberName() {
		return (EAttribute)namespaceMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNamespaceMember_Namespace() {
		return (EReference)namespaceMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespaceMember_Visibility() {
		return (EAttribute)namespaceMemberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamespaceMember_Aliases() {
		return (EAttribute)namespaceMemberEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getNamespaceMember__IsDistinguishableFrom__NamespaceMember() {
		return namespaceMemberEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroupMember() {
		return groupMemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupMember_Group() {
		return (EReference)groupMemberEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupMember_MemberElement() {
		return (EReference)groupMemberEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroupMember_OwnedMemberElement() {
		return (EReference)groupMemberEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVisibilityKind() {
		return visibilityKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroupsFactory getGroupsFactory() {
		return (GroupsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		namespaceEClass = createEClass(NAMESPACE);
		createEReference(namespaceEClass, NAMESPACE__NAMESPACE_MEMBER);
		createEReference(namespaceEClass, NAMESPACE__NAMESPACE_IMPORT);
		createEOperation(namespaceEClass, NAMESPACE___NAME_OF__ELEMENT);

		namespaceImportEClass = createEClass(NAMESPACE_IMPORT);
		createEReference(namespaceImportEClass, NAMESPACE_IMPORT__IMPORTING_NAMESPACE);
		createEReference(namespaceImportEClass, NAMESPACE_IMPORT__IMPORTED_NAMESPACE);
		createEAttribute(namespaceImportEClass, NAMESPACE_IMPORT__VISIBILITY);
		createEOperation(namespaceImportEClass, NAMESPACE_IMPORT___IMPORTED_MEMBERS);

		elementGroupEClass = createEClass(ELEMENT_GROUP);
		createEReference(elementGroupEClass, ELEMENT_GROUP__MEMBER);
		createEReference(elementGroupEClass, ELEMENT_GROUP__GROUP_IMPORT);
		createEReference(elementGroupEClass, ELEMENT_GROUP__IMPORTED_MEMBER);
		createEReference(elementGroupEClass, ELEMENT_GROUP__OWNED_MEMBER);
		createEReference(elementGroupEClass, ELEMENT_GROUP__GROUP_MEMBER);

		groupImportEClass = createEClass(GROUP_IMPORT);
		createEReference(groupImportEClass, GROUP_IMPORT__IMPORTED_GROUP);
		createEReference(groupImportEClass, GROUP_IMPORT__IMPORTING_GROUP);
		createEReference(groupImportEClass, GROUP_IMPORT__SELECTER);
		createEOperation(groupImportEClass, GROUP_IMPORT___IMPORTED_MEMBERS);

		namespaceMemberEClass = createEClass(NAMESPACE_MEMBER);
		createEAttribute(namespaceMemberEClass, NAMESPACE_MEMBER__MEMBER_NAME);
		createEReference(namespaceMemberEClass, NAMESPACE_MEMBER__NAMESPACE);
		createEAttribute(namespaceMemberEClass, NAMESPACE_MEMBER__VISIBILITY);
		createEAttribute(namespaceMemberEClass, NAMESPACE_MEMBER__ALIASES);
		createEOperation(namespaceMemberEClass, NAMESPACE_MEMBER___IS_DISTINGUISHABLE_FROM__NAMESPACEMEMBER);

		groupMemberEClass = createEClass(GROUP_MEMBER);
		createEReference(groupMemberEClass, GROUP_MEMBER__GROUP);
		createEReference(groupMemberEClass, GROUP_MEMBER__MEMBER_ELEMENT);
		createEReference(groupMemberEClass, GROUP_MEMBER__OWNED_MEMBER_ELEMENT);

		// Create enums
		visibilityKindEEnum = createEEnum(VISIBILITY_KIND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		BehaviorsPackage theBehaviorsPackage = (BehaviorsPackage)EPackage.Registry.INSTANCE.getEPackage(BehaviorsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		namespaceEClass.getESuperTypes().add(this.getElementGroup());
		namespaceImportEClass.getESuperTypes().add(this.getGroupImport());
		elementGroupEClass.getESuperTypes().add(theCorePackage.getElement());
		groupImportEClass.getESuperTypes().add(theCorePackage.getRelationship());
		namespaceMemberEClass.getESuperTypes().add(this.getGroupMember());
		groupMemberEClass.getESuperTypes().add(theCorePackage.getRelationship());

		// Initialize classes, features, and operations; add parameters
		initEClass(namespaceEClass, Namespace.class, "Namespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamespace_NamespaceMember(), this.getNamespaceMember(), this.getNamespaceMember_Namespace(), "namespaceMember", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNamespace_NamespaceImport(), this.getNamespaceImport(), this.getNamespaceImport_ImportingNamespace(), "namespaceImport", null, 0, -1, Namespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getNamespace__NameOf__Element(), ecorePackage.getEString(), "nameOf", 0, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theCorePackage.getElement(), "element", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(namespaceImportEClass, NamespaceImport.class, "NamespaceImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNamespaceImport_ImportingNamespace(), this.getNamespace(), this.getNamespace_NamespaceImport(), "importingNamespace", null, 1, 1, NamespaceImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNamespaceImport_ImportedNamespace(), this.getNamespace(), null, "importedNamespace", null, 1, 1, NamespaceImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNamespaceImport_Visibility(), this.getVisibilityKind(), "visibility", null, 1, 1, NamespaceImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getNamespaceImport__ImportedMembers(), theCorePackage.getElement(), "importedMembers", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(elementGroupEClass, ElementGroup.class, "ElementGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElementGroup_Member(), theCorePackage.getElement(), null, "member", null, 0, -1, ElementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementGroup_GroupImport(), this.getGroupImport(), this.getGroupImport_ImportingGroup(), "groupImport", null, 0, -1, ElementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementGroup_ImportedMember(), theCorePackage.getElement(), null, "importedMember", null, 0, -1, ElementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEReference(getElementGroup_OwnedMember(), theCorePackage.getElement(), null, "ownedMember", null, 0, -1, ElementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementGroup_GroupMember(), this.getGroupMember(), this.getGroupMember_Group(), "groupMember", null, 0, -1, ElementGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupImportEClass, GroupImport.class, "GroupImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupImport_ImportedGroup(), this.getElementGroup(), null, "importedGroup", null, 1, 1, GroupImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGroupImport_ImportingGroup(), this.getElementGroup(), this.getElementGroup_GroupImport(), "importingGroup", null, 1, 1, GroupImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGroupImport_Selecter(), theBehaviorsPackage.getBehavior(), null, "selecter", null, 0, 1, GroupImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getGroupImport__ImportedMembers(), theCorePackage.getElement(), "importedMembers", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(namespaceMemberEClass, NamespaceMember.class, "NamespaceMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamespaceMember_MemberName(), ecorePackage.getEString(), "memberName", null, 0, 1, NamespaceMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNamespaceMember_Namespace(), this.getNamespace(), this.getNamespace_NamespaceMember(), "namespace", null, 0, 1, NamespaceMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNamespaceMember_Visibility(), this.getVisibilityKind(), "visibility", null, 1, 1, NamespaceMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getNamespaceMember_Aliases(), ecorePackage.getEString(), "aliases", null, 0, -1, NamespaceMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = initEOperation(getNamespaceMember__IsDistinguishableFrom__NamespaceMember(), ecorePackage.getEBoolean(), "isDistinguishableFrom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getNamespaceMember(), "naming", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(groupMemberEClass, GroupMember.class, "GroupMember", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGroupMember_Group(), this.getElementGroup(), this.getElementGroup_GroupMember(), "group", null, 1, 1, GroupMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGroupMember_MemberElement(), theCorePackage.getElement(), null, "memberElement", null, 0, 1, GroupMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGroupMember_OwnedMemberElement(), theCorePackage.getElement(), null, "ownedMemberElement", null, 0, 1, GroupMember.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(visibilityKindEEnum, VisibilityKind.class, "VisibilityKind");
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PUBLIC);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PRIVATE);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PROTECTED);
		addEEnumLiteral(visibilityKindEEnum, VisibilityKind.PACKAGE);

		// Create resource
		createResource(eNS_URI);
	}

} //GroupsPackageImpl