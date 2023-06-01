package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductSelectionCreatedMessageQueryBuilderDsl  {
    public ProductSelectionCreatedMessageQueryBuilderDsl() {
    }

    public static ProductSelectionCreatedMessageQueryBuilderDsl of() {
        return new ProductSelectionCreatedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSelectionCreatedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionCreatedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductSelectionCreatedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionCreatedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ProductSelectionCreatedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionCreatedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ProductSelectionCreatedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionCreatedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductSelectionCreatedMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ProductSelectionCreatedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductSelectionCreatedMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ProductSelectionCreatedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<ProductSelectionCreatedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionCreatedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductSelectionCreatedMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ProductSelectionCreatedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<ProductSelectionCreatedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionCreatedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductSelectionCreatedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionCreatedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductSelectionCreatedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ProductSelectionCreatedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductSelectionCreatedMessageQueryBuilderDsl> productSelection(
        Function<com.commercetools.api.predicates.query.product_selection.ProductSelectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductSelectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("productSelection"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product_selection.ProductSelectionQueryBuilderDsl.of())),
            ProductSelectionCreatedMessageQueryBuilderDsl::of);
    }
    
    
}
