
package com.commercetools.api.predicates.query.product_selection;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSelectionSetVariantExclusionActionQueryBuilderDsl {
    public ProductSelectionSetVariantExclusionActionQueryBuilderDsl() {
    }

    public static ProductSelectionSetVariantExclusionActionQueryBuilderDsl of() {
        return new ProductSelectionSetVariantExclusionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSelectionSetVariantExclusionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionSetVariantExclusionActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSelectionSetVariantExclusionActionQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("product"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product.ProductResourceIdentifierQueryBuilderDsl.of())),
            ProductSelectionSetVariantExclusionActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSelectionSetVariantExclusionActionQueryBuilderDsl> variantExclusion(
            Function<com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("variantExclusion"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl
                            .of())),
            ProductSelectionSetVariantExclusionActionQueryBuilderDsl::of);
    }

}
