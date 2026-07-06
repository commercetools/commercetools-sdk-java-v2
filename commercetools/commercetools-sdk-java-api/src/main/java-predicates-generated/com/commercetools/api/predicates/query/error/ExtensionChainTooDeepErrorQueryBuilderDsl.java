
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class ExtensionChainTooDeepErrorQueryBuilderDsl {
    public ExtensionChainTooDeepErrorQueryBuilderDsl() {
    }

    public static ExtensionChainTooDeepErrorQueryBuilderDsl of() {
        return new ExtensionChainTooDeepErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExtensionChainTooDeepErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, ExtensionChainTooDeepErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ExtensionChainTooDeepErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, ExtensionChainTooDeepErrorQueryBuilderDsl::of));
    }

}
