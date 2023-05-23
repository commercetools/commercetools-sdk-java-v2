
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductPriceChangedMessagePayloadQueryBuilderDsl {
    public ProductPriceChangedMessagePayloadQueryBuilderDsl() {
    }

    public static ProductPriceChangedMessagePayloadQueryBuilderDsl of() {
        return new ProductPriceChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductPriceChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceChangedMessagePayloadQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductPriceChangedMessagePayloadQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceChangedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPriceChangedMessagePayloadQueryBuilderDsl> oldPrice(
            Function<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl.of())),
            ProductPriceChangedMessagePayloadQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ProductPriceChangedMessagePayloadQueryBuilderDsl> newPrice(
            Function<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("newPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl.of())),
            ProductPriceChangedMessagePayloadQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductPriceChangedMessagePayloadQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductPriceChangedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductPriceChangedMessagePayloadQueryBuilderDsl> oldStagedPrice(
            Function<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldStagedPrice"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceQueryBuilderDsl.of())),
            ProductPriceChangedMessagePayloadQueryBuilderDsl::of);
    }

}
