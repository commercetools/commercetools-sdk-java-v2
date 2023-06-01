package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProjectChangeBusinessUnitStatusOnCreationActionQueryBuilderDsl  {
    public ProjectChangeBusinessUnitStatusOnCreationActionQueryBuilderDsl() {
    }

    public static ProjectChangeBusinessUnitStatusOnCreationActionQueryBuilderDsl of() {
        return new ProjectChangeBusinessUnitStatusOnCreationActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProjectChangeBusinessUnitStatusOnCreationActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProjectChangeBusinessUnitStatusOnCreationActionQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProjectChangeBusinessUnitStatusOnCreationActionQueryBuilderDsl> status() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("status")),
        p -> new CombinationQueryPredicate<>(p, ProjectChangeBusinessUnitStatusOnCreationActionQueryBuilderDsl::of));
    }
    
}
