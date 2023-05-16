
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class ExtensionNoResponseErrorQueryBuilderDsl {
    public ExtensionNoResponseErrorQueryBuilderDsl() {
    }

    public static ExtensionNoResponseErrorQueryBuilderDsl of() {
        return new ExtensionNoResponseErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExtensionNoResponseErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, ExtensionNoResponseErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ExtensionNoResponseErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, ExtensionNoResponseErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ExtensionNoResponseErrorQueryBuilderDsl> extensionId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("extensionId")),
            p -> new CombinationQueryPredicate<>(p, ExtensionNoResponseErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ExtensionNoResponseErrorQueryBuilderDsl> extensionKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("extensionKey")),
            p -> new CombinationQueryPredicate<>(p, ExtensionNoResponseErrorQueryBuilderDsl::of));
    }

}
