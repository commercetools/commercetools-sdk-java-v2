package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProjectUpdateQueryBuilderDsl  {
    public ProjectUpdateQueryBuilderDsl() {
    }

    public static ProjectUpdateQueryBuilderDsl of() {
        return new ProjectUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ProjectUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, ProjectUpdateQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProjectUpdateQueryBuilderDsl> actions(
        Function<com.commercetools.api.predicates.query.project.ProjectUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.ProjectUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("actions"))
            .inner(fn.apply(com.commercetools.api.predicates.query.project.ProjectUpdateActionQueryBuilderDsl.of())),
            ProjectUpdateQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ProjectUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
                p -> new CombinationQueryPredicate<>(p, ProjectUpdateQueryBuilderDsl::of));
    }
    
}
