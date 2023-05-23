
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class ErrorByExtensionQueryBuilderDsl {
    public ErrorByExtensionQueryBuilderDsl() {
    }

    public static ErrorByExtensionQueryBuilderDsl of() {
        return new ErrorByExtensionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ErrorByExtensionQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ErrorByExtensionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ErrorByExtensionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ErrorByExtensionQueryBuilderDsl::of));
    }

}
