
package com.commercetools.api.predicates.query.variant;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantPagedQueryResponseQueryBuilderDsl {
    public VariantPagedQueryResponseQueryBuilderDsl() {
    }

    public static VariantPagedQueryResponseQueryBuilderDsl of() {
        return new VariantPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<VariantPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, VariantPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<VariantPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, VariantPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<VariantPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, VariantPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<VariantPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, VariantPagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantPagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.variant.VariantQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.variant.VariantQueryBuilderDsl.of())),
            VariantPagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, VariantPagedQueryResponseQueryBuilderDsl::of));
    }

}
