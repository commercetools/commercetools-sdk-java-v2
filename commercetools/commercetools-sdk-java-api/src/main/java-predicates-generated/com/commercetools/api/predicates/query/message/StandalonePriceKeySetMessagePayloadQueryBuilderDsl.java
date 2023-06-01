package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StandalonePriceKeySetMessagePayloadQueryBuilderDsl  {
    public StandalonePriceKeySetMessagePayloadQueryBuilderDsl() {
    }

    public static StandalonePriceKeySetMessagePayloadQueryBuilderDsl of() {
        return new StandalonePriceKeySetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceKeySetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceKeySetMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StandalonePriceKeySetMessagePayloadQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceKeySetMessagePayloadQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StandalonePriceKeySetMessagePayloadQueryBuilderDsl> oldKey() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldKey")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceKeySetMessagePayloadQueryBuilderDsl::of));
    }
    
}
