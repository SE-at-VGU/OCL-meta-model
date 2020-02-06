/**
 */
package org.vgu.se.ocl.exp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECall Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.ECallExp#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.ocl.exp.EXPPackage#getECallExp()
 * @model abstract="true"
 * @generated
 */
public interface ECallExp extends EOclExpression {
    /**
     * Returns the value of the '<em><b>Source</b></em>' containment reference.
     * It is bidirectional and its opposite is '{@link org.vgu.se.ocl.exp.EOclExpression#getAppliedElement <em>Applied Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Source</em>' containment reference.
     * @see #setSource(EOclExpression)
     * @see org.vgu.se.ocl.exp.EXPPackage#getECallExp_Source()
     * @see org.vgu.se.ocl.exp.EOclExpression#getAppliedElement
     * @model opposite="appliedElement" containment="true"
     * @generated
     */
    EOclExpression getSource();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.exp.ECallExp#getSource <em>Source</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Source</em>' containment reference.
     * @see #getSource()
     * @generated
     */
    void setSource(EOclExpression value);

} // ECallExp
