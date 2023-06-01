package com.commercetools.api.predicates.query.error;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class MissingRoleOnChannelErrorQueryBuilderDsl  {
    public MissingRoleOnChannelErrorQueryBuilderDsl() {
    }

    public static MissingRoleOnChannelErrorQueryBuilderDsl of() {
        return new MissingRoleOnChannelErrorQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<MissingRoleOnChannelErrorQueryBuilderDsl> code() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("code")),
        p -> new CombinationQueryPredicate<>(p, MissingRoleOnChannelErrorQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<MissingRoleOnChannelErrorQueryBuilderDsl> message() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("message")),
        p -> new CombinationQueryPredicate<>(p, MissingRoleOnChannelErrorQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<MissingRoleOnChannelErrorQueryBuilderDsl> channel(
        Function<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("channel"))
            .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelResourceIdentifierQueryBuilderDsl.of())),
            MissingRoleOnChannelErrorQueryBuilderDsl::of);
    }
    
    public StringComparisonPredicateBuilder<MissingRoleOnChannelErrorQueryBuilderDsl> missingRole() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("missingRole")),
        p -> new CombinationQueryPredicate<>(p, MissingRoleOnChannelErrorQueryBuilderDsl::of));
    }
    
}
