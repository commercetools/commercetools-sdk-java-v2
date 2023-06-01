package com.commercetools.api.predicates.query.payment;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class PaymentSetMethodInfoNameActionQueryBuilderDsl  {
    public PaymentSetMethodInfoNameActionQueryBuilderDsl() {
    }

    public static PaymentSetMethodInfoNameActionQueryBuilderDsl of() {
        return new PaymentSetMethodInfoNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentSetMethodInfoNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, PaymentSetMethodInfoNameActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PaymentSetMethodInfoNameActionQueryBuilderDsl> name(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("name"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            PaymentSetMethodInfoNameActionQueryBuilderDsl::of);
    }
    
    
}
