
package com.commercetools.api.predicates.query.variant;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantBulkUpdateResponseQueryBuilderDsl {
    public VariantBulkUpdateResponseQueryBuilderDsl() {
    }

    public static VariantBulkUpdateResponseQueryBuilderDsl of() {
        return new VariantBulkUpdateResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<VariantBulkUpdateResponseQueryBuilderDsl> successCount() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("successCount")),
            p -> new CombinationQueryPredicate<>(p, VariantBulkUpdateResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<VariantBulkUpdateResponseQueryBuilderDsl> failureCount() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("failureCount")),
            p -> new CombinationQueryPredicate<>(p, VariantBulkUpdateResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantBulkUpdateResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.variant.VariantBulkUpdateResultQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantBulkUpdateResultQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.variant.VariantBulkUpdateResultQueryBuilderDsl.of())),
            VariantBulkUpdateResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<VariantBulkUpdateResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, VariantBulkUpdateResponseQueryBuilderDsl::of));
    }

}
