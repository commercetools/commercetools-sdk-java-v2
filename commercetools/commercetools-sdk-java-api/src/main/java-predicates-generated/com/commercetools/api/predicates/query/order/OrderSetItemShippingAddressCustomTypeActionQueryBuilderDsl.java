package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderSetItemShippingAddressCustomTypeActionQueryBuilderDsl  {
    public OrderSetItemShippingAddressCustomTypeActionQueryBuilderDsl() {
    }

    public static OrderSetItemShippingAddressCustomTypeActionQueryBuilderDsl of() {
        return new OrderSetItemShippingAddressCustomTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetItemShippingAddressCustomTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, OrderSetItemShippingAddressCustomTypeActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderSetItemShippingAddressCustomTypeActionQueryBuilderDsl> addressKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addressKey")),
        p -> new CombinationQueryPredicate<>(p, OrderSetItemShippingAddressCustomTypeActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderSetItemShippingAddressCustomTypeActionQueryBuilderDsl> type(
        Function<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("type"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.TypeResourceIdentifierQueryBuilderDsl.of())),
            OrderSetItemShippingAddressCustomTypeActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderSetItemShippingAddressCustomTypeActionQueryBuilderDsl> fields(
        Function<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("fields"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.FieldContainerQueryBuilderDsl.of())),
            OrderSetItemShippingAddressCustomTypeActionQueryBuilderDsl::of);
    }
    
    
}
