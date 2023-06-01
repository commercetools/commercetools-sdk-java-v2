package com.commercetools.api.predicates.query.me;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MyPaymentSetMethodInfoNameActionQueryBuilderDsl  {
    public MyPaymentSetMethodInfoNameActionQueryBuilderDsl() {
    }

    public static MyPaymentSetMethodInfoNameActionQueryBuilderDsl of() {
        return new MyPaymentSetMethodInfoNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MyPaymentSetMethodInfoNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, MyPaymentSetMethodInfoNameActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MyPaymentSetMethodInfoNameActionQueryBuilderDsl> name(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("name"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            MyPaymentSetMethodInfoNameActionQueryBuilderDsl::of);
    }
    
    
}
