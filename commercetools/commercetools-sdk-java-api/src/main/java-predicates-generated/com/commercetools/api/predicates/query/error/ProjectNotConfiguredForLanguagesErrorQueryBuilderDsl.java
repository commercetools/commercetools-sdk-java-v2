
package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

public class ProjectNotConfiguredForLanguagesErrorQueryBuilderDsl {
    public ProjectNotConfiguredForLanguagesErrorQueryBuilderDsl() {
    }

    public static ProjectNotConfiguredForLanguagesErrorQueryBuilderDsl of() {
        return new ProjectNotConfiguredForLanguagesErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProjectNotConfiguredForLanguagesErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
            p -> new CombinationQueryPredicate<>(p, ProjectNotConfiguredForLanguagesErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProjectNotConfiguredForLanguagesErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p, ProjectNotConfiguredForLanguagesErrorQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<ProjectNotConfiguredForLanguagesErrorQueryBuilderDsl> languages() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("languages")),
            p -> new CombinationQueryPredicate<>(p, ProjectNotConfiguredForLanguagesErrorQueryBuilderDsl::of));
    }

}
