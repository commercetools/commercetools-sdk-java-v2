package com.commercetools.api.predicates.query.quote;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class QuotePagedQueryResponseQueryBuilderDsl  {
    public QuotePagedQueryResponseQueryBuilderDsl() {
    }

    public static QuotePagedQueryResponseQueryBuilderDsl of() {
        return new QuotePagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<QuotePagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
        p -> new CombinationQueryPredicate<>(p, QuotePagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<QuotePagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
        p -> new CombinationQueryPredicate<>(p, QuotePagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<QuotePagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
        p -> new CombinationQueryPredicate<>(p, QuotePagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<QuotePagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
        p -> new CombinationQueryPredicate<>(p, QuotePagedQueryResponseQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<QuotePagedQueryResponseQueryBuilderDsl> results(
        Function<com.commercetools.api.predicates.query.quote.QuoteQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote.QuoteQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("results"))
            .inner(fn.apply(com.commercetools.api.predicates.query.quote.QuoteQueryBuilderDsl.of())),
            QuotePagedQueryResponseQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<QuotePagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
                p -> new CombinationQueryPredicate<>(p, QuotePagedQueryResponseQueryBuilderDsl::of));
    }
    
}
