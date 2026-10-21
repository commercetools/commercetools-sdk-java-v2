
package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderNowRequestedMessagePayloadQueryBuilderDsl {
    public RecurringOrderNowRequestedMessagePayloadQueryBuilderDsl() {
    }

    public static RecurringOrderNowRequestedMessagePayloadQueryBuilderDsl of() {
        return new RecurringOrderNowRequestedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderNowRequestedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderNowRequestedMessagePayloadQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderNowRequestedMessagePayloadQueryBuilderDsl> requestedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("requestedAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderNowRequestedMessagePayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurringOrderNowRequestedMessagePayloadQueryBuilderDsl> reason() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("reason")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderNowRequestedMessagePayloadQueryBuilderDsl::of));
    }

}
