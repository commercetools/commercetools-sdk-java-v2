
package com.commercetools.api.predicates.query.standalone_price;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceSetKeyActionQueryBuilderDsl {
    public StandalonePriceSetKeyActionQueryBuilderDsl() {
    }

    public static StandalonePriceSetKeyActionQueryBuilderDsl of() {
        return new StandalonePriceSetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceSetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceSetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StandalonePriceSetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceSetKeyActionQueryBuilderDsl::of));
    }
}
