
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class StoreContactUrlSetMessagePayloadQueryBuilderDsl {
    public StoreContactUrlSetMessagePayloadQueryBuilderDsl() {
    }

    public static StoreContactUrlSetMessagePayloadQueryBuilderDsl of() {
        return new StoreContactUrlSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreContactUrlSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StoreContactUrlSetMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<StoreContactUrlSetMessagePayloadQueryBuilderDsl> contactUrl() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("contactUrl")),
            p -> new CombinationQueryPredicate<>(p, StoreContactUrlSetMessagePayloadQueryBuilderDsl::of));
    }

}
