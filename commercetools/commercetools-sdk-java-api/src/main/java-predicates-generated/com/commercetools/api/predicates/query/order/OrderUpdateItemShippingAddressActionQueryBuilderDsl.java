package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderUpdateItemShippingAddressActionQueryBuilderDsl  {
    public OrderUpdateItemShippingAddressActionQueryBuilderDsl() {
    }

    public static OrderUpdateItemShippingAddressActionQueryBuilderDsl of() {
        return new OrderUpdateItemShippingAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderUpdateItemShippingAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, OrderUpdateItemShippingAddressActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderUpdateItemShippingAddressActionQueryBuilderDsl> address(
        Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("address"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            OrderUpdateItemShippingAddressActionQueryBuilderDsl::of);
    }
    
    
}
