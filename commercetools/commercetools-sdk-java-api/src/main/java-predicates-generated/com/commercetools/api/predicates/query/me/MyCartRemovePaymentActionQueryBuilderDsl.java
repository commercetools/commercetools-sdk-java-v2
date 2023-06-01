package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCartRemovePaymentActionQueryBuilderDsl  {
    public MyCartRemovePaymentActionQueryBuilderDsl() {
    }

    public static MyCartRemovePaymentActionQueryBuilderDsl of() {
        return new MyCartRemovePaymentActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartRemovePaymentActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyCartRemovePaymentActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MyCartRemovePaymentActionQueryBuilderDsl> payment(
        Function<com.commercetools.api.predicates.query.payment.PaymentResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("payment"))
            .inner(fn.apply(com.commercetools.api.predicates.query.payment.PaymentResourceIdentifierQueryBuilderDsl.of())),
            MyCartRemovePaymentActionQueryBuilderDsl::of);
    }
    
    
}
