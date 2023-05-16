
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceActiveChangedMessagePayloadQueryBuilderDsl {
    public StandalonePriceActiveChangedMessagePayloadQueryBuilderDsl() {
    }

    public static StandalonePriceActiveChangedMessagePayloadQueryBuilderDsl of() {
        return new StandalonePriceActiveChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceActiveChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceActiveChangedMessagePayloadQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<StandalonePriceActiveChangedMessagePayloadQueryBuilderDsl> active() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("active")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceActiveChangedMessagePayloadQueryBuilderDsl::of));
    }

    public BooleanComparisonPredicateBuilder<StandalonePriceActiveChangedMessagePayloadQueryBuilderDsl> oldActive() {
        return new BooleanComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldActive")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceActiveChangedMessagePayloadQueryBuilderDsl::of));
    }

}
