package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductRemovedFromCategoryMessageQueryBuilderDsl  {
    public ProductRemovedFromCategoryMessageQueryBuilderDsl() {
    }

    public static ProductRemovedFromCategoryMessageQueryBuilderDsl of() {
        return new ProductRemovedFromCategoryMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductRemovedFromCategoryMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, ProductRemovedFromCategoryMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductRemovedFromCategoryMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, ProductRemovedFromCategoryMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ProductRemovedFromCategoryMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, ProductRemovedFromCategoryMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ProductRemovedFromCategoryMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, ProductRemovedFromCategoryMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductRemovedFromCategoryMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ProductRemovedFromCategoryMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductRemovedFromCategoryMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ProductRemovedFromCategoryMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<ProductRemovedFromCategoryMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, ProductRemovedFromCategoryMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductRemovedFromCategoryMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ProductRemovedFromCategoryMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<ProductRemovedFromCategoryMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, ProductRemovedFromCategoryMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductRemovedFromCategoryMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ProductRemovedFromCategoryMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductRemovedFromCategoryMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ProductRemovedFromCategoryMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductRemovedFromCategoryMessageQueryBuilderDsl> category(
        Function<com.commercetools.api.predicates.query.category.CategoryReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.category.CategoryReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("category"))
            .inner(fn.apply(com.commercetools.api.predicates.query.category.CategoryReferenceQueryBuilderDsl.of())),
            ProductRemovedFromCategoryMessageQueryBuilderDsl::of);
    }
    
    public BooleanComparisonPredicateBuilder<ProductRemovedFromCategoryMessageQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
        p -> new CombinationQueryPredicate<>(p, ProductRemovedFromCategoryMessageQueryBuilderDsl::of));
    }
    
}
