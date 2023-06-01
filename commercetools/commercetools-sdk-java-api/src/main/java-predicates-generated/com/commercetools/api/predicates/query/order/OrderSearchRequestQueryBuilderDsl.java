package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderSearchRequestQueryBuilderDsl  {
    public OrderSearchRequestQueryBuilderDsl() {
    }

    public static OrderSearchRequestQueryBuilderDsl of() {
        return new OrderSearchRequestQueryBuilderDsl();
    }

    public CombinationQueryPredicate<OrderSearchRequestQueryBuilderDsl> query(
        Function<com.commercetools.api.predicates.query.order.OrderSearchQueryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchQueryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("query"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderSearchQueryQueryBuilderDsl.of())),
            OrderSearchRequestQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<OrderSearchRequestQueryBuilderDsl> sort(
        Function<com.commercetools.api.predicates.query.order.OrderSearchSortingQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchSortingQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("sort"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderSearchSortingQueryBuilderDsl.of())),
            OrderSearchRequestQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<OrderSearchRequestQueryBuilderDsl> sort() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sort")),
                p -> new CombinationQueryPredicate<>(p, OrderSearchRequestQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<OrderSearchRequestQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
        p -> new CombinationQueryPredicate<>(p, OrderSearchRequestQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<OrderSearchRequestQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
        p -> new CombinationQueryPredicate<>(p, OrderSearchRequestQueryBuilderDsl::of));
    }
    
}
