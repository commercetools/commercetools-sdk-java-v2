
package com.commercetools.api.predicates.query.subscription;

import com.commercetools.api.predicates.query.*;

public class MessageSubscriptionQueryBuilderDsl {
    public MessageSubscriptionQueryBuilderDsl() {
    }

    public static MessageSubscriptionQueryBuilderDsl of() {
        return new MessageSubscriptionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MessageSubscriptionQueryBuilderDsl> resourceTypeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceTypeId")),
            p -> new CombinationQueryPredicate<>(p, MessageSubscriptionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<MessageSubscriptionQueryBuilderDsl> types() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("types")),
            p -> new CombinationQueryPredicate<>(p, MessageSubscriptionQueryBuilderDsl::of));
    }

}
