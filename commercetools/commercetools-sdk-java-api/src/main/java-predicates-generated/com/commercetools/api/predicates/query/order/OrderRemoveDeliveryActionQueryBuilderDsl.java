package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderRemoveDeliveryActionQueryBuilderDsl  {
    public OrderRemoveDeliveryActionQueryBuilderDsl() {
    }

    public static OrderRemoveDeliveryActionQueryBuilderDsl of() {
        return new OrderRemoveDeliveryActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderRemoveDeliveryActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, OrderRemoveDeliveryActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderRemoveDeliveryActionQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
        p -> new CombinationQueryPredicate<>(p, OrderRemoveDeliveryActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderRemoveDeliveryActionQueryBuilderDsl> deliveryKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryKey")),
        p -> new CombinationQueryPredicate<>(p, OrderRemoveDeliveryActionQueryBuilderDsl::of));
    }
    
}
