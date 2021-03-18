/**
 */
package ocl.type;

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
 * @see ocl.type.TypeFactory
 * @model kind="package"
 * @generated
 */
public interface TypePackage extends EPackage {
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
	TypePackage eINSTANCE = ocl.type.impl.TypePackageImpl.init();

	/**
	 * The meta object id for the '{@link ocl.type.impl.ClassifierImpl <em>Classifier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.type.impl.ClassifierImpl
	 * @see ocl.type.impl.TypePackageImpl#getClassifier()
	 * @generated
	 */
	int CLASSIFIER = 0;

	/**
	 * The number of structural features of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Classifier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASSIFIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ocl.type.impl.DataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.type.impl.DataTypeImpl
	 * @see ocl.type.impl.TypePackageImpl#getDataType()
	 * @generated
	 */
	int DATA_TYPE = 1;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_TYPE_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.type.impl.InvalidTypeImpl <em>Invalid Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.type.impl.InvalidTypeImpl
	 * @see ocl.type.impl.TypePackageImpl#getInvalidType()
	 * @generated
	 */
	int INVALID_TYPE = 2;

	/**
	 * The number of structural features of the '<em>Invalid Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_TYPE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Invalid Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVALID_TYPE_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.type.impl.VoidTypeImpl <em>Void Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.type.impl.VoidTypeImpl
	 * @see ocl.type.impl.TypePackageImpl#getVoidType()
	 * @generated
	 */
	int VOID_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Void Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Void Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOID_TYPE_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.type.impl.AnyTypeImpl <em>Any Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.type.impl.AnyTypeImpl
	 * @see ocl.type.impl.TypePackageImpl#getAnyType()
	 * @generated
	 */
	int ANY_TYPE = 4;

	/**
	 * The number of structural features of the '<em>Any Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TYPE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Any Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANY_TYPE_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.type.impl.MessageTypeImpl <em>Message Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.type.impl.MessageTypeImpl
	 * @see ocl.type.impl.TypePackageImpl#getMessageType()
	 * @generated
	 */
	int MESSAGE_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Referred Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__REFERRED_SIGNAL = CLASSIFIER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referred Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE__REFERRED_OPERATION = CLASSIFIER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Message Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE_FEATURE_COUNT = CLASSIFIER_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Message Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_TYPE_OPERATION_COUNT = CLASSIFIER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.type.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.type.impl.CollectionTypeImpl
	 * @see ocl.type.impl.TypePackageImpl#getCollectionType()
	 * @generated
	 */
	int COLLECTION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE__ELEMENT_TYPE = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Collection Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLECTION_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.type.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.type.impl.PrimitiveTypeImpl
	 * @see ocl.type.impl.TypePackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 7;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.type.impl.TupleTypeImpl <em>Tuple Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.type.impl.TupleTypeImpl
	 * @see ocl.type.impl.TypePackageImpl#getTupleType()
	 * @generated
	 */
	int TUPLE_TYPE = 8;

	/**
	 * The number of structural features of the '<em>Tuple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_FEATURE_COUNT = DATA_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Tuple Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TUPLE_TYPE_OPERATION_COUNT = DATA_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.type.impl.OrderedSetTypeImpl <em>Ordered Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.type.impl.OrderedSetTypeImpl
	 * @see ocl.type.impl.TypePackageImpl#getOrderedSetType()
	 * @generated
	 */
	int ORDERED_SET_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE__ELEMENT_TYPE = COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The number of structural features of the '<em>Ordered Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE_FEATURE_COUNT = COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Ordered Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDERED_SET_TYPE_OPERATION_COUNT = COLLECTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.type.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.type.impl.SequenceTypeImpl
	 * @see ocl.type.impl.TypePackageImpl#getSequenceType()
	 * @generated
	 */
	int SEQUENCE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE__ELEMENT_TYPE = COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The number of structural features of the '<em>Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE_FEATURE_COUNT = COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sequence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEQUENCE_TYPE_OPERATION_COUNT = COLLECTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.type.impl.BagTypeImpl <em>Bag Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.type.impl.BagTypeImpl
	 * @see ocl.type.impl.TypePackageImpl#getBagType()
	 * @generated
	 */
	int BAG_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE__ELEMENT_TYPE = COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The number of structural features of the '<em>Bag Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE_FEATURE_COUNT = COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bag Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAG_TYPE_OPERATION_COUNT = COLLECTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.type.impl.SetTypeImpl <em>Set Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.type.impl.SetTypeImpl
	 * @see ocl.type.impl.TypePackageImpl#getSetType()
	 * @generated
	 */
	int SET_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE__ELEMENT_TYPE = COLLECTION_TYPE__ELEMENT_TYPE;

	/**
	 * The number of structural features of the '<em>Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE_FEATURE_COUNT = COLLECTION_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Set Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TYPE_OPERATION_COUNT = COLLECTION_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.type.impl.SignalImpl <em>Signal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.type.impl.SignalImpl
	 * @see ocl.type.impl.TypePackageImpl#getSignal()
	 * @generated
	 */
	int SIGNAL = 13;

	/**
	 * The number of structural features of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Signal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIGNAL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link ocl.type.Classifier <em>Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Classifier</em>'.
	 * @see ocl.type.Classifier
	 * @generated
	 */
	EClass getClassifier();

	/**
	 * Returns the meta object for class '{@link ocl.type.DataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see ocl.type.DataType
	 * @generated
	 */
	EClass getDataType();

	/**
	 * Returns the meta object for class '{@link ocl.type.InvalidType <em>Invalid Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Invalid Type</em>'.
	 * @see ocl.type.InvalidType
	 * @generated
	 */
	EClass getInvalidType();

	/**
	 * Returns the meta object for class '{@link ocl.type.VoidType <em>Void Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Void Type</em>'.
	 * @see ocl.type.VoidType
	 * @generated
	 */
	EClass getVoidType();

	/**
	 * Returns the meta object for class '{@link ocl.type.AnyType <em>Any Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Any Type</em>'.
	 * @see ocl.type.AnyType
	 * @generated
	 */
	EClass getAnyType();

	/**
	 * Returns the meta object for class '{@link ocl.type.MessageType <em>Message Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message Type</em>'.
	 * @see ocl.type.MessageType
	 * @generated
	 */
	EClass getMessageType();

	/**
	 * Returns the meta object for the reference '{@link ocl.type.MessageType#getReferredSignal <em>Referred Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Signal</em>'.
	 * @see ocl.type.MessageType#getReferredSignal()
	 * @see #getMessageType()
	 * @generated
	 */
	EReference getMessageType_ReferredSignal();

	/**
	 * Returns the meta object for the attribute '{@link ocl.type.MessageType#getReferredOperation <em>Referred Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referred Operation</em>'.
	 * @see ocl.type.MessageType#getReferredOperation()
	 * @see #getMessageType()
	 * @generated
	 */
	EAttribute getMessageType_ReferredOperation();

	/**
	 * Returns the meta object for class '{@link ocl.type.CollectionType <em>Collection Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collection Type</em>'.
	 * @see ocl.type.CollectionType
	 * @generated
	 */
	EClass getCollectionType();

	/**
	 * Returns the meta object for the reference '{@link ocl.type.CollectionType#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Element Type</em>'.
	 * @see ocl.type.CollectionType#getElementType()
	 * @see #getCollectionType()
	 * @generated
	 */
	EReference getCollectionType_ElementType();

	/**
	 * Returns the meta object for class '{@link ocl.type.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see ocl.type.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for class '{@link ocl.type.TupleType <em>Tuple Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tuple Type</em>'.
	 * @see ocl.type.TupleType
	 * @generated
	 */
	EClass getTupleType();

	/**
	 * Returns the meta object for class '{@link ocl.type.OrderedSetType <em>Ordered Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ordered Set Type</em>'.
	 * @see ocl.type.OrderedSetType
	 * @generated
	 */
	EClass getOrderedSetType();

	/**
	 * Returns the meta object for class '{@link ocl.type.SequenceType <em>Sequence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sequence Type</em>'.
	 * @see ocl.type.SequenceType
	 * @generated
	 */
	EClass getSequenceType();

	/**
	 * Returns the meta object for class '{@link ocl.type.BagType <em>Bag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bag Type</em>'.
	 * @see ocl.type.BagType
	 * @generated
	 */
	EClass getBagType();

	/**
	 * Returns the meta object for class '{@link ocl.type.SetType <em>Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Type</em>'.
	 * @see ocl.type.SetType
	 * @generated
	 */
	EClass getSetType();

	/**
	 * Returns the meta object for class '{@link ocl.type.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Signal</em>'.
	 * @see ocl.type.Signal
	 * @generated
	 */
	EClass getSignal();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypeFactory getTypeFactory();

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
		 * The meta object literal for the '{@link ocl.type.impl.ClassifierImpl <em>Classifier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.type.impl.ClassifierImpl
		 * @see ocl.type.impl.TypePackageImpl#getClassifier()
		 * @generated
		 */
		EClass CLASSIFIER = eINSTANCE.getClassifier();

		/**
		 * The meta object literal for the '{@link ocl.type.impl.DataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.type.impl.DataTypeImpl
		 * @see ocl.type.impl.TypePackageImpl#getDataType()
		 * @generated
		 */
		EClass DATA_TYPE = eINSTANCE.getDataType();

		/**
		 * The meta object literal for the '{@link ocl.type.impl.InvalidTypeImpl <em>Invalid Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.type.impl.InvalidTypeImpl
		 * @see ocl.type.impl.TypePackageImpl#getInvalidType()
		 * @generated
		 */
		EClass INVALID_TYPE = eINSTANCE.getInvalidType();

		/**
		 * The meta object literal for the '{@link ocl.type.impl.VoidTypeImpl <em>Void Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.type.impl.VoidTypeImpl
		 * @see ocl.type.impl.TypePackageImpl#getVoidType()
		 * @generated
		 */
		EClass VOID_TYPE = eINSTANCE.getVoidType();

		/**
		 * The meta object literal for the '{@link ocl.type.impl.AnyTypeImpl <em>Any Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.type.impl.AnyTypeImpl
		 * @see ocl.type.impl.TypePackageImpl#getAnyType()
		 * @generated
		 */
		EClass ANY_TYPE = eINSTANCE.getAnyType();

		/**
		 * The meta object literal for the '{@link ocl.type.impl.MessageTypeImpl <em>Message Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.type.impl.MessageTypeImpl
		 * @see ocl.type.impl.TypePackageImpl#getMessageType()
		 * @generated
		 */
		EClass MESSAGE_TYPE = eINSTANCE.getMessageType();

		/**
		 * The meta object literal for the '<em><b>Referred Signal</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE_TYPE__REFERRED_SIGNAL = eINSTANCE.getMessageType_ReferredSignal();

		/**
		 * The meta object literal for the '<em><b>Referred Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE_TYPE__REFERRED_OPERATION = eINSTANCE.getMessageType_ReferredOperation();

		/**
		 * The meta object literal for the '{@link ocl.type.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.type.impl.CollectionTypeImpl
		 * @see ocl.type.impl.TypePackageImpl#getCollectionType()
		 * @generated
		 */
		EClass COLLECTION_TYPE = eINSTANCE.getCollectionType();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLLECTION_TYPE__ELEMENT_TYPE = eINSTANCE.getCollectionType_ElementType();

		/**
		 * The meta object literal for the '{@link ocl.type.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.type.impl.PrimitiveTypeImpl
		 * @see ocl.type.impl.TypePackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link ocl.type.impl.TupleTypeImpl <em>Tuple Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.type.impl.TupleTypeImpl
		 * @see ocl.type.impl.TypePackageImpl#getTupleType()
		 * @generated
		 */
		EClass TUPLE_TYPE = eINSTANCE.getTupleType();

		/**
		 * The meta object literal for the '{@link ocl.type.impl.OrderedSetTypeImpl <em>Ordered Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.type.impl.OrderedSetTypeImpl
		 * @see ocl.type.impl.TypePackageImpl#getOrderedSetType()
		 * @generated
		 */
		EClass ORDERED_SET_TYPE = eINSTANCE.getOrderedSetType();

		/**
		 * The meta object literal for the '{@link ocl.type.impl.SequenceTypeImpl <em>Sequence Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.type.impl.SequenceTypeImpl
		 * @see ocl.type.impl.TypePackageImpl#getSequenceType()
		 * @generated
		 */
		EClass SEQUENCE_TYPE = eINSTANCE.getSequenceType();

		/**
		 * The meta object literal for the '{@link ocl.type.impl.BagTypeImpl <em>Bag Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.type.impl.BagTypeImpl
		 * @see ocl.type.impl.TypePackageImpl#getBagType()
		 * @generated
		 */
		EClass BAG_TYPE = eINSTANCE.getBagType();

		/**
		 * The meta object literal for the '{@link ocl.type.impl.SetTypeImpl <em>Set Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.type.impl.SetTypeImpl
		 * @see ocl.type.impl.TypePackageImpl#getSetType()
		 * @generated
		 */
		EClass SET_TYPE = eINSTANCE.getSetType();

		/**
		 * The meta object literal for the '{@link ocl.type.impl.SignalImpl <em>Signal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.type.impl.SignalImpl
		 * @see ocl.type.impl.TypePackageImpl#getSignal()
		 * @generated
		 */
		EClass SIGNAL = eINSTANCE.getSignal();

	}

} //TypePackage
