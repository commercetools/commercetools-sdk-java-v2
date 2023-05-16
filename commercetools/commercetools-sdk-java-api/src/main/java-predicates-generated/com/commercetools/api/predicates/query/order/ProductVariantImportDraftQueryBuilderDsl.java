
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductVariantImportDraftQueryBuilderDsl {
    public ProductVariantImportDraftQueryBuilderDsl() {
    }

    public static ProductVariantImportDraftQueryBuilderDsl of() {
        return new ProductVariantImportDraftQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ProductVariantImportDraftQueryBuilderDsl> id() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantImportDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductVariantImportDraftQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantImportDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantImportDraftQueryBuilderDsl> prices(
            Function<com.commercetools.api.predicates.query.common.PriceDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("prices"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceDraftQueryBuilderDsl.of())),
            ProductVariantImportDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductVariantImportDraftQueryBuilderDsl> prices() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("prices")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantImportDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantImportDraftQueryBuilderDsl> attributes(
            Function<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("attributes"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.AttributeQueryBuilderDsl.of())),
            ProductVariantImportDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductVariantImportDraftQueryBuilderDsl> attributes() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("attributes")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantImportDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantImportDraftQueryBuilderDsl> images(
            Function<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("images"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl.of())),
            ProductVariantImportDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductVariantImportDraftQueryBuilderDsl> images() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("images")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantImportDraftQueryBuilderDsl::of));
    }

}
