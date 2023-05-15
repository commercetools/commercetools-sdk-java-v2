
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetOrderNumberActionQueryBuilderDsl {
    public StagedOrderSetOrderNumberActionQueryBuilderDsl() {
    }

    public static StagedOrderSetOrderNumberActionQueryBuilderDsl of() {
        return new StagedOrderSetOrderNumberActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetOrderNumberActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetOrderNumberActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetOrderNumberActionQueryBuilderDsl> orderNumber() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("orderNumber")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetOrderNumberActionQueryBuilderDsl::of));
    }
}
