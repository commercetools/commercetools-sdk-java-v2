
package com.commercetools.api.predicates.query.product_tailoring;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductTailoringAddExternalImageActionQueryBuilderDsl {
    public ProductTailoringAddExternalImageActionQueryBuilderDsl() {
    }

    public static ProductTailoringAddExternalImageActionQueryBuilderDsl of() {
        return new ProductTailoringAddExternalImageActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductTailoringAddExternalImageActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringAddExternalImageActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductTailoringAddExternalImageActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringAddExternalImageActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductTailoringAddExternalImageActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringAddExternalImageActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductTailoringAddExternalImageActionQueryBuilderDsl> image(
            Function<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("image"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ImageQueryBuilderDsl.of())),
            ProductTailoringAddExternalImageActionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductTailoringAddExternalImageActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductTailoringAddExternalImageActionQueryBuilderDsl::of));
    }

}
