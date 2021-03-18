/**
 */
package ocl.dm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ocl.dm.DataModel#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see ocl.dm.DmPackage#getDataModel()
 * @model
 * @generated
 */
public interface DataModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link ocl.dm.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see ocl.dm.DmPackage#getDataModel_Classes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getClasses();

} // DataModel
