
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceCreatedMessagePayloadQueryBuilderDsl {
    public StandalonePriceCreatedMessagePayloadQueryBuilderDsl() {
    }

    public static StandalonePriceCreatedMessagePayloadQueryBuilderDsl of() {
        return new StandalonePriceCreatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceCreatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceCreatedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceCreatedMessagePayloadQueryBuilderDsl> standalonePrice(
            Function<com.commercetools.api.predicates.query.standalone_price.StandalonePriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StandalonePriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("standalonePrice"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.standalone_price.StandalonePriceQueryBuilderDsl.of())),
            StandalonePriceCreatedMessagePayloadQueryBuilderDsl::of);
    }

}
