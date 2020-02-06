/**
 */
package org.vgu.se.ocl.exp;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EString Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.EStringLiteralExp#getStringValue <em>String Value</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.ocl.exp.expPackage#getEStringLiteralExp()
 * @model
 * @generated
 */
public interface EStringLiteralExp extends EPrimitiveType {
    /**
     * Returns the value of the '<em><b>String Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>String Value</em>' attribute.
     * @see #setStringValue(String)
     * @see org.vgu.se.ocl.exp.expPackage#getEStringLiteralExp_StringValue()
     * @model
     * @generated
     */
    String getStringValue();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.exp.EStringLiteralExp#getStringValue <em>String Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>String Value</em>' attribute.
     * @see #getStringValue()
     * @generated
     */
    void setStringValue(String value);

} // EStringLiteralExp
