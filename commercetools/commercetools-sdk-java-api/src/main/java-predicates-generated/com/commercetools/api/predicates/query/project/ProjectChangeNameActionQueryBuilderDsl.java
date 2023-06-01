package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProjectChangeNameActionQueryBuilderDsl  {
    public ProjectChangeNameActionQueryBuilderDsl() {
    }

    public static ProjectChangeNameActionQueryBuilderDsl of() {
        return new ProjectChangeNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProjectChangeNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProjectChangeNameActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProjectChangeNameActionQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, ProjectChangeNameActionQueryBuilderDsl::of));
    }
    
}
