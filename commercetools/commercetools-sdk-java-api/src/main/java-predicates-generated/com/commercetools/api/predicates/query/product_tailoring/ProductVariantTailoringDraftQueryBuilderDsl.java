
package com.commercetools.api.predicates.query.product_tailoring;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductVariantTailoringDraftQueryBuilderDsl {
    public ProductVariantTailoringDraftQueryBuilderDsl() {
    }

    public static ProductVariantTailoringDraftQueryBuilderDsl of() {
        return new ProductVariantTailoringDraftQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ProductVariantTailoringDraftQueryBuilderDsl> id() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantTailoringDraftQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductVariantTailoringDraftQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantTailoringDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantTailoringDraftQueryBuilderDsl> images(
            Function<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("images"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl.of())),
            ProductVariantTailoringDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductVariantTailoringDraftQueryBuilderDsl> images() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("images")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantTailoringDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantTailoringDraftQueryBuilderDsl> assets(
            Function<com.commercetools.api.predicates.query.common.AssetQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AssetQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("assets"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AssetQueryBuilderDsl.of())),
            ProductVariantTailoringDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductVariantTailoringDraftQueryBuilderDsl> assets() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assets")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantTailoringDraftQueryBuilderDsl::of));
    }

}
