
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class PaymentTransactionStateChangedMessagePayloadQueryBuilderDsl {
    public PaymentTransactionStateChangedMessagePayloadQueryBuilderDsl() {
    }

    public static PaymentTransactionStateChangedMessagePayloadQueryBuilderDsl of() {
        return new PaymentTransactionStateChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentTransactionStateChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, PaymentTransactionStateChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentTransactionStateChangedMessagePayloadQueryBuilderDsl> transactionId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("transactionId")),
            p -> new CombinationQueryPredicate<>(p, PaymentTransactionStateChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentTransactionStateChangedMessagePayloadQueryBuilderDsl> state() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
            p -> new CombinationQueryPredicate<>(p, PaymentTransactionStateChangedMessagePayloadQueryBuilderDsl::of));
    }

}
