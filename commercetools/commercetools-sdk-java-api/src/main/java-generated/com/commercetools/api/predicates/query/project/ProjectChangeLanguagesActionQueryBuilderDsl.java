
package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

public class ProjectChangeLanguagesActionQueryBuilderDsl {
    public ProjectChangeLanguagesActionQueryBuilderDsl() {
    }

    public static ProjectChangeLanguagesActionQueryBuilderDsl of() {
        return new ProjectChangeLanguagesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProjectChangeLanguagesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProjectChangeLanguagesActionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<ProjectChangeLanguagesActionQueryBuilderDsl> languages() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("languages")),
            p -> new CombinationQueryPredicate<>(p, ProjectChangeLanguagesActionQueryBuilderDsl::of));
    }
}
