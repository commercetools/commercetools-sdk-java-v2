package com.commercetools.api.predicates.query.payment;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class PaymentSetAnonymousIdActionQueryBuilderDsl  {
    public PaymentSetAnonymousIdActionQueryBuilderDsl() {
    }

    public static PaymentSetAnonymousIdActionQueryBuilderDsl of() {
        return new PaymentSetAnonymousIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentSetAnonymousIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, PaymentSetAnonymousIdActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<PaymentSetAnonymousIdActionQueryBuilderDsl> anonymousId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("anonymousId")),
        p -> new CombinationQueryPredicate<>(p, PaymentSetAnonymousIdActionQueryBuilderDsl::of));
    }
    
}
