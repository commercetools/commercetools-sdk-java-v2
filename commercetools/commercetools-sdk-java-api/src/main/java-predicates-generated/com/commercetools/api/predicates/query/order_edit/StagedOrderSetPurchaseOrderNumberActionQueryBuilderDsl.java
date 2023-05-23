
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetPurchaseOrderNumberActionQueryBuilderDsl {
    public StagedOrderSetPurchaseOrderNumberActionQueryBuilderDsl() {
    }

    public static StagedOrderSetPurchaseOrderNumberActionQueryBuilderDsl of() {
        return new StagedOrderSetPurchaseOrderNumberActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetPurchaseOrderNumberActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetPurchaseOrderNumberActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetPurchaseOrderNumberActionQueryBuilderDsl> purchaseOrderNumber() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("purchaseOrderNumber")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetPurchaseOrderNumberActionQueryBuilderDsl::of));
    }

}
