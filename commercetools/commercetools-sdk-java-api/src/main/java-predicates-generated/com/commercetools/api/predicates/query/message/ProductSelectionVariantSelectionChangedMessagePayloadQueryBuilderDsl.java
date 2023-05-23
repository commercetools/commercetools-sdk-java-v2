
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSelectionVariantSelectionChangedMessagePayloadQueryBuilderDsl {
    public ProductSelectionVariantSelectionChangedMessagePayloadQueryBuilderDsl() {
    }

    public static ProductSelectionVariantSelectionChangedMessagePayloadQueryBuilderDsl of() {
        return new ProductSelectionVariantSelectionChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSelectionVariantSelectionChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")), p -> new CombinationQueryPredicate<>(p,
                ProductSelectionVariantSelectionChangedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSelectionVariantSelectionChangedMessagePayloadQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("product"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            ProductSelectionVariantSelectionChangedMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSelectionVariantSelectionChangedMessagePayloadQueryBuilderDsl> oldVariantSelection(
            Function<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("oldVariantSelection"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl
                            .of())),
            ProductSelectionVariantSelectionChangedMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSelectionVariantSelectionChangedMessagePayloadQueryBuilderDsl> newVariantSelection(
            Function<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("newVariantSelection"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl
                            .of())),
            ProductSelectionVariantSelectionChangedMessagePayloadQueryBuilderDsl::of);
    }

}
