
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CartAddRecurringPaymentAllocationActionQueryBuilderDsl {
    public CartAddRecurringPaymentAllocationActionQueryBuilderDsl() {
    }

    public static CartAddRecurringPaymentAllocationActionQueryBuilderDsl of() {
        return new CartAddRecurringPaymentAllocationActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<CartAddRecurringPaymentAllocationActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, CartAddRecurringPaymentAllocationActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<CartAddRecurringPaymentAllocationActionQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, CartAddRecurringPaymentAllocationActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<CartAddRecurringPaymentAllocationActionQueryBuilderDsl> paymentMethod(
            Function<com.commercetools.api.predicates.query.payment_method.PaymentMethodReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment_method.PaymentMethodReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("paymentMethod"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.payment_method.PaymentMethodReferenceQueryBuilderDsl.of())),
            CartAddRecurringPaymentAllocationActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<CartAddRecurringPaymentAllocationActionQueryBuilderDsl> allocation(
            Function<com.commercetools.api.predicates.query.cart.AllocationDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.AllocationDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("allocation"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.AllocationDraftQueryBuilderDsl.of())),
            CartAddRecurringPaymentAllocationActionQueryBuilderDsl::of);
    }

}
