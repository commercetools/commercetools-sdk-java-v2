package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderCustomLineItemAddedMessagePayloadQueryBuilderDsl  {
    public OrderCustomLineItemAddedMessagePayloadQueryBuilderDsl() {
    }

    public static OrderCustomLineItemAddedMessagePayloadQueryBuilderDsl of() {
        return new OrderCustomLineItemAddedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderCustomLineItemAddedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, OrderCustomLineItemAddedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderCustomLineItemAddedMessagePayloadQueryBuilderDsl> customLineItem(
        Function<com.commercetools.api.predicates.query.cart.CustomLineItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CustomLineItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("customLineItem"))
            .inner(fn.apply(com.commercetools.api.predicates.query.cart.CustomLineItemQueryBuilderDsl.of())),
            OrderCustomLineItemAddedMessagePayloadQueryBuilderDsl::of);
    }
    
    
}
