/**
 */
package ocl.type;

import ocl.exp.Operator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocl.type.MessageType#getReferredSignal <em>Referred Signal</em>}</li>
 *   <li>{@link ocl.type.MessageType#getReferredOperation <em>Referred Operation</em>}</li>
 * </ul>
 *
 * @see ocl.type.TypePackage#getMessageType()
 * @model
 * @generated
 */
public interface MessageType extends Classifier {
	/**
	 * Returns the value of the '<em><b>Referred Signal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Signal</em>' reference.
	 * @see #setReferredSignal(Signal)
	 * @see ocl.type.TypePackage#getMessageType_ReferredSignal()
	 * @model
	 * @generated
	 */
	Signal getReferredSignal();

	/**
	 * Sets the value of the '{@link ocl.type.MessageType#getReferredSignal <em>Referred Signal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Signal</em>' reference.
	 * @see #getReferredSignal()
	 * @generated
	 */
	void setReferredSignal(Signal value);

	/**
	 * Returns the value of the '<em><b>Referred Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link ocl.exp.Operator}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Operation</em>' attribute.
	 * @see ocl.exp.Operator
	 * @see #setReferredOperation(Operator)
	 * @see ocl.type.TypePackage#getMessageType_ReferredOperation()
	 * @model dataType="ocl.exp.Operator"
	 * @generated
	 */
	Operator getReferredOperation();

	/**
	 * Sets the value of the '{@link ocl.type.MessageType#getReferredOperation <em>Referred Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Operation</em>' attribute.
	 * @see ocl.exp.Operator
	 * @see #getReferredOperation()
	 * @generated
	 */
	void setReferredOperation(Operator value);

} // MessageType
