/**
 */
package org.vgu.se.ocl.exp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EBoolean Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.EBooleanLiteralExp#getBooleanValue <em>Boolean Value</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.ocl.exp.EXPPackage#getEBooleanLiteralExp()
 * @model
 * @generated
 */
public interface EBooleanLiteralExp extends EPrimitiveType {
    /**
     * Returns the value of the '<em><b>Boolean Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Boolean Value</em>' attribute.
     * @see #setBooleanValue(Boolean)
     * @see org.vgu.se.ocl.exp.EXPPackage#getEBooleanLiteralExp_BooleanValue()
     * @model
     * @generated
     */
    Boolean getBooleanValue();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.exp.EBooleanLiteralExp#getBooleanValue <em>Boolean Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Boolean Value</em>' attribute.
     * @see #getBooleanValue()
     * @generated
     */
    void setBooleanValue(Boolean value);

} // EBooleanLiteralExp
