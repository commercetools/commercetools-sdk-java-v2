
package com.commercetools.api.predicates.query.extension;

import com.commercetools.api.predicates.query.*;

public class ExtensionSetKeyActionQueryBuilderDsl {
    public ExtensionSetKeyActionQueryBuilderDsl() {
    }

    public static ExtensionSetKeyActionQueryBuilderDsl of() {
        return new ExtensionSetKeyActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExtensionSetKeyActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ExtensionSetKeyActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ExtensionSetKeyActionQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ExtensionSetKeyActionQueryBuilderDsl::of));
    }
}
