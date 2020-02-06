/**
 */
package org.vgu.se.ocl.type;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.vgu.se.ocl.type.TYPEFactory
 * @model kind="package"
 * @generated
 */
public interface TYPEPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "type";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.example.org/ocl/type";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "TYPE";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    TYPEPackage eINSTANCE = org.vgu.se.ocl.type.impl.TYPEPackageImpl.init();

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.type.impl.EClassifierImpl <em>EClassifier</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.type.impl.EClassifierImpl
     * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getEClassifier()
     * @generated
     */
    int ECLASSIFIER = 0;

    /**
     * The number of structural features of the '<em>EClassifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECLASSIFIER_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>EClassifier</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECLASSIFIER_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.type.impl.EDataTypeImpl <em>EData Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.type.impl.EDataTypeImpl
     * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getEDataType()
     * @generated
     */
    int EDATA_TYPE = 1;

    /**
     * The number of structural features of the '<em>EData Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDATA_TYPE_FEATURE_COUNT = ECLASSIFIER_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>EData Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDATA_TYPE_OPERATION_COUNT = ECLASSIFIER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.type.impl.EInvalidTypeImpl <em>EInvalid Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.type.impl.EInvalidTypeImpl
     * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getEInvalidType()
     * @generated
     */
    int EINVALID_TYPE = 2;

    /**
     * The number of structural features of the '<em>EInvalid Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EINVALID_TYPE_FEATURE_COUNT = ECLASSIFIER_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>EInvalid Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EINVALID_TYPE_OPERATION_COUNT = ECLASSIFIER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.type.impl.EVoidTypeImpl <em>EVoid Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.type.impl.EVoidTypeImpl
     * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getEVoidType()
     * @generated
     */
    int EVOID_TYPE = 3;

    /**
     * The number of structural features of the '<em>EVoid Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVOID_TYPE_FEATURE_COUNT = ECLASSIFIER_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>EVoid Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVOID_TYPE_OPERATION_COUNT = ECLASSIFIER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.type.impl.EAnyTypeImpl <em>EAny Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.type.impl.EAnyTypeImpl
     * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getEAnyType()
     * @generated
     */
    int EANY_TYPE = 4;

    /**
     * The number of structural features of the '<em>EAny Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EANY_TYPE_FEATURE_COUNT = ECLASSIFIER_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>EAny Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EANY_TYPE_OPERATION_COUNT = ECLASSIFIER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.type.impl.EMessageTypeImpl <em>EMessage Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.type.impl.EMessageTypeImpl
     * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getEMessageType()
     * @generated
     */
    int EMESSAGE_TYPE = 5;

    /**
     * The feature id for the '<em><b>Referred Signal</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMESSAGE_TYPE__REFERRED_SIGNAL = ECLASSIFIER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Referred Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMESSAGE_TYPE__REFERRED_OPERATION = ECLASSIFIER_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>EMessage Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMESSAGE_TYPE_FEATURE_COUNT = ECLASSIFIER_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>EMessage Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMESSAGE_TYPE_OPERATION_COUNT = ECLASSIFIER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.type.impl.ECollectionTypeImpl <em>ECollection Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.type.impl.ECollectionTypeImpl
     * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getECollectionType()
     * @generated
     */
    int ECOLLECTION_TYPE = 6;

    /**
     * The feature id for the '<em><b>Element Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECOLLECTION_TYPE__ELEMENT_TYPE = EDATA_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>ECollection Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECOLLECTION_TYPE_FEATURE_COUNT = EDATA_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>ECollection Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECOLLECTION_TYPE_OPERATION_COUNT = EDATA_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.type.impl.EPrimitiveTypeImpl <em>EPrimitive Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.type.impl.EPrimitiveTypeImpl
     * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getEPrimitiveType()
     * @generated
     */
    int EPRIMITIVE_TYPE = 7;

    /**
     * The number of structural features of the '<em>EPrimitive Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPRIMITIVE_TYPE_FEATURE_COUNT = EDATA_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>EPrimitive Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPRIMITIVE_TYPE_OPERATION_COUNT = EDATA_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.type.impl.ETupleTypeImpl <em>ETuple Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.type.impl.ETupleTypeImpl
     * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getETupleType()
     * @generated
     */
    int ETUPLE_TYPE = 8;

    /**
     * The number of structural features of the '<em>ETuple Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ETUPLE_TYPE_FEATURE_COUNT = EDATA_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>ETuple Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ETUPLE_TYPE_OPERATION_COUNT = EDATA_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.type.impl.EOrderedSetTypeImpl <em>EOrdered Set Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.type.impl.EOrderedSetTypeImpl
     * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getEOrderedSetType()
     * @generated
     */
    int EORDERED_SET_TYPE = 9;

    /**
     * The feature id for the '<em><b>Element Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EORDERED_SET_TYPE__ELEMENT_TYPE = ECOLLECTION_TYPE__ELEMENT_TYPE;

    /**
     * The number of structural features of the '<em>EOrdered Set Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EORDERED_SET_TYPE_FEATURE_COUNT = ECOLLECTION_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>EOrdered Set Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EORDERED_SET_TYPE_OPERATION_COUNT = ECOLLECTION_TYPE_OPERATION_COUNT
        + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.type.impl.ESequenceTypeImpl <em>ESequence Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.type.impl.ESequenceTypeImpl
     * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getESequenceType()
     * @generated
     */
    int ESEQUENCE_TYPE = 10;

    /**
     * The feature id for the '<em><b>Element Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESEQUENCE_TYPE__ELEMENT_TYPE = ECOLLECTION_TYPE__ELEMENT_TYPE;

    /**
     * The number of structural features of the '<em>ESequence Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESEQUENCE_TYPE_FEATURE_COUNT = ECOLLECTION_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>ESequence Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESEQUENCE_TYPE_OPERATION_COUNT = ECOLLECTION_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.type.impl.EBagTypeImpl <em>EBag Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.type.impl.EBagTypeImpl
     * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getEBagType()
     * @generated
     */
    int EBAG_TYPE = 11;

    /**
     * The feature id for the '<em><b>Element Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBAG_TYPE__ELEMENT_TYPE = ECOLLECTION_TYPE__ELEMENT_TYPE;

    /**
     * The number of structural features of the '<em>EBag Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBAG_TYPE_FEATURE_COUNT = ECOLLECTION_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>EBag Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBAG_TYPE_OPERATION_COUNT = ECOLLECTION_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.type.impl.ESetTypeImpl <em>ESet Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.type.impl.ESetTypeImpl
     * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getESetType()
     * @generated
     */
    int ESET_TYPE = 12;

    /**
     * The feature id for the '<em><b>Element Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESET_TYPE__ELEMENT_TYPE = ECOLLECTION_TYPE__ELEMENT_TYPE;

    /**
     * The number of structural features of the '<em>ESet Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESET_TYPE_FEATURE_COUNT = ECOLLECTION_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>ESet Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESET_TYPE_OPERATION_COUNT = ECOLLECTION_TYPE_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.type.impl.ESignalImpl <em>ESignal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.type.impl.ESignalImpl
     * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getESignal()
     * @generated
     */
    int ESIGNAL = 13;

    /**
     * The number of structural features of the '<em>ESignal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESIGNAL_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>ESignal</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESIGNAL_OPERATION_COUNT = 0;

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.type.EClassifier <em>EClassifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EClassifier</em>'.
     * @see org.vgu.se.ocl.type.EClassifier
     * @generated
     */
    EClass getEClassifier();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.type.EDataType <em>EData Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EData Type</em>'.
     * @see org.vgu.se.ocl.type.EDataType
     * @generated
     */
    EClass getEDataType();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.type.EInvalidType <em>EInvalid Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EInvalid Type</em>'.
     * @see org.vgu.se.ocl.type.EInvalidType
     * @generated
     */
    EClass getEInvalidType();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.type.EVoidType <em>EVoid Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EVoid Type</em>'.
     * @see org.vgu.se.ocl.type.EVoidType
     * @generated
     */
    EClass getEVoidType();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.type.EAnyType <em>EAny Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EAny Type</em>'.
     * @see org.vgu.se.ocl.type.EAnyType
     * @generated
     */
    EClass getEAnyType();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.type.EMessageType <em>EMessage Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EMessage Type</em>'.
     * @see org.vgu.se.ocl.type.EMessageType
     * @generated
     */
    EClass getEMessageType();

    /**
     * Returns the meta object for the reference '{@link org.vgu.se.ocl.type.EMessageType#getReferredSignal <em>Referred Signal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Referred Signal</em>'.
     * @see org.vgu.se.ocl.type.EMessageType#getReferredSignal()
     * @see #getEMessageType()
     * @generated
     */
    EReference getEMessageType_ReferredSignal();

    /**
     * Returns the meta object for the attribute '{@link org.vgu.se.ocl.type.EMessageType#getReferredOperation <em>Referred Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Referred Operation</em>'.
     * @see org.vgu.se.ocl.type.EMessageType#getReferredOperation()
     * @see #getEMessageType()
     * @generated
     */
    EAttribute getEMessageType_ReferredOperation();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.type.ECollectionType <em>ECollection Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ECollection Type</em>'.
     * @see org.vgu.se.ocl.type.ECollectionType
     * @generated
     */
    EClass getECollectionType();

    /**
     * Returns the meta object for the reference '{@link org.vgu.se.ocl.type.ECollectionType#getElementType <em>Element Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Element Type</em>'.
     * @see org.vgu.se.ocl.type.ECollectionType#getElementType()
     * @see #getECollectionType()
     * @generated
     */
    EReference getECollectionType_ElementType();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.type.EPrimitiveType <em>EPrimitive Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EPrimitive Type</em>'.
     * @see org.vgu.se.ocl.type.EPrimitiveType
     * @generated
     */
    EClass getEPrimitiveType();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.type.ETupleType <em>ETuple Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ETuple Type</em>'.
     * @see org.vgu.se.ocl.type.ETupleType
     * @generated
     */
    EClass getETupleType();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.type.EOrderedSetType <em>EOrdered Set Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EOrdered Set Type</em>'.
     * @see org.vgu.se.ocl.type.EOrderedSetType
     * @generated
     */
    EClass getEOrderedSetType();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.type.ESequenceType <em>ESequence Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ESequence Type</em>'.
     * @see org.vgu.se.ocl.type.ESequenceType
     * @generated
     */
    EClass getESequenceType();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.type.EBagType <em>EBag Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EBag Type</em>'.
     * @see org.vgu.se.ocl.type.EBagType
     * @generated
     */
    EClass getEBagType();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.type.ESetType <em>ESet Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ESet Type</em>'.
     * @see org.vgu.se.ocl.type.ESetType
     * @generated
     */
    EClass getESetType();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.type.ESignal <em>ESignal</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ESignal</em>'.
     * @see org.vgu.se.ocl.type.ESignal
     * @generated
     */
    EClass getESignal();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    TYPEFactory getTYPEFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.type.impl.EClassifierImpl <em>EClassifier</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.type.impl.EClassifierImpl
         * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getEClassifier()
         * @generated
         */
        EClass ECLASSIFIER = eINSTANCE.getEClassifier();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.type.impl.EDataTypeImpl <em>EData Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.type.impl.EDataTypeImpl
         * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getEDataType()
         * @generated
         */
        EClass EDATA_TYPE = eINSTANCE.getEDataType();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.type.impl.EInvalidTypeImpl <em>EInvalid Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.type.impl.EInvalidTypeImpl
         * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getEInvalidType()
         * @generated
         */
        EClass EINVALID_TYPE = eINSTANCE.getEInvalidType();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.type.impl.EVoidTypeImpl <em>EVoid Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.type.impl.EVoidTypeImpl
         * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getEVoidType()
         * @generated
         */
        EClass EVOID_TYPE = eINSTANCE.getEVoidType();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.type.impl.EAnyTypeImpl <em>EAny Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.type.impl.EAnyTypeImpl
         * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getEAnyType()
         * @generated
         */
        EClass EANY_TYPE = eINSTANCE.getEAnyType();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.type.impl.EMessageTypeImpl <em>EMessage Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.type.impl.EMessageTypeImpl
         * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getEMessageType()
         * @generated
         */
        EClass EMESSAGE_TYPE = eINSTANCE.getEMessageType();

        /**
         * The meta object literal for the '<em><b>Referred Signal</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EMESSAGE_TYPE__REFERRED_SIGNAL = eINSTANCE
            .getEMessageType_ReferredSignal();

        /**
         * The meta object literal for the '<em><b>Referred Operation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EMESSAGE_TYPE__REFERRED_OPERATION = eINSTANCE
            .getEMessageType_ReferredOperation();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.type.impl.ECollectionTypeImpl <em>ECollection Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.type.impl.ECollectionTypeImpl
         * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getECollectionType()
         * @generated
         */
        EClass ECOLLECTION_TYPE = eINSTANCE.getECollectionType();

        /**
         * The meta object literal for the '<em><b>Element Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ECOLLECTION_TYPE__ELEMENT_TYPE = eINSTANCE
            .getECollectionType_ElementType();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.type.impl.EPrimitiveTypeImpl <em>EPrimitive Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.type.impl.EPrimitiveTypeImpl
         * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getEPrimitiveType()
         * @generated
         */
        EClass EPRIMITIVE_TYPE = eINSTANCE.getEPrimitiveType();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.type.impl.ETupleTypeImpl <em>ETuple Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.type.impl.ETupleTypeImpl
         * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getETupleType()
         * @generated
         */
        EClass ETUPLE_TYPE = eINSTANCE.getETupleType();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.type.impl.EOrderedSetTypeImpl <em>EOrdered Set Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.type.impl.EOrderedSetTypeImpl
         * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getEOrderedSetType()
         * @generated
         */
        EClass EORDERED_SET_TYPE = eINSTANCE.getEOrderedSetType();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.type.impl.ESequenceTypeImpl <em>ESequence Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.type.impl.ESequenceTypeImpl
         * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getESequenceType()
         * @generated
         */
        EClass ESEQUENCE_TYPE = eINSTANCE.getESequenceType();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.type.impl.EBagTypeImpl <em>EBag Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.type.impl.EBagTypeImpl
         * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getEBagType()
         * @generated
         */
        EClass EBAG_TYPE = eINSTANCE.getEBagType();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.type.impl.ESetTypeImpl <em>ESet Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.type.impl.ESetTypeImpl
         * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getESetType()
         * @generated
         */
        EClass ESET_TYPE = eINSTANCE.getESetType();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.type.impl.ESignalImpl <em>ESignal</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.type.impl.ESignalImpl
         * @see org.vgu.se.ocl.type.impl.TYPEPackageImpl#getESignal()
         * @generated
         */
        EClass ESIGNAL = eINSTANCE.getESignal();

    }

} //TYPEPackage
