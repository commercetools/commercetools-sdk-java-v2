package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderShipmentStateChangedMessagePayloadQueryBuilderDsl  {
    public OrderShipmentStateChangedMessagePayloadQueryBuilderDsl() {
    }

    public static OrderShipmentStateChangedMessagePayloadQueryBuilderDsl of() {
        return new OrderShipmentStateChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderShipmentStateChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, OrderShipmentStateChangedMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderShipmentStateChangedMessagePayloadQueryBuilderDsl> shipmentState() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shipmentState")),
        p -> new CombinationQueryPredicate<>(p, OrderShipmentStateChangedMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderShipmentStateChangedMessagePayloadQueryBuilderDsl> oldShipmentState() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldShipmentState")),
        p -> new CombinationQueryPredicate<>(p, OrderShipmentStateChangedMessagePayloadQueryBuilderDsl::of));
    }
    
}
