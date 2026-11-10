
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderStartsAtSetMessagePayloadQueryBuilderDsl {
    public RecurringOrderStartsAtSetMessagePayloadQueryBuilderDsl() {
    }

    public static RecurringOrderStartsAtSetMessagePayloadQueryBuilderDsl of() {
        return new RecurringOrderStartsAtSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderStartsAtSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderStartsAtSetMessagePayloadQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderStartsAtSetMessagePayloadQueryBuilderDsl> startsAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("startsAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderStartsAtSetMessagePayloadQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderStartsAtSetMessagePayloadQueryBuilderDsl> oldStartsAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldStartsAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderStartsAtSetMessagePayloadQueryBuilderDsl::of));
    }

}
