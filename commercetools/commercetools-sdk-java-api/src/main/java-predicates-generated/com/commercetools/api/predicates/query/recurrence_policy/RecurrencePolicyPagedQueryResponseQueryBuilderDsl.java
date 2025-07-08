
package com.commercetools.api.predicates.query.recurrence_policy;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurrencePolicyPagedQueryResponseQueryBuilderDsl {
    public RecurrencePolicyPagedQueryResponseQueryBuilderDsl() {
    }

    public static RecurrencePolicyPagedQueryResponseQueryBuilderDsl of() {
        return new RecurrencePolicyPagedQueryResponseQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<RecurrencePolicyPagedQueryResponseQueryBuilderDsl> limit() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("limit")),
            p -> new CombinationQueryPredicate<>(p, RecurrencePolicyPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<RecurrencePolicyPagedQueryResponseQueryBuilderDsl> offset() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("offset")),
            p -> new CombinationQueryPredicate<>(p, RecurrencePolicyPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<RecurrencePolicyPagedQueryResponseQueryBuilderDsl> count() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("count")),
            p -> new CombinationQueryPredicate<>(p, RecurrencePolicyPagedQueryResponseQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<RecurrencePolicyPagedQueryResponseQueryBuilderDsl> total() {
        return new LongComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("total")),
            p -> new CombinationQueryPredicate<>(p, RecurrencePolicyPagedQueryResponseQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurrencePolicyPagedQueryResponseQueryBuilderDsl> results(
            Function<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("results"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyQueryBuilderDsl.of())),
            RecurrencePolicyPagedQueryResponseQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<RecurrencePolicyPagedQueryResponseQueryBuilderDsl> results() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("results")),
            p -> new CombinationQueryPredicate<>(p, RecurrencePolicyPagedQueryResponseQueryBuilderDsl::of));
    }

}
