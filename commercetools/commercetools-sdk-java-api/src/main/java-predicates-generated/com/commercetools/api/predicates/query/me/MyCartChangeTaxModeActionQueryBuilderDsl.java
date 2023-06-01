package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCartChangeTaxModeActionQueryBuilderDsl  {
    public MyCartChangeTaxModeActionQueryBuilderDsl() {
    }

    public static MyCartChangeTaxModeActionQueryBuilderDsl of() {
        return new MyCartChangeTaxModeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartChangeTaxModeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyCartChangeTaxModeActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MyCartChangeTaxModeActionQueryBuilderDsl> taxMode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxMode")),
        p -> new CombinationQueryPredicate<>(p, MyCartChangeTaxModeActionQueryBuilderDsl::of));
    }
    
}
