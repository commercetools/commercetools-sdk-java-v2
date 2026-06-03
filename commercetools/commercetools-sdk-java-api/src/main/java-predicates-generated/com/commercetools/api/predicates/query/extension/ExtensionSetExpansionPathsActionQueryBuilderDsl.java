
package com.commercetools.api.predicates.query.extension;

import com.commercetools.api.predicates.query.*;

public class ExtensionSetExpansionPathsActionQueryBuilderDsl {
    public ExtensionSetExpansionPathsActionQueryBuilderDsl() {
    }

    public static ExtensionSetExpansionPathsActionQueryBuilderDsl of() {
        return new ExtensionSetExpansionPathsActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExtensionSetExpansionPathsActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ExtensionSetExpansionPathsActionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<ExtensionSetExpansionPathsActionQueryBuilderDsl> expansionPaths() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("expansionPaths")),
            p -> new CombinationQueryPredicate<>(p, ExtensionSetExpansionPathsActionQueryBuilderDsl::of));
    }

}
