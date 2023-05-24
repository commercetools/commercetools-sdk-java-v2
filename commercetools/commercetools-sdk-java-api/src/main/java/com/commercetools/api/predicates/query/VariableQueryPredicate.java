
package com.commercetools.api.predicates.query;

public class VariableQueryPredicate extends ConstantQueryPredicate {

    public VariableQueryPredicate(final String variable) {
        super(variable);
    }

    public VariableQueryPredicate() {
        super();
    }

    public VariableQueryPredicate constant(final String variable) {
        return new VariableQueryPredicate(variable);
    }

    @Override
    public String render() {
        return ":" + super.render();
    }

    public static VariableQueryPredicate of() {
        return new VariableQueryPredicate();
    }
}
