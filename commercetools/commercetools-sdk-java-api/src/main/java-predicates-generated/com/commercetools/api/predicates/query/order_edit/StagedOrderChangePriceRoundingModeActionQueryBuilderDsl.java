
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class StagedOrderChangePriceRoundingModeActionQueryBuilderDsl {
    public StagedOrderChangePriceRoundingModeActionQueryBuilderDsl() {
    }

    public static StagedOrderChangePriceRoundingModeActionQueryBuilderDsl of() {
        return new StagedOrderChangePriceRoundingModeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderChangePriceRoundingModeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderChangePriceRoundingModeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderChangePriceRoundingModeActionQueryBuilderDsl> priceRoundingMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceRoundingMode")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderChangePriceRoundingModeActionQueryBuilderDsl::of));
    }

}
