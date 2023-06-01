package com.commercetools.api.predicates.query.channel;

import com.commercetools.api.predicates.query.*;

import java.util.function.Function;


public class ChannelChangeNameActionQueryBuilderDsl  {
    public ChannelChangeNameActionQueryBuilderDsl() {
    }

    public static ChannelChangeNameActionQueryBuilderDsl of() {
        return new ChannelChangeNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ChannelChangeNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
        p -> new CombinationQueryPredicate<>(p, ChannelChangeNameActionQueryBuilderDsl::of));
    }
    public CombinationQueryPredicate<ChannelChangeNameActionQueryBuilderDsl> name(
        Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
            .parent(ConstantQueryPredicate.of().constant("name"))
            .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            ChannelChangeNameActionQueryBuilderDsl::of);
    }
    
    
}
