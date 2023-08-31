
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceStagedChangesRemovedMessagePayloadQueryBuilderDsl {
    public StandalonePriceStagedChangesRemovedMessagePayloadQueryBuilderDsl() {
    }

    public static StandalonePriceStagedChangesRemovedMessagePayloadQueryBuilderDsl of() {
        return new StandalonePriceStagedChangesRemovedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceStagedChangesRemovedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")), p -> new CombinationQueryPredicate<>(p,
                StandalonePriceStagedChangesRemovedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceStagedChangesRemovedMessagePayloadQueryBuilderDsl> stagedChanges(
            Function<com.commercetools.api.predicates.query.standalone_price.StagedStandalonePriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.standalone_price.StagedStandalonePriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("stagedChanges"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.standalone_price.StagedStandalonePriceQueryBuilderDsl.of())),
            StandalonePriceStagedChangesRemovedMessagePayloadQueryBuilderDsl::of);
    }

}
