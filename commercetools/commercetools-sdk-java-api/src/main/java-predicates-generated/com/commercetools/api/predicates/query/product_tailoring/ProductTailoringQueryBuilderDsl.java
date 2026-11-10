
package com.commercetools.api.predicates.query.product_tailoring;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringQueryBuilderDsl {
    public ProductTailoringQueryBuilderDsl() {
    }

    public static ProductTailoringQueryBuilderDsl of() {
        return new ProductTailoringQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductTailoringQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductTailoringQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductTailoringQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ProductTailoringQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ProductTailoringQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ProductTailoringQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("store"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            ProductTailoringQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("product"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            ProductTailoringQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductTailoringQueryBuilderDsl> published() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("published")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringQueryBuilderDsl> current(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringDataQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringDataQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("current"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_tailoring.ProductTailoringDataQueryBuilderDsl.of())),
            ProductTailoringQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductTailoringQueryBuilderDsl> staged(
            Function<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringDataQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_tailoring.ProductTailoringDataQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("staged"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_tailoring.ProductTailoringDataQueryBuilderDsl.of())),
            ProductTailoringQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductTailoringQueryBuilderDsl> hasStagedChanges() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("hasStagedChanges")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringQueryBuilderDsl> warnings(
            Function<com.commercetools.api.predicates.query.warning.WarningObjectQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.warning.WarningObjectQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("warnings"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.warning.WarningObjectQueryBuilderDsl.of())),
            ProductTailoringQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductTailoringQueryBuilderDsl> warnings() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("warnings")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringQueryBuilderDsl::of));
    }

}
