package com.commercetools.api.predicates.query.channel;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ChannelUpdateQueryBuilderDsl  {
    public ChannelUpdateQueryBuilderDsl() {
    }

    public static ChannelUpdateQueryBuilderDsl of() {
        return new ChannelUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ChannelUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
        p -> new CombinationQueryPredicate<>(p, ChannelUpdateQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ChannelUpdateQueryBuilderDsl> actions(
        Function<com.commercetools.api.predicates.query.channel.ChannelUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("actions"))
            .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelUpdateActionQueryBuilderDsl.of())),
            ChannelUpdateQueryBuilderDsl::of);
    }
    public CollectionPredicateBuilder<ChannelUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
                p -> new CombinationQueryPredicate<>(p, ChannelUpdateQueryBuilderDsl::of));
    }
    
}
