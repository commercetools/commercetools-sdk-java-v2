package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderSetDeliveryAddressActionQueryBuilderDsl  {
    public OrderSetDeliveryAddressActionQueryBuilderDsl() {
    }

    public static OrderSetDeliveryAddressActionQueryBuilderDsl of() {
        return new OrderSetDeliveryAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetDeliveryAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, OrderSetDeliveryAddressActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderSetDeliveryAddressActionQueryBuilderDsl> deliveryId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryId")),
        p -> new CombinationQueryPredicate<>(p, OrderSetDeliveryAddressActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderSetDeliveryAddressActionQueryBuilderDsl> deliveryKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deliveryKey")),
        p -> new CombinationQueryPredicate<>(p, OrderSetDeliveryAddressActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderSetDeliveryAddressActionQueryBuilderDsl> address(
        Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("address"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            OrderSetDeliveryAddressActionQueryBuilderDsl::of);
    }
    
    
}
