
package com.commercetools.api.predicates.query.cart;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentAllocationDraftQueryBuilderDsl {
    public PaymentAllocationDraftQueryBuilderDsl() {
    }

    public static PaymentAllocationDraftQueryBuilderDsl of() {
        return new PaymentAllocationDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentAllocationDraftQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, PaymentAllocationDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentAllocationDraftQueryBuilderDsl> paymentMethod(
            Function<com.commercetools.api.predicates.query.payment_method.PaymentMethodReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment_method.PaymentMethodReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("paymentMethod"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.payment_method.PaymentMethodReferenceQueryBuilderDsl.of())),
            PaymentAllocationDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<PaymentAllocationDraftQueryBuilderDsl> allocation(
            Function<com.commercetools.api.predicates.query.cart.AllocationDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.AllocationDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("allocation"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.AllocationDraftQueryBuilderDsl.of())),
            PaymentAllocationDraftQueryBuilderDsl::of);
    }

}
