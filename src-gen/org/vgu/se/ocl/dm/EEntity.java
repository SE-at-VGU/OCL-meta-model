/**
 */
package org.vgu.se.ocl.dm;

import org.eclipse.emf.common.util.EList;

import org.vgu.se.ocl.type.EClassifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EEntity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.dm.EEntity#getName <em>Name</em>}</li>
 *   <li>{@link org.vgu.se.ocl.dm.EEntity#getEnds <em>Ends</em>}</li>
 *   <li>{@link org.vgu.se.ocl.dm.EEntity#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.ocl.dm.dmPackage#getEEntity()
 * @model
 * @generated
 */
public interface EEntity extends EClassifier {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.vgu.se.ocl.dm.dmPackage#getEEntity_Name()
     * @model dataType="org.eclipse.emf.ecore.xml.type.String"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.dm.EEntity#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Ends</b></em>' containment reference list.
     * The list contents are of type {@link org.vgu.se.ocl.dm.EAssociation}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ends</em>' containment reference list.
     * @see org.vgu.se.ocl.dm.dmPackage#getEEntity_Ends()
     * @model containment="true"
     * @generated
     */
    EList<EAssociation> getEnds();

    /**
     * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
     * The list contents are of type {@link org.vgu.se.ocl.dm.EAttribute}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Attributes</em>' containment reference list.
     * @see org.vgu.se.ocl.dm.dmPackage#getEEntity_Attributes()
     * @model containment="true"
     * @generated
     */
    EList<EAttribute> getAttributes();

} // EEntity
