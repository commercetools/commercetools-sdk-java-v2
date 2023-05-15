
package com.commercetools.api.predicates.query.channel;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ChannelQueryBuilderDsl {
    public ChannelQueryBuilderDsl() {
    }

    public static ChannelQueryBuilderDsl of() {
        return new ChannelQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ChannelQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, ChannelQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ChannelQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, ChannelQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ChannelQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, ChannelQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<ChannelQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, ChannelQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ChannelQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            ChannelQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ChannelQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            ChannelQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<ChannelQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, ChannelQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<ChannelQueryBuilderDsl> roles() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("roles")),
            p -> new CombinationQueryPredicate<>(p, ChannelQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ChannelQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ChannelQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ChannelQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ChannelQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ChannelQueryBuilderDsl> address(
            Function<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("address"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.AddressQueryBuilderDsl.of())),
            ChannelQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ChannelQueryBuilderDsl> reviewRatingStatistics(
            Function<com.commercetools.api.predicates.query.review.ReviewRatingStatisticsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.review.ReviewRatingStatisticsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("reviewRatingStatistics"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.review.ReviewRatingStatisticsQueryBuilderDsl.of())),
            ChannelQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ChannelQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            ChannelQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ChannelQueryBuilderDsl> geoLocation(
            Function<com.commercetools.api.predicates.query.common.GeoJsonQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.GeoJsonQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("geoLocation"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.GeoJsonQueryBuilderDsl.of())),
            ChannelQueryBuilderDsl::of);
    }

    public GeoJsonPredicateBuilder<ChannelQueryBuilderDsl> geoLocation() {
        return new GeoJsonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("geoLocation")),
            p -> new CombinationQueryPredicate<>(p, ChannelQueryBuilderDsl::of));
    }
}
