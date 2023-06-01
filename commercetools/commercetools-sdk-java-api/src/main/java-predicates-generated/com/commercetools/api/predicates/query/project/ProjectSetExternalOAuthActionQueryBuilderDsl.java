package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProjectSetExternalOAuthActionQueryBuilderDsl  {
    public ProjectSetExternalOAuthActionQueryBuilderDsl() {
    }

    public static ProjectSetExternalOAuthActionQueryBuilderDsl of() {
        return new ProjectSetExternalOAuthActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProjectSetExternalOAuthActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProjectSetExternalOAuthActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProjectSetExternalOAuthActionQueryBuilderDsl> externalOAuth(
        Function<com.commercetools.api.predicates.query.project.ExternalOAuthQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.ExternalOAuthQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("externalOAuth"))
            .inner(fn.apply(com.commercetools.api.predicates.query.project.ExternalOAuthQueryBuilderDsl.of())),
            ProjectSetExternalOAuthActionQueryBuilderDsl::of);
    }
    
    
}
