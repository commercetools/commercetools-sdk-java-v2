
package com.commercetools.api.predicates.query.product_tailoring;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductVariantTailoringQueryBuilderDsl {
    public ProductVariantTailoringQueryBuilderDsl() {
    }

    public static ProductVariantTailoringQueryBuilderDsl of() {
        return new ProductVariantTailoringQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ProductVariantTailoringQueryBuilderDsl> id() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantTailoringQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantTailoringQueryBuilderDsl> images(
            Function<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("images"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl.of())),
            ProductVariantTailoringQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductVariantTailoringQueryBuilderDsl> images() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("images")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantTailoringQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantTailoringQueryBuilderDsl> assets(
            Function<com.commercetools.api.predicates.query.common.AssetQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AssetQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("assets"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AssetQueryBuilderDsl.of())),
            ProductVariantTailoringQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductVariantTailoringQueryBuilderDsl> assets() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("assets")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantTailoringQueryBuilderDsl::of));
    }

}
