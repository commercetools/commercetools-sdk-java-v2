
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceTiersSetMessagePayloadQueryBuilderDsl {
    public StandalonePriceTiersSetMessagePayloadQueryBuilderDsl() {
    }

    public static StandalonePriceTiersSetMessagePayloadQueryBuilderDsl of() {
        return new StandalonePriceTiersSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceTiersSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceTiersSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceTiersSetMessagePayloadQueryBuilderDsl> tiers(
            Function<com.commercetools.api.predicates.query.common.PriceTierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceTierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("tiers"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceTierQueryBuilderDsl.of())),
            StandalonePriceTiersSetMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StandalonePriceTiersSetMessagePayloadQueryBuilderDsl> tiers() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tiers")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceTiersSetMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceTiersSetMessagePayloadQueryBuilderDsl> previousTiers(
            Function<com.commercetools.api.predicates.query.common.PriceTierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceTierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("previousTiers"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceTierQueryBuilderDsl.of())),
            StandalonePriceTiersSetMessagePayloadQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StandalonePriceTiersSetMessagePayloadQueryBuilderDsl> previousTiers() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("previousTiers")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceTiersSetMessagePayloadQueryBuilderDsl::of));
    }

}
