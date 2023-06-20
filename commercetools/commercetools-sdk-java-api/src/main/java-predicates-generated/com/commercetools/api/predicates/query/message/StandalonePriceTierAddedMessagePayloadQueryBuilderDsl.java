
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceTierAddedMessagePayloadQueryBuilderDsl {
    public StandalonePriceTierAddedMessagePayloadQueryBuilderDsl() {
    }

    public static StandalonePriceTierAddedMessagePayloadQueryBuilderDsl of() {
        return new StandalonePriceTierAddedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceTierAddedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceTierAddedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceTierAddedMessagePayloadQueryBuilderDsl> tier(
            Function<com.commercetools.api.predicates.query.common.PriceTierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceTierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("tier"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceTierQueryBuilderDsl.of())),
            StandalonePriceTierAddedMessagePayloadQueryBuilderDsl::of);
    }

}
