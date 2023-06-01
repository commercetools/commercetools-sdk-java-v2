package com.commercetools.api.predicates.query.cart;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class CartAddPaymentActionQueryBuilderDsl  {
    public CartAddPaymentActionQueryBuilderDsl() {
    }

    public static CartAddPaymentActionQueryBuilderDsl of() {
        return new CartAddPaymentActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartAddPaymentActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, CartAddPaymentActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<CartAddPaymentActionQueryBuilderDsl> payment(
        Function<com.commercetools.api.predicates.query.payment.PaymentResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("payment"))
            .inner(fn.apply(com.commercetools.api.predicates.query.payment.PaymentResourceIdentifierQueryBuilderDsl.of())),
            CartAddPaymentActionQueryBuilderDsl::of);
    }
    
    
}
