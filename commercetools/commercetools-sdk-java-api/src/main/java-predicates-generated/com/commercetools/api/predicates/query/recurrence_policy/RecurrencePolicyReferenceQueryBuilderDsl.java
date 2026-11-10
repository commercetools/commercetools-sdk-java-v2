
package com.commercetools.api.predicates.query.recurrence_policy;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurrencePolicyReferenceQueryBuilderDsl {
    public RecurrencePolicyReferenceQueryBuilderDsl() {
    }

    public static RecurrencePolicyReferenceQueryBuilderDsl of() {
        return new RecurrencePolicyReferenceQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurrencePolicyReferenceQueryBuilderDsl> typeId() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("typeId")),
            p -> new CombinationQueryPredicate<>(p, RecurrencePolicyReferenceQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurrencePolicyReferenceQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, RecurrencePolicyReferenceQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurrencePolicyReferenceQueryBuilderDsl> obj(
            Function<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("obj"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyQueryBuilderDsl.of())),
            RecurrencePolicyReferenceQueryBuilderDsl::of);
    }

}
