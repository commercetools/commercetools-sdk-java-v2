package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderAddItemShippingAddressActionQueryBuilderDsl  {
    public OrderAddItemShippingAddressActionQueryBuilderDsl() {
    }

    public static OrderAddItemShippingAddressActionQueryBuilderDsl of() {
        return new OrderAddItemShippingAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderAddItemShippingAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, OrderAddItemShippingAddressActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderAddItemShippingAddressActionQueryBuilderDsl> address(
        Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("address"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            OrderAddItemShippingAddressActionQueryBuilderDsl::of);
    }
    
    
}
