package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartAddCustomShippingMethodActionQueryBuilderDsl  {
    public CartAddCustomShippingMethodActionQueryBuilderDsl() {
    }

    public static CartAddCustomShippingMethodActionQueryBuilderDsl of() {
        return new CartAddCustomShippingMethodActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartAddCustomShippingMethodActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartAddCustomShippingMethodActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CartAddCustomShippingMethodActionQueryBuilderDsl> shippingKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingKey")),
        p -> new CombinationQueryPredicate<>(p, CartAddCustomShippingMethodActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CartAddCustomShippingMethodActionQueryBuilderDsl> shippingMethodName() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shippingMethodName")),
        p -> new CombinationQueryPredicate<>(p, CartAddCustomShippingMethodActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartAddCustomShippingMethodActionQueryBuilderDsl> shippingAddress(
        Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("shippingAddress"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            CartAddCustomShippingMethodActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<CartAddCustomShippingMethodActionQueryBuilderDsl> shippingRate(
        Function<com.commercetools.api.predicates.query.shipping_method.ShippingRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shipping_method.ShippingRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("shippingRate"))
            .inner(fn.apply(com.commercetools.api.predicates.query.shipping_method.ShippingRateDraftQueryBuilderDsl.of())),
            CartAddCustomShippingMethodActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<CartAddCustomShippingMethodActionQueryBuilderDsl> shippingRateInput(
        Function<com.commercetools.api.predicates.query.cart.ShippingRateInputDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingRateInputDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("shippingRateInput"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.ShippingRateInputDraftQueryBuilderDsl.of())),
            CartAddCustomShippingMethodActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<CartAddCustomShippingMethodActionQueryBuilderDsl> taxCategory(
        Function<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("taxCategory"))
            .inner(fn.apply(com.commercetools.api.predicates.query.tax_category.TaxCategoryResourceIdentifierQueryBuilderDsl.of())),
            CartAddCustomShippingMethodActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<CartAddCustomShippingMethodActionQueryBuilderDsl> externalTaxRate(
        Function<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("externalTaxRate"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.ExternalTaxRateDraftQueryBuilderDsl.of())),
            CartAddCustomShippingMethodActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<CartAddCustomShippingMethodActionQueryBuilderDsl> deliveries(
        Function<com.commercetools.api.predicates.query.order.DeliveryDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.DeliveryDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("deliveries"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.DeliveryDraftQueryBuilderDsl.of())),
            CartAddCustomShippingMethodActionQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<CartAddCustomShippingMethodActionQueryBuilderDsl> deliveries() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveries")),
                p -> new CombinationQueryPredicate<>(p, CartAddCustomShippingMethodActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartAddCustomShippingMethodActionQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            CartAddCustomShippingMethodActionQueryBuilderDsl::of);
    }
    
    
}
