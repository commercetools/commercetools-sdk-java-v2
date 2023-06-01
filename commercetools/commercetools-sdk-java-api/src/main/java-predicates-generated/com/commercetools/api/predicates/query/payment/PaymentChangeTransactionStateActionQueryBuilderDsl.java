package com.commercetools.api.predicates.query.payment;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class PaymentChangeTransactionStateActionQueryBuilderDsl  {
    public PaymentChangeTransactionStateActionQueryBuilderDsl() {
    }

    public static PaymentChangeTransactionStateActionQueryBuilderDsl of() {
        return new PaymentChangeTransactionStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentChangeTransactionStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, PaymentChangeTransactionStateActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<PaymentChangeTransactionStateActionQueryBuilderDsl> transactionId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("transactionId")),
        p -> new CombinationQueryPredicate<>(p, PaymentChangeTransactionStateActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<PaymentChangeTransactionStateActionQueryBuilderDsl> state() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
        p -> new CombinationQueryPredicate<>(p, PaymentChangeTransactionStateActionQueryBuilderDsl::of));
    }
    
}
