
package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

public class ProjectChangeCurrenciesActionQueryBuilderDsl {
    public ProjectChangeCurrenciesActionQueryBuilderDsl() {
    }

    public static ProjectChangeCurrenciesActionQueryBuilderDsl of() {
        return new ProjectChangeCurrenciesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProjectChangeCurrenciesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProjectChangeCurrenciesActionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<ProjectChangeCurrenciesActionQueryBuilderDsl> currencies() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currencies")),
            p -> new CombinationQueryPredicate<>(p, ProjectChangeCurrenciesActionQueryBuilderDsl::of));
    }

}
