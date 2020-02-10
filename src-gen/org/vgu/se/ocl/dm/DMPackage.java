/**
 */
package org.vgu.se.ocl.dm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.vgu.se.ocl.type.TYPEPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.vgu.se.ocl.dm.DMFactory
 * @model kind="package"
 * @generated
 */
public interface DMPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "dm";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://www.example.org/ocl/dm";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "DM";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    DMPackage eINSTANCE = org.vgu.se.ocl.dm.impl.DMPackageImpl.init();

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.dm.impl.EEntityImpl <em>EEntity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.dm.impl.EEntityImpl
     * @see org.vgu.se.ocl.dm.impl.DMPackageImpl#getEEntity()
     * @generated
     */
    int EENTITY = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EENTITY__NAME = TYPEPackage.ECLASSIFIER_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Ends</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EENTITY__ENDS = TYPEPackage.ECLASSIFIER_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EENTITY__ATTRIBUTES = TYPEPackage.ECLASSIFIER_FEATURE_COUNT + 2;

    /**
     * The number of structural features of the '<em>EEntity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EENTITY_FEATURE_COUNT = TYPEPackage.ECLASSIFIER_FEATURE_COUNT + 3;

    /**
     * The number of operations of the '<em>EEntity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EENTITY_OPERATION_COUNT = TYPEPackage.ECLASSIFIER_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.dm.impl.EAssociationEndImpl <em>EAssociation End</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.dm.impl.EAssociationEndImpl
     * @see org.vgu.se.ocl.dm.impl.DMPackageImpl#getEAssociationEnd()
     * @generated
     */
    int EASSOCIATION_END = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EASSOCIATION_END__NAME = 0;

    /**
     * The feature id for the '<em><b>Mult</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EASSOCIATION_END__MULT = 1;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EASSOCIATION_END__TARGET = 2;

    /**
     * The feature id for the '<em><b>Opp</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EASSOCIATION_END__OPP = 3;

    /**
     * The number of structural features of the '<em>EAssociation End</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EASSOCIATION_END_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>EAssociation End</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EASSOCIATION_END_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.dm.impl.EDataModelImpl <em>EData Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.dm.impl.EDataModelImpl
     * @see org.vgu.se.ocl.dm.impl.DMPackageImpl#getEDataModel()
     * @generated
     */
    int EDATA_MODEL = 2;

    /**
     * The feature id for the '<em><b>Classes</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDATA_MODEL__CLASSES = 0;

    /**
     * The number of structural features of the '<em>EData Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDATA_MODEL_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>EData Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EDATA_MODEL_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.dm.impl.EAttributeImpl <em>EAttribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.dm.impl.EAttributeImpl
     * @see org.vgu.se.ocl.dm.impl.DMPackageImpl#getEAttribute()
     * @generated
     */
    int EATTRIBUTE = 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EATTRIBUTE__NAME = 0;

    /**
     * The feature id for the '<em><b>Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EATTRIBUTE__TYPE = 1;

    /**
     * The number of structural features of the '<em>EAttribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EATTRIBUTE_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>EAttribute</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int EATTRIBUTE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link org.vgu.se.ocl.dm.EMultiplicity <em>EMultiplicity</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.vgu.se.ocl.dm.EMultiplicity
     * @see org.vgu.se.ocl.dm.impl.DMPackageImpl#getEMultiplicity()
     * @generated
     */
    int EMULTIPLICITY = 4;

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.dm.EEntity <em>EEntity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EEntity</em>'.
     * @see org.vgu.se.ocl.dm.EEntity
     * @generated
     */
    EClass getEEntity();

    /**
     * Returns the meta object for the attribute '{@link org.vgu.se.ocl.dm.EEntity#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.vgu.se.ocl.dm.EEntity#getName()
     * @see #getEEntity()
     * @generated
     */
    EAttribute getEEntity_Name();

    /**
     * Returns the meta object for the containment reference list '{@link org.vgu.se.ocl.dm.EEntity#getEnds <em>Ends</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Ends</em>'.
     * @see org.vgu.se.ocl.dm.EEntity#getEnds()
     * @see #getEEntity()
     * @generated
     */
    EReference getEEntity_Ends();

    /**
     * Returns the meta object for the containment reference list '{@link org.vgu.se.ocl.dm.EEntity#getAttributes <em>Attributes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Attributes</em>'.
     * @see org.vgu.se.ocl.dm.EEntity#getAttributes()
     * @see #getEEntity()
     * @generated
     */
    EReference getEEntity_Attributes();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.dm.EAssociationEnd <em>EAssociation End</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EAssociation End</em>'.
     * @see org.vgu.se.ocl.dm.EAssociationEnd
     * @generated
     */
    EClass getEAssociationEnd();

    /**
     * Returns the meta object for the attribute '{@link org.vgu.se.ocl.dm.EAssociationEnd#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.vgu.se.ocl.dm.EAssociationEnd#getName()
     * @see #getEAssociationEnd()
     * @generated
     */
    EAttribute getEAssociationEnd_Name();

    /**
     * Returns the meta object for the attribute '{@link org.vgu.se.ocl.dm.EAssociationEnd#getMult <em>Mult</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mult</em>'.
     * @see org.vgu.se.ocl.dm.EAssociationEnd#getMult()
     * @see #getEAssociationEnd()
     * @generated
     */
    EAttribute getEAssociationEnd_Mult();

    /**
     * Returns the meta object for the reference '{@link org.vgu.se.ocl.dm.EAssociationEnd#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see org.vgu.se.ocl.dm.EAssociationEnd#getTarget()
     * @see #getEAssociationEnd()
     * @generated
     */
    EReference getEAssociationEnd_Target();

    /**
     * Returns the meta object for the reference '{@link org.vgu.se.ocl.dm.EAssociationEnd#getOpp <em>Opp</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Opp</em>'.
     * @see org.vgu.se.ocl.dm.EAssociationEnd#getOpp()
     * @see #getEAssociationEnd()
     * @generated
     */
    EReference getEAssociationEnd_Opp();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.dm.EDataModel <em>EData Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EData Model</em>'.
     * @see org.vgu.se.ocl.dm.EDataModel
     * @generated
     */
    EClass getEDataModel();

    /**
     * Returns the meta object for the containment reference list '{@link org.vgu.se.ocl.dm.EDataModel#getClasses <em>Classes</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Classes</em>'.
     * @see org.vgu.se.ocl.dm.EDataModel#getClasses()
     * @see #getEDataModel()
     * @generated
     */
    EReference getEDataModel_Classes();

    /**
     * Returns the meta object for class '{@link org.vgu.se.ocl.dm.EAttribute <em>EAttribute</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>EAttribute</em>'.
     * @see org.vgu.se.ocl.dm.EAttribute
     * @generated
     */
    EClass getEAttribute();

    /**
     * Returns the meta object for the attribute '{@link org.vgu.se.ocl.dm.EAttribute#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.vgu.se.ocl.dm.EAttribute#getName()
     * @see #getEAttribute()
     * @generated
     */
    EAttribute getEAttribute_Name();

    /**
     * Returns the meta object for the attribute '{@link org.vgu.se.ocl.dm.EAttribute#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Type</em>'.
     * @see org.vgu.se.ocl.dm.EAttribute#getType()
     * @see #getEAttribute()
     * @generated
     */
    EAttribute getEAttribute_Type();

    /**
     * Returns the meta object for enum '{@link org.vgu.se.ocl.dm.EMultiplicity <em>EMultiplicity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for enum '<em>EMultiplicity</em>'.
     * @see org.vgu.se.ocl.dm.EMultiplicity
     * @generated
     */
    EEnum getEMultiplicity();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    DMFactory getDMFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.dm.impl.EEntityImpl <em>EEntity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.dm.impl.EEntityImpl
         * @see org.vgu.se.ocl.dm.impl.DMPackageImpl#getEEntity()
         * @generated
         */
        EClass EENTITY = eINSTANCE.getEEntity();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EENTITY__NAME = eINSTANCE.getEEntity_Name();

        /**
         * The meta object literal for the '<em><b>Ends</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EENTITY__ENDS = eINSTANCE.getEEntity_Ends();

        /**
         * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EENTITY__ATTRIBUTES = eINSTANCE.getEEntity_Attributes();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.dm.impl.EAssociationEndImpl <em>EAssociation End</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.dm.impl.EAssociationEndImpl
         * @see org.vgu.se.ocl.dm.impl.DMPackageImpl#getEAssociationEnd()
         * @generated
         */
        EClass EASSOCIATION_END = eINSTANCE.getEAssociationEnd();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EASSOCIATION_END__NAME = eINSTANCE.getEAssociationEnd_Name();

        /**
         * The meta object literal for the '<em><b>Mult</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EASSOCIATION_END__MULT = eINSTANCE.getEAssociationEnd_Mult();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EASSOCIATION_END__TARGET = eINSTANCE
            .getEAssociationEnd_Target();

        /**
         * The meta object literal for the '<em><b>Opp</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EASSOCIATION_END__OPP = eINSTANCE.getEAssociationEnd_Opp();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.dm.impl.EDataModelImpl <em>EData Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.dm.impl.EDataModelImpl
         * @see org.vgu.se.ocl.dm.impl.DMPackageImpl#getEDataModel()
         * @generated
         */
        EClass EDATA_MODEL = eINSTANCE.getEDataModel();

        /**
         * The meta object literal for the '<em><b>Classes</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference EDATA_MODEL__CLASSES = eINSTANCE.getEDataModel_Classes();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.dm.impl.EAttributeImpl <em>EAttribute</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.dm.impl.EAttributeImpl
         * @see org.vgu.se.ocl.dm.impl.DMPackageImpl#getEAttribute()
         * @generated
         */
        EClass EATTRIBUTE = eINSTANCE.getEAttribute();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EATTRIBUTE__NAME = eINSTANCE.getEAttribute_Name();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute EATTRIBUTE__TYPE = eINSTANCE.getEAttribute_Type();

        /**
         * The meta object literal for the '{@link org.vgu.se.ocl.dm.EMultiplicity <em>EMultiplicity</em>}' enum.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.vgu.se.ocl.dm.EMultiplicity
         * @see org.vgu.se.ocl.dm.impl.DMPackageImpl#getEMultiplicity()
         * @generated
         */
        EEnum EMULTIPLICITY = eINSTANCE.getEMultiplicity();

    }

} //DMPackage
