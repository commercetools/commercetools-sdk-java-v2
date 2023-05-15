
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class StagedOrderChangePaymentStateActionQueryBuilderDsl {
    public StagedOrderChangePaymentStateActionQueryBuilderDsl() {
    }

    public static StagedOrderChangePaymentStateActionQueryBuilderDsl of() {
        return new StagedOrderChangePaymentStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderChangePaymentStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderChangePaymentStateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderChangePaymentStateActionQueryBuilderDsl> paymentState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentState")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderChangePaymentStateActionQueryBuilderDsl::of));
    }
}
