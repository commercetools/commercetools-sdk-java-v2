package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderPaymentAddedMessagePayloadQueryBuilderDsl  {
    public OrderPaymentAddedMessagePayloadQueryBuilderDsl() {
    }

    public static OrderPaymentAddedMessagePayloadQueryBuilderDsl of() {
        return new OrderPaymentAddedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderPaymentAddedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, OrderPaymentAddedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderPaymentAddedMessagePayloadQueryBuilderDsl> payment(
        Function<com.commercetools.api.predicates.query.payment.PaymentReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.PaymentReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("payment"))
            .inner(fn.apply(com.commercetools.api.predicates.query.payment.PaymentReferenceQueryBuilderDsl.of())),
            OrderPaymentAddedMessagePayloadQueryBuilderDsl::of);
    }
    
    
}
