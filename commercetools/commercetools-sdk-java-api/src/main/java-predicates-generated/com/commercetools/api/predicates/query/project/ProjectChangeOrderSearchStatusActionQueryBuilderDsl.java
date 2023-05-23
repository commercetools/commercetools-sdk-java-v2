
package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

public class ProjectChangeOrderSearchStatusActionQueryBuilderDsl {
    public ProjectChangeOrderSearchStatusActionQueryBuilderDsl() {
    }

    public static ProjectChangeOrderSearchStatusActionQueryBuilderDsl of() {
        return new ProjectChangeOrderSearchStatusActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProjectChangeOrderSearchStatusActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProjectChangeOrderSearchStatusActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProjectChangeOrderSearchStatusActionQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
            p -> new CombinationQueryPredicate<>(p, ProjectChangeOrderSearchStatusActionQueryBuilderDsl::of));
    }

}
