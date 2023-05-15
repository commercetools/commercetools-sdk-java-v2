
package com.commercetools.api.predicates.query.order_edit;

import com.commercetools.api.predicates.query.*;

public class StagedOrderSetReturnPaymentStateActionQueryBuilderDsl {
    public StagedOrderSetReturnPaymentStateActionQueryBuilderDsl() {
    }

    public static StagedOrderSetReturnPaymentStateActionQueryBuilderDsl of() {
        return new StagedOrderSetReturnPaymentStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderSetReturnPaymentStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetReturnPaymentStateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetReturnPaymentStateActionQueryBuilderDsl> returnItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("returnItemId")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetReturnPaymentStateActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StagedOrderSetReturnPaymentStateActionQueryBuilderDsl> paymentState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("paymentState")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderSetReturnPaymentStateActionQueryBuilderDsl::of));
    }
}
