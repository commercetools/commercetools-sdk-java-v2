
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class StagedOrderChangeTaxModeActionQueryBuilderDsl {
    public StagedOrderChangeTaxModeActionQueryBuilderDsl() {
    }

    public static StagedOrderChangeTaxModeActionQueryBuilderDsl of() {
        return new StagedOrderChangeTaxModeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderChangeTaxModeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderChangeTaxModeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderChangeTaxModeActionQueryBuilderDsl> taxMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxMode")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderChangeTaxModeActionQueryBuilderDsl::of));
    }
}
