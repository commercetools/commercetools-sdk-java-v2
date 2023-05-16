
package com.commercetools.api.predicates.query.subscription;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class SubscriptionPagedQueryResponseQueryBuilderDsl {
    public SubscriptionPagedQueryResponseQueryBuilderDsl() {
    }

    public static SubscriptionPagedQueryResponseQueryBuilderDsl of() {
        return new SubscriptionPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<SubscriptionPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<SubscriptionPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<SubscriptionPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<SubscriptionPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionPagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<SubscriptionPagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.subscription.SubscriptionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.subscription.SubscriptionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("results"))
                .inner(fn.apply(com.commercetools.api.predicates.query.subscription.SubscriptionQueryBuilderDsl.of())),
            SubscriptionPagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<SubscriptionPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, SubscriptionPagedQueryResponseQueryBuilderDsl::of));
    }

}
