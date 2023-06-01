package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductPublishedMessageQueryBuilderDsl  {
    public ProductPublishedMessageQueryBuilderDsl() {
    }

    public static ProductPublishedMessageQueryBuilderDsl of() {
        return new ProductPublishedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductPublishedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, ProductPublishedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductPublishedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, ProductPublishedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ProductPublishedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, ProductPublishedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ProductPublishedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, ProductPublishedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductPublishedMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ProductPublishedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductPublishedMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ProductPublishedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<ProductPublishedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, ProductPublishedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductPublishedMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ProductPublishedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<ProductPublishedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, ProductPublishedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductPublishedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ProductPublishedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductPublishedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ProductPublishedMessageQueryBuilderDsl::of);
    }
    
    public StringCollectionPredicateBuilder<ProductPublishedMessageQueryBuilderDsl> removedImageUrls() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("removedImageUrls")),
        p -> new CombinationQueryPredicate<>(p, ProductPublishedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductPublishedMessageQueryBuilderDsl> productProjection(
        Function<com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("productProjection"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl.of())),
            ProductPublishedMessageQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<ProductPublishedMessageQueryBuilderDsl> scope() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("scope")),
        p -> new CombinationQueryPredicate<>(p, ProductPublishedMessageQueryBuilderDsl::of));
    }
    
}
