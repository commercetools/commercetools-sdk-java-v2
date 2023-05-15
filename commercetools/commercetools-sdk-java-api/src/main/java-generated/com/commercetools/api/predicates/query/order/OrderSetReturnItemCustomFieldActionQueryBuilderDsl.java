
package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

public class OrderSetReturnItemCustomFieldActionQueryBuilderDsl {
    public OrderSetReturnItemCustomFieldActionQueryBuilderDsl() {
    }

    public static OrderSetReturnItemCustomFieldActionQueryBuilderDsl of() {
        return new OrderSetReturnItemCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetReturnItemCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderSetReturnItemCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetReturnItemCustomFieldActionQueryBuilderDsl> returnItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("returnItemId")),
            p -> new CombinationQueryPredicate<>(p, OrderSetReturnItemCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetReturnItemCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, OrderSetReturnItemCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetReturnItemCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, OrderSetReturnItemCustomFieldActionQueryBuilderDsl::of));
    }
}
