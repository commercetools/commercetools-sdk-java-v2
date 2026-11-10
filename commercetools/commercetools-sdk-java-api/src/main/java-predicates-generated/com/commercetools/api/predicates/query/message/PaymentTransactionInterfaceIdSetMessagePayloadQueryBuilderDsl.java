
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class PaymentTransactionInterfaceIdSetMessagePayloadQueryBuilderDsl {
    public PaymentTransactionInterfaceIdSetMessagePayloadQueryBuilderDsl() {
    }

    public static PaymentTransactionInterfaceIdSetMessagePayloadQueryBuilderDsl of() {
        return new PaymentTransactionInterfaceIdSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentTransactionInterfaceIdSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, PaymentTransactionInterfaceIdSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentTransactionInterfaceIdSetMessagePayloadQueryBuilderDsl> transactionId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("transactionId")),
            p -> new CombinationQueryPredicate<>(p, PaymentTransactionInterfaceIdSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentTransactionInterfaceIdSetMessagePayloadQueryBuilderDsl> newInterfaceId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("newInterfaceId")),
            p -> new CombinationQueryPredicate<>(p, PaymentTransactionInterfaceIdSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentTransactionInterfaceIdSetMessagePayloadQueryBuilderDsl> oldInterfaceId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldInterfaceId")),
            p -> new CombinationQueryPredicate<>(p, PaymentTransactionInterfaceIdSetMessagePayloadQueryBuilderDsl::of));
    }

}
