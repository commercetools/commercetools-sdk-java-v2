
package com.commercetools.api.predicates.query;

import com.commercetools.api.predicates.ConstantPredicate;

public class ConstantQueryPredicate implements ConstantPredicate, QueryPredicate {
    private final String constant;

    public ConstantQueryPredicate(final String constant) {
        this.constant = constant;
    }

    public ConstantQueryPredicate() {
        this.constant = null;
    }

    @Override
    public String constant() {
        return constant;
    }

    public ConstantQueryPredicate constant(final String constant) {
        return new ConstantQueryPredicate(constant);
    }

    @Override
    public String render() {
        return constant;
    }

    public static ConstantQueryPredicate of() {
        return new ConstantQueryPredicate();
    }
}
