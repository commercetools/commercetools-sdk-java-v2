
package com.commercetools.api.predicates.query.channel;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ChannelUpdateActionQueryBuilderDsl {
    public ChannelUpdateActionQueryBuilderDsl() {
    }

    public static ChannelUpdateActionQueryBuilderDsl of() {
        return new ChannelUpdateActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ChannelUpdateActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ChannelUpdateActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ChannelUpdateActionQueryBuilderDsl> asAddRoles(
            Function<com.commercetools.api.predicates.query.channel.ChannelAddRolesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelAddRolesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.channel.ChannelAddRolesActionQueryBuilderDsl.of()),
            ChannelUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ChannelUpdateActionQueryBuilderDsl> asChangeDescription(
            Function<com.commercetools.api.predicates.query.channel.ChannelChangeDescriptionActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelChangeDescriptionActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.channel.ChannelChangeDescriptionActionQueryBuilderDsl.of()),
            ChannelUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ChannelUpdateActionQueryBuilderDsl> asChangeKey(
            Function<com.commercetools.api.predicates.query.channel.ChannelChangeKeyActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelChangeKeyActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.channel.ChannelChangeKeyActionQueryBuilderDsl.of()),
            ChannelUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ChannelUpdateActionQueryBuilderDsl> asChangeName(
            Function<com.commercetools.api.predicates.query.channel.ChannelChangeNameActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelChangeNameActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.channel.ChannelChangeNameActionQueryBuilderDsl.of()),
            ChannelUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ChannelUpdateActionQueryBuilderDsl> asRemoveRoles(
            Function<com.commercetools.api.predicates.query.channel.ChannelRemoveRolesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelRemoveRolesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.channel.ChannelRemoveRolesActionQueryBuilderDsl.of()),
            ChannelUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ChannelUpdateActionQueryBuilderDsl> asSetAddress(
            Function<com.commercetools.api.predicates.query.channel.ChannelSetAddressActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelSetAddressActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.channel.ChannelSetAddressActionQueryBuilderDsl.of()),
            ChannelUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ChannelUpdateActionQueryBuilderDsl> asSetAddressCustomField(
            Function<com.commercetools.api.predicates.query.channel.ChannelSetAddressCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelSetAddressCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.channel.ChannelSetAddressCustomFieldActionQueryBuilderDsl.of()),
            ChannelUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ChannelUpdateActionQueryBuilderDsl> asSetAddressCustomType(
            Function<com.commercetools.api.predicates.query.channel.ChannelSetAddressCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelSetAddressCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.channel.ChannelSetAddressCustomTypeActionQueryBuilderDsl.of()),
            ChannelUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ChannelUpdateActionQueryBuilderDsl> asSetCustomField(
            Function<com.commercetools.api.predicates.query.channel.ChannelSetCustomFieldActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelSetCustomFieldActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.channel.ChannelSetCustomFieldActionQueryBuilderDsl.of()),
            ChannelUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ChannelUpdateActionQueryBuilderDsl> asSetCustomType(
            Function<com.commercetools.api.predicates.query.channel.ChannelSetCustomTypeActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelSetCustomTypeActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.channel.ChannelSetCustomTypeActionQueryBuilderDsl.of()),
            ChannelUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ChannelUpdateActionQueryBuilderDsl> asSetGeoLocation(
            Function<com.commercetools.api.predicates.query.channel.ChannelSetGeoLocationActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelSetGeoLocationActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.channel.ChannelSetGeoLocationActionQueryBuilderDsl.of()),
            ChannelUpdateActionQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<ChannelUpdateActionQueryBuilderDsl> asSetRoles(
            Function<com.commercetools.api.predicates.query.channel.ChannelSetRolesActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelSetRolesActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.channel.ChannelSetRolesActionQueryBuilderDsl.of()),
            ChannelUpdateActionQueryBuilderDsl::of);
    }
}
