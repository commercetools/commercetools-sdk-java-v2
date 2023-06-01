package com.commercetools.api.predicates.query.payment;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class PaymentTransitionStateActionQueryBuilderDsl  {
    public PaymentTransitionStateActionQueryBuilderDsl() {
    }

    public static PaymentTransitionStateActionQueryBuilderDsl of() {
        return new PaymentTransitionStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentTransitionStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, PaymentTransitionStateActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PaymentTransitionStateActionQueryBuilderDsl> state(
        Function<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("state"))
            .inner(fn.apply(com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl.of())),
            PaymentTransitionStateActionQueryBuilderDsl::of);
    }
    
    public BooleanComparisonPredicateBuilder<PaymentTransitionStateActionQueryBuilderDsl> force() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("force")),
        p -> new CombinationQueryPredicate<>(p, PaymentTransitionStateActionQueryBuilderDsl::of));
    }
    
}
