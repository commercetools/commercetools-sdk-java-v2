
package com.commercetools.api.predicates.query.standalone_price;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StandalonePricePagedQueryResponseQueryBuilderDsl {
    public StandalonePricePagedQueryResponseQueryBuilderDsl() {
    }

    public static StandalonePricePagedQueryResponseQueryBuilderDsl of() {
        return new StandalonePricePagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<StandalonePricePagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, StandalonePricePagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StandalonePricePagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, StandalonePricePagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StandalonePricePagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, StandalonePricePagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StandalonePricePagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, StandalonePricePagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePricePagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.standalone_price.StandalonePriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StandalonePriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.standalone_price.StandalonePriceQueryBuilderDsl.of())),
            StandalonePricePagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StandalonePricePagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, StandalonePricePagedQueryResponseQueryBuilderDsl::of));
    }
}
