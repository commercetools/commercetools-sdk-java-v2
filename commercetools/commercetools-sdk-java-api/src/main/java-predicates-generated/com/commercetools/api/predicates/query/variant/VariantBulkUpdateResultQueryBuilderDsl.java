
package com.commercetools.api.predicates.query.variant;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantBulkUpdateResultQueryBuilderDsl {
    public VariantBulkUpdateResultQueryBuilderDsl() {
    }

    public static VariantBulkUpdateResultQueryBuilderDsl of() {
        return new VariantBulkUpdateResultQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantBulkUpdateResultQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, VariantBulkUpdateResultQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantBulkUpdateResultQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, VariantBulkUpdateResultQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantBulkUpdateResultQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
            p -> new CombinationQueryPredicate<>(p, VariantBulkUpdateResultQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantBulkUpdateResultQueryBuilderDsl> asFail(
            Function<com.commercetools.api.predicates.query.variant.VariantBulkUpdateFailResultQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantBulkUpdateFailResultQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.variant.VariantBulkUpdateFailResultQueryBuilderDsl.of()),
            VariantBulkUpdateResultQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<VariantBulkUpdateResultQueryBuilderDsl> asSuccess(
            Function<com.commercetools.api.predicates.query.variant.VariantBulkUpdateSuccessResultQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantBulkUpdateSuccessResultQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.variant.VariantBulkUpdateSuccessResultQueryBuilderDsl.of()),
            VariantBulkUpdateResultQueryBuilderDsl::of);
    }
}
