
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderSearchFullTextExpressionQueryBuilderDsl {
    public OrderSearchFullTextExpressionQueryBuilderDsl() {
    }

    public static OrderSearchFullTextExpressionQueryBuilderDsl of() {
        return new OrderSearchFullTextExpressionQueryBuilderDsl();
    }

    public CombinationQueryPredicate<OrderSearchFullTextExpressionQueryBuilderDsl> fullText(
            Function<com.commercetools.api.predicates.query.order.OrderSearchFullTextValueQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderSearchFullTextValueQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("fullText"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.order.OrderSearchFullTextValueQueryBuilderDsl.of())),
            OrderSearchFullTextExpressionQueryBuilderDsl::of);
    }

}
