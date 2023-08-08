
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetReturnItemCustomFieldActionQueryBuilderDsl {
    public StagedOrderSetReturnItemCustomFieldActionQueryBuilderDsl() {
    }

    public static StagedOrderSetReturnItemCustomFieldActionQueryBuilderDsl of() {
        return new StagedOrderSetReturnItemCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetReturnItemCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetReturnItemCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetReturnItemCustomFieldActionQueryBuilderDsl> returnItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("returnItemId")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetReturnItemCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetReturnItemCustomFieldActionQueryBuilderDsl> returnItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("returnItemKey")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetReturnItemCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetReturnItemCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetReturnItemCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetReturnItemCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetReturnItemCustomFieldActionQueryBuilderDsl::of));
    }

}
