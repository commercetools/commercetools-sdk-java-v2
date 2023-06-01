package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyCartRecalculateActionQueryBuilderDsl  {
    public MyCartRecalculateActionQueryBuilderDsl() {
    }

    public static MyCartRecalculateActionQueryBuilderDsl of() {
        return new MyCartRecalculateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyCartRecalculateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyCartRecalculateActionQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<MyCartRecalculateActionQueryBuilderDsl> updateProductData() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("updateProductData")),
        p -> new CombinationQueryPredicate<>(p, MyCartRecalculateActionQueryBuilderDsl::of));
    }
    
}
