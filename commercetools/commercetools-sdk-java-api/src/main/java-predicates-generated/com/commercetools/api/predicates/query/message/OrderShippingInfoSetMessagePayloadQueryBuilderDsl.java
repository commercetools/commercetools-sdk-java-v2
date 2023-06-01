package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderShippingInfoSetMessagePayloadQueryBuilderDsl  {
    public OrderShippingInfoSetMessagePayloadQueryBuilderDsl() {
    }

    public static OrderShippingInfoSetMessagePayloadQueryBuilderDsl of() {
        return new OrderShippingInfoSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderShippingInfoSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, OrderShippingInfoSetMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderShippingInfoSetMessagePayloadQueryBuilderDsl> shippingInfo(
        Function<com.commercetools.api.predicates.query.cart.ShippingInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("shippingInfo"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.ShippingInfoQueryBuilderDsl.of())),
            OrderShippingInfoSetMessagePayloadQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderShippingInfoSetMessagePayloadQueryBuilderDsl> oldShippingInfo(
        Function<com.commercetools.api.predicates.query.cart.ShippingInfoQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingInfoQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("oldShippingInfo"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.ShippingInfoQueryBuilderDsl.of())),
            OrderShippingInfoSetMessagePayloadQueryBuilderDsl::of);
    }
    
    
}
