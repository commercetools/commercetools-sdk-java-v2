package com.commercetools.api.predicates.query.quote;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class QuoteUpdateQueryBuilderDsl  {
    public QuoteUpdateQueryBuilderDsl() {
    }

    public static QuoteUpdateQueryBuilderDsl of() {
        return new QuoteUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<QuoteUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, QuoteUpdateQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<QuoteUpdateQueryBuilderDsl> actions(
        Function<com.commercetools.api.predicates.query.quote.QuoteUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote.QuoteUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("actions"))
            .inner(fn.apply(com.commercetools.api.predicates.query.quote.QuoteUpdateActionQueryBuilderDsl.of())),
            QuoteUpdateQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<QuoteUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
                p -> new CombinationQueryPredicate<>(p, QuoteUpdateQueryBuilderDsl::of));
    }
    
}
