package com.commercetools.api.predicates.query.staged_quote;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedQuoteReferenceQueryBuilderDsl  {
    public StagedQuoteReferenceQueryBuilderDsl() {
    }

    public static StagedQuoteReferenceQueryBuilderDsl of() {
        return new StagedQuoteReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedQuoteReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, StagedQuoteReferenceQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StagedQuoteReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, StagedQuoteReferenceQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedQuoteReferenceQueryBuilderDsl> obj(
        Function<com.commercetools.api.predicates.query.staged_quote.StagedQuoteQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.staged_quote.StagedQuoteQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("obj"))
            .inner(fn.apply(com.commercetools.api.predicates.query.staged_quote.StagedQuoteQueryBuilderDsl.of())),
            StagedQuoteReferenceQueryBuilderDsl::of);
    }
    
    
}
