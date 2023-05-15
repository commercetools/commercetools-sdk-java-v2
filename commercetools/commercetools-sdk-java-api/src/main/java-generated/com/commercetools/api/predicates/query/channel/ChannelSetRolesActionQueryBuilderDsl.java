
package com.commercetools.api.predicates.query.channel;

import com.commercetools.api.predicates.query.*;

public class ChannelSetRolesActionQueryBuilderDsl {
    public ChannelSetRolesActionQueryBuilderDsl() {
    }

    public static ChannelSetRolesActionQueryBuilderDsl of() {
        return new ChannelSetRolesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ChannelSetRolesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, ChannelSetRolesActionQueryBuilderDsl::of));
    }

    public StringCollectionPredicateBuilder<ChannelSetRolesActionQueryBuilderDsl> roles() {
        return new StringCollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("roles")),
            p -> new CombinationQueryPredicate<>(p, ChannelSetRolesActionQueryBuilderDsl::of));
    }
}
