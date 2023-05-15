
package com.commercetools.api.predicates.query.payment;

import com.commercetools.api.predicates.query.*;

public class PaymentChangeTransactionTimestampActionQueryBuilderDsl {
    public PaymentChangeTransactionTimestampActionQueryBuilderDsl() {
    }

    public static PaymentChangeTransactionTimestampActionQueryBuilderDsl of() {
        return new PaymentChangeTransactionTimestampActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentChangeTransactionTimestampActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, PaymentChangeTransactionTimestampActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentChangeTransactionTimestampActionQueryBuilderDsl> transactionId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("transactionId")),
            p -> new CombinationQueryPredicate<>(p, PaymentChangeTransactionTimestampActionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<PaymentChangeTransactionTimestampActionQueryBuilderDsl> timestamp() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("timestamp")),
            p -> new CombinationQueryPredicate<>(p, PaymentChangeTransactionTimestampActionQueryBuilderDsl::of));
    }
}
