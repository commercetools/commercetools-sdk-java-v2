package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderDiscountCodeStateSetMessagePayloadQueryBuilderDsl  {
    public OrderDiscountCodeStateSetMessagePayloadQueryBuilderDsl() {
    }

    public static OrderDiscountCodeStateSetMessagePayloadQueryBuilderDsl of() {
        return new OrderDiscountCodeStateSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderDiscountCodeStateSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, OrderDiscountCodeStateSetMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderDiscountCodeStateSetMessagePayloadQueryBuilderDsl> discountCode(
        Function<com.commercetools.api.predicates.query.discount_code.DiscountCodeReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.discount_code.DiscountCodeReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("discountCode"))
            .inner(fn.apply(com.commercetools.api.predicates.query.discount_code.DiscountCodeReferenceQueryBuilderDsl.of())),
            OrderDiscountCodeStateSetMessagePayloadQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<OrderDiscountCodeStateSetMessagePayloadQueryBuilderDsl> state() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
        p -> new CombinationQueryPredicate<>(p, OrderDiscountCodeStateSetMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderDiscountCodeStateSetMessagePayloadQueryBuilderDsl> oldState() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldState")),
        p -> new CombinationQueryPredicate<>(p, OrderDiscountCodeStateSetMessagePayloadQueryBuilderDsl::of));
    }
    
}
