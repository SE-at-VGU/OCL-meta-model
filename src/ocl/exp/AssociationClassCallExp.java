/**
 */
package ocl.exp;

import ocl.dm.AssociationEnd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association Class Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocl.exp.AssociationClassCallExp#getReferredAssociationEnds <em>Referred Association Ends</em>}</li>
 * </ul>
 *
 * @see ocl.exp.ExpPackage#getAssociationClassCallExp()
 * @model
 * @generated
 */
public interface AssociationClassCallExp extends NavigationCallExp {
	/**
	 * Returns the value of the '<em><b>Referred Association Ends</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referred Association Ends</em>' reference.
	 * @see #setReferredAssociationEnds(AssociationEnd)
	 * @see ocl.exp.ExpPackage#getAssociationClassCallExp_ReferredAssociationEnds()
	 * @model required="true"
	 * @generated
	 */
	AssociationEnd getReferredAssociationEnds();

	/**
	 * Sets the value of the '{@link ocl.exp.AssociationClassCallExp#getReferredAssociationEnds <em>Referred Association Ends</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referred Association Ends</em>' reference.
	 * @see #getReferredAssociationEnds()
	 * @generated
	 */
	void setReferredAssociationEnds(AssociationEnd value);

} // AssociationClassCallExp
