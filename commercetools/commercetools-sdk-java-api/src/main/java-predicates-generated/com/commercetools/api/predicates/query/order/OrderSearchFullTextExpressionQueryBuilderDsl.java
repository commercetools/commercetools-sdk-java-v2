package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class OrderSearchFullTextExpressionQueryBuilderDsl  {
    public OrderSearchFullTextExpressionQueryBuilderDsl() {
    }

    public static OrderSearchFullTextExpressionQueryBuilderDsl of() {
        return new OrderSearchFullTextExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<OrderSearchFullTextExpressionQueryBuilderDsl> fullText(
        Function<com.commercetools.api.predicates.query.order.OrderSearchFullTextValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchFullTextValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("fullText"))
            .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderSearchFullTextValueQueryBuilderDsl.of())),
            OrderSearchFullTextExpressionQueryBuilderDsl::of);
    }
    
    
}
