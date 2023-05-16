
package com.commercetools.api.predicates.query.payment;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentStatusQueryBuilderDsl {
    public PaymentStatusQueryBuilderDsl() {
    }

    public static PaymentStatusQueryBuilderDsl of() {
        return new PaymentStatusQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentStatusQueryBuilderDsl> interfaceCode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interfaceCode")),
            p -> new CombinationQueryPredicate<>(p, PaymentStatusQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<PaymentStatusQueryBuilderDsl> interfaceText() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("interfaceText")),
            p -> new CombinationQueryPredicate<>(p, PaymentStatusQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentStatusQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            PaymentStatusQueryBuilderDsl::of);
    }

}
