
package com.commercetools.api.predicates.query.store;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class StoreDraftQueryBuilderDsl {
    public StoreDraftQueryBuilderDsl() {
    }

    public static StoreDraftQueryBuilderDsl of() {
        return new StoreDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<StoreDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, StoreDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreDraftQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            StoreDraftQueryBuilderDsl::of);
    }

    public StringCollectionPredicateBuilder<StoreDraftQueryBuilderDsl> languages() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("languages")),
            p -> new CombinationQueryPredicate<>(p, StoreDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreDraftQueryBuilderDsl> countries(
            Function<com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("countries"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store_country.StoreCountryQueryBuilderDsl.of())),
            StoreDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StoreDraftQueryBuilderDsl> countries() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("countries")),
            p -> new CombinationQueryPredicate<>(p, StoreDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreDraftQueryBuilderDsl> distributionChannels(
            Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("distributionChannels"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            StoreDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StoreDraftQueryBuilderDsl> distributionChannels() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("distributionChannels")),
            p -> new CombinationQueryPredicate<>(p, StoreDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreDraftQueryBuilderDsl> supplyChannels(
            Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("supplyChannels"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            StoreDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StoreDraftQueryBuilderDsl> supplyChannels() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("supplyChannels")),
            p -> new CombinationQueryPredicate<>(p, StoreDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreDraftQueryBuilderDsl> productSelections(
            Function<com.commercetools.api.predicates.query.store.ProductSelectionSettingDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.ProductSelectionSettingDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("productSelections"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.store.ProductSelectionSettingDraftQueryBuilderDsl.of())),
            StoreDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<StoreDraftQueryBuilderDsl> productSelections() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("productSelections")),
            p -> new CombinationQueryPredicate<>(p, StoreDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<StoreDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            StoreDraftQueryBuilderDsl::of);
    }

}
