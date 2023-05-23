
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomShippingDraftQueryBuilderDsl {
    public CustomShippingDraftQueryBuilderDsl() {
    }

    public static CustomShippingDraftQueryBuilderDsl of() {
        return new CustomShippingDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CustomShippingDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, CustomShippingDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CustomShippingDraftQueryBuilderDsl> shippingMethodName() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingMethodName")),
            p -> new CombinationQueryPredicate<>(p, CustomShippingDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomShippingDraftQueryBuilderDsl> shippingAddress(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingAddress"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            CustomShippingDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomShippingDraftQueryBuilderDsl> shippingRate(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingRate"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.shipping_method.ShippingRateDraftQueryBuilderDsl.of())),
            CustomShippingDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomShippingDraftQueryBuilderDsl> shippingRateInput(
            Function<com.commercetools.api.predicates.query.cart.ShippingRateInputDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingRateInputDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingRateInput"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.ShippingRateInputDraftQueryBuilderDsl.of())),
            CustomShippingDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomShippingDraftQueryBuilderDsl> taxCategory(
            Function<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("taxCategory"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl
                            .of())),
            CustomShippingDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomShippingDraftQueryBuilderDsl> externalTaxRate(
            Function<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("externalTaxRate"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl.of())),
            CustomShippingDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CustomShippingDraftQueryBuilderDsl> deliveries(
            Function<com.commercetools.api.predicates.query.order.DeliveryDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("deliveries"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryDraftQueryBuilderDsl.of())),
            CustomShippingDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CustomShippingDraftQueryBuilderDsl> deliveries() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveries")),
            p -> new CombinationQueryPredicate<>(p, CustomShippingDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CustomShippingDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            CustomShippingDraftQueryBuilderDsl::of);
    }

}
