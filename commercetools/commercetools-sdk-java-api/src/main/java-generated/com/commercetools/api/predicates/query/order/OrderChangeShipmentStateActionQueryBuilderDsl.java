
package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

public class OrderChangeShipmentStateActionQueryBuilderDsl {
    public OrderChangeShipmentStateActionQueryBuilderDsl() {
    }

    public static OrderChangeShipmentStateActionQueryBuilderDsl of() {
        return new OrderChangeShipmentStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderChangeShipmentStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderChangeShipmentStateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderChangeShipmentStateActionQueryBuilderDsl> shipmentState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shipmentState")),
            p -> new CombinationQueryPredicate<>(p, OrderChangeShipmentStateActionQueryBuilderDsl::of));
    }
}
