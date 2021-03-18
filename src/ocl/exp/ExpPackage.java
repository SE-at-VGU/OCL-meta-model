/**
 */
package ocl.exp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see ocl.exp.ExpFactory
 * @model kind="package"
 * @generated
 */
public interface ExpPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "exp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/ocl/exp";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "EXP";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ExpPackage eINSTANCE = ocl.exp.impl.ExpPackageImpl.init();

	/**
	 * The meta object id for the '{@link ocl.exp.impl.OclExpressionImpl <em>Ocl Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.exp.impl.OclExpressionImpl
	 * @see ocl.exp.impl.ExpPackageImpl#getOclExpression()
	 * @generated
	 */
	int OCL_EXPRESSION = 10;

	/**
	 * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__LOOP_BODY_OWNER = 0;

	/**
	 * The feature id for the '<em><b>Applied Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__APPLIED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__INITIALIZED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Parent Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__PARENT_CALL = 3;

	/**
	 * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION__PARENT_NAV = 4;

	/**
	 * The number of structural features of the '<em>Ocl Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Ocl Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OCL_EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ocl.exp.impl.VariableExpImpl <em>Variable Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.exp.impl.VariableExpImpl
	 * @see ocl.exp.impl.ExpPackageImpl#getVariableExp()
	 * @generated
	 */
	int VARIABLE_EXP = 0;

	/**
	 * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__LOOP_BODY_OWNER = OCL_EXPRESSION__LOOP_BODY_OWNER;

	/**
	 * The feature id for the '<em><b>Applied Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__APPLIED_ELEMENT = OCL_EXPRESSION__APPLIED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__INITIALIZED_ELEMENT = OCL_EXPRESSION__INITIALIZED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__PARENT_CALL = OCL_EXPRESSION__PARENT_CALL;

	/**
	 * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__PARENT_NAV = OCL_EXPRESSION__PARENT_NAV;

	/**
	 * The feature id for the '<em><b>Referred Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP__REFERRED_VARIABLE = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.exp.impl.TypeExpImpl <em>Type Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.exp.impl.TypeExpImpl
	 * @see ocl.exp.impl.ExpPackageImpl#getTypeExp()
	 * @generated
	 */
	int TYPE_EXP = 1;

	/**
	 * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EXP__LOOP_BODY_OWNER = OCL_EXPRESSION__LOOP_BODY_OWNER;

	/**
	 * The feature id for the '<em><b>Applied Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EXP__APPLIED_ELEMENT = OCL_EXPRESSION__APPLIED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EXP__INITIALIZED_ELEMENT = OCL_EXPRESSION__INITIALIZED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EXP__PARENT_CALL = OCL_EXPRESSION__PARENT_CALL;

	/**
	 * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EXP__PARENT_NAV = OCL_EXPRESSION__PARENT_NAV;

	/**
	 * The feature id for the '<em><b>Referred Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EXP__REFERRED_TYPE = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Type Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Type Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.exp.impl.CallExpImpl <em>Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.exp.impl.CallExpImpl
	 * @see ocl.exp.impl.ExpPackageImpl#getCallExp()
	 * @generated
	 */
	int CALL_EXP = 11;

	/**
	 * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXP__LOOP_BODY_OWNER = OCL_EXPRESSION__LOOP_BODY_OWNER;

	/**
	 * The feature id for the '<em><b>Applied Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXP__APPLIED_ELEMENT = OCL_EXPRESSION__APPLIED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXP__INITIALIZED_ELEMENT = OCL_EXPRESSION__INITIALIZED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXP__PARENT_CALL = OCL_EXPRESSION__PARENT_CALL;

	/**
	 * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXP__PARENT_NAV = OCL_EXPRESSION__PARENT_NAV;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXP__SOURCE = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.exp.impl.LoopExpImpl <em>Loop Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.exp.impl.LoopExpImpl
	 * @see ocl.exp.impl.ExpPackageImpl#getLoopExp()
	 * @generated
	 */
	int LOOP_EXP = 2;

	/**
	 * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__LOOP_BODY_OWNER = CALL_EXP__LOOP_BODY_OWNER;

	/**
	 * The feature id for the '<em><b>Applied Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__APPLIED_ELEMENT = CALL_EXP__APPLIED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__INITIALIZED_ELEMENT = CALL_EXP__INITIALIZED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__PARENT_CALL = CALL_EXP__PARENT_CALL;

	/**
	 * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__PARENT_NAV = CALL_EXP__PARENT_NAV;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__SOURCE = CALL_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__BODY = CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP__ITERATOR = CALL_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP_FEATURE_COUNT = CALL_EXP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Loop Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_EXP_OPERATION_COUNT = CALL_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.exp.impl.FeatureCallExpImpl <em>Feature Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.exp.impl.FeatureCallExpImpl
	 * @see ocl.exp.impl.ExpPackageImpl#getFeatureCallExp()
	 * @generated
	 */
	int FEATURE_CALL_EXP = 3;

	/**
	 * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_EXP__LOOP_BODY_OWNER = CALL_EXP__LOOP_BODY_OWNER;

	/**
	 * The feature id for the '<em><b>Applied Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_EXP__APPLIED_ELEMENT = CALL_EXP__APPLIED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_EXP__INITIALIZED_ELEMENT = CALL_EXP__INITIALIZED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_EXP__PARENT_CALL = CALL_EXP__PARENT_CALL;

	/**
	 * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_EXP__PARENT_NAV = CALL_EXP__PARENT_NAV;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_EXP__SOURCE = CALL_EXP__SOURCE;

	/**
	 * The number of structural features of the '<em>Feature Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_EXP_FEATURE_COUNT = CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Feature Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_CALL_EXP_OPERATION_COUNT = CALL_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.exp.impl.NavigationCallExpImpl <em>Navigation Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.exp.impl.NavigationCallExpImpl
	 * @see ocl.exp.impl.ExpPackageImpl#getNavigationCallExp()
	 * @generated
	 */
	int NAVIGATION_CALL_EXP = 14;

	/**
	 * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CALL_EXP__LOOP_BODY_OWNER = FEATURE_CALL_EXP__LOOP_BODY_OWNER;

	/**
	 * The feature id for the '<em><b>Applied Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CALL_EXP__APPLIED_ELEMENT = FEATURE_CALL_EXP__APPLIED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CALL_EXP__INITIALIZED_ELEMENT = FEATURE_CALL_EXP__INITIALIZED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CALL_EXP__PARENT_CALL = FEATURE_CALL_EXP__PARENT_CALL;

	/**
	 * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CALL_EXP__PARENT_NAV = FEATURE_CALL_EXP__PARENT_NAV;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CALL_EXP__SOURCE = FEATURE_CALL_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CALL_EXP__QUALIFIER = FEATURE_CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Navigation Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CALL_EXP_FEATURE_COUNT = FEATURE_CALL_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Navigation Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAVIGATION_CALL_EXP_OPERATION_COUNT = FEATURE_CALL_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.exp.impl.AssociationClassCallExpImpl <em>Association Class Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.exp.impl.AssociationClassCallExpImpl
	 * @see ocl.exp.impl.ExpPackageImpl#getAssociationClassCallExp()
	 * @generated
	 */
	int ASSOCIATION_CLASS_CALL_EXP = 4;

	/**
	 * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_CALL_EXP__LOOP_BODY_OWNER = NAVIGATION_CALL_EXP__LOOP_BODY_OWNER;

	/**
	 * The feature id for the '<em><b>Applied Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_CALL_EXP__APPLIED_ELEMENT = NAVIGATION_CALL_EXP__APPLIED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_CALL_EXP__INITIALIZED_ELEMENT = NAVIGATION_CALL_EXP__INITIALIZED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_CALL_EXP__PARENT_CALL = NAVIGATION_CALL_EXP__PARENT_CALL;

	/**
	 * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_CALL_EXP__PARENT_NAV = NAVIGATION_CALL_EXP__PARENT_NAV;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_CALL_EXP__SOURCE = NAVIGATION_CALL_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_CALL_EXP__QUALIFIER = NAVIGATION_CALL_EXP__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Referred Association Ends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_ENDS = NAVIGATION_CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Association Class Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_CALL_EXP_FEATURE_COUNT = NAVIGATION_CALL_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Association Class Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_CLASS_CALL_EXP_OPERATION_COUNT = NAVIGATION_CALL_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.exp.impl.LiteralExpImpl <em>Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.exp.impl.LiteralExpImpl
	 * @see ocl.exp.impl.ExpPackageImpl#getLiteralExp()
	 * @generated
	 */
	int LITERAL_EXP = 6;

	/**
	 * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXP__LOOP_BODY_OWNER = OCL_EXPRESSION__LOOP_BODY_OWNER;

	/**
	 * The feature id for the '<em><b>Applied Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXP__APPLIED_ELEMENT = OCL_EXPRESSION__APPLIED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXP__INITIALIZED_ELEMENT = OCL_EXPRESSION__INITIALIZED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXP__PARENT_CALL = OCL_EXPRESSION__PARENT_CALL;

	/**
	 * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXP__PARENT_NAV = OCL_EXPRESSION__PARENT_NAV;

	/**
	 * The number of structural features of the '<em>Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXP_FEATURE_COUNT = OCL_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_EXP_OPERATION_COUNT = OCL_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.exp.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.exp.impl.PrimitiveTypeImpl
	 * @see ocl.exp.impl.ExpPackageImpl#getPrimitiveType()
	 * @generated
	 */
	int PRIMITIVE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__LOOP_BODY_OWNER = LITERAL_EXP__LOOP_BODY_OWNER;

	/**
	 * The feature id for the '<em><b>Applied Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__APPLIED_ELEMENT = LITERAL_EXP__APPLIED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__INITIALIZED_ELEMENT = LITERAL_EXP__INITIALIZED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__PARENT_CALL = LITERAL_EXP__PARENT_CALL;

	/**
	 * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE__PARENT_NAV = LITERAL_EXP__PARENT_NAV;

	/**
	 * The number of structural features of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_FEATURE_COUNT = LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_OPERATION_COUNT = LITERAL_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.exp.impl.NumericLiteralExpImpl <em>Numeric Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.exp.impl.NumericLiteralExpImpl
	 * @see ocl.exp.impl.ExpPackageImpl#getNumericLiteralExp()
	 * @generated
	 */
	int NUMERIC_LITERAL_EXP = 5;

	/**
	 * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_LITERAL_EXP__LOOP_BODY_OWNER = PRIMITIVE_TYPE__LOOP_BODY_OWNER;

	/**
	 * The feature id for the '<em><b>Applied Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_LITERAL_EXP__APPLIED_ELEMENT = PRIMITIVE_TYPE__APPLIED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_LITERAL_EXP__INITIALIZED_ELEMENT = PRIMITIVE_TYPE__INITIALIZED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_LITERAL_EXP__PARENT_CALL = PRIMITIVE_TYPE__PARENT_CALL;

	/**
	 * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_LITERAL_EXP__PARENT_NAV = PRIMITIVE_TYPE__PARENT_NAV;

	/**
	 * The number of structural features of the '<em>Numeric Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_LITERAL_EXP_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Numeric Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_LITERAL_EXP_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.exp.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.exp.impl.VariableImpl
	 * @see ocl.exp.impl.ExpPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 7;

	/**
	 * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__LOOP_EXP = 0;

	/**
	 * The feature id for the '<em><b>Init Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__INIT_EXPRESSION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 2;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ocl.exp.impl.PropertyCallExpImpl <em>Property Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.exp.impl.PropertyCallExpImpl
	 * @see ocl.exp.impl.ExpPackageImpl#getPropertyCallExp()
	 * @generated
	 */
	int PROPERTY_CALL_EXP = 8;

	/**
	 * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__LOOP_BODY_OWNER = NAVIGATION_CALL_EXP__LOOP_BODY_OWNER;

	/**
	 * The feature id for the '<em><b>Applied Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__APPLIED_ELEMENT = NAVIGATION_CALL_EXP__APPLIED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__INITIALIZED_ELEMENT = NAVIGATION_CALL_EXP__INITIALIZED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__PARENT_CALL = NAVIGATION_CALL_EXP__PARENT_CALL;

	/**
	 * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__PARENT_NAV = NAVIGATION_CALL_EXP__PARENT_NAV;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__SOURCE = NAVIGATION_CALL_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__QUALIFIER = NAVIGATION_CALL_EXP__QUALIFIER;

	/**
	 * The feature id for the '<em><b>Referred Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP__REFERRED_PROPERTY = NAVIGATION_CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Property Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_FEATURE_COUNT = NAVIGATION_CALL_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Property Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_CALL_EXP_OPERATION_COUNT = NAVIGATION_CALL_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.exp.impl.IteratorExpImpl <em>Iterator Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.exp.impl.IteratorExpImpl
	 * @see ocl.exp.impl.ExpPackageImpl#getIteratorExp()
	 * @generated
	 */
	int ITERATOR_EXP = 9;

	/**
	 * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP__LOOP_BODY_OWNER = LOOP_EXP__LOOP_BODY_OWNER;

	/**
	 * The feature id for the '<em><b>Applied Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP__APPLIED_ELEMENT = LOOP_EXP__APPLIED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP__INITIALIZED_ELEMENT = LOOP_EXP__INITIALIZED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP__PARENT_CALL = LOOP_EXP__PARENT_CALL;

	/**
	 * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP__PARENT_NAV = LOOP_EXP__PARENT_NAV;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP__SOURCE = LOOP_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP__BODY = LOOP_EXP__BODY;

	/**
	 * The feature id for the '<em><b>Iterator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP__ITERATOR = LOOP_EXP__ITERATOR;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP__KIND = LOOP_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Iterator Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP_FEATURE_COUNT = LOOP_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Iterator Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITERATOR_EXP_OPERATION_COUNT = LOOP_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.exp.impl.IntegerLiteralExpImpl <em>Integer Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.exp.impl.IntegerLiteralExpImpl
	 * @see ocl.exp.impl.ExpPackageImpl#getIntegerLiteralExp()
	 * @generated
	 */
	int INTEGER_LITERAL_EXP = 12;

	/**
	 * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXP__LOOP_BODY_OWNER = NUMERIC_LITERAL_EXP__LOOP_BODY_OWNER;

	/**
	 * The feature id for the '<em><b>Applied Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXP__APPLIED_ELEMENT = NUMERIC_LITERAL_EXP__APPLIED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXP__INITIALIZED_ELEMENT = NUMERIC_LITERAL_EXP__INITIALIZED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXP__PARENT_CALL = NUMERIC_LITERAL_EXP__PARENT_CALL;

	/**
	 * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXP__PARENT_NAV = NUMERIC_LITERAL_EXP__PARENT_NAV;

	/**
	 * The feature id for the '<em><b>Integer Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXP__INTEGER_VALUE = NUMERIC_LITERAL_EXP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXP_FEATURE_COUNT = NUMERIC_LITERAL_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_LITERAL_EXP_OPERATION_COUNT = NUMERIC_LITERAL_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.exp.impl.OperationCallExpImpl <em>Operation Call Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.exp.impl.OperationCallExpImpl
	 * @see ocl.exp.impl.ExpPackageImpl#getOperationCallExp()
	 * @generated
	 */
	int OPERATION_CALL_EXP = 15;

	/**
	 * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP__LOOP_BODY_OWNER = FEATURE_CALL_EXP__LOOP_BODY_OWNER;

	/**
	 * The feature id for the '<em><b>Applied Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP__APPLIED_ELEMENT = FEATURE_CALL_EXP__APPLIED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP__INITIALIZED_ELEMENT = FEATURE_CALL_EXP__INITIALIZED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP__PARENT_CALL = FEATURE_CALL_EXP__PARENT_CALL;

	/**
	 * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP__PARENT_NAV = FEATURE_CALL_EXP__PARENT_NAV;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP__SOURCE = FEATURE_CALL_EXP__SOURCE;

	/**
	 * The feature id for the '<em><b>Argument</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP__ARGUMENT = FEATURE_CALL_EXP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Referred Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP__REFERRED_OPERATION = FEATURE_CALL_EXP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Operation Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP_FEATURE_COUNT = FEATURE_CALL_EXP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Operation Call Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_CALL_EXP_OPERATION_COUNT = FEATURE_CALL_EXP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.exp.impl.StringLiteralExpImpl <em>String Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.exp.impl.StringLiteralExpImpl
	 * @see ocl.exp.impl.ExpPackageImpl#getStringLiteralExp()
	 * @generated
	 */
	int STRING_LITERAL_EXP = 16;

	/**
	 * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXP__LOOP_BODY_OWNER = PRIMITIVE_TYPE__LOOP_BODY_OWNER;

	/**
	 * The feature id for the '<em><b>Applied Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXP__APPLIED_ELEMENT = PRIMITIVE_TYPE__APPLIED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXP__INITIALIZED_ELEMENT = PRIMITIVE_TYPE__INITIALIZED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXP__PARENT_CALL = PRIMITIVE_TYPE__PARENT_CALL;

	/**
	 * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXP__PARENT_NAV = PRIMITIVE_TYPE__PARENT_NAV;

	/**
	 * The feature id for the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXP__STRING_VALUE = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXP_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_EXP_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.exp.impl.BooleanLiteralExpImpl <em>Boolean Literal Exp</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.exp.impl.BooleanLiteralExpImpl
	 * @see ocl.exp.impl.ExpPackageImpl#getBooleanLiteralExp()
	 * @generated
	 */
	int BOOLEAN_LITERAL_EXP = 17;

	/**
	 * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXP__LOOP_BODY_OWNER = PRIMITIVE_TYPE__LOOP_BODY_OWNER;

	/**
	 * The feature id for the '<em><b>Applied Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXP__APPLIED_ELEMENT = PRIMITIVE_TYPE__APPLIED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXP__INITIALIZED_ELEMENT = PRIMITIVE_TYPE__INITIALIZED_ELEMENT;

	/**
	 * The feature id for the '<em><b>Parent Call</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXP__PARENT_CALL = PRIMITIVE_TYPE__PARENT_CALL;

	/**
	 * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXP__PARENT_NAV = PRIMITIVE_TYPE__PARENT_NAV;

	/**
	 * The feature id for the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXP__BOOLEAN_VALUE = PRIMITIVE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXP_FEATURE_COUNT = PRIMITIVE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Literal Exp</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_LITERAL_EXP_OPERATION_COUNT = PRIMITIVE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ocl.exp.IteratorKind <em>Iterator Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.exp.IteratorKind
	 * @see ocl.exp.impl.ExpPackageImpl#getIteratorKind()
	 * @generated
	 */
	int ITERATOR_KIND = 18;

	/**
	 * The meta object id for the '{@link ocl.exp.Operator <em>Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ocl.exp.Operator
	 * @see ocl.exp.impl.ExpPackageImpl#getOperator()
	 * @generated
	 */
	int OPERATOR = 19;


	/**
	 * Returns the meta object for class '{@link ocl.exp.VariableExp <em>Variable Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Exp</em>'.
	 * @see ocl.exp.VariableExp
	 * @generated
	 */
	EClass getVariableExp();

	/**
	 * Returns the meta object for the reference '{@link ocl.exp.VariableExp#getReferredVariable <em>Referred Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Variable</em>'.
	 * @see ocl.exp.VariableExp#getReferredVariable()
	 * @see #getVariableExp()
	 * @generated
	 */
	EReference getVariableExp_ReferredVariable();

	/**
	 * Returns the meta object for class '{@link ocl.exp.TypeExp <em>Type Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Exp</em>'.
	 * @see ocl.exp.TypeExp
	 * @generated
	 */
	EClass getTypeExp();

	/**
	 * Returns the meta object for the reference '{@link ocl.exp.TypeExp#getReferredType <em>Referred Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Type</em>'.
	 * @see ocl.exp.TypeExp#getReferredType()
	 * @see #getTypeExp()
	 * @generated
	 */
	EReference getTypeExp_ReferredType();

	/**
	 * Returns the meta object for class '{@link ocl.exp.LoopExp <em>Loop Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Exp</em>'.
	 * @see ocl.exp.LoopExp
	 * @generated
	 */
	EClass getLoopExp();

	/**
	 * Returns the meta object for the containment reference '{@link ocl.exp.LoopExp#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see ocl.exp.LoopExp#getBody()
	 * @see #getLoopExp()
	 * @generated
	 */
	EReference getLoopExp_Body();

	/**
	 * Returns the meta object for the containment reference list '{@link ocl.exp.LoopExp#getIterator <em>Iterator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Iterator</em>'.
	 * @see ocl.exp.LoopExp#getIterator()
	 * @see #getLoopExp()
	 * @generated
	 */
	EReference getLoopExp_Iterator();

	/**
	 * Returns the meta object for class '{@link ocl.exp.FeatureCallExp <em>Feature Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Call Exp</em>'.
	 * @see ocl.exp.FeatureCallExp
	 * @generated
	 */
	EClass getFeatureCallExp();

	/**
	 * Returns the meta object for class '{@link ocl.exp.AssociationClassCallExp <em>Association Class Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association Class Call Exp</em>'.
	 * @see ocl.exp.AssociationClassCallExp
	 * @generated
	 */
	EClass getAssociationClassCallExp();

	/**
	 * Returns the meta object for the reference '{@link ocl.exp.AssociationClassCallExp#getReferredAssociationEnds <em>Referred Association Ends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Association Ends</em>'.
	 * @see ocl.exp.AssociationClassCallExp#getReferredAssociationEnds()
	 * @see #getAssociationClassCallExp()
	 * @generated
	 */
	EReference getAssociationClassCallExp_ReferredAssociationEnds();

	/**
	 * Returns the meta object for class '{@link ocl.exp.NumericLiteralExp <em>Numeric Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Literal Exp</em>'.
	 * @see ocl.exp.NumericLiteralExp
	 * @generated
	 */
	EClass getNumericLiteralExp();

	/**
	 * Returns the meta object for class '{@link ocl.exp.LiteralExp <em>Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Exp</em>'.
	 * @see ocl.exp.LiteralExp
	 * @generated
	 */
	EClass getLiteralExp();

	/**
	 * Returns the meta object for class '{@link ocl.exp.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see ocl.exp.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the container reference '{@link ocl.exp.Variable#getLoopExp <em>Loop Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Loop Exp</em>'.
	 * @see ocl.exp.Variable#getLoopExp()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_LoopExp();

	/**
	 * Returns the meta object for the containment reference '{@link ocl.exp.Variable#getInitExpression <em>Init Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Init Expression</em>'.
	 * @see ocl.exp.Variable#getInitExpression()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_InitExpression();

	/**
	 * Returns the meta object for the attribute '{@link ocl.exp.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ocl.exp.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for class '{@link ocl.exp.PropertyCallExp <em>Property Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Call Exp</em>'.
	 * @see ocl.exp.PropertyCallExp
	 * @generated
	 */
	EClass getPropertyCallExp();

	/**
	 * Returns the meta object for the reference '{@link ocl.exp.PropertyCallExp#getReferredProperty <em>Referred Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred Property</em>'.
	 * @see ocl.exp.PropertyCallExp#getReferredProperty()
	 * @see #getPropertyCallExp()
	 * @generated
	 */
	EReference getPropertyCallExp_ReferredProperty();

	/**
	 * Returns the meta object for class '{@link ocl.exp.IteratorExp <em>Iterator Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iterator Exp</em>'.
	 * @see ocl.exp.IteratorExp
	 * @generated
	 */
	EClass getIteratorExp();

	/**
	 * Returns the meta object for the attribute '{@link ocl.exp.IteratorExp#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see ocl.exp.IteratorExp#getKind()
	 * @see #getIteratorExp()
	 * @generated
	 */
	EAttribute getIteratorExp_Kind();

	/**
	 * Returns the meta object for class '{@link ocl.exp.OclExpression <em>Ocl Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ocl Expression</em>'.
	 * @see ocl.exp.OclExpression
	 * @generated
	 */
	EClass getOclExpression();

	/**
	 * Returns the meta object for the container reference '{@link ocl.exp.OclExpression#getLoopBodyOwner <em>Loop Body Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Loop Body Owner</em>'.
	 * @see ocl.exp.OclExpression#getLoopBodyOwner()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_LoopBodyOwner();

	/**
	 * Returns the meta object for the container reference '{@link ocl.exp.OclExpression#getAppliedElement <em>Applied Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Applied Element</em>'.
	 * @see ocl.exp.OclExpression#getAppliedElement()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_AppliedElement();

	/**
	 * Returns the meta object for the container reference '{@link ocl.exp.OclExpression#getInitializedElement <em>Initialized Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Initialized Element</em>'.
	 * @see ocl.exp.OclExpression#getInitializedElement()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_InitializedElement();

	/**
	 * Returns the meta object for the container reference '{@link ocl.exp.OclExpression#getParentCall <em>Parent Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Call</em>'.
	 * @see ocl.exp.OclExpression#getParentCall()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_ParentCall();

	/**
	 * Returns the meta object for the container reference '{@link ocl.exp.OclExpression#getParentNav <em>Parent Nav</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Nav</em>'.
	 * @see ocl.exp.OclExpression#getParentNav()
	 * @see #getOclExpression()
	 * @generated
	 */
	EReference getOclExpression_ParentNav();

	/**
	 * Returns the meta object for class '{@link ocl.exp.CallExp <em>Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Exp</em>'.
	 * @see ocl.exp.CallExp
	 * @generated
	 */
	EClass getCallExp();

	/**
	 * Returns the meta object for the containment reference '{@link ocl.exp.CallExp#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see ocl.exp.CallExp#getSource()
	 * @see #getCallExp()
	 * @generated
	 */
	EReference getCallExp_Source();

	/**
	 * Returns the meta object for class '{@link ocl.exp.IntegerLiteralExp <em>Integer Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Literal Exp</em>'.
	 * @see ocl.exp.IntegerLiteralExp
	 * @generated
	 */
	EClass getIntegerLiteralExp();

	/**
	 * Returns the meta object for the attribute '{@link ocl.exp.IntegerLiteralExp#getIntegerValue <em>Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integer Value</em>'.
	 * @see ocl.exp.IntegerLiteralExp#getIntegerValue()
	 * @see #getIntegerLiteralExp()
	 * @generated
	 */
	EAttribute getIntegerLiteralExp_IntegerValue();

	/**
	 * Returns the meta object for class '{@link ocl.exp.PrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type</em>'.
	 * @see ocl.exp.PrimitiveType
	 * @generated
	 */
	EClass getPrimitiveType();

	/**
	 * Returns the meta object for class '{@link ocl.exp.NavigationCallExp <em>Navigation Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Navigation Call Exp</em>'.
	 * @see ocl.exp.NavigationCallExp
	 * @generated
	 */
	EClass getNavigationCallExp();

	/**
	 * Returns the meta object for the containment reference list '{@link ocl.exp.NavigationCallExp#getQualifier <em>Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qualifier</em>'.
	 * @see ocl.exp.NavigationCallExp#getQualifier()
	 * @see #getNavigationCallExp()
	 * @generated
	 */
	EReference getNavigationCallExp_Qualifier();

	/**
	 * Returns the meta object for class '{@link ocl.exp.OperationCallExp <em>Operation Call Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation Call Exp</em>'.
	 * @see ocl.exp.OperationCallExp
	 * @generated
	 */
	EClass getOperationCallExp();

	/**
	 * Returns the meta object for the containment reference list '{@link ocl.exp.OperationCallExp#getArgument <em>Argument</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Argument</em>'.
	 * @see ocl.exp.OperationCallExp#getArgument()
	 * @see #getOperationCallExp()
	 * @generated
	 */
	EReference getOperationCallExp_Argument();

	/**
	 * Returns the meta object for the attribute '{@link ocl.exp.OperationCallExp#getReferredOperation <em>Referred Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Referred Operation</em>'.
	 * @see ocl.exp.OperationCallExp#getReferredOperation()
	 * @see #getOperationCallExp()
	 * @generated
	 */
	EAttribute getOperationCallExp_ReferredOperation();

	/**
	 * Returns the meta object for class '{@link ocl.exp.StringLiteralExp <em>String Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal Exp</em>'.
	 * @see ocl.exp.StringLiteralExp
	 * @generated
	 */
	EClass getStringLiteralExp();

	/**
	 * Returns the meta object for the attribute '{@link ocl.exp.StringLiteralExp#getStringValue <em>String Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String Value</em>'.
	 * @see ocl.exp.StringLiteralExp#getStringValue()
	 * @see #getStringLiteralExp()
	 * @generated
	 */
	EAttribute getStringLiteralExp_StringValue();

	/**
	 * Returns the meta object for class '{@link ocl.exp.BooleanLiteralExp <em>Boolean Literal Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Literal Exp</em>'.
	 * @see ocl.exp.BooleanLiteralExp
	 * @generated
	 */
	EClass getBooleanLiteralExp();

	/**
	 * Returns the meta object for the attribute '{@link ocl.exp.BooleanLiteralExp#getBooleanValue <em>Boolean Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean Value</em>'.
	 * @see ocl.exp.BooleanLiteralExp#getBooleanValue()
	 * @see #getBooleanLiteralExp()
	 * @generated
	 */
	EAttribute getBooleanLiteralExp_BooleanValue();

	/**
	 * Returns the meta object for enum '{@link ocl.exp.IteratorKind <em>Iterator Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Iterator Kind</em>'.
	 * @see ocl.exp.IteratorKind
	 * @generated
	 */
	EEnum getIteratorKind();

	/**
	 * Returns the meta object for enum '{@link ocl.exp.Operator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operator</em>'.
	 * @see ocl.exp.Operator
	 * @generated
	 */
	EEnum getOperator();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ExpFactory getExpFactory();

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
		 * The meta object literal for the '{@link ocl.exp.impl.VariableExpImpl <em>Variable Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.exp.impl.VariableExpImpl
		 * @see ocl.exp.impl.ExpPackageImpl#getVariableExp()
		 * @generated
		 */
		EClass VARIABLE_EXP = eINSTANCE.getVariableExp();

		/**
		 * The meta object literal for the '<em><b>Referred Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_EXP__REFERRED_VARIABLE = eINSTANCE.getVariableExp_ReferredVariable();

		/**
		 * The meta object literal for the '{@link ocl.exp.impl.TypeExpImpl <em>Type Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.exp.impl.TypeExpImpl
		 * @see ocl.exp.impl.ExpPackageImpl#getTypeExp()
		 * @generated
		 */
		EClass TYPE_EXP = eINSTANCE.getTypeExp();

		/**
		 * The meta object literal for the '<em><b>Referred Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_EXP__REFERRED_TYPE = eINSTANCE.getTypeExp_ReferredType();

		/**
		 * The meta object literal for the '{@link ocl.exp.impl.LoopExpImpl <em>Loop Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.exp.impl.LoopExpImpl
		 * @see ocl.exp.impl.ExpPackageImpl#getLoopExp()
		 * @generated
		 */
		EClass LOOP_EXP = eINSTANCE.getLoopExp();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_EXP__BODY = eINSTANCE.getLoopExp_Body();

		/**
		 * The meta object literal for the '<em><b>Iterator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP_EXP__ITERATOR = eINSTANCE.getLoopExp_Iterator();

		/**
		 * The meta object literal for the '{@link ocl.exp.impl.FeatureCallExpImpl <em>Feature Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.exp.impl.FeatureCallExpImpl
		 * @see ocl.exp.impl.ExpPackageImpl#getFeatureCallExp()
		 * @generated
		 */
		EClass FEATURE_CALL_EXP = eINSTANCE.getFeatureCallExp();

		/**
		 * The meta object literal for the '{@link ocl.exp.impl.AssociationClassCallExpImpl <em>Association Class Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.exp.impl.AssociationClassCallExpImpl
		 * @see ocl.exp.impl.ExpPackageImpl#getAssociationClassCallExp()
		 * @generated
		 */
		EClass ASSOCIATION_CLASS_CALL_EXP = eINSTANCE.getAssociationClassCallExp();

		/**
		 * The meta object literal for the '<em><b>Referred Association Ends</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_ENDS = eINSTANCE.getAssociationClassCallExp_ReferredAssociationEnds();

		/**
		 * The meta object literal for the '{@link ocl.exp.impl.NumericLiteralExpImpl <em>Numeric Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.exp.impl.NumericLiteralExpImpl
		 * @see ocl.exp.impl.ExpPackageImpl#getNumericLiteralExp()
		 * @generated
		 */
		EClass NUMERIC_LITERAL_EXP = eINSTANCE.getNumericLiteralExp();

		/**
		 * The meta object literal for the '{@link ocl.exp.impl.LiteralExpImpl <em>Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.exp.impl.LiteralExpImpl
		 * @see ocl.exp.impl.ExpPackageImpl#getLiteralExp()
		 * @generated
		 */
		EClass LITERAL_EXP = eINSTANCE.getLiteralExp();

		/**
		 * The meta object literal for the '{@link ocl.exp.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.exp.impl.VariableImpl
		 * @see ocl.exp.impl.ExpPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Loop Exp</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__LOOP_EXP = eINSTANCE.getVariable_LoopExp();

		/**
		 * The meta object literal for the '<em><b>Init Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__INIT_EXPRESSION = eINSTANCE.getVariable_InitExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '{@link ocl.exp.impl.PropertyCallExpImpl <em>Property Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.exp.impl.PropertyCallExpImpl
		 * @see ocl.exp.impl.ExpPackageImpl#getPropertyCallExp()
		 * @generated
		 */
		EClass PROPERTY_CALL_EXP = eINSTANCE.getPropertyCallExp();

		/**
		 * The meta object literal for the '<em><b>Referred Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTY_CALL_EXP__REFERRED_PROPERTY = eINSTANCE.getPropertyCallExp_ReferredProperty();

		/**
		 * The meta object literal for the '{@link ocl.exp.impl.IteratorExpImpl <em>Iterator Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.exp.impl.IteratorExpImpl
		 * @see ocl.exp.impl.ExpPackageImpl#getIteratorExp()
		 * @generated
		 */
		EClass ITERATOR_EXP = eINSTANCE.getIteratorExp();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITERATOR_EXP__KIND = eINSTANCE.getIteratorExp_Kind();

		/**
		 * The meta object literal for the '{@link ocl.exp.impl.OclExpressionImpl <em>Ocl Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.exp.impl.OclExpressionImpl
		 * @see ocl.exp.impl.ExpPackageImpl#getOclExpression()
		 * @generated
		 */
		EClass OCL_EXPRESSION = eINSTANCE.getOclExpression();

		/**
		 * The meta object literal for the '<em><b>Loop Body Owner</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__LOOP_BODY_OWNER = eINSTANCE.getOclExpression_LoopBodyOwner();

		/**
		 * The meta object literal for the '<em><b>Applied Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__APPLIED_ELEMENT = eINSTANCE.getOclExpression_AppliedElement();

		/**
		 * The meta object literal for the '<em><b>Initialized Element</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__INITIALIZED_ELEMENT = eINSTANCE.getOclExpression_InitializedElement();

		/**
		 * The meta object literal for the '<em><b>Parent Call</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__PARENT_CALL = eINSTANCE.getOclExpression_ParentCall();

		/**
		 * The meta object literal for the '<em><b>Parent Nav</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OCL_EXPRESSION__PARENT_NAV = eINSTANCE.getOclExpression_ParentNav();

		/**
		 * The meta object literal for the '{@link ocl.exp.impl.CallExpImpl <em>Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.exp.impl.CallExpImpl
		 * @see ocl.exp.impl.ExpPackageImpl#getCallExp()
		 * @generated
		 */
		EClass CALL_EXP = eINSTANCE.getCallExp();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_EXP__SOURCE = eINSTANCE.getCallExp_Source();

		/**
		 * The meta object literal for the '{@link ocl.exp.impl.IntegerLiteralExpImpl <em>Integer Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.exp.impl.IntegerLiteralExpImpl
		 * @see ocl.exp.impl.ExpPackageImpl#getIntegerLiteralExp()
		 * @generated
		 */
		EClass INTEGER_LITERAL_EXP = eINSTANCE.getIntegerLiteralExp();

		/**
		 * The meta object literal for the '<em><b>Integer Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_LITERAL_EXP__INTEGER_VALUE = eINSTANCE.getIntegerLiteralExp_IntegerValue();

		/**
		 * The meta object literal for the '{@link ocl.exp.impl.PrimitiveTypeImpl <em>Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.exp.impl.PrimitiveTypeImpl
		 * @see ocl.exp.impl.ExpPackageImpl#getPrimitiveType()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE = eINSTANCE.getPrimitiveType();

		/**
		 * The meta object literal for the '{@link ocl.exp.impl.NavigationCallExpImpl <em>Navigation Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.exp.impl.NavigationCallExpImpl
		 * @see ocl.exp.impl.ExpPackageImpl#getNavigationCallExp()
		 * @generated
		 */
		EClass NAVIGATION_CALL_EXP = eINSTANCE.getNavigationCallExp();

		/**
		 * The meta object literal for the '<em><b>Qualifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NAVIGATION_CALL_EXP__QUALIFIER = eINSTANCE.getNavigationCallExp_Qualifier();

		/**
		 * The meta object literal for the '{@link ocl.exp.impl.OperationCallExpImpl <em>Operation Call Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.exp.impl.OperationCallExpImpl
		 * @see ocl.exp.impl.ExpPackageImpl#getOperationCallExp()
		 * @generated
		 */
		EClass OPERATION_CALL_EXP = eINSTANCE.getOperationCallExp();

		/**
		 * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPERATION_CALL_EXP__ARGUMENT = eINSTANCE.getOperationCallExp_Argument();

		/**
		 * The meta object literal for the '<em><b>Referred Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPERATION_CALL_EXP__REFERRED_OPERATION = eINSTANCE.getOperationCallExp_ReferredOperation();

		/**
		 * The meta object literal for the '{@link ocl.exp.impl.StringLiteralExpImpl <em>String Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.exp.impl.StringLiteralExpImpl
		 * @see ocl.exp.impl.ExpPackageImpl#getStringLiteralExp()
		 * @generated
		 */
		EClass STRING_LITERAL_EXP = eINSTANCE.getStringLiteralExp();

		/**
		 * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL_EXP__STRING_VALUE = eINSTANCE.getStringLiteralExp_StringValue();

		/**
		 * The meta object literal for the '{@link ocl.exp.impl.BooleanLiteralExpImpl <em>Boolean Literal Exp</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.exp.impl.BooleanLiteralExpImpl
		 * @see ocl.exp.impl.ExpPackageImpl#getBooleanLiteralExp()
		 * @generated
		 */
		EClass BOOLEAN_LITERAL_EXP = eINSTANCE.getBooleanLiteralExp();

		/**
		 * The meta object literal for the '<em><b>Boolean Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_LITERAL_EXP__BOOLEAN_VALUE = eINSTANCE.getBooleanLiteralExp_BooleanValue();

		/**
		 * The meta object literal for the '{@link ocl.exp.IteratorKind <em>Iterator Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.exp.IteratorKind
		 * @see ocl.exp.impl.ExpPackageImpl#getIteratorKind()
		 * @generated
		 */
		EEnum ITERATOR_KIND = eINSTANCE.getIteratorKind();

		/**
		 * The meta object literal for the '{@link ocl.exp.Operator <em>Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ocl.exp.Operator
		 * @see ocl.exp.impl.ExpPackageImpl#getOperator()
		 * @generated
		 */
		EEnum OPERATOR = eINSTANCE.getOperator();

	}

} //ExpPackage
