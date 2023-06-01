package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderEditAppliedMessagePayloadQueryBuilderDsl  {
    public OrderEditAppliedMessagePayloadQueryBuilderDsl() {
    }

    public static OrderEditAppliedMessagePayloadQueryBuilderDsl of() {
        return new OrderEditAppliedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderEditAppliedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, OrderEditAppliedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderEditAppliedMessagePayloadQueryBuilderDsl> edit(
        Function<com.commercetools.api.predicates.query.order_edit.OrderEditQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.OrderEditQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("edit"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order_edit.OrderEditQueryBuilderDsl.of())),
            OrderEditAppliedMessagePayloadQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderEditAppliedMessagePayloadQueryBuilderDsl> result(
        Function<com.commercetools.api.predicates.query.order_edit.OrderEditAppliedQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.OrderEditAppliedQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("result"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order_edit.OrderEditAppliedQueryBuilderDsl.of())),
            OrderEditAppliedMessagePayloadQueryBuilderDsl::of);
    }
    
    
}
