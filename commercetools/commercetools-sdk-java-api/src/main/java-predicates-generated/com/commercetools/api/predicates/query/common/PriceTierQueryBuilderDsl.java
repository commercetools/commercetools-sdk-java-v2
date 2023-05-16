
package com.commercetools.api.predicates.query.common;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class PriceTierQueryBuilderDsl {
    public PriceTierQueryBuilderDsl() {
    }

    public static PriceTierQueryBuilderDsl of() {
        return new PriceTierQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<PriceTierQueryBuilderDsl> minimumQuantity() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("minimumQuantity")),
            p -> new CombinationQueryPredicate<>(p, PriceTierQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<PriceTierQueryBuilderDsl> value(
            Function<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("value"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.TypedMoneyQueryBuilderDsl.of())),
            PriceTierQueryBuilderDsl::of);
    }

}
