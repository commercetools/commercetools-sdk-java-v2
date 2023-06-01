package com.commercetools.api.predicates.query.payment;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class PaymentSetKeyActionQueryBuilderDsl  {
    public PaymentSetKeyActionQueryBuilderDsl() {
    }

    public static PaymentSetKeyActionQueryBuilderDsl of() {
        return new PaymentSetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentSetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, PaymentSetKeyActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<PaymentSetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, PaymentSetKeyActionQueryBuilderDsl::of));
    }
    
}
