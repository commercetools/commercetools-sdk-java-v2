package com.commercetools.api.predicates.query.payment;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class PaymentSetTransactionCustomFieldActionQueryBuilderDsl  {
    public PaymentSetTransactionCustomFieldActionQueryBuilderDsl() {
    }

    public static PaymentSetTransactionCustomFieldActionQueryBuilderDsl of() {
        return new PaymentSetTransactionCustomFieldActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentSetTransactionCustomFieldActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, PaymentSetTransactionCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<PaymentSetTransactionCustomFieldActionQueryBuilderDsl> transactionId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("transactionId")),
        p -> new CombinationQueryPredicate<>(p, PaymentSetTransactionCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<PaymentSetTransactionCustomFieldActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, PaymentSetTransactionCustomFieldActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<PaymentSetTransactionCustomFieldActionQueryBuilderDsl> value() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("value")),
        p -> new CombinationQueryPredicate<>(p, PaymentSetTransactionCustomFieldActionQueryBuilderDsl::of));
    }
    
}
