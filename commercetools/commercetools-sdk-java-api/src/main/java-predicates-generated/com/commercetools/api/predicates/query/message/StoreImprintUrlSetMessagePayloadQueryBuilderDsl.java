
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class StoreImprintUrlSetMessagePayloadQueryBuilderDsl {
    public StoreImprintUrlSetMessagePayloadQueryBuilderDsl() {
    }

    public static StoreImprintUrlSetMessagePayloadQueryBuilderDsl of() {
        return new StoreImprintUrlSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreImprintUrlSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StoreImprintUrlSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreImprintUrlSetMessagePayloadQueryBuilderDsl> imprintUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("imprintUrl")),
            p -> new CombinationQueryPredicate<>(p, StoreImprintUrlSetMessagePayloadQueryBuilderDsl::of));
    }

}
