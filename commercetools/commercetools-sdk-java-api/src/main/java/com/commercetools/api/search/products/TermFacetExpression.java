
package com.commercetools.api.search.products;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class TermFacetExpression<T> implements FilterExpression {

    private final PathExpression expression;

    private final List<FilterExpression> terms;

    private final Function<T, FilterExpression> formatter;

    public TermFacetExpression(PathExpression expression, Function<T, FilterExpression> formatter) {
        this.expression = expression;
        this.terms = null;
        this.formatter = formatter;
    }

    public TermFacetExpression(PathExpression expression, List<FilterExpression> terms,
            Function<T, FilterExpression> formatter) {
        this.expression = expression;
        this.terms = terms;
        this.formatter = formatter;
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

    public FilterExpression alias(final String alias) {
        return ContainerExpression.of(this, ConstantExpression.of(String.format("as %s", alias)), true);
    }

    public TermFacetExpression<T> is(T value) {
        List<FilterExpression> terms = Optional.ofNullable(terms()).map(termList -> {
            List<FilterExpression> expressions = new ArrayList<>(termList);
            expressions.add(formatter().apply(value));
            return expressions;
        }).orElse(Collections.singletonList(formatter().apply(value)));
        return TermFacetExpression.of(expression, terms, formatter);
    }

    public TermFacetExpression<T> isIn(Iterable<T> values) {
        List<FilterExpression> terms = Optional.ofNullable(terms()).map(termList -> {
            List<FilterExpression> expressions = new ArrayList<>(termList);
            values.forEach(v -> expressions.add(formatter().apply(v)));
            return expressions;
        }).orElse(StreamSupport.stream(values.spliterator(), false).map(formatter()).collect(Collectors.toList()));

        return TermFacetExpression.of(expression, terms, formatter);
    }

    public static <T> TermFacetExpression<T> of(PathExpression expression, Function<T, FilterExpression> formatter) {
        return new TermFacetExpression<>(expression, formatter);
    }

    public static <T> TermFacetExpression<T> of(PathExpression expression, List<FilterExpression> terms,
            Function<T, FilterExpression> formatter) {
        return new TermFacetExpression<>(expression, terms, formatter);
    }

    @Override
    public String render() {
        if (terms == null || terms.isEmpty()) {
            return expression.render();
        }
        return expression.render() + ": "
                + terms.stream().map(FilterExpression::render).collect(Collectors.joining(", "));
    }
}
