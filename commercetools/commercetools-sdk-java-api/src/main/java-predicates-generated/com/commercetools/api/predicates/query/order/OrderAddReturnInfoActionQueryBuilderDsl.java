package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderAddReturnInfoActionQueryBuilderDsl  {
    public OrderAddReturnInfoActionQueryBuilderDsl() {
    }

    public static OrderAddReturnInfoActionQueryBuilderDsl of() {
        return new OrderAddReturnInfoActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderAddReturnInfoActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, OrderAddReturnInfoActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<OrderAddReturnInfoActionQueryBuilderDsl> returnTrackingId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("returnTrackingId")),
        p -> new CombinationQueryPredicate<>(p, OrderAddReturnInfoActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderAddReturnInfoActionQueryBuilderDsl> items(
        Function<com.commercetools.api.predicates.query.order.ReturnItemDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ReturnItemDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("items"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.ReturnItemDraftQueryBuilderDsl.of())),
            OrderAddReturnInfoActionQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<OrderAddReturnInfoActionQueryBuilderDsl> items() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("items")),
                p -> new CombinationQueryPredicate<>(p, OrderAddReturnInfoActionQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<OrderAddReturnInfoActionQueryBuilderDsl> returnDate() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("returnDate")),
        p -> new CombinationQueryPredicate<>(p, OrderAddReturnInfoActionQueryBuilderDsl::of));
    }
    
}
