
package com.commercetools.api.predicates.query.channel;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ChannelPagedQueryResponseQueryBuilderDsl {
    public ChannelPagedQueryResponseQueryBuilderDsl() {
    }

    public static ChannelPagedQueryResponseQueryBuilderDsl of() {
        return new ChannelPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<ChannelPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, ChannelPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ChannelPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, ChannelPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ChannelPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, ChannelPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<ChannelPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, ChannelPagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ChannelPagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.channel.ChannelQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.channel.ChannelQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.channel.ChannelQueryBuilderDsl.of())),
            ChannelPagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ChannelPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, ChannelPagedQueryResponseQueryBuilderDsl::of));
    }

}
