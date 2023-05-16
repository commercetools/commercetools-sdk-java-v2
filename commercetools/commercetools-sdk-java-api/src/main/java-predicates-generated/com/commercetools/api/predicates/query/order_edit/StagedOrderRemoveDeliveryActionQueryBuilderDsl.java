
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class StagedOrderRemoveDeliveryActionQueryBuilderDsl {
    public StagedOrderRemoveDeliveryActionQueryBuilderDsl() {
    }

    public static StagedOrderRemoveDeliveryActionQueryBuilderDsl of() {
        return new StagedOrderRemoveDeliveryActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderRemoveDeliveryActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderRemoveDeliveryActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderRemoveDeliveryActionQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderRemoveDeliveryActionQueryBuilderDsl::of));
    }

}
