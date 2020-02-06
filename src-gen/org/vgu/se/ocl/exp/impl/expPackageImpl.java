/**
 */
package org.vgu.se.ocl.exp.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.vgu.se.ocl.dm.dmPackage;

import org.vgu.se.ocl.dm.impl.dmPackageImpl;

import org.vgu.se.ocl.exp.EAssociationClassCallExp;
import org.vgu.se.ocl.exp.EBooleanLiteralExp;
import org.vgu.se.ocl.exp.ECallExp;
import org.vgu.se.ocl.exp.EFeatureCallExp;
import org.vgu.se.ocl.exp.EIfExp;
import org.vgu.se.ocl.exp.EIntegerLiteralExp;
import org.vgu.se.ocl.exp.EIterateExp;
import org.vgu.se.ocl.exp.EIteratorExp;
import org.vgu.se.ocl.exp.EIteratorKind;
import org.vgu.se.ocl.exp.ELiteralExp;
import org.vgu.se.ocl.exp.ELoopExp;
import org.vgu.se.ocl.exp.EMessageExp;
import org.vgu.se.ocl.exp.ENavigationCallExp;
import org.vgu.se.ocl.exp.ENumericLiteralExp;
import org.vgu.se.ocl.exp.EOclExpression;
import org.vgu.se.ocl.exp.EOperationCallExp;
import org.vgu.se.ocl.exp.EOperator;
import org.vgu.se.ocl.exp.EPrimitiveType;
import org.vgu.se.ocl.exp.EPropertyCallExp;
import org.vgu.se.ocl.exp.EStateExp;
import org.vgu.se.ocl.exp.EStringLiteralExp;
import org.vgu.se.ocl.exp.ETypeExp;
import org.vgu.se.ocl.exp.EVariable;
import org.vgu.se.ocl.exp.EVariableExp;
import org.vgu.se.ocl.exp.expFactory;
import org.vgu.se.ocl.exp.expPackage;

import org.vgu.se.ocl.type.impl.typePackageImpl;

import org.vgu.se.ocl.type.typePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class expPackageImpl extends EPackageImpl implements expPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eVariableExpEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eTypeExpEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eLoopExpEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eStateExpEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eFeatureCallExpEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eAssociationClassCallExpEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eNumericLiteralExpEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eLiteralExpEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eMessageExpEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eVariableEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass ePropertyCallExpEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eIteratorExpEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eOclExpressionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eIterateExpEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eCallExpEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eIntegerLiteralExpEClass = null;

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
    private EClass eNavigationCallExpEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eOperationCallExpEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eStringLiteralExpEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eIfExpEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass eBooleanLiteralExpEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum eIteratorKindEEnum = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EEnum eOperatorEEnum = null;

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
     * @see org.vgu.se.ocl.exp.expPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private expPackageImpl() {
        super(eNS_URI, expFactory.eINSTANCE);
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
     * <p>This method is used to initialize {@link expPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static expPackage init() {
        if (isInited)
            return (expPackage) EPackage.Registry.INSTANCE
                .getEPackage(expPackage.eNS_URI);

        // Obtain or create and register package
        Object registeredexpPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
        expPackageImpl theexpPackage = registeredexpPackage instanceof expPackageImpl
            ? (expPackageImpl) registeredexpPackage
            : new expPackageImpl();

        isInited = true;

        // Obtain or create and register interdependencies
        Object registeredPackage = EPackage.Registry.INSTANCE
            .getEPackage(dmPackage.eNS_URI);
        dmPackageImpl thedmPackage = (dmPackageImpl) (registeredPackage instanceof dmPackageImpl
            ? registeredPackage
            : dmPackage.eINSTANCE);
        registeredPackage = EPackage.Registry.INSTANCE
            .getEPackage(typePackage.eNS_URI);
        typePackageImpl thetypePackage = (typePackageImpl) (registeredPackage instanceof typePackageImpl
            ? registeredPackage
            : typePackage.eINSTANCE);

        // Create package meta-data objects
        theexpPackage.createPackageContents();
        thedmPackage.createPackageContents();
        thetypePackage.createPackageContents();

        // Initialize created meta-data
        theexpPackage.initializePackageContents();
        thedmPackage.initializePackageContents();
        thetypePackage.initializePackageContents();

        // Mark meta-data to indicate it can't be changed
        theexpPackage.freeze();

        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(expPackage.eNS_URI, theexpPackage);
        return theexpPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEVariableExp() {
        return eVariableExpEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEVariableExp_ReferredVariable() {
        return (EReference) eVariableExpEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getETypeExp() {
        return eTypeExpEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getETypeExp_ReferredType() {
        return (EReference) eTypeExpEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getELoopExp() {
        return eLoopExpEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getELoopExp_Body() {
        return (EReference) eLoopExpEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getELoopExp_Iterator() {
        return (EReference) eLoopExpEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEStateExp() {
        return eStateExpEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEFeatureCallExp() {
        return eFeatureCallExpEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEAssociationClassCallExp() {
        return eAssociationClassCallExpEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEAssociationClassCallExp_ReferredAssociationEnds() {
        return (EReference) eAssociationClassCallExpEClass
            .getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getENumericLiteralExp() {
        return eNumericLiteralExpEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getELiteralExp() {
        return eLiteralExpEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEMessageExp() {
        return eMessageExpEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEVariable() {
        return eVariableEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEVariable_LoopExp() {
        return (EReference) eVariableEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEVariable_BaseExp() {
        return (EReference) eVariableEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEVariable_InitExpression() {
        return (EReference) eVariableEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEVariable_Name() {
        return (EAttribute) eVariableEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEPropertyCallExp() {
        return ePropertyCallExpEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEPropertyCallExp_ReferredProperty() {
        return (EReference) ePropertyCallExpEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEIteratorExp() {
        return eIteratorExpEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEIteratorExp_Kind() {
        return (EAttribute) eIteratorExpEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEOclExpression() {
        return eOclExpressionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEOclExpression_LoopBodyOwner() {
        return (EReference) eOclExpressionEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEOclExpression_AppliedElement() {
        return (EReference) eOclExpressionEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEOclExpression_InitializedElement() {
        return (EReference) eOclExpressionEClass.getEStructuralFeatures()
            .get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEOclExpression_ThenOwner() {
        return (EReference) eOclExpressionEClass.getEStructuralFeatures()
            .get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEOclExpression_IfOwner() {
        return (EReference) eOclExpressionEClass.getEStructuralFeatures()
            .get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEOclExpression_ElseOwner() {
        return (EReference) eOclExpressionEClass.getEStructuralFeatures()
            .get(5);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEOclExpression_ParentCall() {
        return (EReference) eOclExpressionEClass.getEStructuralFeatures()
            .get(6);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEOclExpression_ParentNav() {
        return (EReference) eOclExpressionEClass.getEStructuralFeatures()
            .get(7);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEIterateExp() {
        return eIterateExpEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEIterateExp_Result() {
        return (EReference) eIterateExpEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getECallExp() {
        return eCallExpEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getECallExp_Source() {
        return (EReference) eCallExpEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEIntegerLiteralExp() {
        return eIntegerLiteralExpEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEIntegerLiteralExp_IntegerValue() {
        return (EAttribute) eIntegerLiteralExpEClass.getEStructuralFeatures()
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
    public EClass getENavigationCallExp() {
        return eNavigationCallExpEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getENavigationCallExp_Qualifier() {
        return (EReference) eNavigationCallExpEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEOperationCallExp() {
        return eOperationCallExpEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEOperationCallExp_Argument() {
        return (EReference) eOperationCallExpEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEOperationCallExp_ReferredOperation() {
        return (EAttribute) eOperationCallExpEClass.getEStructuralFeatures()
            .get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEStringLiteralExp() {
        return eStringLiteralExpEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEStringLiteralExp_StringValue() {
        return (EAttribute) eStringLiteralExpEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEIfExp() {
        return eIfExpEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEIfExp_ThenExpression() {
        return (EReference) eIfExpEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEIfExp_Condition() {
        return (EReference) eIfExpEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getEIfExp_ElseExpression() {
        return (EReference) eIfExpEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getEBooleanLiteralExp() {
        return eBooleanLiteralExpEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getEBooleanLiteralExp_BooleanValue() {
        return (EAttribute) eBooleanLiteralExpEClass.getEStructuralFeatures()
            .get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getEIteratorKind() {
        return eIteratorKindEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EEnum getEOperator() {
        return eOperatorEEnum;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public expFactory getexpFactory() {
        return (expFactory) getEFactoryInstance();
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
        eVariableExpEClass = createEClass(EVARIABLE_EXP);
        createEReference(eVariableExpEClass, EVARIABLE_EXP__REFERRED_VARIABLE);

        eTypeExpEClass = createEClass(ETYPE_EXP);
        createEReference(eTypeExpEClass, ETYPE_EXP__REFERRED_TYPE);

        eLoopExpEClass = createEClass(ELOOP_EXP);
        createEReference(eLoopExpEClass, ELOOP_EXP__BODY);
        createEReference(eLoopExpEClass, ELOOP_EXP__ITERATOR);

        eStateExpEClass = createEClass(ESTATE_EXP);

        eFeatureCallExpEClass = createEClass(EFEATURE_CALL_EXP);

        eAssociationClassCallExpEClass = createEClass(
            EASSOCIATION_CLASS_CALL_EXP);
        createEReference(eAssociationClassCallExpEClass,
            EASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_ENDS);

        eNumericLiteralExpEClass = createEClass(ENUMERIC_LITERAL_EXP);

        eLiteralExpEClass = createEClass(ELITERAL_EXP);

        eMessageExpEClass = createEClass(EMESSAGE_EXP);

        eVariableEClass = createEClass(EVARIABLE);
        createEReference(eVariableEClass, EVARIABLE__LOOP_EXP);
        createEReference(eVariableEClass, EVARIABLE__BASE_EXP);
        createEReference(eVariableEClass, EVARIABLE__INIT_EXPRESSION);
        createEAttribute(eVariableEClass, EVARIABLE__NAME);

        ePropertyCallExpEClass = createEClass(EPROPERTY_CALL_EXP);
        createEReference(ePropertyCallExpEClass,
            EPROPERTY_CALL_EXP__REFERRED_PROPERTY);

        eIteratorExpEClass = createEClass(EITERATOR_EXP);
        createEAttribute(eIteratorExpEClass, EITERATOR_EXP__KIND);

        eOclExpressionEClass = createEClass(EOCL_EXPRESSION);
        createEReference(eOclExpressionEClass,
            EOCL_EXPRESSION__LOOP_BODY_OWNER);
        createEReference(eOclExpressionEClass,
            EOCL_EXPRESSION__APPLIED_ELEMENT);
        createEReference(eOclExpressionEClass,
            EOCL_EXPRESSION__INITIALIZED_ELEMENT);
        createEReference(eOclExpressionEClass, EOCL_EXPRESSION__THEN_OWNER);
        createEReference(eOclExpressionEClass, EOCL_EXPRESSION__IF_OWNER);
        createEReference(eOclExpressionEClass, EOCL_EXPRESSION__ELSE_OWNER);
        createEReference(eOclExpressionEClass, EOCL_EXPRESSION__PARENT_CALL);
        createEReference(eOclExpressionEClass, EOCL_EXPRESSION__PARENT_NAV);

        eIterateExpEClass = createEClass(EITERATE_EXP);
        createEReference(eIterateExpEClass, EITERATE_EXP__RESULT);

        eCallExpEClass = createEClass(ECALL_EXP);
        createEReference(eCallExpEClass, ECALL_EXP__SOURCE);

        eIntegerLiteralExpEClass = createEClass(EINTEGER_LITERAL_EXP);
        createEAttribute(eIntegerLiteralExpEClass,
            EINTEGER_LITERAL_EXP__INTEGER_VALUE);

        ePrimitiveTypeEClass = createEClass(EPRIMITIVE_TYPE);

        eNavigationCallExpEClass = createEClass(ENAVIGATION_CALL_EXP);
        createEReference(eNavigationCallExpEClass,
            ENAVIGATION_CALL_EXP__QUALIFIER);

        eOperationCallExpEClass = createEClass(EOPERATION_CALL_EXP);
        createEReference(eOperationCallExpEClass,
            EOPERATION_CALL_EXP__ARGUMENT);
        createEAttribute(eOperationCallExpEClass,
            EOPERATION_CALL_EXP__REFERRED_OPERATION);

        eStringLiteralExpEClass = createEClass(ESTRING_LITERAL_EXP);
        createEAttribute(eStringLiteralExpEClass,
            ESTRING_LITERAL_EXP__STRING_VALUE);

        eIfExpEClass = createEClass(EIF_EXP);
        createEReference(eIfExpEClass, EIF_EXP__THEN_EXPRESSION);
        createEReference(eIfExpEClass, EIF_EXP__CONDITION);
        createEReference(eIfExpEClass, EIF_EXP__ELSE_EXPRESSION);

        eBooleanLiteralExpEClass = createEClass(EBOOLEAN_LITERAL_EXP);
        createEAttribute(eBooleanLiteralExpEClass,
            EBOOLEAN_LITERAL_EXP__BOOLEAN_VALUE);

        // Create enums
        eIteratorKindEEnum = createEEnum(EITERATOR_KIND);
        eOperatorEEnum = createEEnum(EOPERATOR);
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
        dmPackage thedmPackage = (dmPackage) EPackage.Registry.INSTANCE
            .getEPackage(dmPackage.eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        eVariableExpEClass.getESuperTypes().add(this.getEOclExpression());
        eTypeExpEClass.getESuperTypes().add(this.getEOclExpression());
        eLoopExpEClass.getESuperTypes().add(this.getECallExp());
        eStateExpEClass.getESuperTypes().add(this.getEOclExpression());
        eFeatureCallExpEClass.getESuperTypes().add(this.getECallExp());
        eAssociationClassCallExpEClass.getESuperTypes()
            .add(this.getENavigationCallExp());
        eNumericLiteralExpEClass.getESuperTypes().add(this.getEPrimitiveType());
        eLiteralExpEClass.getESuperTypes().add(this.getEOclExpression());
        eMessageExpEClass.getESuperTypes().add(this.getEOclExpression());
        ePropertyCallExpEClass.getESuperTypes()
            .add(this.getENavigationCallExp());
        eIteratorExpEClass.getESuperTypes().add(this.getELoopExp());
        eIterateExpEClass.getESuperTypes().add(this.getELoopExp());
        eCallExpEClass.getESuperTypes().add(this.getEOclExpression());
        eIntegerLiteralExpEClass.getESuperTypes()
            .add(this.getENumericLiteralExp());
        ePrimitiveTypeEClass.getESuperTypes().add(this.getELiteralExp());
        eNavigationCallExpEClass.getESuperTypes()
            .add(this.getEFeatureCallExp());
        eOperationCallExpEClass.getESuperTypes().add(this.getEFeatureCallExp());
        eStringLiteralExpEClass.getESuperTypes().add(this.getEPrimitiveType());
        eIfExpEClass.getESuperTypes().add(this.getEOclExpression());
        eBooleanLiteralExpEClass.getESuperTypes().add(this.getEPrimitiveType());

        // Initialize classes, features, and operations; add parameters
        initEClass(eVariableExpEClass, EVariableExp.class, "EVariableExp",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEVariableExp_ReferredVariable(), this.getEVariable(),
            null, "referredVariable", null, 0, 1, EVariableExp.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);

        initEClass(eTypeExpEClass, ETypeExp.class, "ETypeExp", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getETypeExp_ReferredType(),
            thetypePackage.getEClassifier(), null, "referredType", null, 1, 1,
            ETypeExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);

        initEClass(eLoopExpEClass, ELoopExp.class, "ELoopExp", IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getELoopExp_Body(), this.getEOclExpression(),
            this.getEOclExpression_LoopBodyOwner(), "body", null, 1, 1,
            ELoopExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
        initEReference(getELoopExp_Iterator(), this.getEVariable(),
            this.getEVariable_LoopExp(), "iterator", null, 0, -1,
            ELoopExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);

        initEClass(eStateExpEClass, EStateExp.class, "EStateExp", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eFeatureCallExpEClass, EFeatureCallExp.class,
            "EFeatureCallExp", IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);

        initEClass(eAssociationClassCallExpEClass,
            EAssociationClassCallExp.class, "EAssociationClassCallExp",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEAssociationClassCallExp_ReferredAssociationEnds(),
            thedmPackage.getEAssociation(), null, "referredAssociationEnds",
            null, 1, 1, EAssociationClassCallExp.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eNumericLiteralExpEClass, ENumericLiteralExp.class,
            "ENumericLiteralExp", IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);

        initEClass(eLiteralExpEClass, ELiteralExp.class, "ELiteralExp",
            IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eMessageExpEClass, EMessageExp.class, "EMessageExp",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eVariableEClass, EVariable.class, "EVariable", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEVariable_LoopExp(), this.getELoopExp(),
            this.getELoopExp_Iterator(), "loopExp", null, 0, 1, EVariable.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);
        initEReference(getEVariable_BaseExp(), this.getEIterateExp(),
            this.getEIterateExp_Result(), "baseExp", null, 0, 1,
            EVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
        initEReference(getEVariable_InitExpression(), this.getEOclExpression(),
            this.getEOclExpression_InitializedElement(), "initExpression", null,
            0, 1, EVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEVariable_Name(), ecorePackage.getEString(), "name",
            null, 0, 1, EVariable.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);

        initEClass(ePropertyCallExpEClass, EPropertyCallExp.class,
            "EPropertyCallExp", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEPropertyCallExp_ReferredProperty(),
            thedmPackage.getEAttribute(), null, "referredProperty", null, 1, 1,
            EPropertyCallExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);

        initEClass(eIteratorExpEClass, EIteratorExp.class, "EIteratorExp",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEIteratorExp_Kind(), this.getEIteratorKind(), "kind",
            null, 0, 1, EIteratorExp.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);

        initEClass(eOclExpressionEClass, EOclExpression.class, "EOclExpression",
            IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEOclExpression_LoopBodyOwner(), this.getELoopExp(),
            this.getELoopExp_Body(), "loopBodyOwner", null, 0, 1,
            EOclExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
        initEReference(getEOclExpression_AppliedElement(), this.getECallExp(),
            this.getECallExp_Source(), "appliedElement", null, 0, 1,
            EOclExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
        initEReference(getEOclExpression_InitializedElement(),
            this.getEVariable(), this.getEVariable_InitExpression(),
            "initializedElement", null, 0, 1, EOclExpression.class,
            !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
            !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);
        initEReference(getEOclExpression_ThenOwner(), this.getEIfExp(),
            this.getEIfExp_ThenExpression(), "thenOwner", null, 0, 1,
            EOclExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
        initEReference(getEOclExpression_IfOwner(), this.getEIfExp(),
            this.getEIfExp_Condition(), "ifOwner", null, 0, 1,
            EOclExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
        initEReference(getEOclExpression_ElseOwner(), this.getEIfExp(),
            this.getEIfExp_ElseExpression(), "elseOwner", null, 0, 1,
            EOclExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
        initEReference(getEOclExpression_ParentCall(),
            this.getEOperationCallExp(), this.getEOperationCallExp_Argument(),
            "parentCall", null, 0, 1, EOclExpression.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getEOclExpression_ParentNav(),
            this.getENavigationCallExp(),
            this.getENavigationCallExp_Qualifier(), "parentNav", null, 0, 1,
            EOclExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);

        initEClass(eIterateExpEClass, EIterateExp.class, "EIterateExp",
            !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEIterateExp_Result(), this.getEVariable(),
            this.getEVariable_BaseExp(), "result", null, 0, 1,
            EIterateExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);

        initEClass(eCallExpEClass, ECallExp.class, "ECallExp", IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getECallExp_Source(), this.getEOclExpression(),
            this.getEOclExpression_AppliedElement(), "source", null, 0, 1,
            ECallExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);

        initEClass(eIntegerLiteralExpEClass, EIntegerLiteralExp.class,
            "EIntegerLiteralExp", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEIntegerLiteralExp_IntegerValue(),
            ecorePackage.getEIntegerObject(), "integerValue", null, 0, 1,
            EIntegerLiteralExp.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);

        initEClass(ePrimitiveTypeEClass, EPrimitiveType.class, "EPrimitiveType",
            IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(eNavigationCallExpEClass, ENavigationCallExp.class,
            "ENavigationCallExp", IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
        initEReference(getENavigationCallExp_Qualifier(),
            this.getEOclExpression(), this.getEOclExpression_ParentNav(),
            "qualifier", null, 0, -1, ENavigationCallExp.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eOperationCallExpEClass, EOperationCallExp.class,
            "EOperationCallExp", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEOperationCallExp_Argument(),
            this.getEOclExpression(), this.getEOclExpression_ParentCall(),
            "argument", null, 0, -1, EOperationCallExp.class, !IS_TRANSIENT,
            !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
            !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getEOperationCallExp_ReferredOperation(),
            this.getEOperator(), "referredOperation", null, 0, 1,
            EOperationCallExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eStringLiteralExpEClass, EStringLiteralExp.class,
            "EStringLiteralExp", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEStringLiteralExp_StringValue(),
            ecorePackage.getEString(), "stringValue", null, 0, 1,
            EStringLiteralExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(eIfExpEClass, EIfExp.class, "EIfExp", !IS_ABSTRACT,
            !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getEIfExp_ThenExpression(), this.getEOclExpression(),
            this.getEOclExpression_ThenOwner(), "thenExpression", null, 1, 1,
            EIfExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
        initEReference(getEIfExp_Condition(), this.getEOclExpression(),
            this.getEOclExpression_IfOwner(), "condition", null, 1, 1,
            EIfExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);
        initEReference(getEIfExp_ElseExpression(), this.getEOclExpression(),
            this.getEOclExpression_ElseOwner(), "elseExpression", null, 1, 1,
            EIfExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
            IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
            !IS_DERIVED, IS_ORDERED);

        initEClass(eBooleanLiteralExpEClass, EBooleanLiteralExp.class,
            "EBooleanLiteralExp", !IS_ABSTRACT, !IS_INTERFACE,
            IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getEBooleanLiteralExp_BooleanValue(),
            ecorePackage.getEBooleanObject(), "booleanValue", null, 0, 1,
            EBooleanLiteralExp.class, !IS_TRANSIENT, !IS_VOLATILE,
            IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
            IS_ORDERED);

        // Initialize enums and add enum literals
        initEEnum(eIteratorKindEEnum, EIteratorKind.class, "EIteratorKind");
        addEEnumLiteral(eIteratorKindEEnum, EIteratorKind.FOR_ALL_LITERAL);
        addEEnumLiteral(eIteratorKindEEnum, EIteratorKind.EXISTS_LITERAL);
        addEEnumLiteral(eIteratorKindEEnum, EIteratorKind.COLLECT_LITERAL);
        addEEnumLiteral(eIteratorKindEEnum, EIteratorKind.SELECT_LITERAL);

        initEEnum(eOperatorEEnum, EOperator.class, "EOperator");
        addEEnumLiteral(eOperatorEEnum, EOperator.EQUAL_LITERAL);
        addEEnumLiteral(eOperatorEEnum, EOperator.ALL_INSTANCES_LITERAL);
        addEEnumLiteral(eOperatorEEnum, EOperator.GREATER_LITERAL);
        addEEnumLiteral(eOperatorEEnum, EOperator.LESS_LITERAL);
        addEEnumLiteral(eOperatorEEnum, EOperator.NOT_EQUAL_LITERAL);
        addEEnumLiteral(eOperatorEEnum, EOperator.GREATER_OR_EQUAL_LITERAL);
        addEEnumLiteral(eOperatorEEnum, EOperator.LESS_OR_EQUAL_LITERAL);
        addEEnumLiteral(eOperatorEEnum, EOperator.AND_LITERAL);
        addEEnumLiteral(eOperatorEEnum, EOperator.OR_LITERAL);
        addEEnumLiteral(eOperatorEEnum, EOperator.XOR_LITERAL);
        addEEnumLiteral(eOperatorEEnum, EOperator.IMPLIES_LITERAL);
        addEEnumLiteral(eOperatorEEnum, EOperator.SIZE_LITERAL);
        addEEnumLiteral(eOperatorEEnum, EOperator.IS_EMPTY_LITERAL);
        addEEnumLiteral(eOperatorEEnum, EOperator.OCL_IS_UNDEFINED_LITERAL);
        addEEnumLiteral(eOperatorEEnum, EOperator.FLATTEN_LITERAL);
        addEEnumLiteral(eOperatorEEnum, EOperator.NOT_EMPTY_LITERAL);
        addEEnumLiteral(eOperatorEEnum, EOperator.IS_UNIQUE_LITERAL);

        // Create resource
        createResource(eNS_URI);
    }

} //expPackageImpl
