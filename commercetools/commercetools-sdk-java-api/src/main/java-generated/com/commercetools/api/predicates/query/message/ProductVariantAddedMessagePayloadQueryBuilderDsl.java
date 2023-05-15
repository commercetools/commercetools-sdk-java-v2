
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductVariantAddedMessagePayloadQueryBuilderDsl {
    public ProductVariantAddedMessagePayloadQueryBuilderDsl() {
    }

    public static ProductVariantAddedMessagePayloadQueryBuilderDsl of() {
        return new ProductVariantAddedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductVariantAddedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantAddedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductVariantAddedMessagePayloadQueryBuilderDsl> variant(
            Function<com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("variant"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.product.ProductVariantQueryBuilderDsl.of())),
            ProductVariantAddedMessagePayloadQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductVariantAddedMessagePayloadQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductVariantAddedMessagePayloadQueryBuilderDsl::of));
    }
}
