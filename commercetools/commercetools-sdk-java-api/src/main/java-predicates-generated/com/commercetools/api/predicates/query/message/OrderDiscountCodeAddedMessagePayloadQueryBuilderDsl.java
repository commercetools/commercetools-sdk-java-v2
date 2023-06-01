package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderDiscountCodeAddedMessagePayloadQueryBuilderDsl  {
    public OrderDiscountCodeAddedMessagePayloadQueryBuilderDsl() {
    }

    public static OrderDiscountCodeAddedMessagePayloadQueryBuilderDsl of() {
        return new OrderDiscountCodeAddedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderDiscountCodeAddedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, OrderDiscountCodeAddedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderDiscountCodeAddedMessagePayloadQueryBuilderDsl> discountCode(
        Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("discountCode"))
            .inner(fn.apply(com.commercetools.api.predicates.query.discount_code.DiscountCodeReferenceQueryBuilderDsl.of())),
            OrderDiscountCodeAddedMessagePayloadQueryBuilderDsl::of);
    }
    
    
}
