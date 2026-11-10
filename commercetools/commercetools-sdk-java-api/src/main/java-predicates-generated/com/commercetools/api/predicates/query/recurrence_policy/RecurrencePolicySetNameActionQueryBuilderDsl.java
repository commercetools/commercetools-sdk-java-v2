
package com.commercetools.api.predicates.query.recurrence_policy;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurrencePolicySetNameActionQueryBuilderDsl {
    public RecurrencePolicySetNameActionQueryBuilderDsl() {
    }

    public static RecurrencePolicySetNameActionQueryBuilderDsl of() {
        return new RecurrencePolicySetNameActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurrencePolicySetNameActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, RecurrencePolicySetNameActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurrencePolicySetNameActionQueryBuilderDsl> name(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("name"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            RecurrencePolicySetNameActionQueryBuilderDsl::of);
    }

}
