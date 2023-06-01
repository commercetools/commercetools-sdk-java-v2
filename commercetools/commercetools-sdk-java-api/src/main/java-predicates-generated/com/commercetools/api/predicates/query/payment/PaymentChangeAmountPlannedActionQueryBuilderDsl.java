package com.commercetools.api.predicates.query.payment;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class PaymentChangeAmountPlannedActionQueryBuilderDsl  {
    public PaymentChangeAmountPlannedActionQueryBuilderDsl() {
    }

    public static PaymentChangeAmountPlannedActionQueryBuilderDsl of() {
        return new PaymentChangeAmountPlannedActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentChangeAmountPlannedActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, PaymentChangeAmountPlannedActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PaymentChangeAmountPlannedActionQueryBuilderDsl> amount(
        Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("amount"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            PaymentChangeAmountPlannedActionQueryBuilderDsl::of);
    }
    
    
}
