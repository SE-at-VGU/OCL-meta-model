/**
 */
package org.vgu.se.ocl.exp;

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
 * @see org.vgu.se.ocl.exp.expFactory
 * @model kind="package"
 * @generated
 */
public interface expPackage extends EPackage {
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
    String eNS_PREFIX = "exp";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    expPackage eINSTANCE = org.vgu.se.ocl.exp.impl.expPackageImpl.init();

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.exp.impl.EOclExpressionImpl <em>EOcl Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.exp.impl.EOclExpressionImpl
     * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEOclExpression()
     * @generated
     */
    int EOCL_EXPRESSION = 12;

    /**
     * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOCL_EXPRESSION__LOOP_BODY_OWNER = 0;

    /**
     * The feature id for the '<em><b>Applied Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOCL_EXPRESSION__APPLIED_ELEMENT = 1;

    /**
     * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOCL_EXPRESSION__INITIALIZED_ELEMENT = 2;

    /**
     * The feature id for the '<em><b>Then Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOCL_EXPRESSION__THEN_OWNER = 3;

    /**
     * The feature id for the '<em><b>If Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOCL_EXPRESSION__IF_OWNER = 4;

    /**
     * The feature id for the '<em><b>Else Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOCL_EXPRESSION__ELSE_OWNER = 5;

    /**
     * The feature id for the '<em><b>Parent Call</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOCL_EXPRESSION__PARENT_CALL = 6;

    /**
     * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOCL_EXPRESSION__PARENT_NAV = 7;

    /**
     * The number of structural features of the '<em>EOcl Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOCL_EXPRESSION_FEATURE_COUNT = 8;

    /**
     * The number of operations of the '<em>EOcl Expression</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOCL_EXPRESSION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.exp.impl.EVariableExpImpl <em>EVariable Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.exp.impl.EVariableExpImpl
     * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEVariableExp()
     * @generated
     */
    int EVARIABLE_EXP = 0;

    /**
     * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVARIABLE_EXP__LOOP_BODY_OWNER = EOCL_EXPRESSION__LOOP_BODY_OWNER;

    /**
     * The feature id for the '<em><b>Applied Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVARIABLE_EXP__APPLIED_ELEMENT = EOCL_EXPRESSION__APPLIED_ELEMENT;

    /**
     * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVARIABLE_EXP__INITIALIZED_ELEMENT = EOCL_EXPRESSION__INITIALIZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Then Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVARIABLE_EXP__THEN_OWNER = EOCL_EXPRESSION__THEN_OWNER;

    /**
     * The feature id for the '<em><b>If Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVARIABLE_EXP__IF_OWNER = EOCL_EXPRESSION__IF_OWNER;

    /**
     * The feature id for the '<em><b>Else Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVARIABLE_EXP__ELSE_OWNER = EOCL_EXPRESSION__ELSE_OWNER;

    /**
     * The feature id for the '<em><b>Parent Call</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVARIABLE_EXP__PARENT_CALL = EOCL_EXPRESSION__PARENT_CALL;

    /**
     * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVARIABLE_EXP__PARENT_NAV = EOCL_EXPRESSION__PARENT_NAV;

    /**
     * The feature id for the '<em><b>Referred Variable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVARIABLE_EXP__REFERRED_VARIABLE = EOCL_EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>EVariable Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVARIABLE_EXP_FEATURE_COUNT = EOCL_EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>EVariable Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVARIABLE_EXP_OPERATION_COUNT = EOCL_EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.exp.impl.ETypeExpImpl <em>EType Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.exp.impl.ETypeExpImpl
     * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getETypeExp()
     * @generated
     */
    int ETYPE_EXP = 1;

    /**
     * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ETYPE_EXP__LOOP_BODY_OWNER = EOCL_EXPRESSION__LOOP_BODY_OWNER;

    /**
     * The feature id for the '<em><b>Applied Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ETYPE_EXP__APPLIED_ELEMENT = EOCL_EXPRESSION__APPLIED_ELEMENT;

    /**
     * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ETYPE_EXP__INITIALIZED_ELEMENT = EOCL_EXPRESSION__INITIALIZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Then Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ETYPE_EXP__THEN_OWNER = EOCL_EXPRESSION__THEN_OWNER;

    /**
     * The feature id for the '<em><b>If Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ETYPE_EXP__IF_OWNER = EOCL_EXPRESSION__IF_OWNER;

    /**
     * The feature id for the '<em><b>Else Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ETYPE_EXP__ELSE_OWNER = EOCL_EXPRESSION__ELSE_OWNER;

    /**
     * The feature id for the '<em><b>Parent Call</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ETYPE_EXP__PARENT_CALL = EOCL_EXPRESSION__PARENT_CALL;

    /**
     * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ETYPE_EXP__PARENT_NAV = EOCL_EXPRESSION__PARENT_NAV;

    /**
     * The feature id for the '<em><b>Referred Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ETYPE_EXP__REFERRED_TYPE = EOCL_EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>EType Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ETYPE_EXP_FEATURE_COUNT = EOCL_EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>EType Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ETYPE_EXP_OPERATION_COUNT = EOCL_EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.exp.impl.ECallExpImpl <em>ECall Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.exp.impl.ECallExpImpl
     * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getECallExp()
     * @generated
     */
    int ECALL_EXP = 14;

    /**
     * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECALL_EXP__LOOP_BODY_OWNER = EOCL_EXPRESSION__LOOP_BODY_OWNER;

    /**
     * The feature id for the '<em><b>Applied Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECALL_EXP__APPLIED_ELEMENT = EOCL_EXPRESSION__APPLIED_ELEMENT;

    /**
     * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECALL_EXP__INITIALIZED_ELEMENT = EOCL_EXPRESSION__INITIALIZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Then Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECALL_EXP__THEN_OWNER = EOCL_EXPRESSION__THEN_OWNER;

    /**
     * The feature id for the '<em><b>If Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECALL_EXP__IF_OWNER = EOCL_EXPRESSION__IF_OWNER;

    /**
     * The feature id for the '<em><b>Else Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECALL_EXP__ELSE_OWNER = EOCL_EXPRESSION__ELSE_OWNER;

    /**
     * The feature id for the '<em><b>Parent Call</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECALL_EXP__PARENT_CALL = EOCL_EXPRESSION__PARENT_CALL;

    /**
     * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECALL_EXP__PARENT_NAV = EOCL_EXPRESSION__PARENT_NAV;

    /**
     * The feature id for the '<em><b>Source</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECALL_EXP__SOURCE = EOCL_EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>ECall Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECALL_EXP_FEATURE_COUNT = EOCL_EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>ECall Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ECALL_EXP_OPERATION_COUNT = EOCL_EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.exp.impl.ELoopExpImpl <em>ELoop Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.exp.impl.ELoopExpImpl
     * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getELoopExp()
     * @generated
     */
    int ELOOP_EXP = 2;

    /**
     * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELOOP_EXP__LOOP_BODY_OWNER = ECALL_EXP__LOOP_BODY_OWNER;

    /**
     * The feature id for the '<em><b>Applied Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELOOP_EXP__APPLIED_ELEMENT = ECALL_EXP__APPLIED_ELEMENT;

    /**
     * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELOOP_EXP__INITIALIZED_ELEMENT = ECALL_EXP__INITIALIZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Then Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELOOP_EXP__THEN_OWNER = ECALL_EXP__THEN_OWNER;

    /**
     * The feature id for the '<em><b>If Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELOOP_EXP__IF_OWNER = ECALL_EXP__IF_OWNER;

    /**
     * The feature id for the '<em><b>Else Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELOOP_EXP__ELSE_OWNER = ECALL_EXP__ELSE_OWNER;

    /**
     * The feature id for the '<em><b>Parent Call</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELOOP_EXP__PARENT_CALL = ECALL_EXP__PARENT_CALL;

    /**
     * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELOOP_EXP__PARENT_NAV = ECALL_EXP__PARENT_NAV;

    /**
     * The feature id for the '<em><b>Source</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELOOP_EXP__SOURCE = ECALL_EXP__SOURCE;

    /**
     * The feature id for the '<em><b>Body</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELOOP_EXP__BODY = ECALL_EXP_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Iterator</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELOOP_EXP__ITERATOR = ECALL_EXP_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>ELoop Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELOOP_EXP_FEATURE_COUNT = ECALL_EXP_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>ELoop Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELOOP_EXP_OPERATION_COUNT = ECALL_EXP_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.exp.impl.EStateExpImpl <em>EState Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.exp.impl.EStateExpImpl
     * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEStateExp()
     * @generated
     */
    int ESTATE_EXP = 3;

    /**
     * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTATE_EXP__LOOP_BODY_OWNER = EOCL_EXPRESSION__LOOP_BODY_OWNER;

    /**
     * The feature id for the '<em><b>Applied Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTATE_EXP__APPLIED_ELEMENT = EOCL_EXPRESSION__APPLIED_ELEMENT;

    /**
     * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTATE_EXP__INITIALIZED_ELEMENT = EOCL_EXPRESSION__INITIALIZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Then Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTATE_EXP__THEN_OWNER = EOCL_EXPRESSION__THEN_OWNER;

    /**
     * The feature id for the '<em><b>If Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTATE_EXP__IF_OWNER = EOCL_EXPRESSION__IF_OWNER;

    /**
     * The feature id for the '<em><b>Else Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTATE_EXP__ELSE_OWNER = EOCL_EXPRESSION__ELSE_OWNER;

    /**
     * The feature id for the '<em><b>Parent Call</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTATE_EXP__PARENT_CALL = EOCL_EXPRESSION__PARENT_CALL;

    /**
     * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTATE_EXP__PARENT_NAV = EOCL_EXPRESSION__PARENT_NAV;

    /**
     * The number of structural features of the '<em>EState Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTATE_EXP_FEATURE_COUNT = EOCL_EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>EState Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTATE_EXP_OPERATION_COUNT = EOCL_EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.exp.impl.EFeatureCallExpImpl <em>EFeature Call Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.exp.impl.EFeatureCallExpImpl
     * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEFeatureCallExp()
     * @generated
     */
    int EFEATURE_CALL_EXP = 4;

    /**
     * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EFEATURE_CALL_EXP__LOOP_BODY_OWNER = ECALL_EXP__LOOP_BODY_OWNER;

    /**
     * The feature id for the '<em><b>Applied Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EFEATURE_CALL_EXP__APPLIED_ELEMENT = ECALL_EXP__APPLIED_ELEMENT;

    /**
     * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EFEATURE_CALL_EXP__INITIALIZED_ELEMENT = ECALL_EXP__INITIALIZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Then Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EFEATURE_CALL_EXP__THEN_OWNER = ECALL_EXP__THEN_OWNER;

    /**
     * The feature id for the '<em><b>If Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EFEATURE_CALL_EXP__IF_OWNER = ECALL_EXP__IF_OWNER;

    /**
     * The feature id for the '<em><b>Else Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EFEATURE_CALL_EXP__ELSE_OWNER = ECALL_EXP__ELSE_OWNER;

    /**
     * The feature id for the '<em><b>Parent Call</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EFEATURE_CALL_EXP__PARENT_CALL = ECALL_EXP__PARENT_CALL;

    /**
     * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EFEATURE_CALL_EXP__PARENT_NAV = ECALL_EXP__PARENT_NAV;

    /**
     * The feature id for the '<em><b>Source</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EFEATURE_CALL_EXP__SOURCE = ECALL_EXP__SOURCE;

    /**
     * The number of structural features of the '<em>EFeature Call Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EFEATURE_CALL_EXP_FEATURE_COUNT = ECALL_EXP_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>EFeature Call Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EFEATURE_CALL_EXP_OPERATION_COUNT = ECALL_EXP_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.exp.impl.ENavigationCallExpImpl <em>ENavigation Call Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.exp.impl.ENavigationCallExpImpl
     * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getENavigationCallExp()
     * @generated
     */
    int ENAVIGATION_CALL_EXP = 17;

    /**
     * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENAVIGATION_CALL_EXP__LOOP_BODY_OWNER = EFEATURE_CALL_EXP__LOOP_BODY_OWNER;

    /**
     * The feature id for the '<em><b>Applied Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENAVIGATION_CALL_EXP__APPLIED_ELEMENT = EFEATURE_CALL_EXP__APPLIED_ELEMENT;

    /**
     * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENAVIGATION_CALL_EXP__INITIALIZED_ELEMENT = EFEATURE_CALL_EXP__INITIALIZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Then Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENAVIGATION_CALL_EXP__THEN_OWNER = EFEATURE_CALL_EXP__THEN_OWNER;

    /**
     * The feature id for the '<em><b>If Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENAVIGATION_CALL_EXP__IF_OWNER = EFEATURE_CALL_EXP__IF_OWNER;

    /**
     * The feature id for the '<em><b>Else Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENAVIGATION_CALL_EXP__ELSE_OWNER = EFEATURE_CALL_EXP__ELSE_OWNER;

    /**
     * The feature id for the '<em><b>Parent Call</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENAVIGATION_CALL_EXP__PARENT_CALL = EFEATURE_CALL_EXP__PARENT_CALL;

    /**
     * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENAVIGATION_CALL_EXP__PARENT_NAV = EFEATURE_CALL_EXP__PARENT_NAV;

    /**
     * The feature id for the '<em><b>Source</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENAVIGATION_CALL_EXP__SOURCE = EFEATURE_CALL_EXP__SOURCE;

    /**
     * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENAVIGATION_CALL_EXP__QUALIFIER = EFEATURE_CALL_EXP_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>ENavigation Call Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENAVIGATION_CALL_EXP_FEATURE_COUNT = EFEATURE_CALL_EXP_FEATURE_COUNT
        + 1;

    /**
     * The number of operations of the '<em>ENavigation Call Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENAVIGATION_CALL_EXP_OPERATION_COUNT = EFEATURE_CALL_EXP_OPERATION_COUNT
        + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.exp.impl.EAssociationClassCallExpImpl <em>EAssociation Class Call Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.exp.impl.EAssociationClassCallExpImpl
     * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEAssociationClassCallExp()
     * @generated
     */
    int EASSOCIATION_CLASS_CALL_EXP = 5;

    /**
     * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EASSOCIATION_CLASS_CALL_EXP__LOOP_BODY_OWNER = ENAVIGATION_CALL_EXP__LOOP_BODY_OWNER;

    /**
     * The feature id for the '<em><b>Applied Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EASSOCIATION_CLASS_CALL_EXP__APPLIED_ELEMENT = ENAVIGATION_CALL_EXP__APPLIED_ELEMENT;

    /**
     * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EASSOCIATION_CLASS_CALL_EXP__INITIALIZED_ELEMENT = ENAVIGATION_CALL_EXP__INITIALIZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Then Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EASSOCIATION_CLASS_CALL_EXP__THEN_OWNER = ENAVIGATION_CALL_EXP__THEN_OWNER;

    /**
     * The feature id for the '<em><b>If Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EASSOCIATION_CLASS_CALL_EXP__IF_OWNER = ENAVIGATION_CALL_EXP__IF_OWNER;

    /**
     * The feature id for the '<em><b>Else Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EASSOCIATION_CLASS_CALL_EXP__ELSE_OWNER = ENAVIGATION_CALL_EXP__ELSE_OWNER;

    /**
     * The feature id for the '<em><b>Parent Call</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EASSOCIATION_CLASS_CALL_EXP__PARENT_CALL = ENAVIGATION_CALL_EXP__PARENT_CALL;

    /**
     * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EASSOCIATION_CLASS_CALL_EXP__PARENT_NAV = ENAVIGATION_CALL_EXP__PARENT_NAV;

    /**
     * The feature id for the '<em><b>Source</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EASSOCIATION_CLASS_CALL_EXP__SOURCE = ENAVIGATION_CALL_EXP__SOURCE;

    /**
     * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EASSOCIATION_CLASS_CALL_EXP__QUALIFIER = ENAVIGATION_CALL_EXP__QUALIFIER;

    /**
     * The feature id for the '<em><b>Referred Association Ends</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_ENDS = ENAVIGATION_CALL_EXP_FEATURE_COUNT
        + 0;

    /**
     * The number of structural features of the '<em>EAssociation Class Call Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EASSOCIATION_CLASS_CALL_EXP_FEATURE_COUNT = ENAVIGATION_CALL_EXP_FEATURE_COUNT
        + 1;

    /**
     * The number of operations of the '<em>EAssociation Class Call Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EASSOCIATION_CLASS_CALL_EXP_OPERATION_COUNT = ENAVIGATION_CALL_EXP_OPERATION_COUNT
        + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.exp.impl.ELiteralExpImpl <em>ELiteral Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.exp.impl.ELiteralExpImpl
     * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getELiteralExp()
     * @generated
     */
    int ELITERAL_EXP = 7;

    /**
     * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELITERAL_EXP__LOOP_BODY_OWNER = EOCL_EXPRESSION__LOOP_BODY_OWNER;

    /**
     * The feature id for the '<em><b>Applied Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELITERAL_EXP__APPLIED_ELEMENT = EOCL_EXPRESSION__APPLIED_ELEMENT;

    /**
     * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELITERAL_EXP__INITIALIZED_ELEMENT = EOCL_EXPRESSION__INITIALIZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Then Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELITERAL_EXP__THEN_OWNER = EOCL_EXPRESSION__THEN_OWNER;

    /**
     * The feature id for the '<em><b>If Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELITERAL_EXP__IF_OWNER = EOCL_EXPRESSION__IF_OWNER;

    /**
     * The feature id for the '<em><b>Else Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELITERAL_EXP__ELSE_OWNER = EOCL_EXPRESSION__ELSE_OWNER;

    /**
     * The feature id for the '<em><b>Parent Call</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELITERAL_EXP__PARENT_CALL = EOCL_EXPRESSION__PARENT_CALL;

    /**
     * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELITERAL_EXP__PARENT_NAV = EOCL_EXPRESSION__PARENT_NAV;

    /**
     * The number of structural features of the '<em>ELiteral Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELITERAL_EXP_FEATURE_COUNT = EOCL_EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>ELiteral Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ELITERAL_EXP_OPERATION_COUNT = EOCL_EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.exp.impl.EPrimitiveTypeImpl <em>EPrimitive Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.exp.impl.EPrimitiveTypeImpl
     * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEPrimitiveType()
     * @generated
     */
    int EPRIMITIVE_TYPE = 16;

    /**
     * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPRIMITIVE_TYPE__LOOP_BODY_OWNER = ELITERAL_EXP__LOOP_BODY_OWNER;

    /**
     * The feature id for the '<em><b>Applied Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPRIMITIVE_TYPE__APPLIED_ELEMENT = ELITERAL_EXP__APPLIED_ELEMENT;

    /**
     * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPRIMITIVE_TYPE__INITIALIZED_ELEMENT = ELITERAL_EXP__INITIALIZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Then Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPRIMITIVE_TYPE__THEN_OWNER = ELITERAL_EXP__THEN_OWNER;

    /**
     * The feature id for the '<em><b>If Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPRIMITIVE_TYPE__IF_OWNER = ELITERAL_EXP__IF_OWNER;

    /**
     * The feature id for the '<em><b>Else Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPRIMITIVE_TYPE__ELSE_OWNER = ELITERAL_EXP__ELSE_OWNER;

    /**
     * The feature id for the '<em><b>Parent Call</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPRIMITIVE_TYPE__PARENT_CALL = ELITERAL_EXP__PARENT_CALL;

    /**
     * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPRIMITIVE_TYPE__PARENT_NAV = ELITERAL_EXP__PARENT_NAV;

    /**
     * The number of structural features of the '<em>EPrimitive Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPRIMITIVE_TYPE_FEATURE_COUNT = ELITERAL_EXP_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>EPrimitive Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPRIMITIVE_TYPE_OPERATION_COUNT = ELITERAL_EXP_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.exp.impl.ENumericLiteralExpImpl <em>ENumeric Literal Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.exp.impl.ENumericLiteralExpImpl
     * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getENumericLiteralExp()
     * @generated
     */
    int ENUMERIC_LITERAL_EXP = 6;

    /**
     * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERIC_LITERAL_EXP__LOOP_BODY_OWNER = EPRIMITIVE_TYPE__LOOP_BODY_OWNER;

    /**
     * The feature id for the '<em><b>Applied Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERIC_LITERAL_EXP__APPLIED_ELEMENT = EPRIMITIVE_TYPE__APPLIED_ELEMENT;

    /**
     * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERIC_LITERAL_EXP__INITIALIZED_ELEMENT = EPRIMITIVE_TYPE__INITIALIZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Then Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERIC_LITERAL_EXP__THEN_OWNER = EPRIMITIVE_TYPE__THEN_OWNER;

    /**
     * The feature id for the '<em><b>If Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERIC_LITERAL_EXP__IF_OWNER = EPRIMITIVE_TYPE__IF_OWNER;

    /**
     * The feature id for the '<em><b>Else Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERIC_LITERAL_EXP__ELSE_OWNER = EPRIMITIVE_TYPE__ELSE_OWNER;

    /**
     * The feature id for the '<em><b>Parent Call</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERIC_LITERAL_EXP__PARENT_CALL = EPRIMITIVE_TYPE__PARENT_CALL;

    /**
     * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERIC_LITERAL_EXP__PARENT_NAV = EPRIMITIVE_TYPE__PARENT_NAV;

    /**
     * The number of structural features of the '<em>ENumeric Literal Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERIC_LITERAL_EXP_FEATURE_COUNT = EPRIMITIVE_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>ENumeric Literal Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ENUMERIC_LITERAL_EXP_OPERATION_COUNT = EPRIMITIVE_TYPE_OPERATION_COUNT
        + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.exp.impl.EMessageExpImpl <em>EMessage Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.exp.impl.EMessageExpImpl
     * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEMessageExp()
     * @generated
     */
    int EMESSAGE_EXP = 8;

    /**
     * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMESSAGE_EXP__LOOP_BODY_OWNER = EOCL_EXPRESSION__LOOP_BODY_OWNER;

    /**
     * The feature id for the '<em><b>Applied Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMESSAGE_EXP__APPLIED_ELEMENT = EOCL_EXPRESSION__APPLIED_ELEMENT;

    /**
     * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMESSAGE_EXP__INITIALIZED_ELEMENT = EOCL_EXPRESSION__INITIALIZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Then Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMESSAGE_EXP__THEN_OWNER = EOCL_EXPRESSION__THEN_OWNER;

    /**
     * The feature id for the '<em><b>If Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMESSAGE_EXP__IF_OWNER = EOCL_EXPRESSION__IF_OWNER;

    /**
     * The feature id for the '<em><b>Else Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMESSAGE_EXP__ELSE_OWNER = EOCL_EXPRESSION__ELSE_OWNER;

    /**
     * The feature id for the '<em><b>Parent Call</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMESSAGE_EXP__PARENT_CALL = EOCL_EXPRESSION__PARENT_CALL;

    /**
     * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMESSAGE_EXP__PARENT_NAV = EOCL_EXPRESSION__PARENT_NAV;

    /**
     * The number of structural features of the '<em>EMessage Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMESSAGE_EXP_FEATURE_COUNT = EOCL_EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The number of operations of the '<em>EMessage Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EMESSAGE_EXP_OPERATION_COUNT = EOCL_EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.exp.impl.EVariableImpl <em>EVariable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.exp.impl.EVariableImpl
     * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEVariable()
     * @generated
     */
    int EVARIABLE = 9;

    /**
     * The feature id for the '<em><b>Loop Exp</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVARIABLE__LOOP_EXP = 0;

    /**
     * The feature id for the '<em><b>Base Exp</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVARIABLE__BASE_EXP = 1;

    /**
     * The feature id for the '<em><b>Init Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVARIABLE__INIT_EXPRESSION = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVARIABLE__NAME = 3;

    /**
     * The number of structural features of the '<em>EVariable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVARIABLE_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>EVariable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EVARIABLE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.exp.impl.EPropertyCallExpImpl <em>EProperty Call Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.exp.impl.EPropertyCallExpImpl
     * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEPropertyCallExp()
     * @generated
     */
    int EPROPERTY_CALL_EXP = 10;

    /**
     * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPROPERTY_CALL_EXP__LOOP_BODY_OWNER = ENAVIGATION_CALL_EXP__LOOP_BODY_OWNER;

    /**
     * The feature id for the '<em><b>Applied Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPROPERTY_CALL_EXP__APPLIED_ELEMENT = ENAVIGATION_CALL_EXP__APPLIED_ELEMENT;

    /**
     * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPROPERTY_CALL_EXP__INITIALIZED_ELEMENT = ENAVIGATION_CALL_EXP__INITIALIZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Then Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPROPERTY_CALL_EXP__THEN_OWNER = ENAVIGATION_CALL_EXP__THEN_OWNER;

    /**
     * The feature id for the '<em><b>If Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPROPERTY_CALL_EXP__IF_OWNER = ENAVIGATION_CALL_EXP__IF_OWNER;

    /**
     * The feature id for the '<em><b>Else Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPROPERTY_CALL_EXP__ELSE_OWNER = ENAVIGATION_CALL_EXP__ELSE_OWNER;

    /**
     * The feature id for the '<em><b>Parent Call</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPROPERTY_CALL_EXP__PARENT_CALL = ENAVIGATION_CALL_EXP__PARENT_CALL;

    /**
     * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPROPERTY_CALL_EXP__PARENT_NAV = ENAVIGATION_CALL_EXP__PARENT_NAV;

    /**
     * The feature id for the '<em><b>Source</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPROPERTY_CALL_EXP__SOURCE = ENAVIGATION_CALL_EXP__SOURCE;

    /**
     * The feature id for the '<em><b>Qualifier</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPROPERTY_CALL_EXP__QUALIFIER = ENAVIGATION_CALL_EXP__QUALIFIER;

    /**
     * The feature id for the '<em><b>Referred Property</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPROPERTY_CALL_EXP__REFERRED_PROPERTY = ENAVIGATION_CALL_EXP_FEATURE_COUNT
        + 0;

    /**
     * The number of structural features of the '<em>EProperty Call Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPROPERTY_CALL_EXP_FEATURE_COUNT = ENAVIGATION_CALL_EXP_FEATURE_COUNT
        + 1;

    /**
     * The number of operations of the '<em>EProperty Call Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EPROPERTY_CALL_EXP_OPERATION_COUNT = ENAVIGATION_CALL_EXP_OPERATION_COUNT
        + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.exp.impl.EIteratorExpImpl <em>EIterator Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.exp.impl.EIteratorExpImpl
     * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEIteratorExp()
     * @generated
     */
    int EITERATOR_EXP = 11;

    /**
     * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATOR_EXP__LOOP_BODY_OWNER = ELOOP_EXP__LOOP_BODY_OWNER;

    /**
     * The feature id for the '<em><b>Applied Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATOR_EXP__APPLIED_ELEMENT = ELOOP_EXP__APPLIED_ELEMENT;

    /**
     * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATOR_EXP__INITIALIZED_ELEMENT = ELOOP_EXP__INITIALIZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Then Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATOR_EXP__THEN_OWNER = ELOOP_EXP__THEN_OWNER;

    /**
     * The feature id for the '<em><b>If Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATOR_EXP__IF_OWNER = ELOOP_EXP__IF_OWNER;

    /**
     * The feature id for the '<em><b>Else Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATOR_EXP__ELSE_OWNER = ELOOP_EXP__ELSE_OWNER;

    /**
     * The feature id for the '<em><b>Parent Call</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATOR_EXP__PARENT_CALL = ELOOP_EXP__PARENT_CALL;

    /**
     * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATOR_EXP__PARENT_NAV = ELOOP_EXP__PARENT_NAV;

    /**
     * The feature id for the '<em><b>Source</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATOR_EXP__SOURCE = ELOOP_EXP__SOURCE;

    /**
     * The feature id for the '<em><b>Body</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATOR_EXP__BODY = ELOOP_EXP__BODY;

    /**
     * The feature id for the '<em><b>Iterator</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATOR_EXP__ITERATOR = ELOOP_EXP__ITERATOR;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATOR_EXP__KIND = ELOOP_EXP_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>EIterator Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATOR_EXP_FEATURE_COUNT = ELOOP_EXP_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>EIterator Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATOR_EXP_OPERATION_COUNT = ELOOP_EXP_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.exp.impl.EIterateExpImpl <em>EIterate Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.exp.impl.EIterateExpImpl
     * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEIterateExp()
     * @generated
     */
    int EITERATE_EXP = 13;

    /**
     * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATE_EXP__LOOP_BODY_OWNER = ELOOP_EXP__LOOP_BODY_OWNER;

    /**
     * The feature id for the '<em><b>Applied Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATE_EXP__APPLIED_ELEMENT = ELOOP_EXP__APPLIED_ELEMENT;

    /**
     * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATE_EXP__INITIALIZED_ELEMENT = ELOOP_EXP__INITIALIZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Then Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATE_EXP__THEN_OWNER = ELOOP_EXP__THEN_OWNER;

    /**
     * The feature id for the '<em><b>If Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATE_EXP__IF_OWNER = ELOOP_EXP__IF_OWNER;

    /**
     * The feature id for the '<em><b>Else Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATE_EXP__ELSE_OWNER = ELOOP_EXP__ELSE_OWNER;

    /**
     * The feature id for the '<em><b>Parent Call</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATE_EXP__PARENT_CALL = ELOOP_EXP__PARENT_CALL;

    /**
     * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATE_EXP__PARENT_NAV = ELOOP_EXP__PARENT_NAV;

    /**
     * The feature id for the '<em><b>Source</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATE_EXP__SOURCE = ELOOP_EXP__SOURCE;

    /**
     * The feature id for the '<em><b>Body</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATE_EXP__BODY = ELOOP_EXP__BODY;

    /**
     * The feature id for the '<em><b>Iterator</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATE_EXP__ITERATOR = ELOOP_EXP__ITERATOR;

    /**
     * The feature id for the '<em><b>Result</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATE_EXP__RESULT = ELOOP_EXP_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>EIterate Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATE_EXP_FEATURE_COUNT = ELOOP_EXP_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>EIterate Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EITERATE_EXP_OPERATION_COUNT = ELOOP_EXP_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.exp.impl.EIntegerLiteralExpImpl <em>EInteger Literal Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.exp.impl.EIntegerLiteralExpImpl
     * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEIntegerLiteralExp()
     * @generated
     */
    int EINTEGER_LITERAL_EXP = 15;

    /**
     * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EINTEGER_LITERAL_EXP__LOOP_BODY_OWNER = ENUMERIC_LITERAL_EXP__LOOP_BODY_OWNER;

    /**
     * The feature id for the '<em><b>Applied Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EINTEGER_LITERAL_EXP__APPLIED_ELEMENT = ENUMERIC_LITERAL_EXP__APPLIED_ELEMENT;

    /**
     * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EINTEGER_LITERAL_EXP__INITIALIZED_ELEMENT = ENUMERIC_LITERAL_EXP__INITIALIZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Then Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EINTEGER_LITERAL_EXP__THEN_OWNER = ENUMERIC_LITERAL_EXP__THEN_OWNER;

    /**
     * The feature id for the '<em><b>If Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EINTEGER_LITERAL_EXP__IF_OWNER = ENUMERIC_LITERAL_EXP__IF_OWNER;

    /**
     * The feature id for the '<em><b>Else Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EINTEGER_LITERAL_EXP__ELSE_OWNER = ENUMERIC_LITERAL_EXP__ELSE_OWNER;

    /**
     * The feature id for the '<em><b>Parent Call</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EINTEGER_LITERAL_EXP__PARENT_CALL = ENUMERIC_LITERAL_EXP__PARENT_CALL;

    /**
     * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EINTEGER_LITERAL_EXP__PARENT_NAV = ENUMERIC_LITERAL_EXP__PARENT_NAV;

    /**
     * The feature id for the '<em><b>Integer Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EINTEGER_LITERAL_EXP__INTEGER_VALUE = ENUMERIC_LITERAL_EXP_FEATURE_COUNT
        + 0;

    /**
     * The number of structural features of the '<em>EInteger Literal Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EINTEGER_LITERAL_EXP_FEATURE_COUNT = ENUMERIC_LITERAL_EXP_FEATURE_COUNT
        + 1;

    /**
     * The number of operations of the '<em>EInteger Literal Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EINTEGER_LITERAL_EXP_OPERATION_COUNT = ENUMERIC_LITERAL_EXP_OPERATION_COUNT
        + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.exp.impl.EOperationCallExpImpl <em>EOperation Call Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.exp.impl.EOperationCallExpImpl
     * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEOperationCallExp()
     * @generated
     */
    int EOPERATION_CALL_EXP = 18;

    /**
     * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOPERATION_CALL_EXP__LOOP_BODY_OWNER = EFEATURE_CALL_EXP__LOOP_BODY_OWNER;

    /**
     * The feature id for the '<em><b>Applied Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOPERATION_CALL_EXP__APPLIED_ELEMENT = EFEATURE_CALL_EXP__APPLIED_ELEMENT;

    /**
     * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOPERATION_CALL_EXP__INITIALIZED_ELEMENT = EFEATURE_CALL_EXP__INITIALIZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Then Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOPERATION_CALL_EXP__THEN_OWNER = EFEATURE_CALL_EXP__THEN_OWNER;

    /**
     * The feature id for the '<em><b>If Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOPERATION_CALL_EXP__IF_OWNER = EFEATURE_CALL_EXP__IF_OWNER;

    /**
     * The feature id for the '<em><b>Else Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOPERATION_CALL_EXP__ELSE_OWNER = EFEATURE_CALL_EXP__ELSE_OWNER;

    /**
     * The feature id for the '<em><b>Parent Call</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOPERATION_CALL_EXP__PARENT_CALL = EFEATURE_CALL_EXP__PARENT_CALL;

    /**
     * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOPERATION_CALL_EXP__PARENT_NAV = EFEATURE_CALL_EXP__PARENT_NAV;

    /**
     * The feature id for the '<em><b>Source</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOPERATION_CALL_EXP__SOURCE = EFEATURE_CALL_EXP__SOURCE;

    /**
     * The feature id for the '<em><b>Argument</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOPERATION_CALL_EXP__ARGUMENT = EFEATURE_CALL_EXP_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Referred Operation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOPERATION_CALL_EXP__REFERRED_OPERATION = EFEATURE_CALL_EXP_FEATURE_COUNT
        + 1;

    /**
     * The number of structural features of the '<em>EOperation Call Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOPERATION_CALL_EXP_FEATURE_COUNT = EFEATURE_CALL_EXP_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>EOperation Call Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EOPERATION_CALL_EXP_OPERATION_COUNT = EFEATURE_CALL_EXP_OPERATION_COUNT
        + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.exp.impl.EStringLiteralExpImpl <em>EString Literal Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.exp.impl.EStringLiteralExpImpl
     * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEStringLiteralExp()
     * @generated
     */
    int ESTRING_LITERAL_EXP = 19;

    /**
     * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTRING_LITERAL_EXP__LOOP_BODY_OWNER = EPRIMITIVE_TYPE__LOOP_BODY_OWNER;

    /**
     * The feature id for the '<em><b>Applied Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTRING_LITERAL_EXP__APPLIED_ELEMENT = EPRIMITIVE_TYPE__APPLIED_ELEMENT;

    /**
     * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTRING_LITERAL_EXP__INITIALIZED_ELEMENT = EPRIMITIVE_TYPE__INITIALIZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Then Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTRING_LITERAL_EXP__THEN_OWNER = EPRIMITIVE_TYPE__THEN_OWNER;

    /**
     * The feature id for the '<em><b>If Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTRING_LITERAL_EXP__IF_OWNER = EPRIMITIVE_TYPE__IF_OWNER;

    /**
     * The feature id for the '<em><b>Else Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTRING_LITERAL_EXP__ELSE_OWNER = EPRIMITIVE_TYPE__ELSE_OWNER;

    /**
     * The feature id for the '<em><b>Parent Call</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTRING_LITERAL_EXP__PARENT_CALL = EPRIMITIVE_TYPE__PARENT_CALL;

    /**
     * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTRING_LITERAL_EXP__PARENT_NAV = EPRIMITIVE_TYPE__PARENT_NAV;

    /**
     * The feature id for the '<em><b>String Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTRING_LITERAL_EXP__STRING_VALUE = EPRIMITIVE_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>EString Literal Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTRING_LITERAL_EXP_FEATURE_COUNT = EPRIMITIVE_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>EString Literal Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ESTRING_LITERAL_EXP_OPERATION_COUNT = EPRIMITIVE_TYPE_OPERATION_COUNT
        + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.exp.impl.EIfExpImpl <em>EIf Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.exp.impl.EIfExpImpl
     * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEIfExp()
     * @generated
     */
    int EIF_EXP = 20;

    /**
     * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EIF_EXP__LOOP_BODY_OWNER = EOCL_EXPRESSION__LOOP_BODY_OWNER;

    /**
     * The feature id for the '<em><b>Applied Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EIF_EXP__APPLIED_ELEMENT = EOCL_EXPRESSION__APPLIED_ELEMENT;

    /**
     * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EIF_EXP__INITIALIZED_ELEMENT = EOCL_EXPRESSION__INITIALIZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Then Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EIF_EXP__THEN_OWNER = EOCL_EXPRESSION__THEN_OWNER;

    /**
     * The feature id for the '<em><b>If Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EIF_EXP__IF_OWNER = EOCL_EXPRESSION__IF_OWNER;

    /**
     * The feature id for the '<em><b>Else Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EIF_EXP__ELSE_OWNER = EOCL_EXPRESSION__ELSE_OWNER;

    /**
     * The feature id for the '<em><b>Parent Call</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EIF_EXP__PARENT_CALL = EOCL_EXPRESSION__PARENT_CALL;

    /**
     * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EIF_EXP__PARENT_NAV = EOCL_EXPRESSION__PARENT_NAV;

    /**
     * The feature id for the '<em><b>Then Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EIF_EXP__THEN_EXPRESSION = EOCL_EXPRESSION_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EIF_EXP__CONDITION = EOCL_EXPRESSION_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Else Expression</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EIF_EXP__ELSE_EXPRESSION = EOCL_EXPRESSION_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>EIf Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EIF_EXP_FEATURE_COUNT = EOCL_EXPRESSION_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>EIf Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EIF_EXP_OPERATION_COUNT = EOCL_EXPRESSION_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.exp.impl.EBooleanLiteralExpImpl <em>EBoolean Literal Exp</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.exp.impl.EBooleanLiteralExpImpl
     * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEBooleanLiteralExp()
     * @generated
     */
    int EBOOLEAN_LITERAL_EXP = 21;

    /**
     * The feature id for the '<em><b>Loop Body Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBOOLEAN_LITERAL_EXP__LOOP_BODY_OWNER = EPRIMITIVE_TYPE__LOOP_BODY_OWNER;

    /**
     * The feature id for the '<em><b>Applied Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBOOLEAN_LITERAL_EXP__APPLIED_ELEMENT = EPRIMITIVE_TYPE__APPLIED_ELEMENT;

    /**
     * The feature id for the '<em><b>Initialized Element</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBOOLEAN_LITERAL_EXP__INITIALIZED_ELEMENT = EPRIMITIVE_TYPE__INITIALIZED_ELEMENT;

    /**
     * The feature id for the '<em><b>Then Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBOOLEAN_LITERAL_EXP__THEN_OWNER = EPRIMITIVE_TYPE__THEN_OWNER;

    /**
     * The feature id for the '<em><b>If Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBOOLEAN_LITERAL_EXP__IF_OWNER = EPRIMITIVE_TYPE__IF_OWNER;

    /**
     * The feature id for the '<em><b>Else Owner</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBOOLEAN_LITERAL_EXP__ELSE_OWNER = EPRIMITIVE_TYPE__ELSE_OWNER;

    /**
     * The feature id for the '<em><b>Parent Call</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBOOLEAN_LITERAL_EXP__PARENT_CALL = EPRIMITIVE_TYPE__PARENT_CALL;

    /**
     * The feature id for the '<em><b>Parent Nav</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBOOLEAN_LITERAL_EXP__PARENT_NAV = EPRIMITIVE_TYPE__PARENT_NAV;

    /**
     * The feature id for the '<em><b>Boolean Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBOOLEAN_LITERAL_EXP__BOOLEAN_VALUE = EPRIMITIVE_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>EBoolean Literal Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBOOLEAN_LITERAL_EXP_FEATURE_COUNT = EPRIMITIVE_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>EBoolean Literal Exp</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EBOOLEAN_LITERAL_EXP_OPERATION_COUNT = EPRIMITIVE_TYPE_OPERATION_COUNT
        + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.exp.EIteratorKind <em>EIterator Kind</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.exp.EIteratorKind
     * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEIteratorKind()
     * @generated
     */
    int EITERATOR_KIND = 22;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.exp.EOperator <em>EOperator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.exp.EOperator
     * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEOperator()
     * @generated
     */
    int EOPERATOR = 23;

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.exp.EVariableExp <em>EVariable Exp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EVariable Exp</em>'.
     * @see org.vgu.se.ocl.exp.EVariableExp
     * @generated
     */
    EClass getEVariableExp();

    /**
     * Returns the meta object for the reference '{@link org.vgu.se.ocl.exp.EVariableExp#getReferredVariable <em>Referred Variable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Referred Variable</em>'.
     * @see org.vgu.se.ocl.exp.EVariableExp#getReferredVariable()
     * @see #getEVariableExp()
     * @generated
     */
    EReference getEVariableExp_ReferredVariable();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.exp.ETypeExp <em>EType Exp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EType Exp</em>'.
     * @see org.vgu.se.ocl.exp.ETypeExp
     * @generated
     */
    EClass getETypeExp();

    /**
     * Returns the meta object for the reference '{@link org.vgu.se.ocl.exp.ETypeExp#getReferredType <em>Referred Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Referred Type</em>'.
     * @see org.vgu.se.ocl.exp.ETypeExp#getReferredType()
     * @see #getETypeExp()
     * @generated
     */
    EReference getETypeExp_ReferredType();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.exp.ELoopExp <em>ELoop Exp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ELoop Exp</em>'.
     * @see org.vgu.se.ocl.exp.ELoopExp
     * @generated
     */
    EClass getELoopExp();

    /**
     * Returns the meta object for the containment reference '{@link org.vgu.se.ocl.exp.ELoopExp#getBody <em>Body</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Body</em>'.
     * @see org.vgu.se.ocl.exp.ELoopExp#getBody()
     * @see #getELoopExp()
     * @generated
     */
    EReference getELoopExp_Body();

    /**
     * Returns the meta object for the containment reference list '{@link org.vgu.se.ocl.exp.ELoopExp#getIterator <em>Iterator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Iterator</em>'.
     * @see org.vgu.se.ocl.exp.ELoopExp#getIterator()
     * @see #getELoopExp()
     * @generated
     */
    EReference getELoopExp_Iterator();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.exp.EStateExp <em>EState Exp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EState Exp</em>'.
     * @see org.vgu.se.ocl.exp.EStateExp
     * @generated
     */
    EClass getEStateExp();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.exp.EFeatureCallExp <em>EFeature Call Exp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EFeature Call Exp</em>'.
     * @see org.vgu.se.ocl.exp.EFeatureCallExp
     * @generated
     */
    EClass getEFeatureCallExp();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.exp.EAssociationClassCallExp <em>EAssociation Class Call Exp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EAssociation Class Call Exp</em>'.
     * @see org.vgu.se.ocl.exp.EAssociationClassCallExp
     * @generated
     */
    EClass getEAssociationClassCallExp();

    /**
     * Returns the meta object for the reference '{@link org.vgu.se.ocl.exp.EAssociationClassCallExp#getReferredAssociationEnds <em>Referred Association Ends</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Referred Association Ends</em>'.
     * @see org.vgu.se.ocl.exp.EAssociationClassCallExp#getReferredAssociationEnds()
     * @see #getEAssociationClassCallExp()
     * @generated
     */
    EReference getEAssociationClassCallExp_ReferredAssociationEnds();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.exp.ENumericLiteralExp <em>ENumeric Literal Exp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ENumeric Literal Exp</em>'.
     * @see org.vgu.se.ocl.exp.ENumericLiteralExp
     * @generated
     */
    EClass getENumericLiteralExp();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.exp.ELiteralExp <em>ELiteral Exp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ELiteral Exp</em>'.
     * @see org.vgu.se.ocl.exp.ELiteralExp
     * @generated
     */
    EClass getELiteralExp();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.exp.EMessageExp <em>EMessage Exp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EMessage Exp</em>'.
     * @see org.vgu.se.ocl.exp.EMessageExp
     * @generated
     */
    EClass getEMessageExp();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.exp.EVariable <em>EVariable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EVariable</em>'.
     * @see org.vgu.se.ocl.exp.EVariable
     * @generated
     */
    EClass getEVariable();

    /**
     * Returns the meta object for the container reference '{@link org.vgu.se.ocl.exp.EVariable#getLoopExp <em>Loop Exp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Loop Exp</em>'.
     * @see org.vgu.se.ocl.exp.EVariable#getLoopExp()
     * @see #getEVariable()
     * @generated
     */
    EReference getEVariable_LoopExp();

    /**
     * Returns the meta object for the container reference '{@link org.vgu.se.ocl.exp.EVariable#getBaseExp <em>Base Exp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Base Exp</em>'.
     * @see org.vgu.se.ocl.exp.EVariable#getBaseExp()
     * @see #getEVariable()
     * @generated
     */
    EReference getEVariable_BaseExp();

    /**
     * Returns the meta object for the containment reference '{@link org.vgu.se.ocl.exp.EVariable#getInitExpression <em>Init Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Init Expression</em>'.
     * @see org.vgu.se.ocl.exp.EVariable#getInitExpression()
     * @see #getEVariable()
     * @generated
     */
    EReference getEVariable_InitExpression();

    /**
     * Returns the meta object for the attribute '{@link org.vgu.se.ocl.exp.EVariable#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.vgu.se.ocl.exp.EVariable#getName()
     * @see #getEVariable()
     * @generated
     */
    EAttribute getEVariable_Name();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.exp.EPropertyCallExp <em>EProperty Call Exp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EProperty Call Exp</em>'.
     * @see org.vgu.se.ocl.exp.EPropertyCallExp
     * @generated
     */
    EClass getEPropertyCallExp();

    /**
     * Returns the meta object for the reference '{@link org.vgu.se.ocl.exp.EPropertyCallExp#getReferredProperty <em>Referred Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Referred Property</em>'.
     * @see org.vgu.se.ocl.exp.EPropertyCallExp#getReferredProperty()
     * @see #getEPropertyCallExp()
     * @generated
     */
    EReference getEPropertyCallExp_ReferredProperty();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.exp.EIteratorExp <em>EIterator Exp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EIterator Exp</em>'.
     * @see org.vgu.se.ocl.exp.EIteratorExp
     * @generated
     */
    EClass getEIteratorExp();

    /**
     * Returns the meta object for the attribute '{@link org.vgu.se.ocl.exp.EIteratorExp#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kind</em>'.
     * @see org.vgu.se.ocl.exp.EIteratorExp#getKind()
     * @see #getEIteratorExp()
     * @generated
     */
    EAttribute getEIteratorExp_Kind();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.exp.EOclExpression <em>EOcl Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EOcl Expression</em>'.
     * @see org.vgu.se.ocl.exp.EOclExpression
     * @generated
     */
    EClass getEOclExpression();

    /**
     * Returns the meta object for the container reference '{@link org.vgu.se.ocl.exp.EOclExpression#getLoopBodyOwner <em>Loop Body Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Loop Body Owner</em>'.
     * @see org.vgu.se.ocl.exp.EOclExpression#getLoopBodyOwner()
     * @see #getEOclExpression()
     * @generated
     */
    EReference getEOclExpression_LoopBodyOwner();

    /**
     * Returns the meta object for the container reference '{@link org.vgu.se.ocl.exp.EOclExpression#getAppliedElement <em>Applied Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Applied Element</em>'.
     * @see org.vgu.se.ocl.exp.EOclExpression#getAppliedElement()
     * @see #getEOclExpression()
     * @generated
     */
    EReference getEOclExpression_AppliedElement();

    /**
     * Returns the meta object for the container reference '{@link org.vgu.se.ocl.exp.EOclExpression#getInitializedElement <em>Initialized Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Initialized Element</em>'.
     * @see org.vgu.se.ocl.exp.EOclExpression#getInitializedElement()
     * @see #getEOclExpression()
     * @generated
     */
    EReference getEOclExpression_InitializedElement();

    /**
     * Returns the meta object for the container reference '{@link org.vgu.se.ocl.exp.EOclExpression#getThenOwner <em>Then Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Then Owner</em>'.
     * @see org.vgu.se.ocl.exp.EOclExpression#getThenOwner()
     * @see #getEOclExpression()
     * @generated
     */
    EReference getEOclExpression_ThenOwner();

    /**
     * Returns the meta object for the container reference '{@link org.vgu.se.ocl.exp.EOclExpression#getIfOwner <em>If Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>If Owner</em>'.
     * @see org.vgu.se.ocl.exp.EOclExpression#getIfOwner()
     * @see #getEOclExpression()
     * @generated
     */
    EReference getEOclExpression_IfOwner();

    /**
     * Returns the meta object for the container reference '{@link org.vgu.se.ocl.exp.EOclExpression#getElseOwner <em>Else Owner</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Else Owner</em>'.
     * @see org.vgu.se.ocl.exp.EOclExpression#getElseOwner()
     * @see #getEOclExpression()
     * @generated
     */
    EReference getEOclExpression_ElseOwner();

    /**
     * Returns the meta object for the container reference '{@link org.vgu.se.ocl.exp.EOclExpression#getParentCall <em>Parent Call</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Call</em>'.
     * @see org.vgu.se.ocl.exp.EOclExpression#getParentCall()
     * @see #getEOclExpression()
     * @generated
     */
    EReference getEOclExpression_ParentCall();

    /**
     * Returns the meta object for the container reference '{@link org.vgu.se.ocl.exp.EOclExpression#getParentNav <em>Parent Nav</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Parent Nav</em>'.
     * @see org.vgu.se.ocl.exp.EOclExpression#getParentNav()
     * @see #getEOclExpression()
     * @generated
     */
    EReference getEOclExpression_ParentNav();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.exp.EIterateExp <em>EIterate Exp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EIterate Exp</em>'.
     * @see org.vgu.se.ocl.exp.EIterateExp
     * @generated
     */
    EClass getEIterateExp();

    /**
     * Returns the meta object for the containment reference '{@link org.vgu.se.ocl.exp.EIterateExp#getResult <em>Result</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Result</em>'.
     * @see org.vgu.se.ocl.exp.EIterateExp#getResult()
     * @see #getEIterateExp()
     * @generated
     */
    EReference getEIterateExp_Result();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.exp.ECallExp <em>ECall Exp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ECall Exp</em>'.
     * @see org.vgu.se.ocl.exp.ECallExp
     * @generated
     */
    EClass getECallExp();

    /**
     * Returns the meta object for the containment reference '{@link org.vgu.se.ocl.exp.ECallExp#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Source</em>'.
     * @see org.vgu.se.ocl.exp.ECallExp#getSource()
     * @see #getECallExp()
     * @generated
     */
    EReference getECallExp_Source();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.exp.EIntegerLiteralExp <em>EInteger Literal Exp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EInteger Literal Exp</em>'.
     * @see org.vgu.se.ocl.exp.EIntegerLiteralExp
     * @generated
     */
    EClass getEIntegerLiteralExp();

    /**
     * Returns the meta object for the attribute '{@link org.vgu.se.ocl.exp.EIntegerLiteralExp#getIntegerValue <em>Integer Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Integer Value</em>'.
     * @see org.vgu.se.ocl.exp.EIntegerLiteralExp#getIntegerValue()
     * @see #getEIntegerLiteralExp()
     * @generated
     */
    EAttribute getEIntegerLiteralExp_IntegerValue();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.exp.EPrimitiveType <em>EPrimitive Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EPrimitive Type</em>'.
     * @see org.vgu.se.ocl.exp.EPrimitiveType
     * @generated
     */
    EClass getEPrimitiveType();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.exp.ENavigationCallExp <em>ENavigation Call Exp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>ENavigation Call Exp</em>'.
     * @see org.vgu.se.ocl.exp.ENavigationCallExp
     * @generated
     */
    EClass getENavigationCallExp();

    /**
     * Returns the meta object for the containment reference list '{@link org.vgu.se.ocl.exp.ENavigationCallExp#getQualifier <em>Qualifier</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Qualifier</em>'.
     * @see org.vgu.se.ocl.exp.ENavigationCallExp#getQualifier()
     * @see #getENavigationCallExp()
     * @generated
     */
    EReference getENavigationCallExp_Qualifier();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.exp.EOperationCallExp <em>EOperation Call Exp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EOperation Call Exp</em>'.
     * @see org.vgu.se.ocl.exp.EOperationCallExp
     * @generated
     */
    EClass getEOperationCallExp();

    /**
     * Returns the meta object for the containment reference list '{@link org.vgu.se.ocl.exp.EOperationCallExp#getArgument <em>Argument</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Argument</em>'.
     * @see org.vgu.se.ocl.exp.EOperationCallExp#getArgument()
     * @see #getEOperationCallExp()
     * @generated
     */
    EReference getEOperationCallExp_Argument();

    /**
     * Returns the meta object for the attribute '{@link org.vgu.se.ocl.exp.EOperationCallExp#getReferredOperation <em>Referred Operation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Referred Operation</em>'.
     * @see org.vgu.se.ocl.exp.EOperationCallExp#getReferredOperation()
     * @see #getEOperationCallExp()
     * @generated
     */
    EAttribute getEOperationCallExp_ReferredOperation();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.exp.EStringLiteralExp <em>EString Literal Exp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EString Literal Exp</em>'.
     * @see org.vgu.se.ocl.exp.EStringLiteralExp
     * @generated
     */
    EClass getEStringLiteralExp();

    /**
     * Returns the meta object for the attribute '{@link org.vgu.se.ocl.exp.EStringLiteralExp#getStringValue <em>String Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>String Value</em>'.
     * @see org.vgu.se.ocl.exp.EStringLiteralExp#getStringValue()
     * @see #getEStringLiteralExp()
     * @generated
     */
    EAttribute getEStringLiteralExp_StringValue();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.exp.EIfExp <em>EIf Exp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EIf Exp</em>'.
     * @see org.vgu.se.ocl.exp.EIfExp
     * @generated
     */
    EClass getEIfExp();

    /**
     * Returns the meta object for the containment reference '{@link org.vgu.se.ocl.exp.EIfExp#getThenExpression <em>Then Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Then Expression</em>'.
     * @see org.vgu.se.ocl.exp.EIfExp#getThenExpression()
     * @see #getEIfExp()
     * @generated
     */
    EReference getEIfExp_ThenExpression();

    /**
     * Returns the meta object for the containment reference '{@link org.vgu.se.ocl.exp.EIfExp#getCondition <em>Condition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Condition</em>'.
     * @see org.vgu.se.ocl.exp.EIfExp#getCondition()
     * @see #getEIfExp()
     * @generated
     */
    EReference getEIfExp_Condition();

    /**
     * Returns the meta object for the containment reference '{@link org.vgu.se.ocl.exp.EIfExp#getElseExpression <em>Else Expression</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Else Expression</em>'.
     * @see org.vgu.se.ocl.exp.EIfExp#getElseExpression()
     * @see #getEIfExp()
     * @generated
     */
    EReference getEIfExp_ElseExpression();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.exp.EBooleanLiteralExp <em>EBoolean Literal Exp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EBoolean Literal Exp</em>'.
     * @see org.vgu.se.ocl.exp.EBooleanLiteralExp
     * @generated
     */
    EClass getEBooleanLiteralExp();

    /**
     * Returns the meta object for the attribute '{@link org.vgu.se.ocl.exp.EBooleanLiteralExp#getBooleanValue <em>Boolean Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Boolean Value</em>'.
     * @see org.vgu.se.ocl.exp.EBooleanLiteralExp#getBooleanValue()
     * @see #getEBooleanLiteralExp()
     * @generated
     */
    EAttribute getEBooleanLiteralExp_BooleanValue();

    /**
     * Returns the meta object for enum '{@link org.vgu.se.ocl.exp.EIteratorKind <em>EIterator Kind</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>EIterator Kind</em>'.
     * @see org.vgu.se.ocl.exp.EIteratorKind
     * @generated
     */
    EEnum getEIteratorKind();

    /**
     * Returns the meta object for enum '{@link org.vgu.se.ocl.exp.EOperator <em>EOperator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>EOperator</em>'.
     * @see org.vgu.se.ocl.exp.EOperator
     * @generated
     */
    EEnum getEOperator();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    expFactory getexpFactory();

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
         * The meta object literal for the '{@link org.vgu.se.ocl.exp.impl.EVariableExpImpl <em>EVariable Exp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.exp.impl.EVariableExpImpl
         * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEVariableExp()
         * @generated
         */
        EClass EVARIABLE_EXP = eINSTANCE.getEVariableExp();

        /**
         * The meta object literal for the '<em><b>Referred Variable</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EVARIABLE_EXP__REFERRED_VARIABLE = eINSTANCE
            .getEVariableExp_ReferredVariable();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.exp.impl.ETypeExpImpl <em>EType Exp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.exp.impl.ETypeExpImpl
         * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getETypeExp()
         * @generated
         */
        EClass ETYPE_EXP = eINSTANCE.getETypeExp();

        /**
         * The meta object literal for the '<em><b>Referred Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ETYPE_EXP__REFERRED_TYPE = eINSTANCE
            .getETypeExp_ReferredType();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.exp.impl.ELoopExpImpl <em>ELoop Exp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.exp.impl.ELoopExpImpl
         * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getELoopExp()
         * @generated
         */
        EClass ELOOP_EXP = eINSTANCE.getELoopExp();

        /**
         * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELOOP_EXP__BODY = eINSTANCE.getELoopExp_Body();

        /**
         * The meta object literal for the '<em><b>Iterator</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ELOOP_EXP__ITERATOR = eINSTANCE.getELoopExp_Iterator();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.exp.impl.EStateExpImpl <em>EState Exp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.exp.impl.EStateExpImpl
         * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEStateExp()
         * @generated
         */
        EClass ESTATE_EXP = eINSTANCE.getEStateExp();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.exp.impl.EFeatureCallExpImpl <em>EFeature Call Exp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.exp.impl.EFeatureCallExpImpl
         * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEFeatureCallExp()
         * @generated
         */
        EClass EFEATURE_CALL_EXP = eINSTANCE.getEFeatureCallExp();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.exp.impl.EAssociationClassCallExpImpl <em>EAssociation Class Call Exp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.exp.impl.EAssociationClassCallExpImpl
         * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEAssociationClassCallExp()
         * @generated
         */
        EClass EASSOCIATION_CLASS_CALL_EXP = eINSTANCE
            .getEAssociationClassCallExp();

        /**
         * The meta object literal for the '<em><b>Referred Association Ends</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_ENDS = eINSTANCE
            .getEAssociationClassCallExp_ReferredAssociationEnds();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.exp.impl.ENumericLiteralExpImpl <em>ENumeric Literal Exp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.exp.impl.ENumericLiteralExpImpl
         * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getENumericLiteralExp()
         * @generated
         */
        EClass ENUMERIC_LITERAL_EXP = eINSTANCE.getENumericLiteralExp();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.exp.impl.ELiteralExpImpl <em>ELiteral Exp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.exp.impl.ELiteralExpImpl
         * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getELiteralExp()
         * @generated
         */
        EClass ELITERAL_EXP = eINSTANCE.getELiteralExp();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.exp.impl.EMessageExpImpl <em>EMessage Exp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.exp.impl.EMessageExpImpl
         * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEMessageExp()
         * @generated
         */
        EClass EMESSAGE_EXP = eINSTANCE.getEMessageExp();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.exp.impl.EVariableImpl <em>EVariable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.exp.impl.EVariableImpl
         * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEVariable()
         * @generated
         */
        EClass EVARIABLE = eINSTANCE.getEVariable();

        /**
         * The meta object literal for the '<em><b>Loop Exp</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EVARIABLE__LOOP_EXP = eINSTANCE.getEVariable_LoopExp();

        /**
         * The meta object literal for the '<em><b>Base Exp</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EVARIABLE__BASE_EXP = eINSTANCE.getEVariable_BaseExp();

        /**
         * The meta object literal for the '<em><b>Init Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EVARIABLE__INIT_EXPRESSION = eINSTANCE
            .getEVariable_InitExpression();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EVARIABLE__NAME = eINSTANCE.getEVariable_Name();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.exp.impl.EPropertyCallExpImpl <em>EProperty Call Exp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.exp.impl.EPropertyCallExpImpl
         * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEPropertyCallExp()
         * @generated
         */
        EClass EPROPERTY_CALL_EXP = eINSTANCE.getEPropertyCallExp();

        /**
         * The meta object literal for the '<em><b>Referred Property</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EPROPERTY_CALL_EXP__REFERRED_PROPERTY = eINSTANCE
            .getEPropertyCallExp_ReferredProperty();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.exp.impl.EIteratorExpImpl <em>EIterator Exp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.exp.impl.EIteratorExpImpl
         * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEIteratorExp()
         * @generated
         */
        EClass EITERATOR_EXP = eINSTANCE.getEIteratorExp();

        /**
         * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EITERATOR_EXP__KIND = eINSTANCE.getEIteratorExp_Kind();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.exp.impl.EOclExpressionImpl <em>EOcl Expression</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.exp.impl.EOclExpressionImpl
         * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEOclExpression()
         * @generated
         */
        EClass EOCL_EXPRESSION = eINSTANCE.getEOclExpression();

        /**
         * The meta object literal for the '<em><b>Loop Body Owner</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EOCL_EXPRESSION__LOOP_BODY_OWNER = eINSTANCE
            .getEOclExpression_LoopBodyOwner();

        /**
         * The meta object literal for the '<em><b>Applied Element</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EOCL_EXPRESSION__APPLIED_ELEMENT = eINSTANCE
            .getEOclExpression_AppliedElement();

        /**
         * The meta object literal for the '<em><b>Initialized Element</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EOCL_EXPRESSION__INITIALIZED_ELEMENT = eINSTANCE
            .getEOclExpression_InitializedElement();

        /**
         * The meta object literal for the '<em><b>Then Owner</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EOCL_EXPRESSION__THEN_OWNER = eINSTANCE
            .getEOclExpression_ThenOwner();

        /**
         * The meta object literal for the '<em><b>If Owner</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EOCL_EXPRESSION__IF_OWNER = eINSTANCE
            .getEOclExpression_IfOwner();

        /**
         * The meta object literal for the '<em><b>Else Owner</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EOCL_EXPRESSION__ELSE_OWNER = eINSTANCE
            .getEOclExpression_ElseOwner();

        /**
         * The meta object literal for the '<em><b>Parent Call</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EOCL_EXPRESSION__PARENT_CALL = eINSTANCE
            .getEOclExpression_ParentCall();

        /**
         * The meta object literal for the '<em><b>Parent Nav</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EOCL_EXPRESSION__PARENT_NAV = eINSTANCE
            .getEOclExpression_ParentNav();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.exp.impl.EIterateExpImpl <em>EIterate Exp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.exp.impl.EIterateExpImpl
         * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEIterateExp()
         * @generated
         */
        EClass EITERATE_EXP = eINSTANCE.getEIterateExp();

        /**
         * The meta object literal for the '<em><b>Result</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EITERATE_EXP__RESULT = eINSTANCE.getEIterateExp_Result();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.exp.impl.ECallExpImpl <em>ECall Exp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.exp.impl.ECallExpImpl
         * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getECallExp()
         * @generated
         */
        EClass ECALL_EXP = eINSTANCE.getECallExp();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ECALL_EXP__SOURCE = eINSTANCE.getECallExp_Source();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.exp.impl.EIntegerLiteralExpImpl <em>EInteger Literal Exp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.exp.impl.EIntegerLiteralExpImpl
         * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEIntegerLiteralExp()
         * @generated
         */
        EClass EINTEGER_LITERAL_EXP = eINSTANCE.getEIntegerLiteralExp();

        /**
         * The meta object literal for the '<em><b>Integer Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EINTEGER_LITERAL_EXP__INTEGER_VALUE = eINSTANCE
            .getEIntegerLiteralExp_IntegerValue();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.exp.impl.EPrimitiveTypeImpl <em>EPrimitive Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.exp.impl.EPrimitiveTypeImpl
         * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEPrimitiveType()
         * @generated
         */
        EClass EPRIMITIVE_TYPE = eINSTANCE.getEPrimitiveType();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.exp.impl.ENavigationCallExpImpl <em>ENavigation Call Exp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.exp.impl.ENavigationCallExpImpl
         * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getENavigationCallExp()
         * @generated
         */
        EClass ENAVIGATION_CALL_EXP = eINSTANCE.getENavigationCallExp();

        /**
         * The meta object literal for the '<em><b>Qualifier</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ENAVIGATION_CALL_EXP__QUALIFIER = eINSTANCE
            .getENavigationCallExp_Qualifier();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.exp.impl.EOperationCallExpImpl <em>EOperation Call Exp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.exp.impl.EOperationCallExpImpl
         * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEOperationCallExp()
         * @generated
         */
        EClass EOPERATION_CALL_EXP = eINSTANCE.getEOperationCallExp();

        /**
         * The meta object literal for the '<em><b>Argument</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EOPERATION_CALL_EXP__ARGUMENT = eINSTANCE
            .getEOperationCallExp_Argument();

        /**
         * The meta object literal for the '<em><b>Referred Operation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EOPERATION_CALL_EXP__REFERRED_OPERATION = eINSTANCE
            .getEOperationCallExp_ReferredOperation();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.exp.impl.EStringLiteralExpImpl <em>EString Literal Exp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.exp.impl.EStringLiteralExpImpl
         * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEStringLiteralExp()
         * @generated
         */
        EClass ESTRING_LITERAL_EXP = eINSTANCE.getEStringLiteralExp();

        /**
         * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ESTRING_LITERAL_EXP__STRING_VALUE = eINSTANCE
            .getEStringLiteralExp_StringValue();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.exp.impl.EIfExpImpl <em>EIf Exp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.exp.impl.EIfExpImpl
         * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEIfExp()
         * @generated
         */
        EClass EIF_EXP = eINSTANCE.getEIfExp();

        /**
         * The meta object literal for the '<em><b>Then Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EIF_EXP__THEN_EXPRESSION = eINSTANCE
            .getEIfExp_ThenExpression();

        /**
         * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EIF_EXP__CONDITION = eINSTANCE.getEIfExp_Condition();

        /**
         * The meta object literal for the '<em><b>Else Expression</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EIF_EXP__ELSE_EXPRESSION = eINSTANCE
            .getEIfExp_ElseExpression();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.exp.impl.EBooleanLiteralExpImpl <em>EBoolean Literal Exp</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.exp.impl.EBooleanLiteralExpImpl
         * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEBooleanLiteralExp()
         * @generated
         */
        EClass EBOOLEAN_LITERAL_EXP = eINSTANCE.getEBooleanLiteralExp();

        /**
         * The meta object literal for the '<em><b>Boolean Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EBOOLEAN_LITERAL_EXP__BOOLEAN_VALUE = eINSTANCE
            .getEBooleanLiteralExp_BooleanValue();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.exp.EIteratorKind <em>EIterator Kind</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.exp.EIteratorKind
         * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEIteratorKind()
         * @generated
         */
        EEnum EITERATOR_KIND = eINSTANCE.getEIteratorKind();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.exp.EOperator <em>EOperator</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.exp.EOperator
         * @see org.vgu.se.ocl.exp.impl.expPackageImpl#getEOperator()
         * @generated
         */
        EEnum EOPERATOR = eINSTANCE.getEOperator();

    }

} //expPackage
