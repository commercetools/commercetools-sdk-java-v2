package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StandalonePriceDeletedMessagePayloadQueryBuilderDsl  {
    public StandalonePriceDeletedMessagePayloadQueryBuilderDsl() {
    }

    public static StandalonePriceDeletedMessagePayloadQueryBuilderDsl of() {
        return new StandalonePriceDeletedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StandalonePriceDeletedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, StandalonePriceDeletedMessagePayloadQueryBuilderDsl::of));
    }
    
}
