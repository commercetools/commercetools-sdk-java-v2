package com.commercetools.api.predicates.query.custom_object;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CustomObjectPagedQueryResponseQueryBuilderDsl  {
    public CustomObjectPagedQueryResponseQueryBuilderDsl() {
    }

    public static CustomObjectPagedQueryResponseQueryBuilderDsl of() {
        return new CustomObjectPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<CustomObjectPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
        p -> new CombinationQueryPredicate<>(p, CustomObjectPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CustomObjectPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
        p -> new CombinationQueryPredicate<>(p, CustomObjectPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CustomObjectPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
        p -> new CombinationQueryPredicate<>(p, CustomObjectPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CustomObjectPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
        p -> new CombinationQueryPredicate<>(p, CustomObjectPagedQueryResponseQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CustomObjectPagedQueryResponseQueryBuilderDsl> results(
        Function<com.commercetools.api.predicates.query.custom_object.CustomObjectQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.custom_object.CustomObjectQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("results"))
            .inner(fn.apply(com.commercetools.api.predicates.query.custom_object.CustomObjectQueryBuilderDsl.of())),
            CustomObjectPagedQueryResponseQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<CustomObjectPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
                p -> new CombinationQueryPredicate<>(p, CustomObjectPagedQueryResponseQueryBuilderDsl::of));
    }
    
}
