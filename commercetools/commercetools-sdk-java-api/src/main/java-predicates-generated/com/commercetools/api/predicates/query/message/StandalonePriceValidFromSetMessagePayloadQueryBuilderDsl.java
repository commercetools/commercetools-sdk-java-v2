
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class StandalonePriceValidFromSetMessagePayloadQueryBuilderDsl {
    public StandalonePriceValidFromSetMessagePayloadQueryBuilderDsl() {
    }

    public static StandalonePriceValidFromSetMessagePayloadQueryBuilderDsl of() {
        return new StandalonePriceValidFromSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceValidFromSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValidFromSetMessagePayloadQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceValidFromSetMessagePayloadQueryBuilderDsl> validFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("validFrom")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValidFromSetMessagePayloadQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StandalonePriceValidFromSetMessagePayloadQueryBuilderDsl> previousValidFrom() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("previousValidFrom")),
            p -> new CombinationQueryPredicate<>(p, StandalonePriceValidFromSetMessagePayloadQueryBuilderDsl::of));
    }

}
