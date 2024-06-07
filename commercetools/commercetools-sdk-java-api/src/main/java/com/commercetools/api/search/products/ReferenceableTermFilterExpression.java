
package com.commercetools.api.search.products;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import com.commercetools.api.models.Identifiable;

public class ReferenceableTermFilterExpression<T> extends TermFilterExpression<String> {

    public ReferenceableTermFilterExpression(PathExpression expression) {
        super(expression, TermFormatter::format);
    }

    public ReferenceableTermFilterExpression(PathExpression expression, List<FilterExpression> term) {
        super(expression, term, TermFormatter::format);
    }

    public ReferenceableTermFilterExpression<T> is(String value) {
        List<FilterExpression> terms = Optional.ofNullable(terms()).map(term -> {
            List<FilterExpression> expressions = new ArrayList<>(terms());
            expressions.add(formatter().apply(value));
            return expressions;
        }).orElse(Collections.singletonList(formatter().apply(value)));
        return new ReferenceableTermFilterExpression<>(expression(), terms);
    }

    public ReferenceableTermFilterExpression<T> is(Identifiable<T> value) {
        return is(value.getId());
    }

    public ReferenceableTermFilterExpression<T> isIn(Iterable<String> values) {
        List<FilterExpression> terms = Optional.ofNullable(terms()).map(term -> {
            List<FilterExpression> expressions = new ArrayList<>(terms());
            values.forEach(v -> expressions.add(formatter().apply(v)));
            return expressions;
        }).orElse(StreamSupport.stream(values.spliterator(), false).map(formatter()).collect(Collectors.toList()));

        return new ReferenceableTermFilterExpression<T>(expression(), terms);
    }

    public ReferenceableTermFilterExpression<T> containsAny(Iterable<Identifiable<T>> values) {
        return isIn(
            StreamSupport.stream(values.spliterator(), false).map(Identifiable::getId).collect(Collectors.toList()));
    }

    public static <T> ReferenceableTermFilterExpression<T> of(PathExpression expression) {
        return new ReferenceableTermFilterExpression<T>(expression);
    }
}
