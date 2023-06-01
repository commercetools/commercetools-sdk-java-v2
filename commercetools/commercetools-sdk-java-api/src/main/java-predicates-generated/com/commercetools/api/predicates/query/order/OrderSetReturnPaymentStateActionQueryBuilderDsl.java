package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderSetReturnPaymentStateActionQueryBuilderDsl  {
    public OrderSetReturnPaymentStateActionQueryBuilderDsl() {
    }

    public static OrderSetReturnPaymentStateActionQueryBuilderDsl of() {
        return new OrderSetReturnPaymentStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetReturnPaymentStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, OrderSetReturnPaymentStateActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderSetReturnPaymentStateActionQueryBuilderDsl> returnItemId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("returnItemId")),
        p -> new CombinationQueryPredicate<>(p, OrderSetReturnPaymentStateActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderSetReturnPaymentStateActionQueryBuilderDsl> paymentState() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentState")),
        p -> new CombinationQueryPredicate<>(p, OrderSetReturnPaymentStateActionQueryBuilderDsl::of));
    }
    
}
