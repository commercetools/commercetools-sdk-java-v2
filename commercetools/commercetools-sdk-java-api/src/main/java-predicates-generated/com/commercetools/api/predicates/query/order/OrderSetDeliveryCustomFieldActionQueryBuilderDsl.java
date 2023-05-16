
package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

public class OrderSetDeliveryCustomFieldActionQueryBuilderDsl {
    public OrderSetDeliveryCustomFieldActionQueryBuilderDsl() {
    }

    public static OrderSetDeliveryCustomFieldActionQueryBuilderDsl of() {
        return new OrderSetDeliveryCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetDeliveryCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderSetDeliveryCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetDeliveryCustomFieldActionQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
            p -> new CombinationQueryPredicate<>(p, OrderSetDeliveryCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetDeliveryCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, OrderSetDeliveryCustomFieldActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetDeliveryCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
            p -> new CombinationQueryPredicate<>(p, OrderSetDeliveryCustomFieldActionQueryBuilderDsl::of));
    }

}
