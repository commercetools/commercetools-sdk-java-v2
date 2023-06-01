package com.commercetools.api.predicates.query.channel;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ChannelReferenceQueryBuilderDsl  {
    public ChannelReferenceQueryBuilderDsl() {
    }

    public static ChannelReferenceQueryBuilderDsl of() {
        return new ChannelReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ChannelReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
        p -> new CombinationQueryPredicate<>(p, ChannelReferenceQueryBuilderDsl::of));
    }
    public StringComparisonPredicateBuilder<ChannelReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
        p -> new CombinationQueryPredicate<>(p, ChannelReferenceQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ChannelReferenceQueryBuilderDsl> obj(
        Function<com.commercetools.api.predicates.query.channel.ChannelQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("obj"))
            .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelQueryBuilderDsl.of())),
            ChannelReferenceQueryBuilderDsl::of);
    }
    
    
}
