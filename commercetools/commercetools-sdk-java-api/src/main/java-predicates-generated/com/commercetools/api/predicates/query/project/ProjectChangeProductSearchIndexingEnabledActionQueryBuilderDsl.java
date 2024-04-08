
package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

public class ProjectChangeProductSearchIndexingEnabledActionQueryBuilderDsl {
    public ProjectChangeProductSearchIndexingEnabledActionQueryBuilderDsl() {
    }

    public static ProjectChangeProductSearchIndexingEnabledActionQueryBuilderDsl of() {
        return new ProjectChangeProductSearchIndexingEnabledActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProjectChangeProductSearchIndexingEnabledActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p,
                ProjectChangeProductSearchIndexingEnabledActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProjectChangeProductSearchIndexingEnabledActionQueryBuilderDsl> enabled() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("enabled")),
            p -> new CombinationQueryPredicate<>(p,
                ProjectChangeProductSearchIndexingEnabledActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProjectChangeProductSearchIndexingEnabledActionQueryBuilderDsl> mode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("mode")), p -> new CombinationQueryPredicate<>(p,
                ProjectChangeProductSearchIndexingEnabledActionQueryBuilderDsl::of));
    }

}
