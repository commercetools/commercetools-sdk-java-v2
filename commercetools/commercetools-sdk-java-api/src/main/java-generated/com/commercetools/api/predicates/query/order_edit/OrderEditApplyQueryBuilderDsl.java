
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class OrderEditApplyQueryBuilderDsl {
    public OrderEditApplyQueryBuilderDsl() {
    }

    public static OrderEditApplyQueryBuilderDsl of() {
        return new OrderEditApplyQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<OrderEditApplyQueryBuilderDsl> editVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("editVersion")),
            p -> new CombinationQueryPredicate<>(p, OrderEditApplyQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderEditApplyQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, OrderEditApplyQueryBuilderDsl::of));
    }
}
