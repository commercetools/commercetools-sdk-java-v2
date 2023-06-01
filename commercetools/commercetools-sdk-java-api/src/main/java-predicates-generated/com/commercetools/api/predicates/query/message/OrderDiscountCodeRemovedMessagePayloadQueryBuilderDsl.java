package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderDiscountCodeRemovedMessagePayloadQueryBuilderDsl  {
    public OrderDiscountCodeRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static OrderDiscountCodeRemovedMessagePayloadQueryBuilderDsl of() {
        return new OrderDiscountCodeRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderDiscountCodeRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, OrderDiscountCodeRemovedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderDiscountCodeRemovedMessagePayloadQueryBuilderDsl> discountCode(
        Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("discountCode"))
            .inner(fn.apply(com.commercetools.api.predicates.query.discount_code.DiscountCodeReferenceQueryBuilderDsl.of())),
            OrderDiscountCodeRemovedMessagePayloadQueryBuilderDsl::of);
    }
    
    
}
