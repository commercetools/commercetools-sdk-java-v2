
package com.commercetools.api.search.products;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.commercetools.api.models.Identifiable;
import com.commercetools.api.models.category.Category;

public class CategoryTermFacetExpression extends TermFacetExpression<String> {

    public CategoryTermFacetExpression(PathExpression expression) {
        super(expression, TermFormatter::format);
    }

    public CategoryTermFacetExpression(PathExpression expression, List<FilterExpression> term) {
        super(expression, term, TermFormatter::format);
    }

    public CategoryTermFacetExpression is(String value) {
        List<FilterExpression> terms = Optional.ofNullable(terms()).map(term -> {
            List<FilterExpression> expressions = new ArrayList<>(terms());
            expressions.add(formatter().apply(value));
            return expressions;
        }).orElse(Collections.singletonList(formatter().apply(value)));
        return new CategoryTermFacetExpression(expression(), terms);
    }

    public CategoryTermFacetExpression is(Identifiable<Category> value) {
        return is(value.getId());
    }

    public CategoryTermFacetExpression subTree(String value) {
        List<FilterExpression> terms = Optional.ofNullable(terms()).map(term -> {
            List<FilterExpression> expressions = new ArrayList<>(terms());
            expressions.add(
                ContainerExpression.of().parent(ConstantExpression.of("subTree")).inner(formatter().apply(value)));
            return expressions;
        })
                .orElse(Collections.singletonList(
                    ContainerExpression.of().parent(ConstantExpression.of("subTree")).inner(formatter().apply(value))));
        return new CategoryTermFacetExpression(expression(), terms);
    }

    public CategoryTermFacetExpression subTree(Identifiable<Category> value) {
        return subTree(value.getId());
    }

    public CategoryTermFacetExpression isIn(Iterable<String> values) {
        List<FilterExpression> terms = Optional.ofNullable(terms()).map(term -> {
            List<FilterExpression> expressions = new ArrayList<>(terms());
            values.forEach(v -> expressions.add(formatter().apply(v)));
            return expressions;
        }).orElse(StreamSupport.stream(values.spliterator(), false).map(formatter()).collect(Collectors.toList()));

        return new CategoryTermFacetExpression(expression(), terms);
    }

    public CategoryTermFacetExpression containsAny(Iterable<Identifiable<Category>> values) {
        return isIn(
            StreamSupport.stream(values.spliterator(), false).map(Identifiable::getId).collect(Collectors.toList()));
    }

    public static CategoryTermFacetExpression of(PathExpression expression) {
        return new CategoryTermFacetExpression(expression);
    }
}
