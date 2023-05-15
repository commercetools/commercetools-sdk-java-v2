
package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

public class ProjectUpdateActionQueryBuilderDsl {
    public ProjectUpdateActionQueryBuilderDsl() {
    }

    public static ProjectUpdateActionQueryBuilderDsl of() {
        return new ProjectUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProjectUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProjectUpdateActionQueryBuilderDsl::of));
    }
}
