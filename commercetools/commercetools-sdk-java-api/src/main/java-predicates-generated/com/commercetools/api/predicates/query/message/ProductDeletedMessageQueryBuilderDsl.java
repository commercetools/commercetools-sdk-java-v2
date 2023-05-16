
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductDeletedMessageQueryBuilderDsl {
    public ProductDeletedMessageQueryBuilderDsl() {
    }

    public static ProductDeletedMessageQueryBuilderDsl of() {
        return new ProductDeletedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductDeletedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductDeletedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductDeletedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ProductDeletedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductDeletedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ProductDeletedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductDeletedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ProductDeletedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductDeletedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ProductDeletedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductDeletedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ProductDeletedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductDeletedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ProductDeletedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductDeletedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ProductDeletedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductDeletedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ProductDeletedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductDeletedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductDeletedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductDeletedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ProductDeletedMessageQueryBuilderDsl::of);
    }

    public StringCollectionPredicateBuilder<ProductDeletedMessageQueryBuilderDsl> removedImageUrls() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("removedImageUrls")),
            p -> new CombinationQueryPredicate<>(p, ProductDeletedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductDeletedMessageQueryBuilderDsl> currentProjection(
            Function<com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("currentProjection"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl.of())),
            ProductDeletedMessageQueryBuilderDsl::of);
    }

}
