package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderPagedQueryResponseQueryBuilderDsl  {
    public OrderPagedQueryResponseQueryBuilderDsl() {
    }

    public static OrderPagedQueryResponseQueryBuilderDsl of() {
        return new OrderPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<OrderPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
        p -> new CombinationQueryPredicate<>(p, OrderPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<OrderPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
        p -> new CombinationQueryPredicate<>(p, OrderPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<OrderPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
        p -> new CombinationQueryPredicate<>(p, OrderPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<OrderPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
        p -> new CombinationQueryPredicate<>(p, OrderPagedQueryResponseQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderPagedQueryResponseQueryBuilderDsl> results(
        Function<com.commercetools.api.predicates.query.order.OrderQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("results"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderQueryBuilderDsl.of())),
            OrderPagedQueryResponseQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<OrderPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
                p -> new CombinationQueryPredicate<>(p, OrderPagedQueryResponseQueryBuilderDsl::of));
    }
    
}
