package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StoreSupplyChannelsChangedMessageQueryBuilderDsl  {
    public StoreSupplyChannelsChangedMessageQueryBuilderDsl() {
    }

    public static StoreSupplyChannelsChangedMessageQueryBuilderDsl of() {
        return new StoreSupplyChannelsChangedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreSupplyChannelsChangedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, StoreSupplyChannelsChangedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<StoreSupplyChannelsChangedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, StoreSupplyChannelsChangedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<StoreSupplyChannelsChangedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, StoreSupplyChannelsChangedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<StoreSupplyChannelsChangedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, StoreSupplyChannelsChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreSupplyChannelsChangedMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StoreSupplyChannelsChangedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<StoreSupplyChannelsChangedMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StoreSupplyChannelsChangedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<StoreSupplyChannelsChangedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, StoreSupplyChannelsChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreSupplyChannelsChangedMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            StoreSupplyChannelsChangedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<StoreSupplyChannelsChangedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, StoreSupplyChannelsChangedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StoreSupplyChannelsChangedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, StoreSupplyChannelsChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreSupplyChannelsChangedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            StoreSupplyChannelsChangedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<StoreSupplyChannelsChangedMessageQueryBuilderDsl> addedSupplyChannels(
        Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("addedSupplyChannels"))
            .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            StoreSupplyChannelsChangedMessageQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StoreSupplyChannelsChangedMessageQueryBuilderDsl> addedSupplyChannels() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("addedSupplyChannels")),
                p -> new CombinationQueryPredicate<>(p, StoreSupplyChannelsChangedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreSupplyChannelsChangedMessageQueryBuilderDsl> removedSupplyChannels(
        Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("removedSupplyChannels"))
            .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            StoreSupplyChannelsChangedMessageQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StoreSupplyChannelsChangedMessageQueryBuilderDsl> removedSupplyChannels() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("removedSupplyChannels")),
                p -> new CombinationQueryPredicate<>(p, StoreSupplyChannelsChangedMessageQueryBuilderDsl::of));
    }
    
}
