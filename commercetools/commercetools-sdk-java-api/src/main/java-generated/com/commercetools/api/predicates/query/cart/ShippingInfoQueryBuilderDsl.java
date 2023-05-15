
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShippingInfoQueryBuilderDsl {
    public ShippingInfoQueryBuilderDsl() {
    }

    public static ShippingInfoQueryBuilderDsl of() {
        return new ShippingInfoQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingInfoQueryBuilderDsl> shippingMethodName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingMethodName")),
            p -> new CombinationQueryPredicate<>(p, ShippingInfoQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShippingInfoQueryBuilderDsl> price(
            Function<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("price"))
                .inner(fn.apply(com.commercetools.api.predicates.query.common.CentPrecisionMoneyQueryBuilderDsl.of())),
            ShippingInfoQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingInfoQueryBuilderDsl> shippingRate(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingRateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingRateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingRate"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.shipping_method.ShippingRateQueryBuilderDsl.of())),
            ShippingInfoQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingInfoQueryBuilderDsl> taxedPrice(
            Function<com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxedPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.TaxedItemPriceQueryBuilderDsl.of())),
            ShippingInfoQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingInfoQueryBuilderDsl> taxRate(
            Function<com.commercetools.api.predicates.query.tax_category.TaxRateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxRateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxRate"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.tax_category.TaxRateQueryBuilderDsl.of())),
            ShippingInfoQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingInfoQueryBuilderDsl> taxCategory(
            Function<com.commercetools.api.predicates.query.tax_category.TaxCategoryReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategoryReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxCategory"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.tax_category.TaxCategoryReferenceQueryBuilderDsl.of())),
            ShippingInfoQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingInfoQueryBuilderDsl> shippingMethod(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("shippingMethod"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.shipping_method.ShippingMethodReferenceQueryBuilderDsl
                            .of())),
            ShippingInfoQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingInfoQueryBuilderDsl> deliveries(
            Function<com.commercetools.api.predicates.query.order.DeliveryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("deliveries"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryQueryBuilderDsl.of())),
            ShippingInfoQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ShippingInfoQueryBuilderDsl> deliveries() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveries")),
            p -> new CombinationQueryPredicate<>(p, ShippingInfoQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShippingInfoQueryBuilderDsl> discountedPrice(
            Function<com.commercetools.api.predicates.query.cart.DiscountedLineItemPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.DiscountedLineItemPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("discountedPrice"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.DiscountedLineItemPriceQueryBuilderDsl.of())),
            ShippingInfoQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ShippingInfoQueryBuilderDsl> shippingMethodState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingMethodState")),
            p -> new CombinationQueryPredicate<>(p, ShippingInfoQueryBuilderDsl::of));
    }
}
