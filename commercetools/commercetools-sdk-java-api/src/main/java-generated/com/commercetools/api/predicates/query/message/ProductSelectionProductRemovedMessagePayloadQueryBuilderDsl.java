
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSelectionProductRemovedMessagePayloadQueryBuilderDsl {
    public ProductSelectionProductRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static ProductSelectionProductRemovedMessagePayloadQueryBuilderDsl of() {
        return new ProductSelectionProductRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSelectionProductRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductSelectionProductRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSelectionProductRemovedMessagePayloadQueryBuilderDsl> product(
            Function<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("product"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductReferenceQueryBuilderDsl.of())),
            ProductSelectionProductRemovedMessagePayloadQueryBuilderDsl::of);
    }

}
