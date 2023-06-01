package com.commercetools.api.predicates.query.product_selection;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductSelectionExcludeProductActionQueryBuilderDsl  {
    public ProductSelectionExcludeProductActionQueryBuilderDsl() {
    }

    public static ProductSelectionExcludeProductActionQueryBuilderDsl of() {
        return new ProductSelectionExcludeProductActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSelectionExcludeProductActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionExcludeProductActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductSelectionExcludeProductActionQueryBuilderDsl> product(
        Function<com.commercetools.api.predicates.query.product.ProductResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("product"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductResourceIdentifierQueryBuilderDsl.of())),
            ProductSelectionExcludeProductActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductSelectionExcludeProductActionQueryBuilderDsl> variantExclusion(
        Function<com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("variantExclusion"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl.of())),
            ProductSelectionExcludeProductActionQueryBuilderDsl::of);
    }
    
    
}
