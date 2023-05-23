
package com.commercetools.api.predicates.query;

import java.util.Arrays;
import java.util.Collection;
import java.util.function.Function;

public class GeoJsonPredicateBuilder<T> {
    private final BinaryQueryPredicate predicate;

    private final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn;

    public GeoJsonPredicateBuilder(final BinaryQueryPredicate predicate,
            final Function<QueryPredicate, CombinationQueryPredicate<T>> combinationFn) {
        this.predicate = predicate;
        this.combinationFn = combinationFn;
    }

    public CombinationQueryPredicate<T> withinCircle(final Double longitude, final Double latitude,
            final Long distance) {
        Collection<QueryPredicate> p = Arrays.asList(ConstantQueryPredicate.of().constant(longitude.toString()),
            ConstantQueryPredicate.of().constant(latitude.toString()),
            ConstantQueryPredicate.of().constant(distance.toString()));
        return combinationFn.apply(predicate.operator(PredicateOperator.WITHIN.toString())
                .right(ContainerQueryPredicate.of()
                        .parent(ConstantQueryPredicate.of().constant("circle"))
                        .inner(CollectionQueryPredicate.of().predicates(p))));
    }
}
