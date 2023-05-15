
package com.commercetools.api.predicates.query.extension;

import com.commercetools.api.predicates.query.*;

public class ExtensionUpdateActionQueryBuilderDsl {
    public ExtensionUpdateActionQueryBuilderDsl() {
    }

    public static ExtensionUpdateActionQueryBuilderDsl of() {
        return new ExtensionUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExtensionUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ExtensionUpdateActionQueryBuilderDsl::of));
    }
}
