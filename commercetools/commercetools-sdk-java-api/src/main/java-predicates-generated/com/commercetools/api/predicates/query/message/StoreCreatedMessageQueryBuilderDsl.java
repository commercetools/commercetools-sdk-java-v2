package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StoreCreatedMessageQueryBuilderDsl  {
    public StoreCreatedMessageQueryBuilderDsl() {
    }

    public static StoreCreatedMessageQueryBuilderDsl of() {
        return new StoreCreatedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreCreatedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, StoreCreatedMessageQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<StoreCreatedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, StoreCreatedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<StoreCreatedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, StoreCreatedMessageQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<StoreCreatedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, StoreCreatedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreCreatedMessageQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StoreCreatedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<StoreCreatedMessageQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StoreCreatedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<StoreCreatedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
        p -> new CombinationQueryPredicate<>(p, StoreCreatedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreCreatedMessageQueryBuilderDsl> resource(
        Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resource"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            StoreCreatedMessageQueryBuilderDsl::of);
    }
    
    public LongComparisonPredicateBuilder<StoreCreatedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
        p -> new CombinationQueryPredicate<>(p, StoreCreatedMessageQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<StoreCreatedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, StoreCreatedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreCreatedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
        Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
            .inner(fn.apply(com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            StoreCreatedMessageQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<StoreCreatedMessageQueryBuilderDsl> name(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("name"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            StoreCreatedMessageQueryBuilderDsl::of);
    }
    
    public StringCollectionPredicateBuilder<StoreCreatedMessageQueryBuilderDsl> languages() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("languages")),
        p -> new CombinationQueryPredicate<>(p, StoreCreatedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreCreatedMessageQueryBuilderDsl> countries(
        Function<com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("countries"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl.of())),
            StoreCreatedMessageQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StoreCreatedMessageQueryBuilderDsl> countries() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("countries")),
                p -> new CombinationQueryPredicate<>(p, StoreCreatedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreCreatedMessageQueryBuilderDsl> distributionChannels(
        Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("distributionChannels"))
            .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            StoreCreatedMessageQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StoreCreatedMessageQueryBuilderDsl> distributionChannels() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("distributionChannels")),
                p -> new CombinationQueryPredicate<>(p, StoreCreatedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreCreatedMessageQueryBuilderDsl> supplyChannels(
        Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("supplyChannels"))
            .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            StoreCreatedMessageQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StoreCreatedMessageQueryBuilderDsl> supplyChannels() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("supplyChannels")),
                p -> new CombinationQueryPredicate<>(p, StoreCreatedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreCreatedMessageQueryBuilderDsl> productSelections(
        Function<com.commercetools.api.predicates.query.store.ProductSelectionSettingQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.ProductSelectionSettingQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("productSelections"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store.ProductSelectionSettingQueryBuilderDsl.of())),
            StoreCreatedMessageQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StoreCreatedMessageQueryBuilderDsl> productSelections() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productSelections")),
                p -> new CombinationQueryPredicate<>(p, StoreCreatedMessageQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreCreatedMessageQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            StoreCreatedMessageQueryBuilderDsl::of);
    }
    
    
}
