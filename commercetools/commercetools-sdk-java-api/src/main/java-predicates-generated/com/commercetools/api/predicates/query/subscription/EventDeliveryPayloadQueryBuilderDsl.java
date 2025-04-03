
package com.commercetools.api.predicates.query.subscription;

import com.commercetools.api.predicates.query.*;

public class EventDeliveryPayloadQueryBuilderDsl {
    public EventDeliveryPayloadQueryBuilderDsl() {
    }

    public static EventDeliveryPayloadQueryBuilderDsl of() {
        return new EventDeliveryPayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<EventDeliveryPayloadQueryBuilderDsl> notificationType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("notificationType")),
            p -> new CombinationQueryPredicate<>(p, EventDeliveryPayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<EventDeliveryPayloadQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, EventDeliveryPayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<EventDeliveryPayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, EventDeliveryPayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<EventDeliveryPayloadQueryBuilderDsl> resourceType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceType")),
            p -> new CombinationQueryPredicate<>(p, EventDeliveryPayloadQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<EventDeliveryPayloadQueryBuilderDsl> data() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("data")),
            p -> new CombinationQueryPredicate<>(p, EventDeliveryPayloadQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<EventDeliveryPayloadQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, EventDeliveryPayloadQueryBuilderDsl::of));
    }

}
