
package com.commercetools.api.predicates.query.subscription;

import com.commercetools.api.predicates.query.*;

public class EventBridgeDestinationQueryBuilderDsl {
    public EventBridgeDestinationQueryBuilderDsl() {
    }

    public static EventBridgeDestinationQueryBuilderDsl of() {
        return new EventBridgeDestinationQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<EventBridgeDestinationQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, EventBridgeDestinationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<EventBridgeDestinationQueryBuilderDsl> region() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("region")),
            p -> new CombinationQueryPredicate<>(p, EventBridgeDestinationQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<EventBridgeDestinationQueryBuilderDsl> accountId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("accountId")),
            p -> new CombinationQueryPredicate<>(p, EventBridgeDestinationQueryBuilderDsl::of));
    }

}
