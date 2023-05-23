
package com.commercetools.api.predicates.query.project;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProjectSetShippingRateInputTypeActionQueryBuilderDsl {
    public ProjectSetShippingRateInputTypeActionQueryBuilderDsl() {
    }

    public static ProjectSetShippingRateInputTypeActionQueryBuilderDsl of() {
        return new ProjectSetShippingRateInputTypeActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProjectSetShippingRateInputTypeActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProjectSetShippingRateInputTypeActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProjectSetShippingRateInputTypeActionQueryBuilderDsl> shippingRateInputType(
            Function<com.commercetools.api.predicates.query.project.ShippingRateInputTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.ShippingRateInputTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("shippingRateInputType"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.project.ShippingRateInputTypeQueryBuilderDsl.of())),
            ProjectSetShippingRateInputTypeActionQueryBuilderDsl::of);
    }

}
