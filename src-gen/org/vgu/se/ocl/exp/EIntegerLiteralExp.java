/**
 */
package org.vgu.se.ocl.exp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EInteger Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.EIntegerLiteralExp#getIntegerValue <em>Integer Value</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.ocl.exp.EXPPackage#getEIntegerLiteralExp()
 * @model
 * @generated
 */
public interface EIntegerLiteralExp extends ENumericLiteralExp {
    /**
     * Returns the value of the '<em><b>Integer Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Integer Value</em>' attribute.
     * @see #setIntegerValue(Integer)
     * @see org.vgu.se.ocl.exp.EXPPackage#getEIntegerLiteralExp_IntegerValue()
     * @model
     * @generated
     */
    Integer getIntegerValue();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.exp.EIntegerLiteralExp#getIntegerValue <em>Integer Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Integer Value</em>' attribute.
     * @see #getIntegerValue()
     * @generated
     */
    void setIntegerValue(Integer value);

} // EIntegerLiteralExp
