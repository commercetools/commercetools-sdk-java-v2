
package com.commercetools.api.predicates.query.event;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl {
    public CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl() {
    }

    public static CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl of() {
        return new CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl> projectKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("projectKey")),
            p -> new CombinationQueryPredicate<>(p, CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl> payment(
            Function<com.commercetools.api.predicates.query.payment.PaymentReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("payment"))
                .inner(fn.apply(com.commercetools.api.predicates.query.payment.PaymentReferenceQueryBuilderDsl.of())),
            CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl> transactionId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("transactionId")),
            p -> new CombinationQueryPredicate<>(p, CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl> cart(
            Function<com.commercetools.api.predicates.query.cart.CartReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("cart"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.CartReferenceQueryBuilderDsl.of())),
            CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl> order(
            Function<com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("order"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl.of())),
            CheckoutMessagePaymentsPayloadBaseDataQueryBuilderDsl::of);
    }

}
