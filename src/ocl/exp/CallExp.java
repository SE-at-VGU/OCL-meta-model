/**
 */
package ocl.exp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocl.exp.CallExp#getSource <em>Source</em>}</li>
 * </ul>
 *
 * @see ocl.exp.ExpPackage#getCallExp()
 * @model abstract="true"
 * @generated
 */
public interface CallExp extends OclExpression {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ocl.exp.OclExpression#getAppliedElement <em>Applied Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' containment reference.
	 * @see #setSource(OclExpression)
	 * @see ocl.exp.ExpPackage#getCallExp_Source()
	 * @see ocl.exp.OclExpression#getAppliedElement
	 * @model opposite="appliedElement" containment="true"
	 * @generated
	 */
	OclExpression getSource();

	/**
	 * Sets the value of the '{@link ocl.exp.CallExp#getSource <em>Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' containment reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(OclExpression value);

} // CallExp
