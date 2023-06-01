package com.commercetools.api.predicates.query.standalone_price;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StandalonePriceApplyStagedChangesActionQueryBuilderDsl  {
    public StandalonePriceApplyStagedChangesActionQueryBuilderDsl() {
    }

    public static StandalonePriceApplyStagedChangesActionQueryBuilderDsl of() {
        return new StandalonePriceApplyStagedChangesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceApplyStagedChangesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceApplyStagedChangesActionQueryBuilderDsl::of));
    }
    
}
