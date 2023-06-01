package com.commercetools.api.predicates.query.quote;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class QuoteTransitionStateActionQueryBuilderDsl  {
    public QuoteTransitionStateActionQueryBuilderDsl() {
    }

    public static QuoteTransitionStateActionQueryBuilderDsl of() {
        return new QuoteTransitionStateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<QuoteTransitionStateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, QuoteTransitionStateActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<QuoteTransitionStateActionQueryBuilderDsl> state(
        Function<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("state"))
            .inner(fn.apply(com.commercetools.api.predicates.query.state.StateResourceIdentifierQueryBuilderDsl.of())),
            QuoteTransitionStateActionQueryBuilderDsl::of);
    }
    
    public BooleanComparisonPredicateBuilder<QuoteTransitionStateActionQueryBuilderDsl> force() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("force")),
        p -> new CombinationQueryPredicate<>(p, QuoteTransitionStateActionQueryBuilderDsl::of));
    }
    
}
