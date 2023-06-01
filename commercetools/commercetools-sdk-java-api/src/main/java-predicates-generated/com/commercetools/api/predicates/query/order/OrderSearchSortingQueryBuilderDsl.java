package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderSearchSortingQueryBuilderDsl  {
    public OrderSearchSortingQueryBuilderDsl() {
    }

    public static OrderSearchSortingQueryBuilderDsl of() {
        return new OrderSearchSortingQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSearchSortingQueryBuilderDsl> field() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("field")),
        p -> new CombinationQueryPredicate<>(p, OrderSearchSortingQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderSearchSortingQueryBuilderDsl> language() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("language")),
        p -> new CombinationQueryPredicate<>(p, OrderSearchSortingQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderSearchSortingQueryBuilderDsl> order() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("order")),
        p -> new CombinationQueryPredicate<>(p, OrderSearchSortingQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderSearchSortingQueryBuilderDsl> mode() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("mode")),
        p -> new CombinationQueryPredicate<>(p, OrderSearchSortingQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderSearchSortingQueryBuilderDsl> filter(
        Function<com.commercetools.api.predicates.query.order.OrderSearchQueryExpressionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchQueryExpressionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("filter"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderSearchQueryExpressionQueryBuilderDsl.of())),
            OrderSearchSortingQueryBuilderDsl::of);
    }
    
    
}
