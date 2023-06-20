
package com.commercetools.api.predicates.query.standalone_price;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceSetPriceTiersActionQueryBuilderDsl {
    public StandalonePriceSetPriceTiersActionQueryBuilderDsl() {
    }

    public static StandalonePriceSetPriceTiersActionQueryBuilderDsl of() {
        return new StandalonePriceSetPriceTiersActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceSetPriceTiersActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceSetPriceTiersActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceSetPriceTiersActionQueryBuilderDsl> tiers(
            Function<com.commercetools.api.predicates.query.common.PriceTierDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceTierDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("tiers"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceTierDraftQueryBuilderDsl.of())),
            StandalonePriceSetPriceTiersActionQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StandalonePriceSetPriceTiersActionQueryBuilderDsl> tiers() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("tiers")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceSetPriceTiersActionQueryBuilderDsl::of));
    }

}
