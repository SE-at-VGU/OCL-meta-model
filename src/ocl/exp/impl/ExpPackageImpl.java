/**
 */
package ocl.exp.impl;

import ocl.dm.DmPackage;

import ocl.dm.impl.DmPackageImpl;

import ocl.exp.AssociationClassCallExp;
import ocl.exp.BooleanLiteralExp;
import ocl.exp.CallExp;
import ocl.exp.ExpFactory;
import ocl.exp.ExpPackage;
import ocl.exp.IntegerLiteralExp;
import ocl.exp.IteratorExp;
import ocl.exp.IteratorKind;
import ocl.exp.OclExpression;
import ocl.exp.OperationCallExp;
import ocl.exp.Operator;
import ocl.exp.PropertyCallExp;
import ocl.exp.StringLiteralExp;
import ocl.exp.TypeExp;
import ocl.exp.Variable;
import ocl.exp.VariableExp;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExpPackageImpl extends EPackageImpl implements ExpPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associationClassCallExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyCallExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iteratorExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oclExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerLiteralExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass operationCallExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringLiteralExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanLiteralExpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum iteratorKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum operatorEEnum = null;

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
	 * @see ocl.exp.ExpPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExpPackageImpl() {
		super(eNS_URI, ExpFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ExpPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ExpPackage init() {
		if (isInited) return (ExpPackage)EPackage.Registry.INSTANCE.getEPackage(ExpPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredExpPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ExpPackageImpl theExpPackage = registeredExpPackage instanceof ExpPackageImpl ? (ExpPackageImpl)registeredExpPackage : new ExpPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI);
		DmPackageImpl theDmPackage = (DmPackageImpl)(registeredPackage instanceof DmPackageImpl ? registeredPackage : DmPackage.eINSTANCE);

		// Create package meta-data objects
		theExpPackage.createPackageContents();
		theDmPackage.createPackageContents();

		// Initialize created meta-data
		theExpPackage.initializePackageContents();
		theDmPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theExpPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ExpPackage.eNS_URI, theExpPackage);
		return theExpPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariableExp() {
		return variableExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariableExp_ReferredVariable() {
		return (EReference)variableExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeExp() {
		return typeExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypeExp_ReferredType() {
		return (EReference)typeExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAssociationClassCallExp() {
		return associationClassCallExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAssociationClassCallExp_ReferredAssociationEnds() {
		return (EReference)associationClassCallExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVariable_LoopExp() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPropertyCallExp() {
		return propertyCallExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPropertyCallExp_ReferredProperty() {
		return (EReference)propertyCallExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIteratorExp() {
		return iteratorExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIteratorExp_Kind() {
		return (EAttribute)iteratorExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIteratorExp_Body() {
		return (EReference)iteratorExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIteratorExp_Iterator() {
		return (EReference)iteratorExpEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOclExpression() {
		return oclExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOclExpression_LoopBodyOwner() {
		return (EReference)oclExpressionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOclExpression_AppliedElement() {
		return (EReference)oclExpressionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOclExpression_ParentCall() {
		return (EReference)oclExpressionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCallExp() {
		return callExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCallExp_Source() {
		return (EReference)callExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIntegerLiteralExp() {
		return integerLiteralExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIntegerLiteralExp_IntegerValue() {
		return (EAttribute)integerLiteralExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOperationCallExp() {
		return operationCallExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOperationCallExp_Argument() {
		return (EReference)operationCallExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOperationCallExp_ReferredOperation() {
		return (EAttribute)operationCallExpEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringLiteralExp() {
		return stringLiteralExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringLiteralExp_StringValue() {
		return (EAttribute)stringLiteralExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanLiteralExp() {
		return booleanLiteralExpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBooleanLiteralExp_BooleanValue() {
		return (EAttribute)booleanLiteralExpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getIteratorKind() {
		return iteratorKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOperator() {
		return operatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpFactory getExpFactory() {
		return (ExpFactory)getEFactoryInstance();
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
		variableExpEClass = createEClass(VARIABLE_EXP);
		createEReference(variableExpEClass, VARIABLE_EXP__REFERRED_VARIABLE);

		typeExpEClass = createEClass(TYPE_EXP);
		createEReference(typeExpEClass, TYPE_EXP__REFERRED_TYPE);

		associationClassCallExpEClass = createEClass(ASSOCIATION_CLASS_CALL_EXP);
		createEReference(associationClassCallExpEClass, ASSOCIATION_CLASS_CALL_EXP__REFERRED_ASSOCIATION_ENDS);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__LOOP_EXP);
		createEAttribute(variableEClass, VARIABLE__NAME);

		propertyCallExpEClass = createEClass(PROPERTY_CALL_EXP);
		createEReference(propertyCallExpEClass, PROPERTY_CALL_EXP__REFERRED_PROPERTY);

		iteratorExpEClass = createEClass(ITERATOR_EXP);
		createEAttribute(iteratorExpEClass, ITERATOR_EXP__KIND);
		createEReference(iteratorExpEClass, ITERATOR_EXP__BODY);
		createEReference(iteratorExpEClass, ITERATOR_EXP__ITERATOR);

		oclExpressionEClass = createEClass(OCL_EXPRESSION);
		createEReference(oclExpressionEClass, OCL_EXPRESSION__LOOP_BODY_OWNER);
		createEReference(oclExpressionEClass, OCL_EXPRESSION__APPLIED_ELEMENT);
		createEReference(oclExpressionEClass, OCL_EXPRESSION__PARENT_CALL);

		callExpEClass = createEClass(CALL_EXP);
		createEReference(callExpEClass, CALL_EXP__SOURCE);

		integerLiteralExpEClass = createEClass(INTEGER_LITERAL_EXP);
		createEAttribute(integerLiteralExpEClass, INTEGER_LITERAL_EXP__INTEGER_VALUE);

		operationCallExpEClass = createEClass(OPERATION_CALL_EXP);
		createEReference(operationCallExpEClass, OPERATION_CALL_EXP__ARGUMENT);
		createEAttribute(operationCallExpEClass, OPERATION_CALL_EXP__REFERRED_OPERATION);

		stringLiteralExpEClass = createEClass(STRING_LITERAL_EXP);
		createEAttribute(stringLiteralExpEClass, STRING_LITERAL_EXP__STRING_VALUE);

		booleanLiteralExpEClass = createEClass(BOOLEAN_LITERAL_EXP);
		createEAttribute(booleanLiteralExpEClass, BOOLEAN_LITERAL_EXP__BOOLEAN_VALUE);

		// Create enums
		iteratorKindEEnum = createEEnum(ITERATOR_KIND);
		operatorEEnum = createEEnum(OPERATOR);
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
		DmPackage theDmPackage = (DmPackage)EPackage.Registry.INSTANCE.getEPackage(DmPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		variableExpEClass.getESuperTypes().add(this.getOclExpression());
		typeExpEClass.getESuperTypes().add(this.getOclExpression());
		associationClassCallExpEClass.getESuperTypes().add(this.getCallExp());
		propertyCallExpEClass.getESuperTypes().add(this.getCallExp());
		iteratorExpEClass.getESuperTypes().add(this.getCallExp());
		callExpEClass.getESuperTypes().add(this.getOclExpression());
		integerLiteralExpEClass.getESuperTypes().add(this.getOclExpression());
		operationCallExpEClass.getESuperTypes().add(this.getCallExp());
		stringLiteralExpEClass.getESuperTypes().add(this.getOclExpression());
		booleanLiteralExpEClass.getESuperTypes().add(this.getOclExpression());

		// Initialize classes, features, and operations; add parameters
		initEClass(variableExpEClass, VariableExp.class, "VariableExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableExp_ReferredVariable(), this.getVariable(), null, "referredVariable", null, 0, 1, VariableExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeExpEClass, TypeExp.class, "TypeExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeExp_ReferredType(), theDmPackage.getEntity(), null, "referredType", null, 1, 1, TypeExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(associationClassCallExpEClass, AssociationClassCallExp.class, "AssociationClassCallExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssociationClassCallExp_ReferredAssociationEnds(), theDmPackage.getAssociationEnd(), null, "referredAssociationEnds", null, 1, 1, AssociationClassCallExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_LoopExp(), this.getIteratorExp(), this.getIteratorExp_Iterator(), "loopExp", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyCallExpEClass, PropertyCallExp.class, "PropertyCallExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPropertyCallExp_ReferredProperty(), theDmPackage.getAttribute(), null, "referredProperty", null, 1, 1, PropertyCallExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iteratorExpEClass, IteratorExp.class, "IteratorExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIteratorExp_Kind(), this.getIteratorKind(), "kind", null, 0, 1, IteratorExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIteratorExp_Body(), this.getOclExpression(), this.getOclExpression_LoopBodyOwner(), "body", null, 1, 1, IteratorExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIteratorExp_Iterator(), this.getVariable(), this.getVariable_LoopExp(), "iterator", null, 0, -1, IteratorExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oclExpressionEClass, OclExpression.class, "OclExpression", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOclExpression_LoopBodyOwner(), this.getIteratorExp(), this.getIteratorExp_Body(), "loopBodyOwner", null, 0, 1, OclExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOclExpression_AppliedElement(), this.getCallExp(), this.getCallExp_Source(), "appliedElement", null, 0, 1, OclExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOclExpression_ParentCall(), this.getOperationCallExp(), this.getOperationCallExp_Argument(), "parentCall", null, 0, 1, OclExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(callExpEClass, CallExp.class, "CallExp", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallExp_Source(), this.getOclExpression(), this.getOclExpression_AppliedElement(), "source", null, 0, 1, CallExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerLiteralExpEClass, IntegerLiteralExp.class, "IntegerLiteralExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerLiteralExp_IntegerValue(), ecorePackage.getEIntegerObject(), "integerValue", null, 0, 1, IntegerLiteralExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(operationCallExpEClass, OperationCallExp.class, "OperationCallExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOperationCallExp_Argument(), this.getOclExpression(), this.getOclExpression_ParentCall(), "argument", null, 0, -1, OperationCallExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOperationCallExp_ReferredOperation(), this.getOperator(), "referredOperation", null, 0, 1, OperationCallExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringLiteralExpEClass, StringLiteralExp.class, "StringLiteralExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringLiteralExp_StringValue(), ecorePackage.getEString(), "stringValue", null, 0, 1, StringLiteralExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanLiteralExpEClass, BooleanLiteralExp.class, "BooleanLiteralExp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanLiteralExp_BooleanValue(), ecorePackage.getEBooleanObject(), "booleanValue", null, 0, 1, BooleanLiteralExp.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(iteratorKindEEnum, IteratorKind.class, "IteratorKind");
		addEEnumLiteral(iteratorKindEEnum, IteratorKind.EXISTS);
		addEEnumLiteral(iteratorKindEEnum, IteratorKind.COLLECT);

		initEEnum(operatorEEnum, Operator.class, "Operator");
		addEEnumLiteral(operatorEEnum, Operator.EQUAL);
		addEEnumLiteral(operatorEEnum, Operator.AND);
		addEEnumLiteral(operatorEEnum, Operator.ALL_INSTANCES);
		addEEnumLiteral(operatorEEnum, Operator.SIZE);

		// Create resource
		createResource(eNS_URI);
	}

} //ExpPackageImpl
