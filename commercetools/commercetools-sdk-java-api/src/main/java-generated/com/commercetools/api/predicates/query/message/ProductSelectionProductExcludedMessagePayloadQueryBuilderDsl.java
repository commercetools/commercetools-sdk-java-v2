
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSelectionProductExcludedMessagePayloadQueryBuilderDsl {
    public ProductSelectionProductExcludedMessagePayloadQueryBuilderDsl() {
    }

    public static ProductSelectionProductExcludedMessagePayloadQueryBuilderDsl of() {
        return new ProductSelectionProductExcludedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSelectionProductExcludedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionProductExcludedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSelectionProductExcludedMessagePayloadQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("product"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            ProductSelectionProductExcludedMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductSelectionProductExcludedMessagePayloadQueryBuilderDsl> variantExclusion(
            Function<com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("variantExclusion"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.product_selection.ProductVariantExclusionQueryBuilderDsl
                            .of())),
            ProductSelectionProductExcludedMessagePayloadQueryBuilderDsl::of);
    }

}
