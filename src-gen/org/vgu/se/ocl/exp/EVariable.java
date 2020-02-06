/**
 */
package org.vgu.se.ocl.exp;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EVariable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.EVariable#getLoopExp <em>Loop Exp</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.EVariable#getBaseExp <em>Base Exp</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.EVariable#getInitExpression <em>Init Expression</em>}</li>
 *   <li>{@link org.vgu.se.ocl.exp.EVariable#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.ocl.exp.expPackage#getEVariable()
 * @model
 * @generated
 */
public interface EVariable extends EObject {
    /**
     * Returns the value of the '<em><b>Loop Exp</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.vgu.se.ocl.exp.ELoopExp#getIterator <em>Iterator</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Loop Exp</em>' container reference.
     * @see #setLoopExp(ELoopExp)
     * @see org.vgu.se.ocl.exp.expPackage#getEVariable_LoopExp()
     * @see org.vgu.se.ocl.exp.ELoopExp#getIterator
     * @model opposite="iterator" transient="false"
     * @generated
     */
    ELoopExp getLoopExp();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.exp.EVariable#getLoopExp <em>Loop Exp</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Loop Exp</em>' container reference.
     * @see #getLoopExp()
     * @generated
     */
    void setLoopExp(ELoopExp value);

    /**
     * Returns the value of the '<em><b>Base Exp</b></em>' container reference.
     * It is bidirectional and its opposite is '{@link org.vgu.se.ocl.exp.EIterateExp#getResult <em>Result</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base Exp</em>' container reference.
     * @see #setBaseExp(EIterateExp)
     * @see org.vgu.se.ocl.exp.expPackage#getEVariable_BaseExp()
     * @see org.vgu.se.ocl.exp.EIterateExp#getResult
     * @model opposite="result" transient="false"
     * @generated
     */
    EIterateExp getBaseExp();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.exp.EVariable#getBaseExp <em>Base Exp</em>}' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base Exp</em>' container reference.
     * @see #getBaseExp()
     * @generated
     */
    void setBaseExp(EIterateExp value);

    /**
     * Returns the value of the '<em><b>Init Expression</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link org.vgu.se.ocl.exp.EOclExpression#getInitializedElement <em>Initialized Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Init Expression</em>' containment reference.
     * @see #setInitExpression(EOclExpression)
     * @see org.vgu.se.ocl.exp.expPackage#getEVariable_InitExpression()
     * @see org.vgu.se.ocl.exp.EOclExpression#getInitializedElement
     * @model opposite="initializedElement" containment="true"
     * @generated
     */
    EOclExpression getInitExpression();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.exp.EVariable#getInitExpression <em>Init Expression</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Init Expression</em>' containment reference.
     * @see #getInitExpression()
     * @generated
     */
    void setInitExpression(EOclExpression value);

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.vgu.se.ocl.exp.expPackage#getEVariable_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.exp.EVariable#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

} // EVariable
