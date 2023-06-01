package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartRemoveLineItemActionQueryBuilderDsl  {
    public CartRemoveLineItemActionQueryBuilderDsl() {
    }

    public static CartRemoveLineItemActionQueryBuilderDsl of() {
        return new CartRemoveLineItemActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartRemoveLineItemActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartRemoveLineItemActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CartRemoveLineItemActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
        p -> new CombinationQueryPredicate<>(p, CartRemoveLineItemActionQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<CartRemoveLineItemActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
        p -> new CombinationQueryPredicate<>(p, CartRemoveLineItemActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartRemoveLineItemActionQueryBuilderDsl> externalPrice(
        Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("externalPrice"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            CartRemoveLineItemActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<CartRemoveLineItemActionQueryBuilderDsl> externalTotalPrice(
        Function<com.commercetools.api.predicates.query.cart.ExternalLineItemTotalPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ExternalLineItemTotalPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("externalTotalPrice"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.ExternalLineItemTotalPriceQueryBuilderDsl.of())),
            CartRemoveLineItemActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<CartRemoveLineItemActionQueryBuilderDsl> shippingDetailsToRemove(
        Function<com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("shippingDetailsToRemove"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl.of())),
            CartRemoveLineItemActionQueryBuilderDsl::of);
    }
    
    
}
