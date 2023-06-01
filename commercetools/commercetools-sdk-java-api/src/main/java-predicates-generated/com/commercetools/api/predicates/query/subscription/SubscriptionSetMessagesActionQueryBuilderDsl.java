package com.commercetools.api.predicates.query.subscription;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class SubscriptionSetMessagesActionQueryBuilderDsl  {
    public SubscriptionSetMessagesActionQueryBuilderDsl() {
    }

    public static SubscriptionSetMessagesActionQueryBuilderDsl of() {
        return new SubscriptionSetMessagesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<SubscriptionSetMessagesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, SubscriptionSetMessagesActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<SubscriptionSetMessagesActionQueryBuilderDsl> messages(
        Function<com.commercetools.api.predicates.query.subscription.MessageSubscriptionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.MessageSubscriptionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("messages"))
            .inner(fn.apply(com.commercetools.api.predicates.query.subscription.MessageSubscriptionQueryBuilderDsl.of())),
            SubscriptionSetMessagesActionQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<SubscriptionSetMessagesActionQueryBuilderDsl> messages() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("messages")),
                p -> new CombinationQueryPredicate<>(p, SubscriptionSetMessagesActionQueryBuilderDsl::of));
    }
    
}
