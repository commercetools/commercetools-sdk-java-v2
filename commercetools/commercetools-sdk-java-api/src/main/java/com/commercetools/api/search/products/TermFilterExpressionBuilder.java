
package com.commercetools.api.search.products;

import java.util.function.Function;

public class TermFilterExpressionBuilder<T> {
    private final PathExpression expression;
    private final Function<T, FilterExpression> formatter;

    public TermFilterExpressionBuilder() {
        this.expression = null;
        this.formatter = null;
    }

    public TermFilterExpressionBuilder(PathExpression expression, Function<T, FilterExpression> formatter) {
        this.expression = expression;
        this.formatter = formatter;
    }

    public TermFilterExpression<T> is(T value) {
        return TermFilterExpression.of(expression, formatter).is(value);
    }

    public TermFilterExpression<T> isIn(Iterable<T> values) {
        return TermFilterExpression.of(expression, formatter).isIn(values);
    }

    public FilterExpression exists() {
        return new ExistsTermFilterExpression(expression).exists();
    }

    public FilterExpression missing() {
        return new ExistsTermFilterExpression(expression).missing();
    }

    public RangeFilterExpression<T> ranges() {
        return new RangeFilterExpression<>(expression, null, formatter);
    }

    public static <T> TermFilterExpressionBuilder<T> of(PathExpression expression,
            Function<T, FilterExpression> formatter) {
        return new TermFilterExpressionBuilder<>(expression, formatter);
    }
}
