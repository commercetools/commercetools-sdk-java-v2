
package com.commercetools.api.predicates.query.quote_request;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class QuoteRequestTransitionStateActionQueryBuilderDsl {
    public QuoteRequestTransitionStateActionQueryBuilderDsl() {
    }

    public static QuoteRequestTransitionStateActionQueryBuilderDsl of() {
        return new QuoteRequestTransitionStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteRequestTransitionStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestTransitionStateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<QuoteRequestTransitionStateActionQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl.of())),
            QuoteRequestTransitionStateActionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<QuoteRequestTransitionStateActionQueryBuilderDsl> force() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("force")),
            p -> new CombinationQueryPredicate<>(p, QuoteRequestTransitionStateActionQueryBuilderDsl::of));
    }

}
