
package com.commercetools.api.predicates.query.recurrence_policy;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurrencePolicyUpdateQueryBuilderDsl {
    public RecurrencePolicyUpdateQueryBuilderDsl() {
    }

    public static RecurrencePolicyUpdateQueryBuilderDsl of() {
        return new RecurrencePolicyUpdateQueryBuilderDsl();
    }

    public LongComparisonPredicateBuilder<RecurrencePolicyUpdateQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, RecurrencePolicyUpdateQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurrencePolicyUpdateQueryBuilderDsl> actions(
            Function<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyUpdateActionQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyUpdateActionQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("actions"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyUpdateActionQueryBuilderDsl
                            .of())),
            RecurrencePolicyUpdateQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<RecurrencePolicyUpdateQueryBuilderDsl> actions() {
        return new CollectionPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("actions")),
            p -> new CombinationQueryPredicate<>(p, RecurrencePolicyUpdateQueryBuilderDsl::of));
    }

}
