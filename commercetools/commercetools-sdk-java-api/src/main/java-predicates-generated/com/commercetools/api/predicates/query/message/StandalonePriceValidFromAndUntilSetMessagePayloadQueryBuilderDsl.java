
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceValidFromAndUntilSetMessagePayloadQueryBuilderDsl {
    public StandalonePriceValidFromAndUntilSetMessagePayloadQueryBuilderDsl() {
    }

    public static StandalonePriceValidFromAndUntilSetMessagePayloadQueryBuilderDsl of() {
        return new StandalonePriceValidFromAndUntilSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceValidFromAndUntilSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")), p -> new CombinationQueryPredicate<>(p,
                StandalonePriceValidFromAndUntilSetMessagePayloadQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceValidFromAndUntilSetMessagePayloadQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
            p -> new CombinationQueryPredicate<>(p,
                StandalonePriceValidFromAndUntilSetMessagePayloadQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceValidFromAndUntilSetMessagePayloadQueryBuilderDsl> previousValidFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("previousValidFrom")),
            p -> new CombinationQueryPredicate<>(p,
                StandalonePriceValidFromAndUntilSetMessagePayloadQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceValidFromAndUntilSetMessagePayloadQueryBuilderDsl> validUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validUntil")),
            p -> new CombinationQueryPredicate<>(p,
                StandalonePriceValidFromAndUntilSetMessagePayloadQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceValidFromAndUntilSetMessagePayloadQueryBuilderDsl> previousValidUntil() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("previousValidUntil")),
            p -> new CombinationQueryPredicate<>(p,
                StandalonePriceValidFromAndUntilSetMessagePayloadQueryBuilderDsl::of));
    }

}
