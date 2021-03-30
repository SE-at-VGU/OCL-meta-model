/**
 */
package ocl.exp;

import ocl.dm.Entity;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocl.exp.TypeExp#getReferredType <em>Referred Type</em>}</li>
 * </ul>
 *
 * @see ocl.exp.ExpPackage#getTypeExp()
 * @model
 * @generated
 */
public interface TypeExp extends OclExpression {
	/**
	 * Returns the value of the '<em><b>Referred Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Type</em>' reference.
	 * @see #setReferredType(Entity)
	 * @see ocl.exp.ExpPackage#getTypeExp_ReferredType()
	 * @model required="true"
	 * @generated
	 */
	Entity getReferredType();

	/**
	 * Sets the value of the '{@link ocl.exp.TypeExp#getReferredType <em>Referred Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Type</em>' reference.
	 * @see #getReferredType()
	 * @generated
	 */
	void setReferredType(Entity value);

} // TypeExp
