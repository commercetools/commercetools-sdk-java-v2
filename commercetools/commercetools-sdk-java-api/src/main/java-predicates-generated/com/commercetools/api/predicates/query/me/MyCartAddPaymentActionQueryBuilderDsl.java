package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCartAddPaymentActionQueryBuilderDsl  {
    public MyCartAddPaymentActionQueryBuilderDsl() {
    }

    public static MyCartAddPaymentActionQueryBuilderDsl of() {
        return new MyCartAddPaymentActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartAddPaymentActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyCartAddPaymentActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MyCartAddPaymentActionQueryBuilderDsl> payment(
        Function<com.commercetools.api.predicates.query.payment.PaymentResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("payment"))
            .inner(fn.apply(com.commercetools.api.predicates.query.payment.PaymentResourceIdentifierQueryBuilderDsl.of())),
            MyCartAddPaymentActionQueryBuilderDsl::of);
    }
    
    
}
