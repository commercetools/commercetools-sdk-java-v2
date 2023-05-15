
package com.commercetools.api.predicates.query.extension;

import com.commercetools.api.predicates.query.*;

public class ExtensionDestinationQueryBuilderDsl {
    public ExtensionDestinationQueryBuilderDsl() {
    }

    public static ExtensionDestinationQueryBuilderDsl of() {
        return new ExtensionDestinationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExtensionDestinationQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ExtensionDestinationQueryBuilderDsl::of));
    }
}
