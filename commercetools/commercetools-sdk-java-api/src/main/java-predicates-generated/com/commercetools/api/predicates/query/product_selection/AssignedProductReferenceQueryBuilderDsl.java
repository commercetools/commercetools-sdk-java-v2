package com.commercetools.api.predicates.query.product_selection;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class AssignedProductReferenceQueryBuilderDsl  {
    public AssignedProductReferenceQueryBuilderDsl() {
    }

    public static AssignedProductReferenceQueryBuilderDsl of() {
        return new AssignedProductReferenceQueryBuilderDsl();
    }

    public CombinationQueryPredicate<AssignedProductReferenceQueryBuilderDsl> product(
        Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("product"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            AssignedProductReferenceQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<AssignedProductReferenceQueryBuilderDsl> variantSelection(
        Function<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("variantSelection"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl.of())),
            AssignedProductReferenceQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<AssignedProductReferenceQueryBuilderDsl> variantExclusion(
        Function<com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("variantExclusion"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl.of())),
            AssignedProductReferenceQueryBuilderDsl::of);
    }
    
    
}
