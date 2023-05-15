
package com.commercetools.api.predicates.query.extension;

import com.commercetools.api.predicates.query.*;

public class ExtensionTriggerQueryBuilderDsl {
    public ExtensionTriggerQueryBuilderDsl() {
    }

    public static ExtensionTriggerQueryBuilderDsl of() {
        return new ExtensionTriggerQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExtensionTriggerQueryBuilderDsl> resourceTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceTypeId")),
            p -> new CombinationQueryPredicate<>(p, ExtensionTriggerQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<ExtensionTriggerQueryBuilderDsl> actions() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, ExtensionTriggerQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ExtensionTriggerQueryBuilderDsl> condition() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("condition")),
            p -> new CombinationQueryPredicate<>(p, ExtensionTriggerQueryBuilderDsl::of));
    }
}
