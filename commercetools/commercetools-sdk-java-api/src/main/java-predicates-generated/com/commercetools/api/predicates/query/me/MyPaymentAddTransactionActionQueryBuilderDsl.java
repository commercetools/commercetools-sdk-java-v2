package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyPaymentAddTransactionActionQueryBuilderDsl  {
    public MyPaymentAddTransactionActionQueryBuilderDsl() {
    }

    public static MyPaymentAddTransactionActionQueryBuilderDsl of() {
        return new MyPaymentAddTransactionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyPaymentAddTransactionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyPaymentAddTransactionActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MyPaymentAddTransactionActionQueryBuilderDsl> transaction(
        Function<com.commercetools.api.predicates.query.payment.TransactionDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.payment.TransactionDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("transaction"))
            .inner(fn.apply(com.commercetools.api.predicates.query.payment.TransactionDraftQueryBuilderDsl.of())),
            MyPaymentAddTransactionActionQueryBuilderDsl::of);
    }
    
    
}
