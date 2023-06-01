package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductSelectionProductAddedMessageQueryBuilderDsl  {
    public ProductSelectionProductAddedMessageQueryBuilderDsl() {
    }

    public static ProductSelectionProductAddedMessageQueryBuilderDsl of() {
        return new ProductSelectionProductAddedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSelectionProductAddedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionProductAddedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<ProductSelectionProductAddedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionProductAddedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ProductSelectionProductAddedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionProductAddedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<ProductSelectionProductAddedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionProductAddedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductSelectionProductAddedMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ProductSelectionProductAddedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductSelectionProductAddedMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ProductSelectionProductAddedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<ProductSelectionProductAddedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionProductAddedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductSelectionProductAddedMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ProductSelectionProductAddedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<ProductSelectionProductAddedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionProductAddedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ProductSelectionProductAddedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionProductAddedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductSelectionProductAddedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ProductSelectionProductAddedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductSelectionProductAddedMessageQueryBuilderDsl> product(
        Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("product"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            ProductSelectionProductAddedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductSelectionProductAddedMessageQueryBuilderDsl> variantSelection(
        Function<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("variantSelection"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl.of())),
            ProductSelectionProductAddedMessageQueryBuilderDsl::of);
    }
    
    
}
