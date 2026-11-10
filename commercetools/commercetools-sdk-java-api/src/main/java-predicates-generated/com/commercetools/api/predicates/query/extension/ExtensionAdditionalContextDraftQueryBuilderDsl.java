
package com.commercetools.api.predicates.query.extension;

import com.commercetools.api.predicates.query.*;

public class ExtensionAdditionalContextDraftQueryBuilderDsl {
    public ExtensionAdditionalContextDraftQueryBuilderDsl() {
    }

    public static ExtensionAdditionalContextDraftQueryBuilderDsl of() {
        return new ExtensionAdditionalContextDraftQueryBuilderDsl();
    }

    public BooleanComparisonPredicateBuilder<ExtensionAdditionalContextDraftQueryBuilderDsl> includeOldResource() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("includeOldResource")),
            p -> new CombinationQueryPredicate<>(p, ExtensionAdditionalContextDraftQueryBuilderDsl::of));
    }

}
