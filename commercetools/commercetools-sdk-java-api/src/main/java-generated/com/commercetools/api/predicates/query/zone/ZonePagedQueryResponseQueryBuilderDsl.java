
package com.commercetools.api.predicates.query.zone;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ZonePagedQueryResponseQueryBuilderDsl {
    public ZonePagedQueryResponseQueryBuilderDsl() {
    }

    public static ZonePagedQueryResponseQueryBuilderDsl of() {
        return new ZonePagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ZonePagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, ZonePagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ZonePagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, ZonePagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ZonePagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, ZonePagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ZonePagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, ZonePagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ZonePagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.zone.ZoneQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.zone.ZoneQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.zone.ZoneQueryBuilderDsl.of())),
            ZonePagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ZonePagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, ZonePagedQueryResponseQueryBuilderDsl::of));
    }
}
