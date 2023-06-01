package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProjectChangeCartsConfigurationActionQueryBuilderDsl  {
    public ProjectChangeCartsConfigurationActionQueryBuilderDsl() {
    }

    public static ProjectChangeCartsConfigurationActionQueryBuilderDsl of() {
        return new ProjectChangeCartsConfigurationActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProjectChangeCartsConfigurationActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProjectChangeCartsConfigurationActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProjectChangeCartsConfigurationActionQueryBuilderDsl> cartsConfiguration(
        Function<com.commercetools.api.predicates.query.project.CartsConfigurationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.CartsConfigurationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("cartsConfiguration"))
            .inner(fn.apply(com.commercetools.api.predicates.query.project.CartsConfigurationQueryBuilderDsl.of())),
            ProjectChangeCartsConfigurationActionQueryBuilderDsl::of);
    }
    
    
}
