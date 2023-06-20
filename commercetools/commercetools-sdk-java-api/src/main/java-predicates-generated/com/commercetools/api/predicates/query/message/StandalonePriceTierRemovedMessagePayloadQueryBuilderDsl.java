
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceTierRemovedMessagePayloadQueryBuilderDsl {
    public StandalonePriceTierRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static StandalonePriceTierRemovedMessagePayloadQueryBuilderDsl of() {
        return new StandalonePriceTierRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceTierRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceTierRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceTierRemovedMessagePayloadQueryBuilderDsl> removedTier(
            Function<com.commercetools.api.predicates.query.common.PriceTierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceTierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("removedTier"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceTierQueryBuilderDsl.of())),
            StandalonePriceTierRemovedMessagePayloadQueryBuilderDsl::of);
    }

}
