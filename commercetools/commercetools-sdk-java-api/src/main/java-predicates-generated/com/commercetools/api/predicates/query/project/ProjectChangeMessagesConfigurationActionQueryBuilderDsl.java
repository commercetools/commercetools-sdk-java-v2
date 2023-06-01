package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProjectChangeMessagesConfigurationActionQueryBuilderDsl  {
    public ProjectChangeMessagesConfigurationActionQueryBuilderDsl() {
    }

    public static ProjectChangeMessagesConfigurationActionQueryBuilderDsl of() {
        return new ProjectChangeMessagesConfigurationActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProjectChangeMessagesConfigurationActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProjectChangeMessagesConfigurationActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProjectChangeMessagesConfigurationActionQueryBuilderDsl> messagesConfiguration(
        Function<com.commercetools.api.predicates.query.message.MessagesConfigurationDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.MessagesConfigurationDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("messagesConfiguration"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.MessagesConfigurationDraftQueryBuilderDsl.of())),
            ProjectChangeMessagesConfigurationActionQueryBuilderDsl::of);
    }
    
    
}
