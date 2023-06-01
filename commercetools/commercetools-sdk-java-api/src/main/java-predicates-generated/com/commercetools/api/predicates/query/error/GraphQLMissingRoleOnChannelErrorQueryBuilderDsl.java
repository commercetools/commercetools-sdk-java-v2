package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class GraphQLMissingRoleOnChannelErrorQueryBuilderDsl  {
    public GraphQLMissingRoleOnChannelErrorQueryBuilderDsl() {
    }

    public static GraphQLMissingRoleOnChannelErrorQueryBuilderDsl of() {
        return new GraphQLMissingRoleOnChannelErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<GraphQLMissingRoleOnChannelErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, GraphQLMissingRoleOnChannelErrorQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<GraphQLMissingRoleOnChannelErrorQueryBuilderDsl> channel(
        Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("channel"))
            .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            GraphQLMissingRoleOnChannelErrorQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<GraphQLMissingRoleOnChannelErrorQueryBuilderDsl> missingRole() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("missingRole")),
        p -> new CombinationQueryPredicate<>(p, GraphQLMissingRoleOnChannelErrorQueryBuilderDsl::of));
    }
    
}
