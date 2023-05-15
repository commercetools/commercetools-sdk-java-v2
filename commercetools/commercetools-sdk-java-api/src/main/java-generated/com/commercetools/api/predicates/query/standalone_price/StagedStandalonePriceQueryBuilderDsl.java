
package com.commercetools.api.predicates.query.standalone_price;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedStandalonePriceQueryBuilderDsl {
    public StagedStandalonePriceQueryBuilderDsl() {
    }

    public static StagedStandalonePriceQueryBuilderDsl of() {
        return new StagedStandalonePriceQueryBuilderDsl();
    }

    public CombinationQueryPredicate<StagedStandalonePriceQueryBuilderDsl> value(
            Function<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("value"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl.of())),
            StagedStandalonePriceQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<StagedStandalonePriceQueryBuilderDsl> discounted(
            Function<com.commercetools.api.predicates.query.common.DiscountedPriceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.DiscountedPriceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("discounted"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.DiscountedPriceQueryBuilderDsl.of())),
            StagedStandalonePriceQueryBuilderDsl::of);
    }

}
