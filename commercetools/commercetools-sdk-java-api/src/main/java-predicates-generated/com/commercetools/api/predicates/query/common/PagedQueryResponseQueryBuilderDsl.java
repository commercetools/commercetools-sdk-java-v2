package com.commercetools.api.predicates.query.common;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class PagedQueryResponseQueryBuilderDsl  {
    public PagedQueryResponseQueryBuilderDsl() {
    }

    public static PagedQueryResponseQueryBuilderDsl of() {
        return new PagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<PagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
        p -> new CombinationQueryPredicate<>(p, PagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<PagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
        p -> new CombinationQueryPredicate<>(p, PagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<PagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
        p -> new CombinationQueryPredicate<>(p, PagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<PagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
        p -> new CombinationQueryPredicate<>(p, PagedQueryResponseQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<PagedQueryResponseQueryBuilderDsl> results(
        Function<com.commercetools.api.predicates.query.common.BaseResourceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseResourceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("results"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseResourceQueryBuilderDsl.of())),
            PagedQueryResponseQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<PagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
                p -> new CombinationQueryPredicate<>(p, PagedQueryResponseQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<PagedQueryResponseQueryBuilderDsl> meta() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("meta")),
        p -> new CombinationQueryPredicate<>(p, PagedQueryResponseQueryBuilderDsl::of));
    }
    
}
