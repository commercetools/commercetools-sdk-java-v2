
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderUpdateSyncInfoActionQueryBuilderDsl {
    public OrderUpdateSyncInfoActionQueryBuilderDsl() {
    }

    public static OrderUpdateSyncInfoActionQueryBuilderDsl of() {
        return new OrderUpdateSyncInfoActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderUpdateSyncInfoActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, OrderUpdateSyncInfoActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderUpdateSyncInfoActionQueryBuilderDsl> channel(
            Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("channel"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            OrderUpdateSyncInfoActionQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<OrderUpdateSyncInfoActionQueryBuilderDsl> externalId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("externalId")),
            p -> new CombinationQueryPredicate<>(p, OrderUpdateSyncInfoActionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderUpdateSyncInfoActionQueryBuilderDsl> syncedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("syncedAt")),
            p -> new CombinationQueryPredicate<>(p, OrderUpdateSyncInfoActionQueryBuilderDsl::of));
    }
}
