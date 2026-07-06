
package com.commercetools.api.predicates.query.extension;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ExtensionSetDependenciesActionQueryBuilderDsl {
    public ExtensionSetDependenciesActionQueryBuilderDsl() {
    }

    public static ExtensionSetDependenciesActionQueryBuilderDsl of() {
        return new ExtensionSetDependenciesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ExtensionSetDependenciesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ExtensionSetDependenciesActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ExtensionSetDependenciesActionQueryBuilderDsl> dependencies(
            Function<com.commercetools.api.predicates.query.extension.ExtensionResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.extension.ExtensionResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("dependencies"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.extension.ExtensionResourceIdentifierQueryBuilderDsl.of())),
            ExtensionSetDependenciesActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ExtensionSetDependenciesActionQueryBuilderDsl> dependencies() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("dependencies")),
            p -> new CombinationQueryPredicate<>(p, ExtensionSetDependenciesActionQueryBuilderDsl::of));
    }

}
