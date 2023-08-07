
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class StagedOrderChangeCustomLineItemQuantityActionQueryBuilderDsl {
    public StagedOrderChangeCustomLineItemQuantityActionQueryBuilderDsl() {
    }

    public static StagedOrderChangeCustomLineItemQuantityActionQueryBuilderDsl of() {
        return new StagedOrderChangeCustomLineItemQuantityActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderChangeCustomLineItemQuantityActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderChangeCustomLineItemQuantityActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderChangeCustomLineItemQuantityActionQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderChangeCustomLineItemQuantityActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderChangeCustomLineItemQuantityActionQueryBuilderDsl> customLineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemKey")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderChangeCustomLineItemQuantityActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<StagedOrderChangeCustomLineItemQuantityActionQueryBuilderDsl> quantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("quantity")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderChangeCustomLineItemQuantityActionQueryBuilderDsl::of));
    }

}
