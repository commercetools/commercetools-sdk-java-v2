package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderSetShippingAddressActionQueryBuilderDsl  {
    public OrderSetShippingAddressActionQueryBuilderDsl() {
    }

    public static OrderSetShippingAddressActionQueryBuilderDsl of() {
        return new OrderSetShippingAddressActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetShippingAddressActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, OrderSetShippingAddressActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderSetShippingAddressActionQueryBuilderDsl> address(
        Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("address"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            OrderSetShippingAddressActionQueryBuilderDsl::of);
    }
    
    
}
