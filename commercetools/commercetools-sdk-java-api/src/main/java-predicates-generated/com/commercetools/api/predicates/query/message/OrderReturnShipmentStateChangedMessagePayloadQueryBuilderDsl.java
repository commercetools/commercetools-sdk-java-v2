
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class OrderReturnShipmentStateChangedMessagePayloadQueryBuilderDsl {
    public OrderReturnShipmentStateChangedMessagePayloadQueryBuilderDsl() {
    }

    public static OrderReturnShipmentStateChangedMessagePayloadQueryBuilderDsl of() {
        return new OrderReturnShipmentStateChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderReturnShipmentStateChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderReturnShipmentStateChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderReturnShipmentStateChangedMessagePayloadQueryBuilderDsl> returnItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("returnItemId")),
            p -> new CombinationQueryPredicate<>(p, OrderReturnShipmentStateChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderReturnShipmentStateChangedMessagePayloadQueryBuilderDsl> returnShipmentState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("returnShipmentState")),
            p -> new CombinationQueryPredicate<>(p, OrderReturnShipmentStateChangedMessagePayloadQueryBuilderDsl::of));
    }

}
