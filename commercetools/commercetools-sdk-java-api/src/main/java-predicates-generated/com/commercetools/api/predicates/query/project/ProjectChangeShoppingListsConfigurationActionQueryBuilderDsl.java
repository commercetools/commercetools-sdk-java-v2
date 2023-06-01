package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProjectChangeShoppingListsConfigurationActionQueryBuilderDsl  {
    public ProjectChangeShoppingListsConfigurationActionQueryBuilderDsl() {
    }

    public static ProjectChangeShoppingListsConfigurationActionQueryBuilderDsl of() {
        return new ProjectChangeShoppingListsConfigurationActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProjectChangeShoppingListsConfigurationActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProjectChangeShoppingListsConfigurationActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProjectChangeShoppingListsConfigurationActionQueryBuilderDsl> shoppingListsConfiguration(
        Function<com.commercetools.api.predicates.query.project.ShoppingListsConfigurationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.ShoppingListsConfigurationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("shoppingListsConfiguration"))
            .inner(fn.apply(com.commercetools.api.predicates.query.project.ShoppingListsConfigurationQueryBuilderDsl.of())),
            ProjectChangeShoppingListsConfigurationActionQueryBuilderDsl::of);
    }
    
    
}
