
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class ExtensionChainTooWideErrorQueryBuilderDsl {
    public ExtensionChainTooWideErrorQueryBuilderDsl() {
    }

    public static ExtensionChainTooWideErrorQueryBuilderDsl of() {
        return new ExtensionChainTooWideErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExtensionChainTooWideErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, ExtensionChainTooWideErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ExtensionChainTooWideErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, ExtensionChainTooWideErrorQueryBuilderDsl::of));
    }

}
