
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartRemovePaymentActionQueryBuilderDsl {
    public CartRemovePaymentActionQueryBuilderDsl() {
    }

    public static CartRemovePaymentActionQueryBuilderDsl of() {
        return new CartRemovePaymentActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartRemovePaymentActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartRemovePaymentActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartRemovePaymentActionQueryBuilderDsl> payment(
            Function<com.commercetools.api.predicates.query.payment.PaymentResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("payment"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.payment.PaymentResourceIdentifierQueryBuilderDsl.of())),
            CartRemovePaymentActionQueryBuilderDsl::of);
    }

}
