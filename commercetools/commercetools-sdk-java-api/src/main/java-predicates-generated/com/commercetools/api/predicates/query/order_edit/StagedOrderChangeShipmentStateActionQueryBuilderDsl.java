
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class StagedOrderChangeShipmentStateActionQueryBuilderDsl {
    public StagedOrderChangeShipmentStateActionQueryBuilderDsl() {
    }

    public static StagedOrderChangeShipmentStateActionQueryBuilderDsl of() {
        return new StagedOrderChangeShipmentStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderChangeShipmentStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderChangeShipmentStateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderChangeShipmentStateActionQueryBuilderDsl> shipmentState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("shipmentState")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderChangeShipmentStateActionQueryBuilderDsl::of));
    }

}
