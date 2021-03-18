/**
 */
package ocl.exp;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iterator Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocl.exp.IteratorExp#getKind <em>Kind</em>}</li>
 * </ul>
 *
 * @see ocl.exp.ExpPackage#getIteratorExp()
 * @model
 * @generated
 */
public interface IteratorExp extends LoopExp {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link ocl.exp.IteratorKind}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see ocl.exp.IteratorKind
	 * @see #setKind(IteratorKind)
	 * @see ocl.exp.ExpPackage#getIteratorExp_Kind()
	 * @model dataType="ocl.exp.IteratorKind"
	 * @generated
	 */
	IteratorKind getKind();

	/**
	 * Sets the value of the '{@link ocl.exp.IteratorExp#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see ocl.exp.IteratorKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(IteratorKind value);

} // IteratorExp
