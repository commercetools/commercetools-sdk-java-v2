package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedOrderChangeTaxRoundingModeActionQueryBuilderDsl  {
    public StagedOrderChangeTaxRoundingModeActionQueryBuilderDsl() {
    }

    public static StagedOrderChangeTaxRoundingModeActionQueryBuilderDsl of() {
        return new StagedOrderChangeTaxRoundingModeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderChangeTaxRoundingModeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderChangeTaxRoundingModeActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedOrderChangeTaxRoundingModeActionQueryBuilderDsl> taxRoundingMode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxRoundingMode")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderChangeTaxRoundingModeActionQueryBuilderDsl::of));
    }
    
}
