
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartAddShippingMethodActionQueryBuilderDsl {
    public CartAddShippingMethodActionQueryBuilderDsl() {
    }

    public static CartAddShippingMethodActionQueryBuilderDsl of() {
        return new CartAddShippingMethodActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartAddShippingMethodActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartAddShippingMethodActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartAddShippingMethodActionQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
            p -> new CombinationQueryPredicate<>(p, CartAddShippingMethodActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartAddShippingMethodActionQueryBuilderDsl> shippingMethod(
            Function<com.commercetools.api.predicates.query.shipping_method.ShippingMethodResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingMethodResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("shippingMethod"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.shipping_method.ShippingMethodResourceIdentifierQueryBuilderDsl
                            .of())),
            CartAddShippingMethodActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartAddShippingMethodActionQueryBuilderDsl> shippingAddress(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingAddress"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            CartAddShippingMethodActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartAddShippingMethodActionQueryBuilderDsl> shippingRateInput(
            Function<com.commercetools.api.predicates.query.cart.ShippingRateInputDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingRateInputDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingRateInput"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.cart.ShippingRateInputDraftQueryBuilderDsl.of())),
            CartAddShippingMethodActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartAddShippingMethodActionQueryBuilderDsl> externalTaxRate(
            Function<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("externalTaxRate"))
                .inner(fn.apply(com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl.of())),
            CartAddShippingMethodActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartAddShippingMethodActionQueryBuilderDsl> deliveries(
            Function<com.commercetools.api.predicates.query.order.DeliveryDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("deliveries"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryDraftQueryBuilderDsl.of())),
            CartAddShippingMethodActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CartAddShippingMethodActionQueryBuilderDsl> deliveries() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveries")),
            p -> new CombinationQueryPredicate<>(p, CartAddShippingMethodActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartAddShippingMethodActionQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            CartAddShippingMethodActionQueryBuilderDsl::of);
    }

}
