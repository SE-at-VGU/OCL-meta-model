/**
 */
package org.vgu.se.ocl.exp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EIterate Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.EIterateExp#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.ocl.exp.expPackage#getEIterateExp()
 * @model
 * @generated
 */
public interface EIterateExp extends ELoopExp {
    /**
     * Returns the value of the '<em><b>Result</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link org.vgu.se.ocl.exp.EVariable#getBaseExp <em>Base Exp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Result</em>' containment reference.
     * @see #setResult(EVariable)
     * @see org.vgu.se.ocl.exp.expPackage#getEIterateExp_Result()
     * @see org.vgu.se.ocl.exp.EVariable#getBaseExp
     * @model opposite="baseExp" containment="true"
     * @generated
     */
    EVariable getResult();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.exp.EIterateExp#getResult <em>Result</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Result</em>' containment reference.
     * @see #getResult()
     * @generated
     */
    void setResult(EVariable value);

} // EIterateExp
