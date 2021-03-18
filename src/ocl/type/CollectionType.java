/**
 */
package ocl.type;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocl.type.CollectionType#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @see ocl.type.TypePackage#getCollectionType()
 * @model
 * @generated
 */
public interface CollectionType extends DataType {
	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' reference.
	 * @see #setElementType(Classifier)
	 * @see ocl.type.TypePackage#getCollectionType_ElementType()
	 * @model required="true"
	 * @generated
	 */
	Classifier getElementType();

	/**
	 * Sets the value of the '{@link ocl.type.CollectionType#getElementType <em>Element Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' reference.
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(Classifier value);

} // CollectionType
