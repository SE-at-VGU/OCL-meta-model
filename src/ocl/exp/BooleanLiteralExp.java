/**
 */
package ocl.exp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Literal Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocl.exp.BooleanLiteralExp#getBooleanValue <em>Boolean Value</em>}</li>
 * </ul>
 *
 * @see ocl.exp.ExpPackage#getBooleanLiteralExp()
 * @model
 * @generated
 */
public interface BooleanLiteralExp extends OclExpression {
	/**
	 * Returns the value of the '<em><b>Boolean Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean Value</em>' attribute.
	 * @see #setBooleanValue(Boolean)
	 * @see ocl.exp.ExpPackage#getBooleanLiteralExp_BooleanValue()
	 * @model
	 * @generated
	 */
	Boolean getBooleanValue();

	/**
	 * Sets the value of the '{@link ocl.exp.BooleanLiteralExp#getBooleanValue <em>Boolean Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean Value</em>' attribute.
	 * @see #getBooleanValue()
	 * @generated
	 */
	void setBooleanValue(Boolean value);

} // BooleanLiteralExp
