
package com.commercetools.api.predicates.query.payment;

import com.commercetools.api.predicates.query.*;

public class PaymentChangeTransactionInteractionIdActionQueryBuilderDsl {
    public PaymentChangeTransactionInteractionIdActionQueryBuilderDsl() {
    }

    public static PaymentChangeTransactionInteractionIdActionQueryBuilderDsl of() {
        return new PaymentChangeTransactionInteractionIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentChangeTransactionInteractionIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, PaymentChangeTransactionInteractionIdActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentChangeTransactionInteractionIdActionQueryBuilderDsl> transactionId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("transactionId")),
            p -> new CombinationQueryPredicate<>(p, PaymentChangeTransactionInteractionIdActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentChangeTransactionInteractionIdActionQueryBuilderDsl> interactionId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interactionId")),
            p -> new CombinationQueryPredicate<>(p, PaymentChangeTransactionInteractionIdActionQueryBuilderDsl::of));
    }

}
