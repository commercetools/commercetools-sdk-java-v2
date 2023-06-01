package com.commercetools.api.predicates.query.standalone_price;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StandalonePriceChangeActiveActionQueryBuilderDsl  {
    public StandalonePriceChangeActiveActionQueryBuilderDsl() {
    }

    public static StandalonePriceChangeActiveActionQueryBuilderDsl of() {
        return new StandalonePriceChangeActiveActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceChangeActiveActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceChangeActiveActionQueryBuilderDsl::of));
    }
    public BooleanComparisonPredicateBuilder<StandalonePriceChangeActiveActionQueryBuilderDsl> active() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("active")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceChangeActiveActionQueryBuilderDsl::of));
    }
    
}
