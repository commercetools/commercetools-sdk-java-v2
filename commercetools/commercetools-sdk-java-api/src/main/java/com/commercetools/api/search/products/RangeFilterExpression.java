
package com.commercetools.api.search.products;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RangeFilterExpression<T> implements FilterExpression {

    private final PathExpression expression;

    private final List<RangeExpression> ranges;

    private final Function<T, FilterExpression> formatter;

    public RangeFilterExpression(PathExpression expression, Function<T, FilterExpression> formatter) {
        this.expression = expression;
        this.ranges = null;
        this.formatter = formatter;
    }

    public RangeFilterExpression(PathExpression expression, List<RangeExpression> ranges,
            Function<T, FilterExpression> formatter) {
        this.expression = expression;
        this.ranges = ranges;
        this.formatter = formatter;
    }

    PathExpression expression() {
        return expression;
    }

    List<RangeExpression> ranges() {
        return ranges;
    }

    Function<T, FilterExpression> formatter() {
        return formatter;
    }

    public RangeFilterExpression<T> rangeFrom(T from) {
        List<RangeExpression> terms = Optional.ofNullable(ranges).map(rangeList -> {
            List<RangeExpression> expressions = new ArrayList<>(rangeList);
            expressions.add(RangeExpression.from(formatter().apply(from)));
            return expressions;
        }).orElse(Collections.singletonList(RangeExpression.from(formatter().apply(from))));
        return RangeFilterExpression.of(expression, terms, formatter);
    }

    public RangeFilterExpression<T> rangeTo(T to) {
        List<RangeExpression> terms = Optional.ofNullable(ranges).map(rangeList -> {
            List<RangeExpression> expressions = new ArrayList<>(rangeList);
            expressions.add(RangeExpression.to(formatter().apply(to)));
            return expressions;
        }).orElse(Collections.singletonList(RangeExpression.to(formatter().apply(to))));
        return RangeFilterExpression.of(expression, terms, formatter);
    }

    public RangeFilterExpression<T> range(T from, T to) {
        List<RangeExpression> terms = Optional.ofNullable(ranges).map(rangeList -> {
            List<RangeExpression> expressions = new ArrayList<>(rangeList);
            expressions.add(RangeExpression.of(formatter().apply(from), formatter().apply(to)));
            return expressions;
        }).orElse(Collections.singletonList(RangeExpression.of(formatter().apply(from), formatter().apply(to))));
        return RangeFilterExpression.of(expression, terms, formatter);
    }

    public static <T> RangeFilterExpression<T> of(PathExpression expression, Function<T, FilterExpression> formatter) {
        return new RangeFilterExpression<>(expression, formatter);
    }

    public static <T> RangeFilterExpression<T> of(PathExpression expression, List<RangeExpression> ranges,
            Function<T, FilterExpression> formatter) {
        return new RangeFilterExpression<>(expression, ranges, formatter);
    }

    public FilterExpression exists() {
        return new ExistsTermFilterExpression(expression).exists();
    }

    public FilterExpression missing() {
        return new ExistsTermFilterExpression(expression).missing();
    }

    @Override
    public String render() {
        Objects.requireNonNull(ranges);
        return expression.render() + ": range "
                + ranges.stream().map(FilterExpression::render).collect(Collectors.joining(", "));
    }
}
