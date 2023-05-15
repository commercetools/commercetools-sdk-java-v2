
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class StagedOrderRemoveParcelFromDeliveryActionQueryBuilderDsl {
    public StagedOrderRemoveParcelFromDeliveryActionQueryBuilderDsl() {
    }

    public static StagedOrderRemoveParcelFromDeliveryActionQueryBuilderDsl of() {
        return new StagedOrderRemoveParcelFromDeliveryActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderRemoveParcelFromDeliveryActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderRemoveParcelFromDeliveryActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderRemoveParcelFromDeliveryActionQueryBuilderDsl> parcelId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("parcelId")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderRemoveParcelFromDeliveryActionQueryBuilderDsl::of));
    }
}
