package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderAddPaymentActionQueryBuilderDsl  {
    public OrderAddPaymentActionQueryBuilderDsl() {
    }

    public static OrderAddPaymentActionQueryBuilderDsl of() {
        return new OrderAddPaymentActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderAddPaymentActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, OrderAddPaymentActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderAddPaymentActionQueryBuilderDsl> payment(
        Function<com.commercetools.api.predicates.query.payment.PaymentResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("payment"))
            .inner(fn.apply(com.commercetools.api.predicates.query.payment.PaymentResourceIdentifierQueryBuilderDsl.of())),
            OrderAddPaymentActionQueryBuilderDsl::of);
    }
    
    
}
