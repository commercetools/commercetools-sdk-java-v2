
package com.commercetools.api.predicates.query.api_client;

import com.commercetools.api.predicates.query.*;

public class ApiClientQueryBuilderDsl {
    public ApiClientQueryBuilderDsl() {
    }

    public static ApiClientQueryBuilderDsl of() {
        return new ApiClientQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApiClientQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ApiClientQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApiClientQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
            p -> new CombinationQueryPredicate<>(p, ApiClientQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApiClientQueryBuilderDsl> scope() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("scope")),
            p -> new CombinationQueryPredicate<>(p, ApiClientQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ApiClientQueryBuilderDsl> secret() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("secret")),
            p -> new CombinationQueryPredicate<>(p, ApiClientQueryBuilderDsl::of));
    }

    public DateComparisonPredicateBuilder<ApiClientQueryBuilderDsl> lastUsedAt() {
        return new DateComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastUsedAt")),
            p -> new CombinationQueryPredicate<>(p, ApiClientQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ApiClientQueryBuilderDsl> deleteAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deleteAt")),
            p -> new CombinationQueryPredicate<>(p, ApiClientQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ApiClientQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ApiClientQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ApiClientQueryBuilderDsl> accessTokenValiditySeconds() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("accessTokenValiditySeconds")),
            p -> new CombinationQueryPredicate<>(p, ApiClientQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ApiClientQueryBuilderDsl> refreshTokenValiditySeconds() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("refreshTokenValiditySeconds")),
            p -> new CombinationQueryPredicate<>(p, ApiClientQueryBuilderDsl::of));
    }
}
