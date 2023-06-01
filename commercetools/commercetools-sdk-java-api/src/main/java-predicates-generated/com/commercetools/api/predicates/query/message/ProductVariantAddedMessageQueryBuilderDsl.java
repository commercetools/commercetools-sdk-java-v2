package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductVariantAddedMessageQueryBuilderDsl  {
    public ProductVariantAddedMessageQueryBuilderDsl() {
    }

    public static ProductVariantAddedMessageQueryBuilderDsl of() {
        return new ProductVariantAddedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductVariantAddedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, ProductVariantAddedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductVariantAddedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, ProductVariantAddedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ProductVariantAddedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, ProductVariantAddedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ProductVariantAddedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, ProductVariantAddedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductVariantAddedMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ProductVariantAddedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductVariantAddedMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ProductVariantAddedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<ProductVariantAddedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, ProductVariantAddedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductVariantAddedMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ProductVariantAddedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<ProductVariantAddedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, ProductVariantAddedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductVariantAddedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ProductVariantAddedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductVariantAddedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ProductVariantAddedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductVariantAddedMessageQueryBuilderDsl> variant(
        Function<com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("variant"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl.of())),
            ProductVariantAddedMessageQueryBuilderDsl::of);
    }
    
    public BooleanComparisonPredicateBuilder<ProductVariantAddedMessageQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
        p -> new CombinationQueryPredicate<>(p, ProductVariantAddedMessageQueryBuilderDsl::of));
    }
    
}
