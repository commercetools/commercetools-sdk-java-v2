
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class StoreDeletedMessagePayloadQueryBuilderDsl {
    public StoreDeletedMessagePayloadQueryBuilderDsl() {
    }

    public static StoreDeletedMessagePayloadQueryBuilderDsl of() {
        return new StoreDeletedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreDeletedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, StoreDeletedMessagePayloadQueryBuilderDsl::of));
    }

}
