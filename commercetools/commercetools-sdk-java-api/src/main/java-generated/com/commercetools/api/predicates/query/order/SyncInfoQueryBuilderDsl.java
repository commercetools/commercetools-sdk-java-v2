
package com.commercetools.api.predicates.query.order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SyncInfoQueryBuilderDsl {
    public SyncInfoQueryBuilderDsl() {
    }

    public static SyncInfoQueryBuilderDsl of() {
        return new SyncInfoQueryBuilderDsl();
    }

    public CombinationQueryPredicate<SyncInfoQueryBuilderDsl> channel(
            Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("channel"))
                .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            SyncInfoQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<SyncInfoQueryBuilderDsl> externalId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("externalId")),
            p -> new CombinationQueryPredicate<>(p, SyncInfoQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<SyncInfoQueryBuilderDsl> syncedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("syncedAt")),
            p -> new CombinationQueryPredicate<>(p, SyncInfoQueryBuilderDsl::of));
    }
}
