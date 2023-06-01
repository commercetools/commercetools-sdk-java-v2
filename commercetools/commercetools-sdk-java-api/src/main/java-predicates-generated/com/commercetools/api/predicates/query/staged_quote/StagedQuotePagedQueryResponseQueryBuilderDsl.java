package com.commercetools.api.predicates.query.staged_quote;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StagedQuotePagedQueryResponseQueryBuilderDsl  {
    public StagedQuotePagedQueryResponseQueryBuilderDsl() {
    }

    public static StagedQuotePagedQueryResponseQueryBuilderDsl of() {
        return new StagedQuotePagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<StagedQuotePagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
        p -> new CombinationQueryPredicate<>(p, StagedQuotePagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<StagedQuotePagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
        p -> new CombinationQueryPredicate<>(p, StagedQuotePagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<StagedQuotePagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
        p -> new CombinationQueryPredicate<>(p, StagedQuotePagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<StagedQuotePagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
        p -> new CombinationQueryPredicate<>(p, StagedQuotePagedQueryResponseQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StagedQuotePagedQueryResponseQueryBuilderDsl> results(
        Function<com.commercetools.api.predicates.query.staged_quote.StagedQuoteQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.staged_quote.StagedQuoteQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("results"))
            .inner(fn.apply(com.commercetools.api.predicates.query.staged_quote.StagedQuoteQueryBuilderDsl.of())),
            StagedQuotePagedQueryResponseQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StagedQuotePagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
                p -> new CombinationQueryPredicate<>(p, StagedQuotePagedQueryResponseQueryBuilderDsl::of));
    }
    
}
