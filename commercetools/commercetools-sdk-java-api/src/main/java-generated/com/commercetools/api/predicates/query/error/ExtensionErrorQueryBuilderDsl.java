
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class ExtensionErrorQueryBuilderDsl {
    public ExtensionErrorQueryBuilderDsl() {
    }

    public static ExtensionErrorQueryBuilderDsl of() {
        return new ExtensionErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExtensionErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, ExtensionErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ExtensionErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, ExtensionErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ExtensionErrorQueryBuilderDsl> extensionId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("extensionId")),
            p -> new CombinationQueryPredicate<>(p, ExtensionErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ExtensionErrorQueryBuilderDsl> extensionKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("extensionKey")),
            p -> new CombinationQueryPredicate<>(p, ExtensionErrorQueryBuilderDsl::of));
    }
}
