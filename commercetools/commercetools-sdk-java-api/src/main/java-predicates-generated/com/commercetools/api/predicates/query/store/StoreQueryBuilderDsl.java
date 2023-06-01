package com.commercetools.api.predicates.query.store;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class StoreQueryBuilderDsl  {
    public StoreQueryBuilderDsl() {
    }

    public static StoreQueryBuilderDsl of() {
        return new StoreQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, StoreQueryBuilderDsl::of));
    }
    public LongComparisonPredicateBuilder<StoreQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, StoreQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<StoreQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
        p -> new CombinationQueryPredicate<>(p, StoreQueryBuilderDsl::of));
    }
    public DateTimeComparisonPredicateBuilder<StoreQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
        p -> new CombinationQueryPredicate<>(p, StoreQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreQueryBuilderDsl> lastModifiedBy(
        Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            StoreQueryBuilderDsl::of);
    }
    
    public CombinationQueryPredicate<StoreQueryBuilderDsl> createdBy(
        Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("createdBy"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            StoreQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<StoreQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
        p -> new CombinationQueryPredicate<>(p, StoreQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreQueryBuilderDsl> name(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("name"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            StoreQueryBuilderDsl::of);
    }
    
    public StringCollectionPredicateBuilder<StoreQueryBuilderDsl> languages() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("languages")),
        p -> new CombinationQueryPredicate<>(p, StoreQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreQueryBuilderDsl> countries(
        Function<com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("countries"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl.of())),
            StoreQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StoreQueryBuilderDsl> countries() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("countries")),
                p -> new CombinationQueryPredicate<>(p, StoreQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreQueryBuilderDsl> distributionChannels(
        Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("distributionChannels"))
            .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            StoreQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StoreQueryBuilderDsl> distributionChannels() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("distributionChannels")),
                p -> new CombinationQueryPredicate<>(p, StoreQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreQueryBuilderDsl> supplyChannels(
        Function<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("supplyChannels"))
            .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelReferenceQueryBuilderDsl.of())),
            StoreQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StoreQueryBuilderDsl> supplyChannels() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("supplyChannels")),
                p -> new CombinationQueryPredicate<>(p, StoreQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreQueryBuilderDsl> productSelections(
        Function<com.commercetools.api.predicates.query.store.ProductSelectionSettingQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.ProductSelectionSettingQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("productSelections"))
            .inner(fn.apply(com.commercetools.api.predicates.query.store.ProductSelectionSettingQueryBuilderDsl.of())),
            StoreQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<StoreQueryBuilderDsl> productSelections() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productSelections")),
                p -> new CombinationQueryPredicate<>(p, StoreQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<StoreQueryBuilderDsl> custom(
        Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("custom"))
            .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            StoreQueryBuilderDsl::of);
    }
    
    
}
