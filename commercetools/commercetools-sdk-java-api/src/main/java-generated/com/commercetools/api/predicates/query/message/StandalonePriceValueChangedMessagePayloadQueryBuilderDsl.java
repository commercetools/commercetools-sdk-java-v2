
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceValueChangedMessagePayloadQueryBuilderDsl {
    public StandalonePriceValueChangedMessagePayloadQueryBuilderDsl() {
    }

    public static StandalonePriceValueChangedMessagePayloadQueryBuilderDsl of() {
        return new StandalonePriceValueChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceValueChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValueChangedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceValueChangedMessagePayloadQueryBuilderDsl> value(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("value"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            StandalonePriceValueChangedMessagePayloadQueryBuilderDsl::of);
    }

    public BooleanComparisonPredicateBuilder<StandalonePriceValueChangedMessagePayloadQueryBuilderDsl> staged() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("staged")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValueChangedMessagePayloadQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StandalonePriceValueChangedMessagePayloadQueryBuilderDsl> oldValue(
            Function<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("oldValue"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.MoneyQueryBuilderDsl.of())),
            StandalonePriceValueChangedMessagePayloadQueryBuilderDsl::of);
    }

}
