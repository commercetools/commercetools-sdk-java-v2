
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class OrderEditNotProcessedQueryBuilderDsl {
    public OrderEditNotProcessedQueryBuilderDsl() {
    }

    public static OrderEditNotProcessedQueryBuilderDsl of() {
        return new OrderEditNotProcessedQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderEditNotProcessedQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderEditNotProcessedQueryBuilderDsl::of));
    }

}
