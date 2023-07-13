
package com.commercetools.api.search.products;

import java.util.Collections;

public class ExistsTermFilterExpressionBuilder implements FilterExpression {

    private final PathExpression expression;

    public ExistsTermFilterExpressionBuilder(PathExpression expression) {
        this.expression = expression;
    }

    public FilterExpression missing() {
        return new ExistsTermFilterExpression(expression, Collections.singletonList(ConstantExpression.of("missing")));
    }

    public FilterExpression exists() {
        return new ExistsTermFilterExpression(expression, Collections.singletonList(ConstantExpression.of("exists")));
    }

    public static ExistsTermFilterExpressionBuilder of(PathExpression expression) {
        return new ExistsTermFilterExpressionBuilder(expression);
    }
}
