
package com.commercetools.api.predicates.query.project;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProjectSetDiscountsConfigurationActionQueryBuilderDsl {
    public ProjectSetDiscountsConfigurationActionQueryBuilderDsl() {
    }

    public static ProjectSetDiscountsConfigurationActionQueryBuilderDsl of() {
        return new ProjectSetDiscountsConfigurationActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProjectSetDiscountsConfigurationActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProjectSetDiscountsConfigurationActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProjectSetDiscountsConfigurationActionQueryBuilderDsl> discountsConfiguration(
            Function<com.commercetools.api.predicates.query.project.DiscountsConfigurationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.DiscountsConfigurationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("discountsConfiguration"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.project.DiscountsConfigurationQueryBuilderDsl.of())),
            ProjectSetDiscountsConfigurationActionQueryBuilderDsl::of);
    }

}
