
package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

public class ProjectChangeProductSearchStatusActionQueryBuilderDsl {
    public ProjectChangeProductSearchStatusActionQueryBuilderDsl() {
    }

    public static ProjectChangeProductSearchStatusActionQueryBuilderDsl of() {
        return new ProjectChangeProductSearchStatusActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProjectChangeProductSearchStatusActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProjectChangeProductSearchStatusActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProjectChangeProductSearchStatusActionQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
            p -> new CombinationQueryPredicate<>(p, ProjectChangeProductSearchStatusActionQueryBuilderDsl::of));
    }

}
