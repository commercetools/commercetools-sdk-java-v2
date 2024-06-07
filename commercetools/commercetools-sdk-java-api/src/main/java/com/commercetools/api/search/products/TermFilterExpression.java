
package com.commercetools.api.search.products;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class TermFilterExpression<T> implements FilterExpression {

    private final PathExpression expression;

    private final List<FilterExpression> terms;

    private final Function<T, FilterExpression> formatter;

    public TermFilterExpression(PathExpression expression, Function<T, FilterExpression> formatter) {
        this.expression = expression;
        this.terms = null;
        this.formatter = formatter;
    }

    public TermFilterExpression(PathExpression expression, List<FilterExpression> terms,
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

    public TermFilterExpression<T> is(T value) {
        List<FilterExpression> terms = Optional.ofNullable(terms()).map(termList -> {
            List<FilterExpression> expressions = new ArrayList<>(termList);
            expressions.add(formatter().apply(value));
            return expressions;
        }).orElse(Collections.singletonList(formatter().apply(value)));
        return TermFilterExpression.of(expression, terms, formatter);
    }

    public TermFilterExpression<T> isIn(Iterable<T> values) {
        List<FilterExpression> terms = Optional.ofNullable(terms()).map(termList -> {
            List<FilterExpression> expressions = new ArrayList<>(termList);
            values.forEach(v -> expressions.add(formatter().apply(v)));
            return expressions;
        }).orElse(StreamSupport.stream(values.spliterator(), false).map(formatter()).collect(Collectors.toList()));

        return TermFilterExpression.of(expression, terms, formatter);
    }

    public static <T> TermFilterExpression<T> of(PathExpression expression, Function<T, FilterExpression> formatter) {
        return new TermFilterExpression<>(expression, formatter);
    }

    public static <T> TermFilterExpression<T> of(PathExpression expression, List<FilterExpression> terms,
            Function<T, FilterExpression> formatter) {
        return new TermFilterExpression<>(expression, terms, formatter);
    }

    public FilterExpression exists() {
        return new ExistsTermFilterExpression(expression()).exists();
    }

    public FilterExpression missing() {
        return new ExistsTermFilterExpression(expression()).missing();
    }

    @Override
    public String render() {
        Objects.requireNonNull(terms);
        return expression.render() + ": "
                + terms.stream().map(FilterExpression::render).collect(Collectors.joining(", "));
    }
}
