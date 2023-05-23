
package com.commercetools.api.predicates.query.channel;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ChannelDraftQueryBuilderDsl {
    public ChannelDraftQueryBuilderDsl() {
    }

    public static ChannelDraftQueryBuilderDsl of() {
        return new ChannelDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ChannelDraftQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ChannelDraftQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<ChannelDraftQueryBuilderDsl> roles() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("roles")),
            p -> new CombinationQueryPredicate<>(p, ChannelDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ChannelDraftQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ChannelDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ChannelDraftQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ChannelDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ChannelDraftQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.BaseAddressQueryBuilderDsl.of())),
            ChannelDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ChannelDraftQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsDraftQueryBuilderDsl.of())),
            ChannelDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ChannelDraftQueryBuilderDsl> geoLocation(
            Function<com.commercetools.api.predicates.query.common.GeoJsonQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.GeoJsonQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("geoLocation"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.GeoJsonQueryBuilderDsl.of())),
            ChannelDraftQueryBuilderDsl::of);
    }

    public GeoJsonPredicateBuilder<ChannelDraftQueryBuilderDsl> geoLocation() {
        return new GeoJsonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("geoLocation")),
            p -> new CombinationQueryPredicate<>(p, ChannelDraftQueryBuilderDsl::of));
    }

}
