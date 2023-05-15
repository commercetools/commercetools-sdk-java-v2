
package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

public class OrderSetReturnShipmentStateActionQueryBuilderDsl {
    public OrderSetReturnShipmentStateActionQueryBuilderDsl() {
    }

    public static OrderSetReturnShipmentStateActionQueryBuilderDsl of() {
        return new OrderSetReturnShipmentStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetReturnShipmentStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderSetReturnShipmentStateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetReturnShipmentStateActionQueryBuilderDsl> returnItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("returnItemId")),
            p -> new CombinationQueryPredicate<>(p, OrderSetReturnShipmentStateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetReturnShipmentStateActionQueryBuilderDsl> shipmentState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shipmentState")),
            p -> new CombinationQueryPredicate<>(p, OrderSetReturnShipmentStateActionQueryBuilderDsl::of));
    }
}
