package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderEditReferenceQueryBuilderDsl  {
    public OrderEditReferenceQueryBuilderDsl() {
    }

    public static OrderEditReferenceQueryBuilderDsl of() {
        return new OrderEditReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderEditReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, OrderEditReferenceQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderEditReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, OrderEditReferenceQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderEditReferenceQueryBuilderDsl> obj(
        Function<com.commercetools.api.predicates.query.order_edit.OrderEditQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order_edit.OrderEditQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("obj"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order_edit.OrderEditQueryBuilderDsl.of())),
            OrderEditReferenceQueryBuilderDsl::of);
    }
    
    
}
