
package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

public class OrderSetLineItemCustomFieldActionQueryBuilderDsl {
    public OrderSetLineItemCustomFieldActionQueryBuilderDsl() {
    }

    public static OrderSetLineItemCustomFieldActionQueryBuilderDsl of() {
        return new OrderSetLineItemCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetLineItemCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderSetLineItemCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetLineItemCustomFieldActionQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, OrderSetLineItemCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetLineItemCustomFieldActionQueryBuilderDsl> lineItemKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemKey")),
            p -> new CombinationQueryPredicate<>(p, OrderSetLineItemCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetLineItemCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, OrderSetLineItemCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetLineItemCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, OrderSetLineItemCustomFieldActionQueryBuilderDsl::of));
    }

}
