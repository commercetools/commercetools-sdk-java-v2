
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class MessagePagedQueryResponseQueryBuilderDsl {
    public MessagePagedQueryResponseQueryBuilderDsl() {
    }

    public static MessagePagedQueryResponseQueryBuilderDsl of() {
        return new MessagePagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<MessagePagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, MessagePagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MessagePagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, MessagePagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MessagePagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, MessagePagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<MessagePagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, MessagePagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<MessagePagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.message.MessageQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.MessageQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.message.MessageQueryBuilderDsl.of())),
            MessagePagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<MessagePagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, MessagePagedQueryResponseQueryBuilderDsl::of));
    }

}
