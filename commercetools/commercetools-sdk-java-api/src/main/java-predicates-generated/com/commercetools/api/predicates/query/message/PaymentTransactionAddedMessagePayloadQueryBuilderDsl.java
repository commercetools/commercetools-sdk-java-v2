package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class PaymentTransactionAddedMessagePayloadQueryBuilderDsl  {
    public PaymentTransactionAddedMessagePayloadQueryBuilderDsl() {
    }

    public static PaymentTransactionAddedMessagePayloadQueryBuilderDsl of() {
        return new PaymentTransactionAddedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentTransactionAddedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, PaymentTransactionAddedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PaymentTransactionAddedMessagePayloadQueryBuilderDsl> transaction(
        Function<com.commercetools.api.predicates.query.payment.TransactionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.TransactionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("transaction"))
            .inner(fn.apply(com.commercetools.api.predicates.query.payment.TransactionQueryBuilderDsl.of())),
            PaymentTransactionAddedMessagePayloadQueryBuilderDsl::of);
    }
    
    
}
