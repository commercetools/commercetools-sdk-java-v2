
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceExternalDiscountSetMessagePayloadQueryBuilderDsl {
    public StandalonePriceExternalDiscountSetMessagePayloadQueryBuilderDsl() {
    }

    public static StandalonePriceExternalDiscountSetMessagePayloadQueryBuilderDsl of() {
        return new StandalonePriceExternalDiscountSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceExternalDiscountSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")), p -> new CombinationQueryPredicate<>(p,
                StandalonePriceExternalDiscountSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceExternalDiscountSetMessagePayloadQueryBuilderDsl> discounted(
            Function<com.commercetools.api.predicates.query.common.DiscountedPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.DiscountedPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("discounted"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.DiscountedPriceQueryBuilderDsl.of())),
            StandalonePriceExternalDiscountSetMessagePayloadQueryBuilderDsl::of);
    }

}
