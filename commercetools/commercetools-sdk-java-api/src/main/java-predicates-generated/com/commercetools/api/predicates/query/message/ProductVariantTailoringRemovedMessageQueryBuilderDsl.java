
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductVariantTailoringRemovedMessageQueryBuilderDsl {
    public ProductVariantTailoringRemovedMessageQueryBuilderDsl() {
    }

    public static ProductVariantTailoringRemovedMessageQueryBuilderDsl of() {
        return new ProductVariantTailoringRemovedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductVariantTailoringRemovedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantTailoringRemovedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductVariantTailoringRemovedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantTailoringRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductVariantTailoringRemovedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantTailoringRemovedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductVariantTailoringRemovedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantTailoringRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantTailoringRemovedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ProductVariantTailoringRemovedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductVariantTailoringRemovedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ProductVariantTailoringRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductVariantTailoringRemovedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantTailoringRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantTailoringRemovedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            ProductVariantTailoringRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductVariantTailoringRemovedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantTailoringRemovedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductVariantTailoringRemovedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantTailoringRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantTailoringRemovedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            ProductVariantTailoringRemovedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductVariantTailoringRemovedMessageQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("store"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            ProductVariantTailoringRemovedMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ProductVariantTailoringRemovedMessageQueryBuilderDsl> productKey() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productKey")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantTailoringRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantTailoringRemovedMessageQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("product"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            ProductVariantTailoringRemovedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<ProductVariantTailoringRemovedMessageQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantTailoringRemovedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantTailoringRemovedMessageQueryBuilderDsl> variant(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductVariantTailoringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductVariantTailoringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("variant"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_tailoring.ProductVariantTailoringQueryBuilderDsl
                            .of())),
            ProductVariantTailoringRemovedMessageQueryBuilderDsl::of);
    }

}
