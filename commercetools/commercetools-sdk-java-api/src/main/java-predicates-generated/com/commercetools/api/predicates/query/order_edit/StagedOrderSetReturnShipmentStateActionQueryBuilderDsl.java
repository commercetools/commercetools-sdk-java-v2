
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetReturnShipmentStateActionQueryBuilderDsl {
    public StagedOrderSetReturnShipmentStateActionQueryBuilderDsl() {
    }

    public static StagedOrderSetReturnShipmentStateActionQueryBuilderDsl of() {
        return new StagedOrderSetReturnShipmentStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetReturnShipmentStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetReturnShipmentStateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetReturnShipmentStateActionQueryBuilderDsl> returnItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("returnItemId")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetReturnShipmentStateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetReturnShipmentStateActionQueryBuilderDsl> returnItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("returnItemKey")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetReturnShipmentStateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetReturnShipmentStateActionQueryBuilderDsl> shipmentState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shipmentState")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetReturnShipmentStateActionQueryBuilderDsl::of));
    }

}
