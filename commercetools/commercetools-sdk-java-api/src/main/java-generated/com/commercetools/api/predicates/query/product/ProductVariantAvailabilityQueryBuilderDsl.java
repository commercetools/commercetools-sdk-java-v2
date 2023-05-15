
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductVariantAvailabilityQueryBuilderDsl {
    public ProductVariantAvailabilityQueryBuilderDsl() {
    }

    public static ProductVariantAvailabilityQueryBuilderDsl of() {
        return new ProductVariantAvailabilityQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductVariantAvailabilityQueryBuilderDsl> channels(
            Function<com.commercetools.api.predicates.query.product.ProductVariantChannelAvailabilityMapQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductVariantChannelAvailabilityMapQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("channels"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product.ProductVariantChannelAvailabilityMapQueryBuilderDsl
                            .of())),
            ProductVariantAvailabilityQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductVariantAvailabilityQueryBuilderDsl> isOnStock() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("isOnStock")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantAvailabilityQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductVariantAvailabilityQueryBuilderDsl> restockableInDays() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("restockableInDays")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantAvailabilityQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductVariantAvailabilityQueryBuilderDsl> availableQuantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("availableQuantity")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantAvailabilityQueryBuilderDsl::of));
    }
}
