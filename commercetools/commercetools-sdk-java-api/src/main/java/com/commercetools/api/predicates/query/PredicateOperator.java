
package com.commercetools.api.predicates.query;

public enum PredicateOperator {
    IS_EQUAL("="),
    IS_NOT_EQUAL("!="),
    IS_NOT("<>"),
    IS_LESS_THAN("<"),
    IS_LESS_THAN_OR_EQUAL("<="),
    IS_GREATER_THAN(">"),
    IS_GREATER_THAN_OR_EQUAL(">="),
    IS_IN("in"),

    IS("is"),
    WITHIN("within"),;

    private final String operator;

    /**
     * @param operator
     */
    PredicateOperator(final String operator) {
        this.operator = operator;
    }

    /* (non-Javadoc)
     * @see java.lang.Enum#toString()
     */
    @Override
    public String toString() {
        return operator;
    }
}
