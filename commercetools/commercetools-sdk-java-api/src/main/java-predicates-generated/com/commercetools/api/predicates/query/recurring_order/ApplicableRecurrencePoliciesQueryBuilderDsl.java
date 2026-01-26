
package com.commercetools.api.predicates.query.recurring_order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApplicableRecurrencePoliciesQueryBuilderDsl {
    public ApplicableRecurrencePoliciesQueryBuilderDsl() {
    }

    public static ApplicableRecurrencePoliciesQueryBuilderDsl of() {
        return new ApplicableRecurrencePoliciesQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApplicableRecurrencePoliciesQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ApplicableRecurrencePoliciesQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApplicableRecurrencePoliciesQueryBuilderDsl> recurrencePolicies(
            Function<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("recurrencePolicies"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyReferenceQueryBuilderDsl
                            .of())),
            ApplicableRecurrencePoliciesQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ApplicableRecurrencePoliciesQueryBuilderDsl> recurrencePolicies() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("recurrencePolicies")),
            p -> new CombinationQueryPredicate<>(p, ApplicableRecurrencePoliciesQueryBuilderDsl::of));
    }

}
