
package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

public class StagedOrderUpdateActionQueryBuilderDsl {
    public StagedOrderUpdateActionQueryBuilderDsl() {
    }

    public static StagedOrderUpdateActionQueryBuilderDsl of() {
        return new StagedOrderUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderUpdateActionQueryBuilderDsl::of));
    }
}
