package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderSetStoreActionQueryBuilderDsl  {
    public OrderSetStoreActionQueryBuilderDsl() {
    }

    public static OrderSetStoreActionQueryBuilderDsl of() {
        return new OrderSetStoreActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetStoreActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, OrderSetStoreActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderSetStoreActionQueryBuilderDsl> store(
        Function<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("store"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreResourceIdentifierQueryBuilderDsl.of())),
            OrderSetStoreActionQueryBuilderDsl::of);
    }
    
    
}
