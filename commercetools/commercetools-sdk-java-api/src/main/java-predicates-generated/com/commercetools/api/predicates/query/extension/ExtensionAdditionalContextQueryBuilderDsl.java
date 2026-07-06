
package com.commercetools.api.predicates.query.extension;

import com.commercetools.api.predicates.query.*;

public class ExtensionAdditionalContextQueryBuilderDsl {
    public ExtensionAdditionalContextQueryBuilderDsl() {
    }

    public static ExtensionAdditionalContextQueryBuilderDsl of() {
        return new ExtensionAdditionalContextQueryBuilderDsl();
    }

    public BooleanComparisonPredicateBuilder<ExtensionAdditionalContextQueryBuilderDsl> includeOldResource() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("includeOldResource")),
            p -> new CombinationQueryPredicate<>(p, ExtensionAdditionalContextQueryBuilderDsl::of));
    }

}
