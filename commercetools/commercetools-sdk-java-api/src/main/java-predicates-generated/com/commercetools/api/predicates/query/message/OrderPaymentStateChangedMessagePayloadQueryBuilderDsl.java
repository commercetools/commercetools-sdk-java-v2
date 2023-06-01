package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderPaymentStateChangedMessagePayloadQueryBuilderDsl  {
    public OrderPaymentStateChangedMessagePayloadQueryBuilderDsl() {
    }

    public static OrderPaymentStateChangedMessagePayloadQueryBuilderDsl of() {
        return new OrderPaymentStateChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderPaymentStateChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, OrderPaymentStateChangedMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderPaymentStateChangedMessagePayloadQueryBuilderDsl> paymentState() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentState")),
        p -> new CombinationQueryPredicate<>(p, OrderPaymentStateChangedMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderPaymentStateChangedMessagePayloadQueryBuilderDsl> oldPaymentState() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldPaymentState")),
        p -> new CombinationQueryPredicate<>(p, OrderPaymentStateChangedMessagePayloadQueryBuilderDsl::of));
    }
    
}
