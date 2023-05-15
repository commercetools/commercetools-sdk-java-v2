
package com.commercetools.api.predicates.query.standalone_price;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceUpdateActionQueryBuilderDsl {
    public StandalonePriceUpdateActionQueryBuilderDsl() {
    }

    public static StandalonePriceUpdateActionQueryBuilderDsl of() {
        return new StandalonePriceUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceUpdateActionQueryBuilderDsl::of));
    }
}
