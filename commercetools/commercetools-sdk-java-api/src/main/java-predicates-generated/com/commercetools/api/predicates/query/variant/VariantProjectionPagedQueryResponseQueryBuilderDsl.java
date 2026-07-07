
package com.commercetools.api.predicates.query.variant;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantProjectionPagedQueryResponseQueryBuilderDsl {
    public VariantProjectionPagedQueryResponseQueryBuilderDsl() {
    }

    public static VariantProjectionPagedQueryResponseQueryBuilderDsl of() {
        return new VariantProjectionPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<VariantProjectionPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, VariantProjectionPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<VariantProjectionPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, VariantProjectionPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<VariantProjectionPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, VariantProjectionPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<VariantProjectionPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, VariantProjectionPagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantProjectionPagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.variant.VariantProjectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantProjectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("results"))
                .inner(fn.apply(com.commercetools.api.predicates.query.variant.VariantProjectionQueryBuilderDsl.of())),
            VariantProjectionPagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantProjectionPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, VariantProjectionPagedQueryResponseQueryBuilderDsl::of));
    }

}
