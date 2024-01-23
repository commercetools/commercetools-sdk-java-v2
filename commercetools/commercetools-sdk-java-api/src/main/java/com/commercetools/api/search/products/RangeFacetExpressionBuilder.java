
package com.commercetools.api.search.products;

import java.util.Objects;
import java.util.function.Function;

public class RangeFacetExpressionBuilder<T> implements FilterExpression {
    private final PathExpression expression;
    private final Function<T, FilterExpression> formatter;

    public RangeFacetExpressionBuilder() {
        this.expression = null;
        this.formatter = null;
    }

    public RangeFacetExpressionBuilder(PathExpression expression, Function<T, FilterExpression> formatter) {
        this.expression = expression;
        this.formatter = formatter;
    }

    public TermFacetExpression<T> is(T value) {
        return TermFacetExpression.of(expression, formatter).is(value);
    }

    public TermFacetExpression<T> isIn(Iterable<T> values) {
        return TermFacetExpression.of(expression, formatter).isIn(values);
    }

    public RangeFacetExpression<T> rangeFrom(T from) {
        return RangeFacetExpression.of(expression, formatter).rangeFrom(from);
    }

    public RangeFacetExpression<T> rangeTo(T to) {
        return RangeFacetExpression.of(expression, formatter).rangeTo(to);
    }

    public RangeFacetExpression<T> range(T from, T to) {
        return RangeFacetExpression.of(expression, formatter).range(from, to);
    }

    @Override
    public String render() {
        Objects.requireNonNull(expression);
        return expression.render();
    }

    public static <T> RangeFacetExpressionBuilder<T> of(PathExpression expression,
            Function<T, FilterExpression> formatter) {
        return new RangeFacetExpressionBuilder<>(expression, formatter);
    }
}
