package com.commercetools.api.predicates.query.shopping_list;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ShoppingListQueryBuilderDsl  {
    public ShoppingListQueryBuilderDsl() {
    }

    public static ShoppingListQueryBuilderDsl of() {
        return new ShoppingListQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ShoppingListQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ShoppingListQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ShoppingListQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ShoppingListQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ShoppingListQueryBuilderDsl> name(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("name"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ShoppingListQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<ShoppingListQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ShoppingListQueryBuilderDsl> customer(
        Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("customer"))
            .inner(fn.apply(com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            ShoppingListQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ShoppingListQueryBuilderDsl> slug(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("slug"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ShoppingListQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ShoppingListQueryBuilderDsl> description(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("description"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ShoppingListQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ShoppingListQueryBuilderDsl> lineItems(
        Function<com.commercetools.api.predicates.query.shopping_list.ShoppingListLineItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.ShoppingListLineItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lineItems"))
            .inner(fn.apply(com.commercetools.api.predicates.query.shopping_list.ShoppingListLineItemQueryBuilderDsl.of())),
            ShoppingListQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ShoppingListQueryBuilderDsl> lineItems() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItems")),
                p -> new CombinationQueryPredicate<>(p, ShoppingListQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ShoppingListQueryBuilderDsl> textLineItems(
        Function<com.commercetools.api.predicates.query.shopping_list.TextLineItemQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.shopping_list.TextLineItemQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("textLineItems"))
            .inner(fn.apply(com.commercetools.api.predicates.query.shopping_list.TextLineItemQueryBuilderDsl.of())),
            ShoppingListQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ShoppingListQueryBuilderDsl> textLineItems() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("textLineItems")),
                p -> new CombinationQueryPredicate<>(p, ShoppingListQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ShoppingListQueryBuilderDsl> deleteDaysAfterLastModification() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("deleteDaysAfterLastModification")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ShoppingListQueryBuilderDsl> anonymousId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("anonymousId")),
        p -> new CombinationQueryPredicate<>(p, ShoppingListQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ShoppingListQueryBuilderDsl> store(
        Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("store"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            ShoppingListQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ShoppingListQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            ShoppingListQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ShoppingListQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ShoppingListQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ShoppingListQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ShoppingListQueryBuilderDsl::of);
    }
    
    
}
