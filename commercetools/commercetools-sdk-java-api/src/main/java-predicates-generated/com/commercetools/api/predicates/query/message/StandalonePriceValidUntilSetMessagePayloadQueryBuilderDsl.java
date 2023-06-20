
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceValidUntilSetMessagePayloadQueryBuilderDsl {
    public StandalonePriceValidUntilSetMessagePayloadQueryBuilderDsl() {
    }

    public static StandalonePriceValidUntilSetMessagePayloadQueryBuilderDsl of() {
        return new StandalonePriceValidUntilSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceValidUntilSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValidUntilSetMessagePayloadQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceValidUntilSetMessagePayloadQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValidUntilSetMessagePayloadQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceValidUntilSetMessagePayloadQueryBuilderDsl> previousValidUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("previousValidUntil")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValidUntilSetMessagePayloadQueryBuilderDsl::of));
    }

}
