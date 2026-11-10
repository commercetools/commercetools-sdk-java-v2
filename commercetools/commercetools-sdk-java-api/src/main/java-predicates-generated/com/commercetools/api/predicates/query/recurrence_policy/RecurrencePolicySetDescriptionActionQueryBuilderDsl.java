
package com.commercetools.api.predicates.query.recurrence_policy;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurrencePolicySetDescriptionActionQueryBuilderDsl {
    public RecurrencePolicySetDescriptionActionQueryBuilderDsl() {
    }

    public static RecurrencePolicySetDescriptionActionQueryBuilderDsl of() {
        return new RecurrencePolicySetDescriptionActionQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurrencePolicySetDescriptionActionQueryBuilderDsl> action() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("action")),
            p -> new CombinationQueryPredicate<>(p, RecurrencePolicySetDescriptionActionQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurrencePolicySetDescriptionActionQueryBuilderDsl> description(
            Function<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("description"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LocalizedStringQueryBuilderDsl.of())),
            RecurrencePolicySetDescriptionActionQueryBuilderDsl::of);
    }

}
