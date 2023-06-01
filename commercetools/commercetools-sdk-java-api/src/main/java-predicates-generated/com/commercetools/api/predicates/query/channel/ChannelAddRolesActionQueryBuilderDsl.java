package com.commercetools.api.predicates.query.channel;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ChannelAddRolesActionQueryBuilderDsl  {
    public ChannelAddRolesActionQueryBuilderDsl() {
    }

    public static ChannelAddRolesActionQueryBuilderDsl of() {
        return new ChannelAddRolesActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ChannelAddRolesActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ChannelAddRolesActionQueryBuilderDsl::of));
    }
    public StringCollectionPredicateBuilder<ChannelAddRolesActionQueryBuilderDsl> roles() {
        return new StringCollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("roles")),
        p -> new CombinationQueryPredicate<>(p, ChannelAddRolesActionQueryBuilderDsl::of));
    }
    
}
