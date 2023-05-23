
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductCreatedMessagePayloadQueryBuilderDsl {
    public ProductCreatedMessagePayloadQueryBuilderDsl() {
    }

    public static ProductCreatedMessagePayloadQueryBuilderDsl of() {
        return new ProductCreatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductCreatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductCreatedMessagePayloadQueryBuilderDsl> productProjection(
            Function<com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("productProjection"))
                .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductProjectionQueryBuilderDsl.of())),
            ProductCreatedMessagePayloadQueryBuilderDsl::of);
    }

}
