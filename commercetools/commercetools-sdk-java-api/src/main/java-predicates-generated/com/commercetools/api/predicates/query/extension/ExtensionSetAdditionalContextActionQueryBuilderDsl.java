
package com.commercetools.api.predicates.query.extension;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ExtensionSetAdditionalContextActionQueryBuilderDsl {
    public ExtensionSetAdditionalContextActionQueryBuilderDsl() {
    }

    public static ExtensionSetAdditionalContextActionQueryBuilderDsl of() {
        return new ExtensionSetAdditionalContextActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExtensionSetAdditionalContextActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ExtensionSetAdditionalContextActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ExtensionSetAdditionalContextActionQueryBuilderDsl> additionalContext(
            Function<com.commercetools.api.predicates.query.extension.ExtensionAdditionalContextDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.extension.ExtensionAdditionalContextDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("additionalContext"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.extension.ExtensionAdditionalContextDraftQueryBuilderDsl
                            .of())),
            ExtensionSetAdditionalContextActionQueryBuilderDsl::of);
    }

}
