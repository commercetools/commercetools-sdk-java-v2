package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderSetReturnInfoActionQueryBuilderDsl  {
    public OrderSetReturnInfoActionQueryBuilderDsl() {
    }

    public static OrderSetReturnInfoActionQueryBuilderDsl of() {
        return new OrderSetReturnInfoActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetReturnInfoActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, OrderSetReturnInfoActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<OrderSetReturnInfoActionQueryBuilderDsl> items(
        Function<com.commercetools.api.predicates.query.order.ReturnInfoDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.ReturnInfoDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("items"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.ReturnInfoDraftQueryBuilderDsl.of())),
            OrderSetReturnInfoActionQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<OrderSetReturnInfoActionQueryBuilderDsl> items() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("items")),
                p -> new CombinationQueryPredicate<>(p, OrderSetReturnInfoActionQueryBuilderDsl::of));
    }
    
}
