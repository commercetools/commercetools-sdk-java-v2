
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class ContentTooLargeErrorQueryBuilderDsl {
    public ContentTooLargeErrorQueryBuilderDsl() {
    }

    public static ContentTooLargeErrorQueryBuilderDsl of() {
        return new ContentTooLargeErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ContentTooLargeErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, ContentTooLargeErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ContentTooLargeErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, ContentTooLargeErrorQueryBuilderDsl::of));
    }

}
