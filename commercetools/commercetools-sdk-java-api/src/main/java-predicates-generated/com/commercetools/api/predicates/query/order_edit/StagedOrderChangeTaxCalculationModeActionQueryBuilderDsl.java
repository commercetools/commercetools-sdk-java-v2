package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedOrderChangeTaxCalculationModeActionQueryBuilderDsl  {
    public StagedOrderChangeTaxCalculationModeActionQueryBuilderDsl() {
    }

    public static StagedOrderChangeTaxCalculationModeActionQueryBuilderDsl of() {
        return new StagedOrderChangeTaxCalculationModeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderChangeTaxCalculationModeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderChangeTaxCalculationModeActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedOrderChangeTaxCalculationModeActionQueryBuilderDsl> taxCalculationMode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxCalculationMode")),
        p -> new CombinationQueryPredicate<>(p, StagedOrderChangeTaxCalculationModeActionQueryBuilderDsl::of));
    }
    
}
