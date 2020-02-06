/**
 */
package org.vgu.se.ocl.exp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EIterator Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.vgu.se.ocl.exp.EXPPackage#getEIteratorKind()
 * @model instanceClass="org.vgu.se.ocl.exp.EIteratorKind"
 * @generated
 */
public enum EIteratorKind implements Enumerator {
    /**
     * The '<em><b>For All</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FOR_ALL
     * @generated
     * @ordered
     */
    FOR_ALL_LITERAL(0, "forAll", "forAll"),

    /**
     * The '<em><b>Exists</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EXISTS
     * @generated
     * @ordered
     */
    EXISTS_LITERAL(1, "exists", "exists"),

    /**
     * The '<em><b>Collect</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COLLECT
     * @generated
     * @ordered
     */
    COLLECT_LITERAL(2, "collect", "collect"),

    /**
     * The '<em><b>Select</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SELECT
     * @generated
     * @ordered
     */
    SELECT_LITERAL(3, "select", "select");

    /**
     * The '<em><b>For All</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FOR_ALL_LITERAL
     * @model name="forAll"
     * @generated
     * @ordered
     */
    public static final int FOR_ALL = 0;

    /**
     * The '<em><b>Exists</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EXISTS_LITERAL
     * @model name="exists"
     * @generated
     * @ordered
     */
    public static final int EXISTS = 1;

    /**
     * The '<em><b>Collect</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #COLLECT_LITERAL
     * @model name="collect"
     * @generated
     * @ordered
     */
    public static final int COLLECT = 2;

    /**
     * The '<em><b>Select</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SELECT_LITERAL
     * @model name="select"
     * @generated
     * @ordered
     */
    public static final int SELECT = 3;

    /**
     * An array of all the '<em><b>EIterator Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final EIteratorKind[] VALUES_ARRAY = new EIteratorKind[] {
        FOR_ALL_LITERAL, EXISTS_LITERAL, COLLECT_LITERAL, SELECT_LITERAL, };

    /**
     * A public read-only list of all the '<em><b>EIterator Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<EIteratorKind> VALUES = Collections
        .unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>EIterator Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static EIteratorKind get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            EIteratorKind result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>EIterator Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static EIteratorKind getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            EIteratorKind result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>EIterator Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static EIteratorKind get(int value) {
        switch (value) {
        case FOR_ALL:
            return FOR_ALL_LITERAL;
        case EXISTS:
            return EXISTS_LITERAL;
        case COLLECT:
            return COLLECT_LITERAL;
        case SELECT:
            return SELECT_LITERAL;
        }
        return null;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final int value;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String name;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private final String literal;

    /**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EIteratorKind(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int getValue() {
        return value;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getLiteral() {
        return literal;
    }

    /**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        return literal;
    }

} //EIteratorKind
