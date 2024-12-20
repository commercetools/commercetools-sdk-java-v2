
package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

public class ProjectChangeBusinessUnitSearchStatusActionQueryBuilderDsl {
    public ProjectChangeBusinessUnitSearchStatusActionQueryBuilderDsl() {
    }

    public static ProjectChangeBusinessUnitSearchStatusActionQueryBuilderDsl of() {
        return new ProjectChangeBusinessUnitSearchStatusActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProjectChangeBusinessUnitSearchStatusActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProjectChangeBusinessUnitSearchStatusActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProjectChangeBusinessUnitSearchStatusActionQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
            p -> new CombinationQueryPredicate<>(p, ProjectChangeBusinessUnitSearchStatusActionQueryBuilderDsl::of));
    }

}
