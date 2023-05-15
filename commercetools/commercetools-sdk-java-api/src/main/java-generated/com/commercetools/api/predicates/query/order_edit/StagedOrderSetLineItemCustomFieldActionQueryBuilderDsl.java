
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetLineItemCustomFieldActionQueryBuilderDsl {
    public StagedOrderSetLineItemCustomFieldActionQueryBuilderDsl() {
    }

    public static StagedOrderSetLineItemCustomFieldActionQueryBuilderDsl of() {
        return new StagedOrderSetLineItemCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetLineItemCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetLineItemCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetLineItemCustomFieldActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetLineItemCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetLineItemCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetLineItemCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetLineItemCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetLineItemCustomFieldActionQueryBuilderDsl::of));
    }
}
