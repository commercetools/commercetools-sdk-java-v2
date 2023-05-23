
package com.commercetools.api.predicates.query.order_edit;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StagedOrderUpdateSyncInfoActionQueryBuilderDsl {
    public StagedOrderUpdateSyncInfoActionQueryBuilderDsl() {
    }

    public static StagedOrderUpdateSyncInfoActionQueryBuilderDsl of() {
        return new StagedOrderUpdateSyncInfoActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StagedOrderUpdateSyncInfoActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderUpdateSyncInfoActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StagedOrderUpdateSyncInfoActionQueryBuilderDsl> channel(
            Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("channel"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            StagedOrderUpdateSyncInfoActionQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<StagedOrderUpdateSyncInfoActionQueryBuilderDsl> externalId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("externalId")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderUpdateSyncInfoActionQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<StagedOrderUpdateSyncInfoActionQueryBuilderDsl> syncedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("syncedAt")),
            p -> new CombinationQueryPredicate<>(p, StagedOrderUpdateSyncInfoActionQueryBuilderDsl::of));
    }

}
