/**
 */
package org.vgu.se.ocl.dm.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.vgu.se.ocl.dm.EAssociation;
import org.vgu.se.ocl.dm.EDataModel;
import org.vgu.se.ocl.dm.EEntity;
import org.vgu.se.ocl.dm.EMultiplicity;
import org.vgu.se.ocl.dm.dmFactory;
import org.vgu.se.ocl.dm.dmPackage;

import org.vgu.se.ocl.exp.expPackage;

import org.vgu.se.ocl.exp.impl.expPackageImpl;

import org.vgu.se.ocl.type.impl.typePackageImpl;

import org.vgu.se.ocl.type.typePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class dmPackageImpl extends EPackageImpl implements dmPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eEntityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eAssociationEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eDataModelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eAttributeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum eMultiplicityEEnum = null;

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
     * @see org.vgu.se.ocl.dm.dmPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private dmPackageImpl() {
        super(eNS_URI, dmFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link dmPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static dmPackage init() {
        if (isInited)
            return (dmPackage) EPackage.Registry.INSTANCE
                .getEPackage(dmPackage.eNS_URI);

        // Obtain or create and register package
        Object registereddmPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        dmPackageImpl thedmPackage = registereddmPackage instanceof dmPackageImpl
            ? (dmPackageImpl) registereddmPackage
            : new dmPackageImpl();

        isInited = true;

        // Initialize simple dependencies
        XMLTypePackage.eINSTANCE.eClass();

        // Obtain or create and register interdependencies
        Object registeredPackage = EPackage.Registry.INSTANCE
            .getEPackage(expPackage.eNS_URI);
        expPackageImpl theexpPackage = (expPackageImpl) (registeredPackage instanceof expPackageImpl
            ? registeredPackage
            : expPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE
            .getEPackage(typePackage.eNS_URI);
        typePackageImpl thetypePackage = (typePackageImpl) (registeredPackage instanceof typePackageImpl
            ? registeredPackage
            : typePackage.eINSTANCE);

        // Create package meta-data objects
        thedmPackage.createPackageContents();
        theexpPackage.createPackageContents();
        thetypePackage.createPackageContents();

        // Initialize created meta-data
        thedmPackage.initializePackageContents();
        theexpPackage.initializePackageContents();
        thetypePackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        thedmPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(dmPackage.eNS_URI, thedmPackage);
        return thedmPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEEntity() {
        return eEntityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEEntity_Name() {
        return (EAttribute) eEntityEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEEntity_Ends() {
        return (EReference) eEntityEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEEntity_Attributes() {
        return (EReference) eEntityEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEAssociation() {
        return eAssociationEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEAssociation_Name() {
        return (EAttribute) eAssociationEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEAssociation_Opp() {
        return (EAttribute) eAssociationEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEAssociation_Mult() {
        return (EAttribute) eAssociationEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEAssociation_Target() {
        return (EReference) eAssociationEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEDataModel() {
        return eDataModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEDataModel_Classes() {
        return (EReference) eDataModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEAttribute() {
        return eAttributeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEAttribute_Name() {
        return (EAttribute) eAttributeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEAttribute_Type() {
        return (EAttribute) eAttributeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getEMultiplicity() {
        return eMultiplicityEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public dmFactory getdmFactory() {
        return (dmFactory) getEFactoryInstance();
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
        if (isCreated)
            return;
        isCreated = true;

        // Create classes and their features
        eEntityEClass = createEClass(EENTITY);
        createEAttribute(eEntityEClass, EENTITY__NAME);
        createEReference(eEntityEClass, EENTITY__ENDS);
        createEReference(eEntityEClass, EENTITY__ATTRIBUTES);

        eAssociationEClass = createEClass(EASSOCIATION);
        createEAttribute(eAssociationEClass, EASSOCIATION__NAME);
        createEAttribute(eAssociationEClass, EASSOCIATION__OPP);
        createEAttribute(eAssociationEClass, EASSOCIATION__MULT);
        createEReference(eAssociationEClass, EASSOCIATION__TARGET);

        eDataModelEClass = createEClass(EDATA_MODEL);
        createEReference(eDataModelEClass, EDATA_MODEL__CLASSES);

        eAttributeEClass = createEClass(EATTRIBUTE);
        createEAttribute(eAttributeEClass, EATTRIBUTE__NAME);
        createEAttribute(eAttributeEClass, EATTRIBUTE__TYPE);

        // Create enums
        eMultiplicityEEnum = createEEnum(EMULTIPLICITY);
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
        if (isInitialized)
            return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Obtain other dependent packages
        typePackage thetypePackage = (typePackage) EPackage.Registry.INSTANCE
            .getEPackage(typePackage.eNS_URI);
        XMLTypePackage theXMLTypePackage = (XMLTypePackage) EPackage.Registry.INSTANCE
            .getEPackage(XMLTypePackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        eEntityEClass.getESuperTypes().add(thetypePackage.getEClassifier());

        // Initialize classes, features, and operations; add parameters
        initEClass(eEntityEClass, EEntity.class, "EEntity", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEEntity_Name(), theXMLTypePackage.getString(), "name",
            null, 0, 1, EEntity.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);
        initEReference(getEEntity_Ends(), this.getEAssociation(), null, "ends",
            null, 0, -1, EEntity.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
            IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEEntity_Attributes(), this.getEAttribute(), null,
            "attributes", null, 0, -1, EEntity.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eAssociationEClass, EAssociation.class, "EAssociation",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEAssociation_Name(), ecorePackage.getEString(),
            "name", null, 0, 1, EAssociation.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);
        initEAttribute(getEAssociation_Opp(), ecorePackage.getEString(), "opp",
            null, 0, 1, EAssociation.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);
        initEAttribute(getEAssociation_Mult(), this.getEMultiplicity(), "mult",
            null, 0, 1, EAssociation.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);
        initEReference(getEAssociation_Target(), this.getEEntity(), null,
            "target", null, 1, 1, EAssociation.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eDataModelEClass, EDataModel.class, "EDataModel",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEDataModel_Classes(), this.getEEntity(), null,
            "classes", null, 0, -1, EDataModel.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eAttributeEClass, org.vgu.se.ocl.dm.EAttribute.class,
            "EAttribute", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEAttribute_Name(), ecorePackage.getEString(), "name",
            null, 0, 1, org.vgu.se.ocl.dm.EAttribute.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEAttribute_Type(), ecorePackage.getEString(), "type",
            null, 0, 1, org.vgu.se.ocl.dm.EAttribute.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(eMultiplicityEEnum, EMultiplicity.class, "EMultiplicity");
        addEEnumLiteral(eMultiplicityEEnum, EMultiplicity.ONE_LITERAL);
        addEEnumLiteral(eMultiplicityEEnum, EMultiplicity.MANY_LITERAL);

        // Create resource
        createResource(eNS_URI);
    }

} //dmPackageImpl
