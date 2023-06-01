package com.commercetools.api.predicates.query.payment;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class PaymentAddTransactionActionQueryBuilderDsl  {
    public PaymentAddTransactionActionQueryBuilderDsl() {
    }

    public static PaymentAddTransactionActionQueryBuilderDsl of() {
        return new PaymentAddTransactionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentAddTransactionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, PaymentAddTransactionActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PaymentAddTransactionActionQueryBuilderDsl> transaction(
        Function<com.commercetools.api.predicates.query.payment.TransactionDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.TransactionDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("transaction"))
            .inner(fn.apply(com.commercetools.api.predicates.query.payment.TransactionDraftQueryBuilderDsl.of())),
            PaymentAddTransactionActionQueryBuilderDsl::of);
    }
    
    
}
