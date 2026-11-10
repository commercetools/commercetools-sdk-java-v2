
package com.commercetools.api.predicates.query.subscription;

import com.commercetools.api.predicates.query.*;

public class EventSubscriptionQueryBuilderDsl {
    public EventSubscriptionQueryBuilderDsl() {
    }

    public static EventSubscriptionQueryBuilderDsl of() {
        return new EventSubscriptionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<EventSubscriptionQueryBuilderDsl> resourceTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceTypeId")),
            p -> new CombinationQueryPredicate<>(p, EventSubscriptionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<EventSubscriptionQueryBuilderDsl> types() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("types")),
            p -> new CombinationQueryPredicate<>(p, EventSubscriptionQueryBuilderDsl::of));
    }

}
