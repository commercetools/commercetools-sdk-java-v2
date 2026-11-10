
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderStateChangedMessagePayloadQueryBuilderDsl {
    public RecurringOrderStateChangedMessagePayloadQueryBuilderDsl() {
    }

    public static RecurringOrderStateChangedMessagePayloadQueryBuilderDsl of() {
        return new RecurringOrderStateChangedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderStateChangedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderStateChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurringOrderStateChangedMessagePayloadQueryBuilderDsl> state() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("state")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderStateChangedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurringOrderStateChangedMessagePayloadQueryBuilderDsl> oldState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldState")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderStateChangedMessagePayloadQueryBuilderDsl::of));
    }

}
