
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSelectionCreatedMessagePayloadQueryBuilderDsl {
    public ProductSelectionCreatedMessagePayloadQueryBuilderDsl() {
    }

    public static ProductSelectionCreatedMessagePayloadQueryBuilderDsl of() {
        return new ProductSelectionCreatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSelectionCreatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSelectionCreatedMessagePayloadQueryBuilderDsl> productSelection(
            Function<com.commercetools.api.predicates.query.product_selection.ProductSelectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product_selection.ProductSelectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("productSelection"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.product_selection.ProductSelectionQueryBuilderDsl.of())),
            ProductSelectionCreatedMessagePayloadQueryBuilderDsl::of);
    }

}
