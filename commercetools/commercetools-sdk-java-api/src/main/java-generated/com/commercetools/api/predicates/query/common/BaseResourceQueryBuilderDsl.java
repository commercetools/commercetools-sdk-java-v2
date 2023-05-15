
package com.commercetools.api.predicates.query.common;

import com.commercetools.api.predicates.query.*;

public class BaseResourceQueryBuilderDsl {
    public BaseResourceQueryBuilderDsl() {
    }

    public static BaseResourceQueryBuilderDsl of() {
        return new BaseResourceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<BaseResourceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, BaseResourceQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<BaseResourceQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, BaseResourceQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<BaseResourceQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, BaseResourceQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<BaseResourceQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, BaseResourceQueryBuilderDsl::of));
    }
}
