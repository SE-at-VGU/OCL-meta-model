/**
 */
package ocl.exp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>String Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocl.exp.StringLiteralExp#getStringValue <em>String Value</em>}</li>
 * </ul>
 *
 * @see ocl.exp.ExpPackage#getStringLiteralExp()
 * @model
 * @generated
 */
public interface StringLiteralExp extends PrimitiveType {
	/**
	 * Returns the value of the '<em><b>String Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Value</em>' attribute.
	 * @see #setStringValue(String)
	 * @see ocl.exp.ExpPackage#getStringLiteralExp_StringValue()
	 * @model
	 * @generated
	 */
	String getStringValue();

	/**
	 * Sets the value of the '{@link ocl.exp.StringLiteralExp#getStringValue <em>String Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Value</em>' attribute.
	 * @see #getStringValue()
	 * @generated
	 */
	void setStringValue(String value);

} // StringLiteralExp
