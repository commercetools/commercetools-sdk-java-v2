
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductVariantDeletedMessageQueryBuilderDsl {
    public ProductVariantDeletedMessageQueryBuilderDsl() {
    }

    public static ProductVariantDeletedMessageQueryBuilderDsl of() {
        return new ProductVariantDeletedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductVariantDeletedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantDeletedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductVariantDeletedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantDeletedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductVariantDeletedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantDeletedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductVariantDeletedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantDeletedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantDeletedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ProductVariantDeletedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductVariantDeletedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ProductVariantDeletedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductVariantDeletedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantDeletedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantDeletedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ProductVariantDeletedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductVariantDeletedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantDeletedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductVariantDeletedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantDeletedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantDeletedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ProductVariantDeletedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductVariantDeletedMessageQueryBuilderDsl> variant(
            Function<com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("variant"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl.of())),
            ProductVariantDeletedMessageQueryBuilderDsl::of);
    }

    public StringCollectionPredicateBuilder<ProductVariantDeletedMessageQueryBuilderDsl> removedImageUrls() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("removedImageUrls")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantDeletedMessageQueryBuilderDsl::of));
    }
}
