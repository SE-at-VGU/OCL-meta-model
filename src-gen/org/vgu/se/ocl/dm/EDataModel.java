/**
 */
package org.vgu.se.ocl.dm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EData Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.vgu.se.ocl.dm.EDataModel#getClasses <em>Classes</em>}</li>
 * </ul>
 *
 * @see org.vgu.se.ocl.dm.DMPackage#getEDataModel()
 * @model
 * @generated
 */
public interface EDataModel extends EObject {
    /**
     * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
     * The list contents are of type {@link org.vgu.se.ocl.dm.EEntity}.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the value of the '<em>Classes</em>' containment reference list.
     * @see org.vgu.se.ocl.dm.DMPackage#getEDataModel_Classes()
     * @model containment="true"
     * @generated
     */
    EList<EEntity> getClasses();

} // EDataModel
