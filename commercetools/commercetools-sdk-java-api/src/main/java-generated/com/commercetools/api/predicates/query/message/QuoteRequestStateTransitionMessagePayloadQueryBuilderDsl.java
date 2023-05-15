
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class QuoteRequestStateTransitionMessagePayloadQueryBuilderDsl {
    public QuoteRequestStateTransitionMessagePayloadQueryBuilderDsl() {
    }

    public static QuoteRequestStateTransitionMessagePayloadQueryBuilderDsl of() {
        return new QuoteRequestStateTransitionMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteRequestStateTransitionMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestStateTransitionMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteRequestStateTransitionMessagePayloadQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            QuoteRequestStateTransitionMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteRequestStateTransitionMessagePayloadQueryBuilderDsl> oldState(
            Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldState"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            QuoteRequestStateTransitionMessagePayloadQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<QuoteRequestStateTransitionMessagePayloadQueryBuilderDsl> force() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("force")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestStateTransitionMessagePayloadQueryBuilderDsl::of));
    }
}
