
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class ExtensionDependencyExistsErrorQueryBuilderDsl {
    public ExtensionDependencyExistsErrorQueryBuilderDsl() {
    }

    public static ExtensionDependencyExistsErrorQueryBuilderDsl of() {
        return new ExtensionDependencyExistsErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExtensionDependencyExistsErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, ExtensionDependencyExistsErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ExtensionDependencyExistsErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, ExtensionDependencyExistsErrorQueryBuilderDsl::of));
    }

}
