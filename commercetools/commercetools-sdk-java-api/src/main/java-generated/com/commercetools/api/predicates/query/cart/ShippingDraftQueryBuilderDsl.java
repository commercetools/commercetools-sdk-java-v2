
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ShippingDraftQueryBuilderDsl {
    public ShippingDraftQueryBuilderDsl() {
    }

    public static ShippingDraftQueryBuilderDsl of() {
        return new ShippingDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShippingDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ShippingDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShippingDraftQueryBuilderDsl> shippingMethod(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("shippingMethod"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.shipping_method.ShippingMethodReferenceQueryBuilderDsl
                            .of())),
            ShippingDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingDraftQueryBuilderDsl> shippingAddress(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingAddress"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            ShippingDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingDraftQueryBuilderDsl> shippingRateInput(
            Function<com.commercetools.api.predicates.query.cart.ShippingRateInputDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingRateInputDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingRateInput"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.ShippingRateInputDraftQueryBuilderDsl.of())),
            ShippingDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingDraftQueryBuilderDsl> externalTaxRate(
            Function<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("externalTaxRate"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl.of())),
            ShippingDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ShippingDraftQueryBuilderDsl> deliveries(
            Function<com.commercetools.api.predicates.query.order.DeliveryDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("deliveries"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryDraftQueryBuilderDsl.of())),
            ShippingDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ShippingDraftQueryBuilderDsl> deliveries() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveries")),
            p -> new CombinationQueryPredicate<>(p, ShippingDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ShippingDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            ShippingDraftQueryBuilderDsl::of);
    }

}
