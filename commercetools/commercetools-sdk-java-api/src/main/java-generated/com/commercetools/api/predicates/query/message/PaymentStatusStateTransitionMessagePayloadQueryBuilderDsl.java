
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PaymentStatusStateTransitionMessagePayloadQueryBuilderDsl {
    public PaymentStatusStateTransitionMessagePayloadQueryBuilderDsl() {
    }

    public static PaymentStatusStateTransitionMessagePayloadQueryBuilderDsl of() {
        return new PaymentStatusStateTransitionMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<PaymentStatusStateTransitionMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, PaymentStatusStateTransitionMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PaymentStatusStateTransitionMessagePayloadQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            PaymentStatusStateTransitionMessagePayloadQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<PaymentStatusStateTransitionMessagePayloadQueryBuilderDsl> force() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("force")),
            p -> new CombinationQueryPredicate<>(p, PaymentStatusStateTransitionMessagePayloadQueryBuilderDsl::of));
    }
}
