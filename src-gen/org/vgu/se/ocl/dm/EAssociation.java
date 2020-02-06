/**
 */
package org.vgu.se.ocl.dm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAssociation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.dm.EAssociation#getName <em>Name</em>}</li>
 *   <li>{@link org.vgu.se.ocl.dm.EAssociation#getOpp <em>Opp</em>}</li>
 *   <li>{@link org.vgu.se.ocl.dm.EAssociation#getMult <em>Mult</em>}</li>
 *   <li>{@link org.vgu.se.ocl.dm.EAssociation#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.ocl.dm.DMPackage#getEAssociation()
 * @model
 * @generated
 */
public interface EAssociation extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.vgu.se.ocl.dm.DMPackage#getEAssociation_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.dm.EAssociation#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Opp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Opp</em>' attribute.
     * @see #setOpp(String)
     * @see org.vgu.se.ocl.dm.DMPackage#getEAssociation_Opp()
     * @model
     * @generated
     */
    String getOpp();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.dm.EAssociation#getOpp <em>Opp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Opp</em>' attribute.
     * @see #getOpp()
     * @generated
     */
    void setOpp(String value);

    /**
     * Returns the value of the '<em><b>Mult</b></em>' attribute.
     * The literals are from the enumeration {@link org.vgu.se.ocl.dm.EMultiplicity}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mult</em>' attribute.
     * @see org.vgu.se.ocl.dm.EMultiplicity
     * @see #setMult(EMultiplicity)
     * @see org.vgu.se.ocl.dm.DMPackage#getEAssociation_Mult()
     * @model dataType="org.vgu.se.ocl.dm.EMultiplicity"
     * @generated
     */
    EMultiplicity getMult();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.dm.EAssociation#getMult <em>Mult</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mult</em>' attribute.
     * @see org.vgu.se.ocl.dm.EMultiplicity
     * @see #getMult()
     * @generated
     */
    void setMult(EMultiplicity value);

    /**
     * Returns the value of the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target</em>' reference.
     * @see #setTarget(EEntity)
     * @see org.vgu.se.ocl.dm.DMPackage#getEAssociation_Target()
     * @model required="true"
     * @generated
     */
    EEntity getTarget();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.dm.EAssociation#getTarget <em>Target</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target</em>' reference.
     * @see #getTarget()
     * @generated
     */
    void setTarget(EEntity value);

} // EAssociation
