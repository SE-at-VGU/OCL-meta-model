/**
 */
package org.vgu.se.ocl.exp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.vgu.se.ocl.exp.EXPPackage
 * @generated
 */
public interface EXPFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EXPFactory eINSTANCE = org.vgu.se.ocl.exp.impl.EXPFactoryImpl.init();

    /**
     * Returns a new object of class '<em>EVariable Exp</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EVariable Exp</em>'.
     * @generated
     */
    EVariableExp createEVariableExp();

    /**
     * Returns a new object of class '<em>EType Exp</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EType Exp</em>'.
     * @generated
     */
    ETypeExp createETypeExp();

    /**
     * Returns a new object of class '<em>EState Exp</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EState Exp</em>'.
     * @generated
     */
    EStateExp createEStateExp();

    /**
     * Returns a new object of class '<em>EAssociation Class Call Exp</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EAssociation Class Call Exp</em>'.
     * @generated
     */
    EAssociationClassCallExp createEAssociationClassCallExp();

    /**
     * Returns a new object of class '<em>EMessage Exp</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EMessage Exp</em>'.
     * @generated
     */
    EMessageExp createEMessageExp();

    /**
     * Returns a new object of class '<em>EVariable</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EVariable</em>'.
     * @generated
     */
    EVariable createEVariable();

    /**
     * Returns a new object of class '<em>EProperty Call Exp</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EProperty Call Exp</em>'.
     * @generated
     */
    EPropertyCallExp createEPropertyCallExp();

    /**
     * Returns a new object of class '<em>EIterator Exp</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EIterator Exp</em>'.
     * @generated
     */
    EIteratorExp createEIteratorExp();

    /**
     * Returns a new object of class '<em>EIterate Exp</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EIterate Exp</em>'.
     * @generated
     */
    EIterateExp createEIterateExp();

    /**
     * Returns a new object of class '<em>EInteger Literal Exp</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EInteger Literal Exp</em>'.
     * @generated
     */
    EIntegerLiteralExp createEIntegerLiteralExp();

    /**
     * Returns a new object of class '<em>EOperation Call Exp</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EOperation Call Exp</em>'.
     * @generated
     */
    EOperationCallExp createEOperationCallExp();

    /**
     * Returns a new object of class '<em>EString Literal Exp</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EString Literal Exp</em>'.
     * @generated
     */
    EStringLiteralExp createEStringLiteralExp();

    /**
     * Returns a new object of class '<em>EIf Exp</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EIf Exp</em>'.
     * @generated
     */
    EIfExp createEIfExp();

    /**
     * Returns a new object of class '<em>EBoolean Literal Exp</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EBoolean Literal Exp</em>'.
     * @generated
     */
    EBooleanLiteralExp createEBooleanLiteralExp();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    EXPPackage getEXPPackage();

} //EXPFactory
