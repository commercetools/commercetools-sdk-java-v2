
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShippingInfoImportDraftQueryBuilderDsl {
    public ShippingInfoImportDraftQueryBuilderDsl() {
    }

    public static ShippingInfoImportDraftQueryBuilderDsl of() {
        return new ShippingInfoImportDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingInfoImportDraftQueryBuilderDsl> shippingMethodName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingMethodName")),
            p -> new CombinationQueryPredicate<>(p, ShippingInfoImportDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShippingInfoImportDraftQueryBuilderDsl> price(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("price"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            ShippingInfoImportDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingInfoImportDraftQueryBuilderDsl> shippingRate(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingRate"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.shipping_method.ShippingRateDraftQueryBuilderDsl.of())),
            ShippingInfoImportDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingInfoImportDraftQueryBuilderDsl> taxRate(
            Function<com.commercetools.api.predicates.query.tax_category.TaxRateQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxRateQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxRate"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.tax_category.TaxRateQueryBuilderDsl.of())),
            ShippingInfoImportDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingInfoImportDraftQueryBuilderDsl> taxCategory(
            Function<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("taxCategory"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl
                            .of())),
            ShippingInfoImportDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingInfoImportDraftQueryBuilderDsl> shippingMethod(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("shippingMethod"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.shipping_method.ShippingMethodResourceIdentifierQueryBuilderDsl
                            .of())),
            ShippingInfoImportDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingInfoImportDraftQueryBuilderDsl> deliveries(
            Function<com.commercetools.api.predicates.query.order.DeliveryDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("deliveries"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryDraftQueryBuilderDsl.of())),
            ShippingInfoImportDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ShippingInfoImportDraftQueryBuilderDsl> deliveries() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveries")),
            p -> new CombinationQueryPredicate<>(p, ShippingInfoImportDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShippingInfoImportDraftQueryBuilderDsl> discountedPrice(
            Function<com.commercetools.api.predicates.query.order.DiscountedLineItemPriceDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DiscountedLineItemPriceDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("discountedPrice"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.order.DiscountedLineItemPriceDraftQueryBuilderDsl.of())),
            ShippingInfoImportDraftQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ShippingInfoImportDraftQueryBuilderDsl> shippingMethodState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingMethodState")),
            p -> new CombinationQueryPredicate<>(p, ShippingInfoImportDraftQueryBuilderDsl::of));
    }
}
