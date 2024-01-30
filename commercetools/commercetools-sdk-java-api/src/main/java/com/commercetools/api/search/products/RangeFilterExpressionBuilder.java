
package com.commercetools.api.search.products;

import java.util.function.Function;

public class RangeFilterExpressionBuilder<T> {
    private final PathExpression expression;
    private final Function<T, FilterExpression> formatter;

    public RangeFilterExpressionBuilder() {
        this.expression = null;
        this.formatter = null;
    }

    public RangeFilterExpressionBuilder(PathExpression expression, Function<T, FilterExpression> formatter) {
        this.expression = expression;
        this.formatter = formatter;
    }

    public TermFilterExpression<T> is(T value) {
        return TermFilterExpression.of(expression, formatter).is(value);
    }

    public TermFilterExpression<T> isIn(Iterable<T> values) {
        return TermFilterExpression.of(expression, formatter).isIn(values);
    }

    public RangeFilterExpression<T> rangeFrom(T from) {
        return RangeFilterExpression.of(expression, formatter).rangeFrom(from);
    }

    public RangeFilterExpression<T> rangeTo(T to) {
        return RangeFilterExpression.of(expression, formatter).rangeTo(to);
    }

    public RangeFilterExpression<T> range(T from, T to) {
        return RangeFilterExpression.of(expression, formatter).range(from, to);
    }

    public static <T> RangeFilterExpressionBuilder<T> of(PathExpression expression,
            Function<T, FilterExpression> formatter) {
        return new RangeFilterExpressionBuilder<>(expression, formatter);
    }
}
