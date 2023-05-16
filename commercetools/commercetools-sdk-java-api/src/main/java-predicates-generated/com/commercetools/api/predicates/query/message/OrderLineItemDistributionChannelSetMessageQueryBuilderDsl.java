
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderLineItemDistributionChannelSetMessageQueryBuilderDsl {
    public OrderLineItemDistributionChannelSetMessageQueryBuilderDsl() {
    }

    public static OrderLineItemDistributionChannelSetMessageQueryBuilderDsl of() {
        return new OrderLineItemDistributionChannelSetMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderLineItemDistributionChannelSetMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemDistributionChannelSetMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderLineItemDistributionChannelSetMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemDistributionChannelSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderLineItemDistributionChannelSetMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemDistributionChannelSetMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderLineItemDistributionChannelSetMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemDistributionChannelSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderLineItemDistributionChannelSetMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            OrderLineItemDistributionChannelSetMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderLineItemDistributionChannelSetMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            OrderLineItemDistributionChannelSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderLineItemDistributionChannelSetMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemDistributionChannelSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderLineItemDistributionChannelSetMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            OrderLineItemDistributionChannelSetMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderLineItemDistributionChannelSetMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemDistributionChannelSetMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderLineItemDistributionChannelSetMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemDistributionChannelSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderLineItemDistributionChannelSetMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            OrderLineItemDistributionChannelSetMessageQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<OrderLineItemDistributionChannelSetMessageQueryBuilderDsl> lineItemId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lineItemId")),
            p -> new CombinationQueryPredicate<>(p, OrderLineItemDistributionChannelSetMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderLineItemDistributionChannelSetMessageQueryBuilderDsl> distributionChannel(
            Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("distributionChannel"))
                .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            OrderLineItemDistributionChannelSetMessageQueryBuilderDsl::of);
    }

}
