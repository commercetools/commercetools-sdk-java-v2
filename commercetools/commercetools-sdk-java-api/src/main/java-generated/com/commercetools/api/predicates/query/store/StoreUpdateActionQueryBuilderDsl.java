
package com.commercetools.api.predicates.query.store;

import com.commercetools.api.predicates.query.*;

public class StoreUpdateActionQueryBuilderDsl {
    public StoreUpdateActionQueryBuilderDsl() {
    }

    public static StoreUpdateActionQueryBuilderDsl of() {
        return new StoreUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StoreUpdateActionQueryBuilderDsl::of));
    }
}
