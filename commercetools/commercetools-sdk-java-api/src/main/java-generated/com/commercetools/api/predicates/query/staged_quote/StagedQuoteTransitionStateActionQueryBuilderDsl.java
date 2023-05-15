
package com.commercetools.api.predicates.query.staged_quote;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedQuoteTransitionStateActionQueryBuilderDsl {
    public StagedQuoteTransitionStateActionQueryBuilderDsl() {
    }

    public static StagedQuoteTransitionStateActionQueryBuilderDsl of() {
        return new StagedQuoteTransitionStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedQuoteTransitionStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteTransitionStateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedQuoteTransitionStateActionQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl.of())),
            StagedQuoteTransitionStateActionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<StagedQuoteTransitionStateActionQueryBuilderDsl> force() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("force")),
            p -> new CombinationQueryPredicate<>(p, StagedQuoteTransitionStateActionQueryBuilderDsl::of));
    }
}
