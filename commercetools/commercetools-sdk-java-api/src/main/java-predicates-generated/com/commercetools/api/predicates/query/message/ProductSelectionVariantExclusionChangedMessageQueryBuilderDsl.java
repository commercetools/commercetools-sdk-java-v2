package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl  {
    public ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl() {
    }

    public static ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl of() {
        return new ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl> product(
        Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("product"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl> oldVariantExclusion(
        Function<com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("oldVariantExclusion"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl.of())),
            ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl> newVariantExclusion(
        Function<com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("newVariantExclusion"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl.of())),
            ProductSelectionVariantExclusionChangedMessageQueryBuilderDsl::of);
    }
    
    
}
