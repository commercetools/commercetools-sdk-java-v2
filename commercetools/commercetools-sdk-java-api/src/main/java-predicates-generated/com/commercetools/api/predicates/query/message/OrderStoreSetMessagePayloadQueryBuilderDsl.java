package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderStoreSetMessagePayloadQueryBuilderDsl  {
    public OrderStoreSetMessagePayloadQueryBuilderDsl() {
    }

    public static OrderStoreSetMessagePayloadQueryBuilderDsl of() {
        return new OrderStoreSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderStoreSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, OrderStoreSetMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderStoreSetMessagePayloadQueryBuilderDsl> store(
        Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("store"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            OrderStoreSetMessagePayloadQueryBuilderDsl::of);
    }
    
    
}
