/**
 */
package org.vgu.se.ocl.dm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EAttribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.dm.EAttribute#getName <em>Name</em>}</li>
 *   <li>{@link org.vgu.se.ocl.dm.EAttribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.ocl.dm.dmPackage#getEAttribute()
 * @model
 * @generated
 */
public interface EAttribute extends EObject {
    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see org.vgu.se.ocl.dm.dmPackage#getEAttribute_Name()
     * @model
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.dm.EAttribute#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' attribute.
     * @see #setType(String)
     * @see org.vgu.se.ocl.dm.dmPackage#getEAttribute_Type()
     * @model
     * @generated
     */
    String getType();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.dm.EAttribute#getType <em>Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' attribute.
     * @see #getType()
     * @generated
     */
    void setType(String value);

} // EAttribute
