
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductRemovePriceActionQueryBuilderDsl {
    public ProductRemovePriceActionQueryBuilderDsl() {
    }

    public static ProductRemovePriceActionQueryBuilderDsl of() {
        return new ProductRemovePriceActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductRemovePriceActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductRemovePriceActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductRemovePriceActionQueryBuilderDsl> priceId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceId")),
            p -> new CombinationQueryPredicate<>(p, ProductRemovePriceActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductRemovePriceActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductRemovePriceActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductRemovePriceActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductRemovePriceActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductRemovePriceActionQueryBuilderDsl> price(
            Function<com.commercetools.api.predicates.query.common.PriceDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("price"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceDraftQueryBuilderDsl.of())),
            ProductRemovePriceActionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductRemovePriceActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductRemovePriceActionQueryBuilderDsl::of));
    }

}
