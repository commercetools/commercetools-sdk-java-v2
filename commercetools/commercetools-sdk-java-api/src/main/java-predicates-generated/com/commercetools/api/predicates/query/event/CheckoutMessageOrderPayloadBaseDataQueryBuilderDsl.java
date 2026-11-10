
package com.commercetools.api.predicates.query.event;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CheckoutMessageOrderPayloadBaseDataQueryBuilderDsl {
    public CheckoutMessageOrderPayloadBaseDataQueryBuilderDsl() {
    }

    public static CheckoutMessageOrderPayloadBaseDataQueryBuilderDsl of() {
        return new CheckoutMessageOrderPayloadBaseDataQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CheckoutMessageOrderPayloadBaseDataQueryBuilderDsl> projectKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("projectKey")),
            p -> new CombinationQueryPredicate<>(p, CheckoutMessageOrderPayloadBaseDataQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CheckoutMessageOrderPayloadBaseDataQueryBuilderDsl> cart(
            Function<com.commercetools.api.predicates.query.cart.CartReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("cart"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.CartReferenceQueryBuilderDsl.of())),
            CheckoutMessageOrderPayloadBaseDataQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CheckoutMessageOrderPayloadBaseDataQueryBuilderDsl> payments(
            Function<com.commercetools.api.predicates.query.payment.PaymentReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("payments"))
                .inner(fn.apply(com.commercetools.api.predicates.query.payment.PaymentReferenceQueryBuilderDsl.of())),
            CheckoutMessageOrderPayloadBaseDataQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CheckoutMessageOrderPayloadBaseDataQueryBuilderDsl> payments() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("payments")),
            p -> new CombinationQueryPredicate<>(p, CheckoutMessageOrderPayloadBaseDataQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CheckoutMessageOrderPayloadBaseDataQueryBuilderDsl> errors(
            Function<com.commercetools.api.predicates.query.error.ErrorObjectQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.error.ErrorObjectQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("errors"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.error.ErrorObjectQueryBuilderDsl.of())),
            CheckoutMessageOrderPayloadBaseDataQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<CheckoutMessageOrderPayloadBaseDataQueryBuilderDsl> errors() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("errors")),
            p -> new CombinationQueryPredicate<>(p, CheckoutMessageOrderPayloadBaseDataQueryBuilderDsl::of));
    }

}
