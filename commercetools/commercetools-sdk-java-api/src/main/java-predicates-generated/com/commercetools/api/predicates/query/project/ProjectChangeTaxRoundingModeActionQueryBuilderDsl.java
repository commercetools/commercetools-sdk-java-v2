
package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

public class ProjectChangeTaxRoundingModeActionQueryBuilderDsl {
    public ProjectChangeTaxRoundingModeActionQueryBuilderDsl() {
    }

    public static ProjectChangeTaxRoundingModeActionQueryBuilderDsl of() {
        return new ProjectChangeTaxRoundingModeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProjectChangeTaxRoundingModeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProjectChangeTaxRoundingModeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProjectChangeTaxRoundingModeActionQueryBuilderDsl> taxRoundingMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("taxRoundingMode")),
            p -> new CombinationQueryPredicate<>(p, ProjectChangeTaxRoundingModeActionQueryBuilderDsl::of));
    }

}
