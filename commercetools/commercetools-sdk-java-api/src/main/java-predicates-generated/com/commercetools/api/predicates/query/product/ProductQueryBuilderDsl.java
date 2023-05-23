
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductQueryBuilderDsl {
    public ProductQueryBuilderDsl() {
    }

    public static ProductQueryBuilderDsl of() {
        return new ProductQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ProductQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ProductQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ProductQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ProductQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ProductQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ProductQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ProductQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ProductQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductQueryBuilderDsl> productType(
            Function<com.commercetools.api.predicates.query.product_type.ProductTypeReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_type.ProductTypeReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("productType"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product_type.ProductTypeReferenceQueryBuilderDsl.of())),
            ProductQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductQueryBuilderDsl> masterData(
            Function<com.commercetools.api.predicates.query.product.ProductCatalogDataQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductCatalogDataQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("masterData"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product.ProductCatalogDataQueryBuilderDsl.of())),
            ProductQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductQueryBuilderDsl> taxCategory(
            Function<com.commercetools.api.predicates.query.tax_category.TaxCategoryReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.tax_category.TaxCategoryReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("taxCategory"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.tax_category.TaxCategoryReferenceQueryBuilderDsl.of())),
            ProductQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            ProductQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductQueryBuilderDsl> reviewRatingStatistics(
            Function<com.commercetools.api.predicates.query.review.ReviewRatingStatisticsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.review.ReviewRatingStatisticsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("reviewRatingStatistics"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.review.ReviewRatingStatisticsQueryBuilderDsl.of())),
            ProductQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ProductQueryBuilderDsl> priceMode() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceMode")),
            p -> new CombinationQueryPredicate<>(p, ProductQueryBuilderDsl::of));
    }

}
