
package com.commercetools.api.predicates.query.standalone_price;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceSetDiscountedPriceActionQueryBuilderDsl {
    public StandalonePriceSetDiscountedPriceActionQueryBuilderDsl() {
    }

    public static StandalonePriceSetDiscountedPriceActionQueryBuilderDsl of() {
        return new StandalonePriceSetDiscountedPriceActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceSetDiscountedPriceActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceSetDiscountedPriceActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceSetDiscountedPriceActionQueryBuilderDsl> discounted(
            Function<com.commercetools.api.predicates.query.common.DiscountedPriceDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.DiscountedPriceDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("discounted"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.common.DiscountedPriceDraftQueryBuilderDsl.of())),
            StandalonePriceSetDiscountedPriceActionQueryBuilderDsl::of);
    }

}
