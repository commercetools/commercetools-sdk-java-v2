package com.commercetools.api.predicates.query.message;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StoreCreatedMessagePayloadQueryBuilderDsl  {
    public StoreCreatedMessagePayloadQueryBuilderDsl() {
    }

    public static StoreCreatedMessagePayloadQueryBuilderDsl of() {
        return new StoreCreatedMessagePayloadQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreCreatedMessagePayloadQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
        p -> new CombinationQueryPredicate<>(p, StoreCreatedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreCreatedMessagePayloadQueryBuilderDsl> name(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("name"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            StoreCreatedMessagePayloadQueryBuilderDsl::of);
    }
    
    public StringCollectionPredicateBuilder<StoreCreatedMessagePayloadQueryBuilderDsl> languages() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("languages")),
        p -> new CombinationQueryPredicate<>(p, StoreCreatedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreCreatedMessagePayloadQueryBuilderDsl> countries(
        Function<com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("countries"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl.of())),
            StoreCreatedMessagePayloadQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StoreCreatedMessagePayloadQueryBuilderDsl> countries() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("countries")),
                p -> new CombinationQueryPredicate<>(p, StoreCreatedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreCreatedMessagePayloadQueryBuilderDsl> distributionChannels(
        Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("distributionChannels"))
            .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            StoreCreatedMessagePayloadQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StoreCreatedMessagePayloadQueryBuilderDsl> distributionChannels() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("distributionChannels")),
                p -> new CombinationQueryPredicate<>(p, StoreCreatedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreCreatedMessagePayloadQueryBuilderDsl> supplyChannels(
        Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("supplyChannels"))
            .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            StoreCreatedMessagePayloadQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StoreCreatedMessagePayloadQueryBuilderDsl> supplyChannels() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("supplyChannels")),
                p -> new CombinationQueryPredicate<>(p, StoreCreatedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreCreatedMessagePayloadQueryBuilderDsl> productSelections(
        Function<com.commercetools.api.predicates.query.store.ProductSelectionSettingQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.ProductSelectionSettingQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("productSelections"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store.ProductSelectionSettingQueryBuilderDsl.of())),
            StoreCreatedMessagePayloadQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StoreCreatedMessagePayloadQueryBuilderDsl> productSelections() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productSelections")),
                p -> new CombinationQueryPredicate<>(p, StoreCreatedMessagePayloadQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreCreatedMessagePayloadQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            StoreCreatedMessagePayloadQueryBuilderDsl::of);
    }
    
    
}
