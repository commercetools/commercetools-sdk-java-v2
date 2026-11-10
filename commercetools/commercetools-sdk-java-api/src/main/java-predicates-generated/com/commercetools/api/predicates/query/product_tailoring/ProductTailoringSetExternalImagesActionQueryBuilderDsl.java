
package com.commercetools.api.predicates.query.product_tailoring;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringSetExternalImagesActionQueryBuilderDsl {
    public ProductTailoringSetExternalImagesActionQueryBuilderDsl() {
    }

    public static ProductTailoringSetExternalImagesActionQueryBuilderDsl of() {
        return new ProductTailoringSetExternalImagesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetExternalImagesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetExternalImagesActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductTailoringSetExternalImagesActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetExternalImagesActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringSetExternalImagesActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetExternalImagesActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringSetExternalImagesActionQueryBuilderDsl> images(
            Function<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("images"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl.of())),
            ProductTailoringSetExternalImagesActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductTailoringSetExternalImagesActionQueryBuilderDsl> images() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("images")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetExternalImagesActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductTailoringSetExternalImagesActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringSetExternalImagesActionQueryBuilderDsl::of));
    }

}
