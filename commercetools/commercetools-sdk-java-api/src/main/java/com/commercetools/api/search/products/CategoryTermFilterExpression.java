
package com.commercetools.api.search.products;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.commercetools.api.models.Identifiable;
import com.commercetools.api.models.category.Category;

public class CategoryTermFilterExpression extends TermFilterExpression<String> {

    public CategoryTermFilterExpression(PathExpression expression) {
        super(expression, TermFormatter::format);
    }

    public CategoryTermFilterExpression(PathExpression expression, List<FilterExpression> term) {
        super(expression, term, TermFormatter::format);
    }

    public CategoryTermFilterExpression is(String value) {
        List<FilterExpression> terms = Optional.ofNullable(terms()).map(term -> {
            List<FilterExpression> expressions = new ArrayList<>(terms());
            expressions.add(formatter().apply(value));
            return expressions;
        }).orElse(Collections.singletonList(formatter().apply(value)));
        return new CategoryTermFilterExpression(expression(), terms);
    }

    public CategoryTermFilterExpression is(Identifiable<Category> value) {
        return is(value.getId());
    }

    public CategoryTermFilterExpression subTree(String value) {
        List<FilterExpression> terms = Optional.ofNullable(terms()).map(term -> {
            List<FilterExpression> expressions = new ArrayList<>(terms());
            expressions.add(
                ContainerExpression.of().parent(ConstantExpression.of("subTree")).inner(formatter().apply(value)));
            return expressions;
        })
                .orElse(Collections.singletonList(
                    ContainerExpression.of().parent(ConstantExpression.of("subTree")).inner(formatter().apply(value))));
        return new CategoryTermFilterExpression(expression(), terms);
    }

    public CategoryTermFilterExpression subTree(Identifiable<Category> value) {
        return subTree(value.getId());
    }

    public CategoryTermFilterExpression isIn(Iterable<String> values) {
        List<FilterExpression> terms = Optional.ofNullable(terms()).map(term -> {
            List<FilterExpression> expressions = new ArrayList<>(terms());
            values.forEach(v -> expressions.add(formatter().apply(v)));
            return expressions;
        }).orElse(StreamSupport.stream(values.spliterator(), false).map(formatter()).collect(Collectors.toList()));

        return new CategoryTermFilterExpression(expression(), terms);
    }

    public CategoryTermFilterExpression containsAny(Iterable<Identifiable<Category>> values) {
        return isIn(
            StreamSupport.stream(values.spliterator(), false).map(Identifiable::getId).collect(Collectors.toList()));
    }

    public static CategoryTermFilterExpression of(PathExpression expression) {
        return new CategoryTermFilterExpression(expression);
    }
}
