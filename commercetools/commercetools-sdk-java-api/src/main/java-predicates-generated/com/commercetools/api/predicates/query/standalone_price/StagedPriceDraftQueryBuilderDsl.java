
package com.commercetools.api.predicates.query.standalone_price;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedPriceDraftQueryBuilderDsl {
    public StagedPriceDraftQueryBuilderDsl() {
    }

    public static StagedPriceDraftQueryBuilderDsl of() {
        return new StagedPriceDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<StagedPriceDraftQueryBuilderDsl> value(
            Function<com.commercetools.api.predicates.query.common.TypedMoneyDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.TypedMoneyDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("value"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.TypedMoneyDraftQueryBuilderDsl.of())),
            StagedPriceDraftQueryBuilderDsl::of);
    }

}
