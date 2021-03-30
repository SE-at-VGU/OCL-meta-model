/**
 */
package ocl.exp;

import ocl.dm.Attribute;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocl.exp.PropertyCallExp#getReferredProperty <em>Referred Property</em>}</li>
 * </ul>
 *
 * @see ocl.exp.ExpPackage#getPropertyCallExp()
 * @model
 * @generated
 */
public interface PropertyCallExp extends CallExp {
	/**
	 * Returns the value of the '<em><b>Referred Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Property</em>' reference.
	 * @see #setReferredProperty(Attribute)
	 * @see ocl.exp.ExpPackage#getPropertyCallExp_ReferredProperty()
	 * @model required="true"
	 * @generated
	 */
	Attribute getReferredProperty();

	/**
	 * Sets the value of the '{@link ocl.exp.PropertyCallExp#getReferredProperty <em>Referred Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Property</em>' reference.
	 * @see #getReferredProperty()
	 * @generated
	 */
	void setReferredProperty(Attribute value);

} // PropertyCallExp
