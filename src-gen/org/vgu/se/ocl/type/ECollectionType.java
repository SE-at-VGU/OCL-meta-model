/**
 */
package org.vgu.se.ocl.type;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ECollection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.type.ECollectionType#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.ocl.type.typePackage#getECollectionType()
 * @model
 * @generated
 */
public interface ECollectionType extends EDataType {
    /**
     * Returns the value of the '<em><b>Element Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Element Type</em>' reference.
     * @see #setElementType(EClassifier)
     * @see org.vgu.se.ocl.type.typePackage#getECollectionType_ElementType()
     * @model required="true"
     * @generated
     */
    EClassifier getElementType();

    /**
     * Sets the value of the '{@link org.vgu.se.ocl.type.ECollectionType#getElementType <em>Element Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Element Type</em>' reference.
     * @see #getElementType()
     * @generated
     */
    void setElementType(EClassifier value);

} // ECollectionType
