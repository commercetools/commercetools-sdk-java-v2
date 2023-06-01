package com.commercetools.api.predicates.query.channel;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ChannelRemoveRolesActionQueryBuilderDsl  {
    public ChannelRemoveRolesActionQueryBuilderDsl() {
    }

    public static ChannelRemoveRolesActionQueryBuilderDsl of() {
        return new ChannelRemoveRolesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ChannelRemoveRolesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ChannelRemoveRolesActionQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<ChannelRemoveRolesActionQueryBuilderDsl> roles() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("roles")),
        p -> new CombinationQueryPredicate<>(p, ChannelRemoveRolesActionQueryBuilderDsl::of));
    }
    
}
