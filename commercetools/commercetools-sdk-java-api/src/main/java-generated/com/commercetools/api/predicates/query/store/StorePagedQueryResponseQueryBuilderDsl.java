
package com.commercetools.api.predicates.query.store;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StorePagedQueryResponseQueryBuilderDsl {
    public StorePagedQueryResponseQueryBuilderDsl() {
    }

    public static StorePagedQueryResponseQueryBuilderDsl of() {
        return new StorePagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<StorePagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, StorePagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StorePagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, StorePagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StorePagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, StorePagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StorePagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, StorePagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StorePagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.store.StoreQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreQueryBuilderDsl.of())),
            StorePagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StorePagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, StorePagedQueryResponseQueryBuilderDsl::of));
    }
}
