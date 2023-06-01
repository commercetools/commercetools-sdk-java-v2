package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartSetLineItemShippingDetailsActionQueryBuilderDsl  {
    public CartSetLineItemShippingDetailsActionQueryBuilderDsl() {
    }

    public static CartSetLineItemShippingDetailsActionQueryBuilderDsl of() {
        return new CartSetLineItemShippingDetailsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartSetLineItemShippingDetailsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartSetLineItemShippingDetailsActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<CartSetLineItemShippingDetailsActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
        p -> new CombinationQueryPredicate<>(p, CartSetLineItemShippingDetailsActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartSetLineItemShippingDetailsActionQueryBuilderDsl> shippingDetails(
        Function<com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("shippingDetails"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.ItemShippingDetailsDraftQueryBuilderDsl.of())),
            CartSetLineItemShippingDetailsActionQueryBuilderDsl::of);
    }
    
    
}
