/**
 */
package org.vgu.se.ocl.type.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.vgu.se.ocl.dm.dmPackage;

import org.vgu.se.ocl.dm.impl.dmPackageImpl;

import org.vgu.se.ocl.exp.expPackage;

import org.vgu.se.ocl.exp.impl.expPackageImpl;

import org.vgu.se.ocl.type.EAnyType;
import org.vgu.se.ocl.type.EBagType;
import org.vgu.se.ocl.type.EClassifier;
import org.vgu.se.ocl.type.ECollectionType;
import org.vgu.se.ocl.type.EDataType;
import org.vgu.se.ocl.type.EInvalidType;
import org.vgu.se.ocl.type.EMessageType;
import org.vgu.se.ocl.type.EOrderedSetType;
import org.vgu.se.ocl.type.EPrimitiveType;
import org.vgu.se.ocl.type.ESequenceType;
import org.vgu.se.ocl.type.ESetType;
import org.vgu.se.ocl.type.ESignal;
import org.vgu.se.ocl.type.ETupleType;
import org.vgu.se.ocl.type.EVoidType;
import org.vgu.se.ocl.type.typeFactory;
import org.vgu.se.ocl.type.typePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class typePackageImpl extends EPackageImpl implements typePackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eClassifierEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eDataTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eInvalidTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eVoidTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eAnyTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eMessageTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eCollectionTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ePrimitiveTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eTupleTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eOrderedSetTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eSequenceTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eBagTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eSetTypeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eSignalEClass = null;

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
     * @see org.vgu.se.ocl.type.typePackage#eNS_URI
     * @see #init()
     * @generated
     */
    private typePackageImpl() {
        super(eNS_URI, typeFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link typePackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static typePackage init() {
        if (isInited)
            return (typePackage) EPackage.Registry.INSTANCE
                .getEPackage(typePackage.eNS_URI);

        // Obtain or create and register package
        Object registeredtypePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        typePackageImpl thetypePackage = registeredtypePackage instanceof typePackageImpl
            ? (typePackageImpl) registeredtypePackage
            : new typePackageImpl();

        isInited = true;

        // Obtain or create and register interdependencies
        Object registeredPackage = EPackage.Registry.INSTANCE
            .getEPackage(dmPackage.eNS_URI);
        dmPackageImpl thedmPackage = (dmPackageImpl) (registeredPackage instanceof dmPackageImpl
            ? registeredPackage
            : dmPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE
            .getEPackage(expPackage.eNS_URI);
        expPackageImpl theexpPackage = (expPackageImpl) (registeredPackage instanceof expPackageImpl
            ? registeredPackage
            : expPackage.eINSTANCE);

        // Create package meta-data objects
        thetypePackage.createPackageContents();
        thedmPackage.createPackageContents();
        theexpPackage.createPackageContents();

        // Initialize created meta-data
        thetypePackage.initializePackageContents();
        thedmPackage.initializePackageContents();
        theexpPackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        thetypePackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(typePackage.eNS_URI, thetypePackage);
        return thetypePackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEClassifier() {
        return eClassifierEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEDataType() {
        return eDataTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEInvalidType() {
        return eInvalidTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEVoidType() {
        return eVoidTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEAnyType() {
        return eAnyTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEMessageType() {
        return eMessageTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEMessageType_ReferredSignal() {
        return (EReference) eMessageTypeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEMessageType_ReferredOperation() {
        return (EAttribute) eMessageTypeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getECollectionType() {
        return eCollectionTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getECollectionType_ElementType() {
        return (EReference) eCollectionTypeEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEPrimitiveType() {
        return ePrimitiveTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getETupleType() {
        return eTupleTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEOrderedSetType() {
        return eOrderedSetTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getESequenceType() {
        return eSequenceTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEBagType() {
        return eBagTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getESetType() {
        return eSetTypeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getESignal() {
        return eSignalEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public typeFactory gettypeFactory() {
        return (typeFactory) getEFactoryInstance();
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
        eClassifierEClass = createEClass(ECLASSIFIER);

        eDataTypeEClass = createEClass(EDATA_TYPE);

        eInvalidTypeEClass = createEClass(EINVALID_TYPE);

        eVoidTypeEClass = createEClass(EVOID_TYPE);

        eAnyTypeEClass = createEClass(EANY_TYPE);

        eMessageTypeEClass = createEClass(EMESSAGE_TYPE);
        createEReference(eMessageTypeEClass, EMESSAGE_TYPE__REFERRED_SIGNAL);
        createEAttribute(eMessageTypeEClass, EMESSAGE_TYPE__REFERRED_OPERATION);

        eCollectionTypeEClass = createEClass(ECOLLECTION_TYPE);
        createEReference(eCollectionTypeEClass, ECOLLECTION_TYPE__ELEMENT_TYPE);

        ePrimitiveTypeEClass = createEClass(EPRIMITIVE_TYPE);

        eTupleTypeEClass = createEClass(ETUPLE_TYPE);

        eOrderedSetTypeEClass = createEClass(EORDERED_SET_TYPE);

        eSequenceTypeEClass = createEClass(ESEQUENCE_TYPE);

        eBagTypeEClass = createEClass(EBAG_TYPE);

        eSetTypeEClass = createEClass(ESET_TYPE);

        eSignalEClass = createEClass(ESIGNAL);
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
        expPackage theexpPackage = (expPackage) EPackage.Registry.INSTANCE
            .getEPackage(expPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        eDataTypeEClass.getESuperTypes().add(this.getEClassifier());
        eInvalidTypeEClass.getESuperTypes().add(this.getEClassifier());
        eVoidTypeEClass.getESuperTypes().add(this.getEClassifier());
        eAnyTypeEClass.getESuperTypes().add(this.getEClassifier());
        eMessageTypeEClass.getESuperTypes().add(this.getEClassifier());
        eCollectionTypeEClass.getESuperTypes().add(this.getEDataType());
        ePrimitiveTypeEClass.getESuperTypes().add(this.getEDataType());
        eTupleTypeEClass.getESuperTypes().add(this.getEDataType());
        eOrderedSetTypeEClass.getESuperTypes().add(this.getECollectionType());
        eSequenceTypeEClass.getESuperTypes().add(this.getECollectionType());
        eBagTypeEClass.getESuperTypes().add(this.getECollectionType());
        eSetTypeEClass.getESuperTypes().add(this.getECollectionType());

        // Initialize classes, features, and operations; add parameters
        initEClass(eClassifierEClass, EClassifier.class, "EClassifier",
            IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eDataTypeEClass, EDataType.class, "EDataType", IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eInvalidTypeEClass, EInvalidType.class, "EInvalidType",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eVoidTypeEClass, EVoidType.class, "EVoidType", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eAnyTypeEClass, EAnyType.class, "EAnyType", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eMessageTypeEClass, EMessageType.class, "EMessageType",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEMessageType_ReferredSignal(), this.getESignal(),
            null, "referredSignal", null, 0, 1, EMessageType.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);
        initEAttribute(getEMessageType_ReferredOperation(),
            theexpPackage.getEOperator(), "referredOperation", null, 0, 1,
            EMessageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eCollectionTypeEClass, ECollectionType.class,
            "ECollectionType", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
        initEReference(getECollectionType_ElementType(), this.getEClassifier(),
            null, "elementType", null, 1, 1, ECollectionType.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);

        initEClass(ePrimitiveTypeEClass, EPrimitiveType.class, "EPrimitiveType",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eTupleTypeEClass, ETupleType.class, "ETupleType",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eOrderedSetTypeEClass, EOrderedSetType.class,
            "EOrderedSetType", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);

        initEClass(eSequenceTypeEClass, ESequenceType.class, "ESequenceType",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eBagTypeEClass, EBagType.class, "EBagType", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eSetTypeEClass, ESetType.class, "ESetType", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eSignalEClass, ESignal.class, "ESignal", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        // Create resource
        createResource(eNS_URI);
    }

} //typePackageImpl
