
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetCustomLineItemCustomFieldActionQueryBuilderDsl {
    public StagedOrderSetCustomLineItemCustomFieldActionQueryBuilderDsl() {
    }

    public static StagedOrderSetCustomLineItemCustomFieldActionQueryBuilderDsl of() {
        return new StagedOrderSetCustomLineItemCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetCustomLineItemCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetCustomLineItemCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetCustomLineItemCustomFieldActionQueryBuilderDsl> customLineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customLineItemId")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetCustomLineItemCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetCustomLineItemCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetCustomLineItemCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetCustomLineItemCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetCustomLineItemCustomFieldActionQueryBuilderDsl::of));
    }
}
