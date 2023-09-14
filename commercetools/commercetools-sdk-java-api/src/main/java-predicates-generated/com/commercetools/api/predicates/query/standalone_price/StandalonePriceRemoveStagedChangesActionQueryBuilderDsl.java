
package com.commercetools.api.predicates.query.standalone_price;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceRemoveStagedChangesActionQueryBuilderDsl {
    public StandalonePriceRemoveStagedChangesActionQueryBuilderDsl() {
    }

    public static StandalonePriceRemoveStagedChangesActionQueryBuilderDsl of() {
        return new StandalonePriceRemoveStagedChangesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceRemoveStagedChangesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceRemoveStagedChangesActionQueryBuilderDsl::of));
    }

}
