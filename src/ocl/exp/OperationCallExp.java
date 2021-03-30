/**
 */
package ocl.exp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocl.exp.OperationCallExp#getArgument <em>Argument</em>}</li>
 *   <li>{@link ocl.exp.OperationCallExp#getReferredOperation <em>Referred Operation</em>}</li>
 * </ul>
 *
 * @see ocl.exp.ExpPackage#getOperationCallExp()
 * @model
 * @generated
 */
public interface OperationCallExp extends CallExp {
	/**
	 * Returns the value of the '<em><b>Argument</b></em>' containment reference list.
	 * The list contents are of type {@link ocl.exp.OclExpression}.
	 * It is bidirectional and its opposite is '{@link ocl.exp.OclExpression#getParentCall <em>Parent Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Argument</em>' containment reference list.
	 * @see ocl.exp.ExpPackage#getOperationCallExp_Argument()
	 * @see ocl.exp.OclExpression#getParentCall
	 * @model opposite="parentCall" containment="true"
	 * @generated
	 */
	EList<OclExpression> getArgument();

	/**
	 * Returns the value of the '<em><b>Referred Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link ocl.exp.Operator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Operation</em>' attribute.
	 * @see ocl.exp.Operator
	 * @see #setReferredOperation(Operator)
	 * @see ocl.exp.ExpPackage#getOperationCallExp_ReferredOperation()
	 * @model dataType="ocl.exp.Operator"
	 * @generated
	 */
	Operator getReferredOperation();

	/**
	 * Sets the value of the '{@link ocl.exp.OperationCallExp#getReferredOperation <em>Referred Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Operation</em>' attribute.
	 * @see ocl.exp.Operator
	 * @see #getReferredOperation()
	 * @generated
	 */
	void setReferredOperation(Operator value);

} // OperationCallExp
