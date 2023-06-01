package com.commercetools.api.predicates.query.payment;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class PaymentSetInterfaceIdActionQueryBuilderDsl  {
    public PaymentSetInterfaceIdActionQueryBuilderDsl() {
    }

    public static PaymentSetInterfaceIdActionQueryBuilderDsl of() {
        return new PaymentSetInterfaceIdActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentSetInterfaceIdActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, PaymentSetInterfaceIdActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<PaymentSetInterfaceIdActionQueryBuilderDsl> interfaceId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interfaceId")),
        p -> new CombinationQueryPredicate<>(p, PaymentSetInterfaceIdActionQueryBuilderDsl::of));
    }
    
}
