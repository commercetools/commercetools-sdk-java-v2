package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ProductSelectionProductAddedMessagePayloadQueryBuilderDsl  {
    public ProductSelectionProductAddedMessagePayloadQueryBuilderDsl() {
    }

    public static ProductSelectionProductAddedMessagePayloadQueryBuilderDsl of() {
        return new ProductSelectionProductAddedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSelectionProductAddedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, ProductSelectionProductAddedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ProductSelectionProductAddedMessagePayloadQueryBuilderDsl> product(
        Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("product"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            ProductSelectionProductAddedMessagePayloadQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<ProductSelectionProductAddedMessagePayloadQueryBuilderDsl> variantSelection(
        Function<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("variantSelection"))
            .inner(fn.apply(com.commercetools.api.predicates.query.product_selection.ProductVariantSelectionQueryBuilderDsl.of())),
            ProductSelectionProductAddedMessagePayloadQueryBuilderDsl::of);
    }
    
    
}
