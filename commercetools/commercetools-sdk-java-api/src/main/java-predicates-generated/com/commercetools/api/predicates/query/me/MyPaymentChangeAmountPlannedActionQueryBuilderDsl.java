package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyPaymentChangeAmountPlannedActionQueryBuilderDsl  {
    public MyPaymentChangeAmountPlannedActionQueryBuilderDsl() {
    }

    public static MyPaymentChangeAmountPlannedActionQueryBuilderDsl of() {
        return new MyPaymentChangeAmountPlannedActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyPaymentChangeAmountPlannedActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyPaymentChangeAmountPlannedActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MyPaymentChangeAmountPlannedActionQueryBuilderDsl> amount(
        Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("amount"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            MyPaymentChangeAmountPlannedActionQueryBuilderDsl::of);
    }
    
    
}
