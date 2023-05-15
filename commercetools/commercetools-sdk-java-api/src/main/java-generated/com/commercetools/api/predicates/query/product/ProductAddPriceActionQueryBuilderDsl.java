
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductAddPriceActionQueryBuilderDsl {
    public ProductAddPriceActionQueryBuilderDsl() {
    }

    public static ProductAddPriceActionQueryBuilderDsl of() {
        return new ProductAddPriceActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductAddPriceActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductAddPriceActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductAddPriceActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductAddPriceActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductAddPriceActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductAddPriceActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductAddPriceActionQueryBuilderDsl> price(
            Function<com.commercetools.api.predicates.query.common.PriceDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("price"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceDraftQueryBuilderDsl.of())),
            ProductAddPriceActionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductAddPriceActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductAddPriceActionQueryBuilderDsl::of));
    }
}
