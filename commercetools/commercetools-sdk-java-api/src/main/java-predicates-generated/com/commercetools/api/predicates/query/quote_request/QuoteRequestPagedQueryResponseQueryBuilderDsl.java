package com.commercetools.api.predicates.query.quote_request;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class QuoteRequestPagedQueryResponseQueryBuilderDsl  {
    public QuoteRequestPagedQueryResponseQueryBuilderDsl() {
    }

    public static QuoteRequestPagedQueryResponseQueryBuilderDsl of() {
        return new QuoteRequestPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<QuoteRequestPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<QuoteRequestPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<QuoteRequestPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<QuoteRequestPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
        p -> new CombinationQueryPredicate<>(p, QuoteRequestPagedQueryResponseQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<QuoteRequestPagedQueryResponseQueryBuilderDsl> results(
        Function<com.commercetools.api.predicates.query.quote_request.QuoteRequestQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.quote_request.QuoteRequestQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("results"))
            .inner(fn.apply(com.commercetools.api.predicates.query.quote_request.QuoteRequestQueryBuilderDsl.of())),
            QuoteRequestPagedQueryResponseQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<QuoteRequestPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
                p -> new CombinationQueryPredicate<>(p, QuoteRequestPagedQueryResponseQueryBuilderDsl::of));
    }
    
}
