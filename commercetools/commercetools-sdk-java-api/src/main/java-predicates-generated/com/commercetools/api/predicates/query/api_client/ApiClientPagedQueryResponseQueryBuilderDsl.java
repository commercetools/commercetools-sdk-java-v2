package com.commercetools.api.predicates.query.api_client;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ApiClientPagedQueryResponseQueryBuilderDsl  {
    public ApiClientPagedQueryResponseQueryBuilderDsl() {
    }

    public static ApiClientPagedQueryResponseQueryBuilderDsl of() {
        return new ApiClientPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ApiClientPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
        p -> new CombinationQueryPredicate<>(p, ApiClientPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ApiClientPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
        p -> new CombinationQueryPredicate<>(p, ApiClientPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ApiClientPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
        p -> new CombinationQueryPredicate<>(p, ApiClientPagedQueryResponseQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ApiClientPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
        p -> new CombinationQueryPredicate<>(p, ApiClientPagedQueryResponseQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ApiClientPagedQueryResponseQueryBuilderDsl> results(
        Function<com.commercetools.api.predicates.query.api_client.ApiClientQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.api_client.ApiClientQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("results"))
            .inner(fn.apply(com.commercetools.api.predicates.query.api_client.ApiClientQueryBuilderDsl.of())),
            ApiClientPagedQueryResponseQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ApiClientPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
                p -> new CombinationQueryPredicate<>(p, ApiClientPagedQueryResponseQueryBuilderDsl::of));
    }
    
}
