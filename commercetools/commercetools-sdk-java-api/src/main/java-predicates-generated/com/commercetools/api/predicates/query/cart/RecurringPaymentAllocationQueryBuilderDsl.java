
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurringPaymentAllocationQueryBuilderDsl {
    public RecurringPaymentAllocationQueryBuilderDsl() {
    }

    public static RecurringPaymentAllocationQueryBuilderDsl of() {
        return new RecurringPaymentAllocationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringPaymentAllocationQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, RecurringPaymentAllocationQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringPaymentAllocationQueryBuilderDsl> paymentMethod(
            Function<com.commercetools.api.predicates.query.payment_method.PaymentMethodReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment_method.PaymentMethodReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("paymentMethod"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.payment_method.PaymentMethodReferenceQueryBuilderDsl.of())),
            RecurringPaymentAllocationQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringPaymentAllocationQueryBuilderDsl> allocation(
            Function<com.commercetools.api.predicates.query.cart.AllocationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.AllocationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("allocation"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.AllocationQueryBuilderDsl.of())),
            RecurringPaymentAllocationQueryBuilderDsl::of);
    }

}
