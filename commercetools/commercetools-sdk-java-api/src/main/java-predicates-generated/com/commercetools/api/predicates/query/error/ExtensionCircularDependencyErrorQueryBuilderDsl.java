
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class ExtensionCircularDependencyErrorQueryBuilderDsl {
    public ExtensionCircularDependencyErrorQueryBuilderDsl() {
    }

    public static ExtensionCircularDependencyErrorQueryBuilderDsl of() {
        return new ExtensionCircularDependencyErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExtensionCircularDependencyErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, ExtensionCircularDependencyErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ExtensionCircularDependencyErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, ExtensionCircularDependencyErrorQueryBuilderDsl::of));
    }

}
