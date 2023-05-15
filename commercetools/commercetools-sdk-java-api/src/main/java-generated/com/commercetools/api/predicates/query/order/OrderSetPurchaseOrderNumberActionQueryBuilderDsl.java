
package com.commercetools.api.predicates.query.order;

import com.commercetools.api.predicates.query.*;

public class OrderSetPurchaseOrderNumberActionQueryBuilderDsl {
    public OrderSetPurchaseOrderNumberActionQueryBuilderDsl() {
    }

    public static OrderSetPurchaseOrderNumberActionQueryBuilderDsl of() {
        return new OrderSetPurchaseOrderNumberActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderSetPurchaseOrderNumberActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderSetPurchaseOrderNumberActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderSetPurchaseOrderNumberActionQueryBuilderDsl> purchaseOrderNumber() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("purchaseOrderNumber")),
            p -> new CombinationQueryPredicate<>(p, OrderSetPurchaseOrderNumberActionQueryBuilderDsl::of));
    }
}
