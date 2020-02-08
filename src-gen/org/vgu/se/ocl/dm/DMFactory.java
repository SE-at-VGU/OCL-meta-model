/**
 */
package org.vgu.se.ocl.dm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.vgu.se.ocl.dm.DMPackage
 * @generated
 */
public interface DMFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DMFactory eINSTANCE = org.vgu.se.ocl.dm.impl.DMFactoryImpl.init();

    /**
     * Returns a new object of class '<em>EEntity</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EEntity</em>'.
     * @generated
     */
    EEntity createEEntity();

    /**
     * Returns a new object of class '<em>EAssociation End</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EAssociation End</em>'.
     * @generated
     */
    EAssociationEnd createEAssociationEnd();

    /**
     * Returns a new object of class '<em>EData Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EData Model</em>'.
     * @generated
     */
    EDataModel createEDataModel();

    /**
     * Returns a new object of class '<em>EAttribute</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>EAttribute</em>'.
     * @generated
     */
    EAttribute createEAttribute();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    DMPackage getDMPackage();

} //DMFactory
