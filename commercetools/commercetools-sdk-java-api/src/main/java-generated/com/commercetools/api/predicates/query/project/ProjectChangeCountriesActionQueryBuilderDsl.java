
package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

public class ProjectChangeCountriesActionQueryBuilderDsl {
    public ProjectChangeCountriesActionQueryBuilderDsl() {
    }

    public static ProjectChangeCountriesActionQueryBuilderDsl of() {
        return new ProjectChangeCountriesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProjectChangeCountriesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProjectChangeCountriesActionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<ProjectChangeCountriesActionQueryBuilderDsl> countries() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("countries")),
            p -> new CombinationQueryPredicate<>(p, ProjectChangeCountriesActionQueryBuilderDsl::of));
    }
}
