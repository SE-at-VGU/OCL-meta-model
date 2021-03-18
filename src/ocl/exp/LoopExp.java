/**
 */
package ocl.exp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocl.exp.LoopExp#getBody <em>Body</em>}</li>
 *   <li>{@link ocl.exp.LoopExp#getIterator <em>Iterator</em>}</li>
 * </ul>
 *
 * @see ocl.exp.ExpPackage#getLoopExp()
 * @model abstract="true"
 * @generated
 */
public interface LoopExp extends CallExp {
	/**
	 * Returns the value of the '<em><b>Body</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ocl.exp.OclExpression#getLoopBodyOwner <em>Loop Body Owner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Body</em>' containment reference.
	 * @see #setBody(OclExpression)
	 * @see ocl.exp.ExpPackage#getLoopExp_Body()
	 * @see ocl.exp.OclExpression#getLoopBodyOwner
	 * @model opposite="loopBodyOwner" containment="true" required="true"
	 * @generated
	 */
	OclExpression getBody();

	/**
	 * Sets the value of the '{@link ocl.exp.LoopExp#getBody <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body</em>' containment reference.
	 * @see #getBody()
	 * @generated
	 */
	void setBody(OclExpression value);

	/**
	 * Returns the value of the '<em><b>Iterator</b></em>' containment reference list.
	 * The list contents are of type {@link ocl.exp.Variable}.
	 * It is bidirectional and its opposite is '{@link ocl.exp.Variable#getLoopExp <em>Loop Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iterator</em>' containment reference list.
	 * @see ocl.exp.ExpPackage#getLoopExp_Iterator()
	 * @see ocl.exp.Variable#getLoopExp
	 * @model opposite="loopExp" containment="true"
	 * @generated
	 */
	EList<Variable> getIterator();

} // LoopExp
