
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderExpiresAtSetMessagePayloadQueryBuilderDsl {
    public RecurringOrderExpiresAtSetMessagePayloadQueryBuilderDsl() {
    }

    public static RecurringOrderExpiresAtSetMessagePayloadQueryBuilderDsl of() {
        return new RecurringOrderExpiresAtSetMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderExpiresAtSetMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderExpiresAtSetMessagePayloadQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderExpiresAtSetMessagePayloadQueryBuilderDsl> newExpiresAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("newExpiresAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderExpiresAtSetMessagePayloadQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderExpiresAtSetMessagePayloadQueryBuilderDsl> oldExpiresAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("oldExpiresAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderExpiresAtSetMessagePayloadQueryBuilderDsl::of));
    }

}
