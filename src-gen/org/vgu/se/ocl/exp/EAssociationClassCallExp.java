/**
 */
package org.vgu.se.ocl.exp;

import org.vgu.se.ocl.dm.EAssociation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAssociation Class Call Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.exp.EAssociationClassCallExp#getReferredAssociationEnds <em>Referred Association Ends</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.ocl.exp.EXPPackage#getEAssociationClassCallExp()
 * @model
 * @generated
 */
public interface EAssociationClassCallExp extends ENavigationCallExp {
    /**
     * Returns the value of the '<em><b>Referred Association Ends</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Referred Association Ends</em>' reference.
     * @see #setReferredAssociationEnds(EAssociation)
     * @see org.vgu.se.ocl.exp.EXPPackage#getEAssociationClassCallExp_ReferredAssociationEnds()
     * @model required="true"
     * @generated
     */
    EAssociation getReferredAssociationEnds();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.exp.EAssociationClassCallExp#getReferredAssociationEnds <em>Referred Association Ends</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Referred Association Ends</em>' reference.
     * @see #getReferredAssociationEnds()
     * @generated
     */
    void setReferredAssociationEnds(EAssociation value);

} // EAssociationClassCallExp
