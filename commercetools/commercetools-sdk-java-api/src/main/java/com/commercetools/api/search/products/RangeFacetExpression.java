
package com.commercetools.api.search.products;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RangeFacetExpression<T> implements FacetExpression<T> {

    private final PathExpression expression;

    private final List<RangeExpression> ranges;

    private final Function<T, FilterExpression> formatter;

    private final boolean countingProducts;

    private final String alias;

    RangeFacetExpression(final PathExpression expression, final Function<T, FilterExpression> formatter) {
        this.expression = expression;
        this.ranges = null;
        this.formatter = formatter;
        this.alias = null;
        this.countingProducts = false;
    }

    RangeFacetExpression(final PathExpression expression, final List<RangeExpression> ranges,
            final Function<T, FilterExpression> formatter) {
        this.expression = expression;
        this.ranges = ranges;
        this.formatter = formatter;
        this.alias = null;
        this.countingProducts = false;
    }

    RangeFacetExpression(final PathExpression expression, final List<RangeExpression> ranges,
            final Function<T, FilterExpression> formatter, final String alias, final boolean countingProducts) {
        this.expression = expression;
        this.ranges = ranges;
        this.formatter = formatter;
        this.alias = alias;
        this.countingProducts = countingProducts;
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

    public RangeFacetExpression<T> alias(final String alias) {
        return new RangeFacetExpression<>(expression, ranges, formatter, alias, countingProducts);
    }

    public RangeFacetExpression<T> countingProducts() {
        return new RangeFacetExpression<>(expression, ranges, formatter, alias, true);
    }

    public RangeFacetExpression<T> rangeFrom(T from) {
        List<RangeExpression> terms = Optional.ofNullable(ranges).map(rangeList -> {
            List<RangeExpression> expressions = new ArrayList<>(rangeList);
            expressions.add(RangeExpression.from(formatter().apply(from)));
            return expressions;
        }).orElse(Collections.singletonList(RangeExpression.from(formatter().apply(from))));
        return new RangeFacetExpression<>(expression, terms, formatter, alias, countingProducts);
    }

    public RangeFacetExpression<T> rangeTo(T to) {
        List<RangeExpression> terms = Optional.ofNullable(ranges).map(rangeList -> {
            List<RangeExpression> expressions = new ArrayList<>(rangeList);
            expressions.add(RangeExpression.to(formatter().apply(to)));
            return expressions;
        }).orElse(Collections.singletonList(RangeExpression.to(formatter().apply(to))));
        return new RangeFacetExpression<>(expression, terms, formatter, alias, countingProducts);
    }

    public RangeFacetExpression<T> range(T from, T to) {
        List<RangeExpression> terms = Optional.ofNullable(ranges).map(rangeList -> {
            List<RangeExpression> expressions = new ArrayList<>(rangeList);
            expressions.add(RangeExpression.of(formatter().apply(from), formatter().apply(to)));
            return expressions;
        }).orElse(Collections.singletonList(RangeExpression.of(formatter().apply(from), formatter().apply(to))));
        return new RangeFacetExpression<>(expression, terms, formatter, alias, countingProducts);
    }

    public static <T> RangeFacetExpression<T> of(final PathExpression expression,
            final Function<T, FilterExpression> formatter) {
        return new RangeFacetExpression<>(expression, formatter);
    }

    public static <T> RangeFacetExpression<T> of(final PathExpression expression, final List<RangeExpression> ranges,
            Function<T, FilterExpression> formatter) {
        return new RangeFacetExpression<>(expression, ranges, formatter);
    }

    public static <T> RangeFacetExpression<T> of(final PathExpression expression, final List<RangeExpression> ranges,
            final Function<T, FilterExpression> formatter, final String alias, final boolean countingProducts) {
        return new RangeFacetExpression<>(expression, ranges, formatter, alias, countingProducts);
    }

    @Override
    public String render() {
        Objects.requireNonNull(ranges);
        return expression.render() + ": range "
                + ranges.stream().map(FilterExpression::render).collect(Collectors.joining(", ")) + renderMeta();
    }

    private String renderMeta() {
        return Optional.ofNullable(alias).map(s -> String.format(" as %s", alias)).orElse("")
                + (countingProducts ? " counting products" : "");
    }
}
