
package com.commercetools.api.predicates.query.api_client;

import com.commercetools.api.predicates.query.*;

public class ApiClientDraftQueryBuilderDsl {
    public ApiClientDraftQueryBuilderDsl() {
    }

    public static ApiClientDraftQueryBuilderDsl of() {
        return new ApiClientDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApiClientDraftQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ApiClientDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApiClientDraftQueryBuilderDsl> scope() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("scope")),
            p -> new CombinationQueryPredicate<>(p, ApiClientDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ApiClientDraftQueryBuilderDsl> deleteDaysAfterCreation() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deleteDaysAfterCreation")),
            p -> new CombinationQueryPredicate<>(p, ApiClientDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ApiClientDraftQueryBuilderDsl> accessTokenValiditySeconds() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("accessTokenValiditySeconds")),
            p -> new CombinationQueryPredicate<>(p, ApiClientDraftQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ApiClientDraftQueryBuilderDsl> refreshTokenValiditySeconds() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("refreshTokenValiditySeconds")),
            p -> new CombinationQueryPredicate<>(p, ApiClientDraftQueryBuilderDsl::of));
    }

}
