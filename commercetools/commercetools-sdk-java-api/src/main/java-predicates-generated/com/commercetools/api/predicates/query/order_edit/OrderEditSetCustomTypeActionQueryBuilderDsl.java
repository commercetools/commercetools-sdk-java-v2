package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderEditSetCustomTypeActionQueryBuilderDsl  {
    public OrderEditSetCustomTypeActionQueryBuilderDsl() {
    }

    public static OrderEditSetCustomTypeActionQueryBuilderDsl of() {
        return new OrderEditSetCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderEditSetCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, OrderEditSetCustomTypeActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderEditSetCustomTypeActionQueryBuilderDsl> type(
        Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("type"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            OrderEditSetCustomTypeActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderEditSetCustomTypeActionQueryBuilderDsl> fields(
        Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("fields"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            OrderEditSetCustomTypeActionQueryBuilderDsl::of);
    }
    
    
}
