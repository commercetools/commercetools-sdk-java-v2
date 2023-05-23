
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductSetPricesActionQueryBuilderDsl {
    public ProductSetPricesActionQueryBuilderDsl() {
    }

    public static ProductSetPricesActionQueryBuilderDsl of() {
        return new ProductSetPricesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductSetPricesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductSetPricesActionQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ProductSetPricesActionQueryBuilderDsl> variantId() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("variantId")),
            p -> new CombinationQueryPredicate<>(p, ProductSetPricesActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductSetPricesActionQueryBuilderDsl> sku() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sku")),
            p -> new CombinationQueryPredicate<>(p, ProductSetPricesActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductSetPricesActionQueryBuilderDsl> prices(
            Function<com.commercetools.api.predicates.query.common.PriceDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("prices"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceDraftQueryBuilderDsl.of())),
            ProductSetPricesActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ProductSetPricesActionQueryBuilderDsl> prices() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("prices")),
            p -> new CombinationQueryPredicate<>(p, ProductSetPricesActionQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<ProductSetPricesActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductSetPricesActionQueryBuilderDsl::of));
    }

}
