package com.commercetools.api.predicates.query.store;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StoreReferenceQueryBuilderDsl  {
    public StoreReferenceQueryBuilderDsl() {
    }

    public static StoreReferenceQueryBuilderDsl of() {
        return new StoreReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, StoreReferenceQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StoreReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, StoreReferenceQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreReferenceQueryBuilderDsl> obj(
        Function<com.commercetools.api.predicates.query.store.StoreQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("obj"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreQueryBuilderDsl.of())),
            StoreReferenceQueryBuilderDsl::of);
    }
    
    
}
