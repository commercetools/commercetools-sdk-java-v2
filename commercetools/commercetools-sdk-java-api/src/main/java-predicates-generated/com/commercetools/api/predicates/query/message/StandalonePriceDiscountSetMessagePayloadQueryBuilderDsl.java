
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceDiscountSetMessagePayloadQueryBuilderDsl {
    public StandalonePriceDiscountSetMessagePayloadQueryBuilderDsl() {
    }

    public static StandalonePriceDiscountSetMessagePayloadQueryBuilderDsl of() {
        return new StandalonePriceDiscountSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceDiscountSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceDiscountSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceDiscountSetMessagePayloadQueryBuilderDsl> discounted(
            Function<com.commercetools.api.predicates.query.common.DiscountedPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.DiscountedPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("discounted"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.DiscountedPriceQueryBuilderDsl.of())),
            StandalonePriceDiscountSetMessagePayloadQueryBuilderDsl::of);
    }

}
