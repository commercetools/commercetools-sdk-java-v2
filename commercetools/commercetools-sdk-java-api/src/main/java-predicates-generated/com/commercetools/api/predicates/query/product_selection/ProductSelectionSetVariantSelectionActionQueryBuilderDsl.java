package com.commercetools.api.predicates.query.product_selection;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductSelectionSetVariantSelectionActionQueryBuilderDsl  {
    public ProductSelectionSetVariantSelectionActionQueryBuilderDsl() {
    }

    public static ProductSelectionSetVariantSelectionActionQueryBuilderDsl of() {
        return new ProductSelectionSetVariantSelectionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSelectionSetVariantSelectionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionSetVariantSelectionActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductSelectionSetVariantSelectionActionQueryBuilderDsl> product(
        Function<com.commercetools.api.predicates.query.product.ProductResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("product"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductResourceIdentifierQueryBuilderDsl.of())),
            ProductSelectionSetVariantSelectionActionQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductSelectionSetVariantSelectionActionQueryBuilderDsl> variantSelection(
        Function<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("variantSelection"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl.of())),
            ProductSelectionSetVariantSelectionActionQueryBuilderDsl::of);
    }
    
    
}
