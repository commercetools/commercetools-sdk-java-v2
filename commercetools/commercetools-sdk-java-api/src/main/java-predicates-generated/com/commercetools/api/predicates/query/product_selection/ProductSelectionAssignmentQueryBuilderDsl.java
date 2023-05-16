
package com.commercetools.api.predicates.query.product_selection;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSelectionAssignmentQueryBuilderDsl {
    public ProductSelectionAssignmentQueryBuilderDsl() {
    }

    public static ProductSelectionAssignmentQueryBuilderDsl of() {
        return new ProductSelectionAssignmentQueryBuilderDsl();
    }

    public CombinationQueryPredicate<ProductSelectionAssignmentQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("product"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            ProductSelectionAssignmentQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSelectionAssignmentQueryBuilderDsl> productSelection(
            Function<com.commercetools.api.predicates.query.product_selection.ProductSelectionReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductSelectionReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("productSelection"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_selection.ProductSelectionReferenceQueryBuilderDsl
                            .of())),
            ProductSelectionAssignmentQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSelectionAssignmentQueryBuilderDsl> variantSelection(
            Function<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("variantSelection"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl
                            .of())),
            ProductSelectionAssignmentQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSelectionAssignmentQueryBuilderDsl> variantExclusion(
            Function<com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("variantExclusion"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl
                            .of())),
            ProductSelectionAssignmentQueryBuilderDsl::of);
    }

}
