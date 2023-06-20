
package com.commercetools.api.predicates.query.standalone_price;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceAddPriceTierActionQueryBuilderDsl {
    public StandalonePriceAddPriceTierActionQueryBuilderDsl() {
    }

    public static StandalonePriceAddPriceTierActionQueryBuilderDsl of() {
        return new StandalonePriceAddPriceTierActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceAddPriceTierActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceAddPriceTierActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceAddPriceTierActionQueryBuilderDsl> tier(
            Function<com.commercetools.api.predicates.query.common.PriceTierDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.PriceTierDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("tier"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.PriceTierDraftQueryBuilderDsl.of())),
            StandalonePriceAddPriceTierActionQueryBuilderDsl::of);
    }

}
