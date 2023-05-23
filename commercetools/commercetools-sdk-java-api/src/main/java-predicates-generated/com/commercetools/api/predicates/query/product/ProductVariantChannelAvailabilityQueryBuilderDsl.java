
package com.commercetools.api.predicates.query.product;

import com.commercetools.api.predicates.query.*;

public class ProductVariantChannelAvailabilityQueryBuilderDsl {
    public ProductVariantChannelAvailabilityQueryBuilderDsl() {
    }

    public static ProductVariantChannelAvailabilityQueryBuilderDsl of() {
        return new ProductVariantChannelAvailabilityQueryBuilderDsl();
    }

    public BooleanComparisonPredicateBuilder<ProductVariantChannelAvailabilityQueryBuilderDsl> isOnStock() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isOnStock")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantChannelAvailabilityQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductVariantChannelAvailabilityQueryBuilderDsl> restockableInDays() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("restockableInDays")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantChannelAvailabilityQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductVariantChannelAvailabilityQueryBuilderDsl> availableQuantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("availableQuantity")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantChannelAvailabilityQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductVariantChannelAvailabilityQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantChannelAvailabilityQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductVariantChannelAvailabilityQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantChannelAvailabilityQueryBuilderDsl::of));
    }

}
