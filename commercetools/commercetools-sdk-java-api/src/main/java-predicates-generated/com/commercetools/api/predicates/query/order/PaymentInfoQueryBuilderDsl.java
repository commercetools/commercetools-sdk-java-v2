package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class PaymentInfoQueryBuilderDsl  {
    public PaymentInfoQueryBuilderDsl() {
    }

    public static PaymentInfoQueryBuilderDsl of() {
        return new PaymentInfoQueryBuilderDsl();
    }

    public CombinationQueryPredicate<PaymentInfoQueryBuilderDsl> payments(
        Function<com.commercetools.api.predicates.query.payment.PaymentReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("payments"))
            .inner(fn.apply(com.commercetools.api.predicates.query.payment.PaymentReferenceQueryBuilderDsl.of())),
            PaymentInfoQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<PaymentInfoQueryBuilderDsl> payments() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("payments")),
                p -> new CombinationQueryPredicate<>(p, PaymentInfoQueryBuilderDsl::of));
    }
    
}
