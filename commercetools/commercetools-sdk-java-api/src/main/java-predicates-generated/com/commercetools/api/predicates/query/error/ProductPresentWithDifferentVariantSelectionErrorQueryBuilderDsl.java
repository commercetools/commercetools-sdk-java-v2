
package com.commercetools.api.predicates.query.error;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl {
    public ProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl() {
    }

    public static ProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl of() {
        return new ProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")), p -> new CombinationQueryPredicate<>(p,
                ProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
            p -> new CombinationQueryPredicate<>(p,
                ProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("product"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            ProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl> existingVariantSelection(
            Function<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("existingVariantSelection"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl
                            .of())),
            ProductPresentWithDifferentVariantSelectionErrorQueryBuilderDsl::of);
    }

}
