package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderChangePaymentStateActionQueryBuilderDsl  {
    public OrderChangePaymentStateActionQueryBuilderDsl() {
    }

    public static OrderChangePaymentStateActionQueryBuilderDsl of() {
        return new OrderChangePaymentStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderChangePaymentStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, OrderChangePaymentStateActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderChangePaymentStateActionQueryBuilderDsl> paymentState() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentState")),
        p -> new CombinationQueryPredicate<>(p, OrderChangePaymentStateActionQueryBuilderDsl::of));
    }
    
}
