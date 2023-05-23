
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class StagedOrderChangeOrderStateActionQueryBuilderDsl {
    public StagedOrderChangeOrderStateActionQueryBuilderDsl() {
    }

    public static StagedOrderChangeOrderStateActionQueryBuilderDsl of() {
        return new StagedOrderChangeOrderStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderChangeOrderStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderChangeOrderStateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderChangeOrderStateActionQueryBuilderDsl> orderState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("orderState")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderChangeOrderStateActionQueryBuilderDsl::of));
    }

}
