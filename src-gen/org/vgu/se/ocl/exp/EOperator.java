/**
 */
package org.vgu.se.ocl.exp;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>EOperator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.vgu.se.ocl.exp.EXPPackage#getEOperator()
 * @model instanceClass="org.vgu.se.ocl.exp.EOperator"
 * @generated
 */
public enum EOperator implements Enumerator {
    /**
     * The '<em><b>Equal</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EQUAL
     * @generated
     * @ordered
     */
    EQUAL_LITERAL(1, "equal", "="),

    /**
     * The '<em><b>All Instances</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ALL_INSTANCES
     * @generated
     * @ordered
     */
    ALL_INSTANCES_LITERAL(0, "allInstances", "allInstances"),

    /**
     * The '<em><b>Greater</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GREATER
     * @generated
     * @ordered
     */
    GREATER_LITERAL(2, "greater", ">"),

    /**
     * The '<em><b>Less</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LESS
     * @generated
     * @ordered
     */
    LESS_LITERAL(3, "less", "<"),

    /**
     * The '<em><b>Not Equal</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOT_EQUAL
     * @generated
     * @ordered
     */
    NOT_EQUAL_LITERAL(4, "notEqual", "<>"),

    /**
     * The '<em><b>Greater Or Equal</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GREATER_OR_EQUAL
     * @generated
     * @ordered
     */
    GREATER_OR_EQUAL_LITERAL(6, "greaterOrEqual", ">="),

    /**
     * The '<em><b>Less Or Equal</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LESS_OR_EQUAL
     * @generated
     * @ordered
     */
    LESS_OR_EQUAL_LITERAL(7, "lessOrEqual", "<="),

    /**
     * The '<em><b>AND</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AND
     * @generated
     * @ordered
     */
    AND_LITERAL(8, "AND", "and"),

    /**
     * The '<em><b>OR</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OR
     * @generated
     * @ordered
     */
    OR_LITERAL(9, "OR", "or"),

    /**
     * The '<em><b>IMPLIES</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMPLIES
     * @generated
     * @ordered
     */
    IMPLIES_LITERAL(11, "IMPLIES", "implies"),

    /**
     * The '<em><b>Size</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SIZE
     * @generated
     * @ordered
     */
    SIZE_LITERAL(12, "size", "size"),

    /**
     * The '<em><b>Is Empty</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IS_EMPTY
     * @generated
     * @ordered
     */
    IS_EMPTY_LITERAL(13, "isEmpty", "isEmpty"),

    /**
     * The '<em><b>Ocl Is Undefined</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OCL_IS_UNDEFINED
     * @generated
     * @ordered
     */
    OCL_IS_UNDEFINED_LITERAL(14, "oclIsUndefined", "oclIsUndefined"),

    /**
     * The '<em><b>Flatten</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FLATTEN
     * @generated
     * @ordered
     */
    FLATTEN_LITERAL(15, "flatten", "flatten"),

    /**
     * The '<em><b>Not Empty</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOT_EMPTY
     * @generated
     * @ordered
     */
    NOT_EMPTY_LITERAL(16, "notEmpty", "notEmpty"),

    /**
     * The '<em><b>Is Unique</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IS_UNIQUE
     * @generated
     * @ordered
     */
    IS_UNIQUE_LITERAL(17, "isUnique", "isUnique");

    /**
     * The '<em><b>Equal</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #EQUAL_LITERAL
     * @model name="equal" literal="="
     * @generated
     * @ordered
     */
    public static final int EQUAL = 1;

    /**
     * The '<em><b>All Instances</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #ALL_INSTANCES_LITERAL
     * @model name="allInstances"
     * @generated
     * @ordered
     */
    public static final int ALL_INSTANCES = 0;

    /**
     * The '<em><b>Greater</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GREATER_LITERAL
     * @model name="greater" literal="&gt;"
     * @generated
     * @ordered
     */
    public static final int GREATER = 2;

    /**
     * The '<em><b>Less</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LESS_LITERAL
     * @model name="less" literal="&lt;"
     * @generated
     * @ordered
     */
    public static final int LESS = 3;

    /**
     * The '<em><b>Not Equal</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOT_EQUAL_LITERAL
     * @model name="notEqual" literal="&lt;&gt;"
     * @generated
     * @ordered
     */
    public static final int NOT_EQUAL = 4;

    /**
     * The '<em><b>Greater Or Equal</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #GREATER_OR_EQUAL_LITERAL
     * @model name="greaterOrEqual" literal="&gt;="
     * @generated
     * @ordered
     */
    public static final int GREATER_OR_EQUAL = 6;

    /**
     * The '<em><b>Less Or Equal</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #LESS_OR_EQUAL_LITERAL
     * @model name="lessOrEqual" literal="&lt;="
     * @generated
     * @ordered
     */
    public static final int LESS_OR_EQUAL = 7;

    /**
     * The '<em><b>AND</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #AND_LITERAL
     * @model
     * @generated
     * @ordered
     */
    public static final int AND = 8;

    /**
     * The '<em><b>OR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OR_LITERAL
     * @model
     * @generated
     * @ordered
     */
    public static final int OR = 9;

    /**
     * The '<em><b>XOR</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #XOR_LITERAL
     * @model
     * @generated
     * @ordered
     */
    public static final int XOR = 10;

    /**
     * The '<em><b>IMPLIES</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IMPLIES_LITERAL
     * @model
     * @generated
     * @ordered
     */
    public static final int IMPLIES = 11;

    /**
     * The '<em><b>Size</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #SIZE_LITERAL
     * @model name="size"
     * @generated
     * @ordered
     */
    public static final int SIZE = 12;

    /**
     * The '<em><b>Is Empty</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IS_EMPTY_LITERAL
     * @model name="isEmpty"
     * @generated
     * @ordered
     */
    public static final int IS_EMPTY = 13;

    /**
     * The '<em><b>Ocl Is Undefined</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #OCL_IS_UNDEFINED_LITERAL
     * @model name="oclIsUndefined"
     * @generated
     * @ordered
     */
    public static final int OCL_IS_UNDEFINED = 14;

    /**
     * The '<em><b>Flatten</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #FLATTEN_LITERAL
     * @model name="flatten"
     * @generated
     * @ordered
     */
    public static final int FLATTEN = 15;

    /**
     * The '<em><b>Not Empty</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #NOT_EMPTY_LITERAL
     * @model name="notEmpty"
     * @generated
     * @ordered
     */
    public static final int NOT_EMPTY = 16;

    /**
     * The '<em><b>Is Unique</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #IS_UNIQUE_LITERAL
     * @model name="isUnique"
     * @generated
     * @ordered
     */
    public static final int IS_UNIQUE = 17;

    /**
     * An array of all the '<em><b>EOperator</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static final EOperator[] VALUES_ARRAY = new EOperator[] {
        EQUAL_LITERAL, ALL_INSTANCES_LITERAL, GREATER_LITERAL, LESS_LITERAL,
        NOT_EQUAL_LITERAL, GREATER_OR_EQUAL_LITERAL, LESS_OR_EQUAL_LITERAL,
        AND_LITERAL, OR_LITERAL, IMPLIES_LITERAL, SIZE_LITERAL,
        IS_EMPTY_LITERAL, OCL_IS_UNDEFINED_LITERAL, FLATTEN_LITERAL,
        NOT_EMPTY_LITERAL, IS_UNIQUE_LITERAL, };

    /**
     * A public read-only list of all the '<em><b>EOperator</b></em>' enumerators.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public static final List<EOperator> VALUES = Collections
        .unmodifiableList(Arrays.asList(VALUES_ARRAY));

    /**
     * Returns the '<em><b>EOperator</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static EOperator get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            EOperator result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>EOperator</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static EOperator getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            EOperator result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

    /**
     * Returns the '<em><b>EOperator</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
    public static EOperator get(int value) {
        switch (value) {
        case EQUAL:
            return EQUAL_LITERAL;
        case ALL_INSTANCES:
            return ALL_INSTANCES_LITERAL;
        case GREATER:
            return GREATER_LITERAL;
        case LESS:
            return LESS_LITERAL;
        case NOT_EQUAL:
            return NOT_EQUAL_LITERAL;
        case GREATER_OR_EQUAL:
            return GREATER_OR_EQUAL_LITERAL;
        case LESS_OR_EQUAL:
            return LESS_OR_EQUAL_LITERAL;
        case AND:
            return AND_LITERAL;
        case OR:
            return OR_LITERAL;
        case IMPLIES:
            return IMPLIES_LITERAL;
        case SIZE:
            return SIZE_LITERAL;
        case IS_EMPTY:
            return IS_EMPTY_LITERAL;
        case OCL_IS_UNDEFINED:
            return OCL_IS_UNDEFINED_LITERAL;
        case FLATTEN:
            return FLATTEN_LITERAL;
        case NOT_EMPTY:
            return NOT_EMPTY_LITERAL;
        case IS_UNIQUE:
            return IS_UNIQUE_LITERAL;
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
    private EOperator(int value, String name, String literal) {
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

} //EOperator
