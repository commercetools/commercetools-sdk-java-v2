
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class TaxedItemPriceDraftQueryBuilderDsl {
    public TaxedItemPriceDraftQueryBuilderDsl() {
    }

    public static TaxedItemPriceDraftQueryBuilderDsl of() {
        return new TaxedItemPriceDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<TaxedItemPriceDraftQueryBuilderDsl> totalNet(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("totalNet"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            TaxedItemPriceDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<TaxedItemPriceDraftQueryBuilderDsl> totalGross(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("totalGross"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            TaxedItemPriceDraftQueryBuilderDsl::of);
    }

}
