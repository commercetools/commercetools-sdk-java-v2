
package com.commercetools.api.search.products;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class TermFacetExpression<T> implements FacetExpression<T> {

    private final PathExpression expression;

    private final List<FilterExpression> terms;

    private final Function<T, FilterExpression> formatter;

    private final boolean countingProducts;

    private final String alias;

    TermFacetExpression(final PathExpression expression, final Function<T, FilterExpression> formatter) {
        this.expression = expression;
        this.terms = null;
        this.formatter = formatter;
        this.alias = null;
        this.countingProducts = false;
    }

    TermFacetExpression(final PathExpression expression, final List<FilterExpression> terms,
            final Function<T, FilterExpression> formatter) {
        this.expression = expression;
        this.terms = terms;
        this.formatter = formatter;
        this.alias = null;
        this.countingProducts = false;
    }

    TermFacetExpression(final PathExpression expression, final List<FilterExpression> terms,
            final Function<T, FilterExpression> formatter, final String alias, final boolean countingProducts) {
        this.expression = expression;
        this.terms = terms;
        this.formatter = formatter;
        this.alias = alias;
        this.countingProducts = countingProducts;
    }

    PathExpression expression() {
        return expression;
    }

    List<FilterExpression> terms() {
        return terms;
    }

    Function<T, FilterExpression> formatter() {
        return formatter;
    }

    public TermFacetExpression<T> alias(final String alias) {
        return new TermFacetExpression<>(expression, terms, formatter, alias, countingProducts);
    }

    public TermFacetExpression<T> countingProducts() {
        return new TermFacetExpression<>(expression, terms, formatter, alias, true);
    }

    public TermFacetExpression<T> is(final T value) {
        List<FilterExpression> terms = Optional.ofNullable(terms()).map(termList -> {
            List<FilterExpression> expressions = new ArrayList<>(termList);
            expressions.add(formatter().apply(value));
            return expressions;
        }).orElse(Collections.singletonList(formatter().apply(value)));
        return new TermFacetExpression<>(expression, terms, formatter, alias, countingProducts);
    }

    public TermFacetExpression<T> isIn(final Iterable<T> values) {
        List<FilterExpression> terms = Optional.ofNullable(terms()).map(termList -> {
            List<FilterExpression> expressions = new ArrayList<>(termList);
            values.forEach(v -> expressions.add(formatter().apply(v)));
            return expressions;
        }).orElse(StreamSupport.stream(values.spliterator(), false).map(formatter()).collect(Collectors.toList()));

        return new TermFacetExpression<>(expression, terms, formatter, alias, countingProducts);
    }

    public RangeFacetExpression<T> ranges() {
        return new RangeFacetExpression<>(expression, null, formatter, alias, countingProducts);
    }

    public static <T> TermFacetExpression<T> of(final PathExpression expression,
            final Function<T, FilterExpression> formatter) {
        return new TermFacetExpression<>(expression, formatter);
    }

    public static <T> TermFacetExpression<T> of(final PathExpression expression, final List<FilterExpression> terms,
            Function<T, FilterExpression> formatter) {
        return new TermFacetExpression<>(expression, terms, formatter);
    }

    public static <T> TermFacetExpression<T> of(final PathExpression expression, final List<FilterExpression> terms,
            final Function<T, FilterExpression> formatter, final String alias, final boolean countingProducts) {
        return new TermFacetExpression<>(expression, terms, formatter, alias, countingProducts);
    }

    @Override
    public String render() {
        if (terms == null || terms.isEmpty()) {
            return expression.render() + renderMeta();
        }
        return expression.render() + ": "
                + terms.stream().map(FilterExpression::render).collect(Collectors.joining(", ")) + renderMeta();
    }

    private String renderMeta() {
        return Optional.ofNullable(alias).map(s -> String.format(" as %s", alias)).orElse("")
                + (countingProducts ? " counting products" : "");
    }
}
