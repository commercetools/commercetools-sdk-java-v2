package com.commercetools.api.predicates.query.payment;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class PaymentReferenceQueryBuilderDsl  {
    public PaymentReferenceQueryBuilderDsl() {
    }

    public static PaymentReferenceQueryBuilderDsl of() {
        return new PaymentReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, PaymentReferenceQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<PaymentReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, PaymentReferenceQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PaymentReferenceQueryBuilderDsl> obj(
        Function<com.commercetools.api.predicates.query.payment.PaymentQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("obj"))
            .inner(fn.apply(com.commercetools.api.predicates.query.payment.PaymentQueryBuilderDsl.of())),
            PaymentReferenceQueryBuilderDsl::of);
    }
    
    
}
