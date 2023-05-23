
package com.commercetools.api.predicates.query.product_selection;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSelectionAddProductActionQueryBuilderDsl {
    public ProductSelectionAddProductActionQueryBuilderDsl() {
    }

    public static ProductSelectionAddProductActionQueryBuilderDsl of() {
        return new ProductSelectionAddProductActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSelectionAddProductActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionAddProductActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSelectionAddProductActionQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("product"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product.ProductResourceIdentifierQueryBuilderDsl.of())),
            ProductSelectionAddProductActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSelectionAddProductActionQueryBuilderDsl> variantSelection(
            Function<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("variantSelection"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl
                            .of())),
            ProductSelectionAddProductActionQueryBuilderDsl::of);
    }

}
