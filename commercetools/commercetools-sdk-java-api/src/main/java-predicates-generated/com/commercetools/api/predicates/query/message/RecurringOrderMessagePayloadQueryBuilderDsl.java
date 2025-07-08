
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderMessagePayloadQueryBuilderDsl {
    public RecurringOrderMessagePayloadQueryBuilderDsl() {
    }

    public static RecurringOrderMessagePayloadQueryBuilderDsl of() {
        return new RecurringOrderMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderMessagePayloadQueryBuilderDsl::of));
    }

}
