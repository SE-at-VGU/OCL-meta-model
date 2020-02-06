/**
 */
package org.vgu.se.ocl.exp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EVariable Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.EVariableExp#getReferredVariable <em>Referred Variable</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.ocl.exp.expPackage#getEVariableExp()
 * @model
 * @generated
 */
public interface EVariableExp extends EOclExpression {
    /**
     * Returns the value of the '<em><b>Referred Variable</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred Variable</em>' reference.
     * @see #setReferredVariable(EVariable)
     * @see org.vgu.se.ocl.exp.expPackage#getEVariableExp_ReferredVariable()
     * @model
     * @generated
     */
    EVariable getReferredVariable();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.exp.EVariableExp#getReferredVariable <em>Referred Variable</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Referred Variable</em>' reference.
     * @see #getReferredVariable()
     * @generated
     */
    void setReferredVariable(EVariable value);

} // EVariableExp
