
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class QuoteStateTransitionMessagePayloadQueryBuilderDsl {
    public QuoteStateTransitionMessagePayloadQueryBuilderDsl() {
    }

    public static QuoteStateTransitionMessagePayloadQueryBuilderDsl of() {
        return new QuoteStateTransitionMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteStateTransitionMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, QuoteStateTransitionMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteStateTransitionMessagePayloadQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            QuoteStateTransitionMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<QuoteStateTransitionMessagePayloadQueryBuilderDsl> oldState(
            Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldState"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            QuoteStateTransitionMessagePayloadQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<QuoteStateTransitionMessagePayloadQueryBuilderDsl> force() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("force")),
            p -> new CombinationQueryPredicate<>(p, QuoteStateTransitionMessagePayloadQueryBuilderDsl::of));
    }

}
