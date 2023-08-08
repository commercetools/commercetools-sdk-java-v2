
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class StagedOrderRemoveCustomLineItemActionQueryBuilderDsl {
    public StagedOrderRemoveCustomLineItemActionQueryBuilderDsl() {
    }

    public static StagedOrderRemoveCustomLineItemActionQueryBuilderDsl of() {
        return new StagedOrderRemoveCustomLineItemActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderRemoveCustomLineItemActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderRemoveCustomLineItemActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderRemoveCustomLineItemActionQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderRemoveCustomLineItemActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderRemoveCustomLineItemActionQueryBuilderDsl> customLineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemKey")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderRemoveCustomLineItemActionQueryBuilderDsl::of));
    }

}
