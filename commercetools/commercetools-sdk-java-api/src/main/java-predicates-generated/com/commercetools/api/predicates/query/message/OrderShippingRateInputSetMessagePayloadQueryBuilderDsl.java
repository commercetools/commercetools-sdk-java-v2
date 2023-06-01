package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderShippingRateInputSetMessagePayloadQueryBuilderDsl  {
    public OrderShippingRateInputSetMessagePayloadQueryBuilderDsl() {
    }

    public static OrderShippingRateInputSetMessagePayloadQueryBuilderDsl of() {
        return new OrderShippingRateInputSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderShippingRateInputSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, OrderShippingRateInputSetMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderShippingRateInputSetMessagePayloadQueryBuilderDsl> shippingRateInput(
        Function<com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("shippingRateInput"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl.of())),
            OrderShippingRateInputSetMessagePayloadQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderShippingRateInputSetMessagePayloadQueryBuilderDsl> oldShippingRateInput(
        Function<com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("oldShippingRateInput"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.ShippingRateInputQueryBuilderDsl.of())),
            OrderShippingRateInputSetMessagePayloadQueryBuilderDsl::of);
    }
    
    
}
