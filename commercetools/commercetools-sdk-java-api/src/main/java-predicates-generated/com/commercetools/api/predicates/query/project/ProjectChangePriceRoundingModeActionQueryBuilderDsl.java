
package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

public class ProjectChangePriceRoundingModeActionQueryBuilderDsl {
    public ProjectChangePriceRoundingModeActionQueryBuilderDsl() {
    }

    public static ProjectChangePriceRoundingModeActionQueryBuilderDsl of() {
        return new ProjectChangePriceRoundingModeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProjectChangePriceRoundingModeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProjectChangePriceRoundingModeActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProjectChangePriceRoundingModeActionQueryBuilderDsl> priceRoundingMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceRoundingMode")),
            p -> new CombinationQueryPredicate<>(p, ProjectChangePriceRoundingModeActionQueryBuilderDsl::of));
    }

}
