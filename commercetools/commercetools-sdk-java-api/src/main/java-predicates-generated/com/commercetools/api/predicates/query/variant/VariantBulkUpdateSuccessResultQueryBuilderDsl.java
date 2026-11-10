
package com.commercetools.api.predicates.query.variant;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class VariantBulkUpdateSuccessResultQueryBuilderDsl {
    public VariantBulkUpdateSuccessResultQueryBuilderDsl() {
    }

    public static VariantBulkUpdateSuccessResultQueryBuilderDsl of() {
        return new VariantBulkUpdateSuccessResultQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<VariantBulkUpdateSuccessResultQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, VariantBulkUpdateSuccessResultQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantBulkUpdateSuccessResultQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, VariantBulkUpdateSuccessResultQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<VariantBulkUpdateSuccessResultQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
            p -> new CombinationQueryPredicate<>(p, VariantBulkUpdateSuccessResultQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<VariantBulkUpdateSuccessResultQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.variant.VariantBulkUpdateResourceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.variant.VariantBulkUpdateResourceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.variant.VariantBulkUpdateResourceQueryBuilderDsl.of())),
            VariantBulkUpdateSuccessResultQueryBuilderDsl::of);
    }

}
