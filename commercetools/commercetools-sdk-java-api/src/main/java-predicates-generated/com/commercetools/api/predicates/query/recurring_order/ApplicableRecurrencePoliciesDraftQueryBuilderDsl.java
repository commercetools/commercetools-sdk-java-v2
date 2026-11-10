
package com.commercetools.api.predicates.query.recurring_order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class ApplicableRecurrencePoliciesDraftQueryBuilderDsl {
    public ApplicableRecurrencePoliciesDraftQueryBuilderDsl() {
    }

    public static ApplicableRecurrencePoliciesDraftQueryBuilderDsl of() {
        return new ApplicableRecurrencePoliciesDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<ApplicableRecurrencePoliciesDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, ApplicableRecurrencePoliciesDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<ApplicableRecurrencePoliciesDraftQueryBuilderDsl> recurrencePolicies(
            Function<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("recurrencePolicies"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyResourceIdentifierQueryBuilderDsl
                            .of())),
            ApplicableRecurrencePoliciesDraftQueryBuilderDsl::of);
    }

    public CollectionPredicateBuilder<ApplicableRecurrencePoliciesDraftQueryBuilderDsl> recurrencePolicies() {
        return new CollectionPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("recurrencePolicies")),
            p -> new CombinationQueryPredicate<>(p, ApplicableRecurrencePoliciesDraftQueryBuilderDsl::of));
    }

}
