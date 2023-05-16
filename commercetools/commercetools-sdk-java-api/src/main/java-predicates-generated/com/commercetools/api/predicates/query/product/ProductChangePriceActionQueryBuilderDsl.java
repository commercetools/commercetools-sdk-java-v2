
package com.commercetools.api.predicates.query.product;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ProductChangePriceActionQueryBuilderDsl {
    public ProductChangePriceActionQueryBuilderDsl() {
    }

    public static ProductChangePriceActionQueryBuilderDsl of() {
        return new ProductChangePriceActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ProductChangePriceActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ProductChangePriceActionQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<ProductChangePriceActionQueryBuilderDsl> priceId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("priceId")),
            p -> new CombinationQueryPredicate<>(p, ProductChangePriceActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ProductChangePriceActionQueryBuilderDsl> price(
            Function<com.commercetools.api.predicates.query.common.PriceDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("price"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceDraftQueryBuilderDsl.of())),
            ProductChangePriceActionQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<ProductChangePriceActionQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, ProductChangePriceActionQueryBuilderDsl::of));
    }

}
