package com.commercetools.api.predicates.query.project;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProjectQueryBuilderDsl  {
    public ProjectQueryBuilderDsl() {
    }

    public static ProjectQueryBuilderDsl of() {
        return new ProjectQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ProjectQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, ProjectQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProjectQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, ProjectQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProjectQueryBuilderDsl> name() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("name")),
        p -> new CombinationQueryPredicate<>(p, ProjectQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<ProjectQueryBuilderDsl> countries() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("countries")),
        p -> new CombinationQueryPredicate<>(p, ProjectQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<ProjectQueryBuilderDsl> currencies() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("currencies")),
        p -> new CombinationQueryPredicate<>(p, ProjectQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<ProjectQueryBuilderDsl> languages() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("languages")),
        p -> new CombinationQueryPredicate<>(p, ProjectQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ProjectQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, ProjectQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProjectQueryBuilderDsl> trialUntil() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("trialUntil")),
        p -> new CombinationQueryPredicate<>(p, ProjectQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProjectQueryBuilderDsl> messages(
        Function<com.commercetools.api.predicates.query.message.MessagesConfigurationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.MessagesConfigurationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("messages"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.MessagesConfigurationQueryBuilderDsl.of())),
            ProjectQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProjectQueryBuilderDsl> carts(
        Function<com.commercetools.api.predicates.query.project.CartsConfigurationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.CartsConfigurationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("carts"))
            .inner(fn.apply(com.commercetools.api.predicates.query.project.CartsConfigurationQueryBuilderDsl.of())),
            ProjectQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProjectQueryBuilderDsl> shoppingLists(
        Function<com.commercetools.api.predicates.query.project.ShoppingListsConfigurationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.ShoppingListsConfigurationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("shoppingLists"))
            .inner(fn.apply(com.commercetools.api.predicates.query.project.ShoppingListsConfigurationQueryBuilderDsl.of())),
            ProjectQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProjectQueryBuilderDsl> shippingRateInputType(
        Function<com.commercetools.api.predicates.query.project.ShippingRateInputTypeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.ShippingRateInputTypeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("shippingRateInputType"))
            .inner(fn.apply(com.commercetools.api.predicates.query.project.ShippingRateInputTypeQueryBuilderDsl.of())),
            ProjectQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProjectQueryBuilderDsl> externalOAuth(
        Function<com.commercetools.api.predicates.query.project.ExternalOAuthQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.ExternalOAuthQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("externalOAuth"))
            .inner(fn.apply(com.commercetools.api.predicates.query.project.ExternalOAuthQueryBuilderDsl.of())),
            ProjectQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProjectQueryBuilderDsl> searchIndexing(
        Function<com.commercetools.api.predicates.query.project.SearchIndexingConfigurationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.SearchIndexingConfigurationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("searchIndexing"))
            .inner(fn.apply(com.commercetools.api.predicates.query.project.SearchIndexingConfigurationQueryBuilderDsl.of())),
            ProjectQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProjectQueryBuilderDsl> businessUnits(
        Function<com.commercetools.api.predicates.query.project.BusinessUnitConfigurationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.project.BusinessUnitConfigurationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("businessUnits"))
            .inner(fn.apply(com.commercetools.api.predicates.query.project.BusinessUnitConfigurationQueryBuilderDsl.of())),
            ProjectQueryBuilderDsl::of);
    }
    
    
}
