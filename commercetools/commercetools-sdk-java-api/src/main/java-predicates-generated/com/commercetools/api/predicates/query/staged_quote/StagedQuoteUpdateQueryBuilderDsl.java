package com.commercetools.api.predicates.query.staged_quote;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedQuoteUpdateQueryBuilderDsl  {
    public StagedQuoteUpdateQueryBuilderDsl() {
    }

    public static StagedQuoteUpdateQueryBuilderDsl of() {
        return new StagedQuoteUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<StagedQuoteUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, StagedQuoteUpdateQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedQuoteUpdateQueryBuilderDsl> actions(
        Function<com.commercetools.api.predicates.query.staged_quote.StagedQuoteUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.staged_quote.StagedQuoteUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("actions"))
            .inner(fn.apply(com.commercetools.api.predicates.query.staged_quote.StagedQuoteUpdateActionQueryBuilderDsl.of())),
            StagedQuoteUpdateQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StagedQuoteUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
                p -> new CombinationQueryPredicate<>(p, StagedQuoteUpdateQueryBuilderDsl::of));
    }
    
}
