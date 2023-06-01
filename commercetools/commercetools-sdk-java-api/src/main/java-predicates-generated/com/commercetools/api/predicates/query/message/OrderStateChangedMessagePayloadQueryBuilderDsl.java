package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderStateChangedMessagePayloadQueryBuilderDsl  {
    public OrderStateChangedMessagePayloadQueryBuilderDsl() {
    }

    public static OrderStateChangedMessagePayloadQueryBuilderDsl of() {
        return new OrderStateChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderStateChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, OrderStateChangedMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderStateChangedMessagePayloadQueryBuilderDsl> orderState() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("orderState")),
        p -> new CombinationQueryPredicate<>(p, OrderStateChangedMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderStateChangedMessagePayloadQueryBuilderDsl> oldOrderState() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldOrderState")),
        p -> new CombinationQueryPredicate<>(p, OrderStateChangedMessagePayloadQueryBuilderDsl::of));
    }
    
}
