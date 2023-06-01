package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductRevertedStagedChangesMessageQueryBuilderDsl  {
    public ProductRevertedStagedChangesMessageQueryBuilderDsl() {
    }

    public static ProductRevertedStagedChangesMessageQueryBuilderDsl of() {
        return new ProductRevertedStagedChangesMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductRevertedStagedChangesMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, ProductRevertedStagedChangesMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductRevertedStagedChangesMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, ProductRevertedStagedChangesMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ProductRevertedStagedChangesMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, ProductRevertedStagedChangesMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ProductRevertedStagedChangesMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, ProductRevertedStagedChangesMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductRevertedStagedChangesMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ProductRevertedStagedChangesMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductRevertedStagedChangesMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ProductRevertedStagedChangesMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<ProductRevertedStagedChangesMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, ProductRevertedStagedChangesMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductRevertedStagedChangesMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ProductRevertedStagedChangesMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<ProductRevertedStagedChangesMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, ProductRevertedStagedChangesMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductRevertedStagedChangesMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ProductRevertedStagedChangesMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductRevertedStagedChangesMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ProductRevertedStagedChangesMessageQueryBuilderDsl::of);
    }
    
    public StringCollectionPredicateBuilder<ProductRevertedStagedChangesMessageQueryBuilderDsl> removedImageUrls() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("removedImageUrls")),
        p -> new CombinationQueryPredicate<>(p, ProductRevertedStagedChangesMessageQueryBuilderDsl::of));
    }
    
}
