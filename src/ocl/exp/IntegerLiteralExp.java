/**
 */
package ocl.exp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Integer Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocl.exp.IntegerLiteralExp#getIntegerValue <em>Integer Value</em>}</li>
 * </ul>
 *
 * @see ocl.exp.ExpPackage#getIntegerLiteralExp()
 * @model
 * @generated
 */
public interface IntegerLiteralExp extends NumericLiteralExp {
	/**
	 * Returns the value of the '<em><b>Integer Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Value</em>' attribute.
	 * @see #setIntegerValue(Integer)
	 * @see ocl.exp.ExpPackage#getIntegerLiteralExp_IntegerValue()
	 * @model
	 * @generated
	 */
	Integer getIntegerValue();

	/**
	 * Sets the value of the '{@link ocl.exp.IntegerLiteralExp#getIntegerValue <em>Integer Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Value</em>' attribute.
	 * @see #getIntegerValue()
	 * @generated
	 */
	void setIntegerValue(Integer value);

} // IntegerLiteralExp
