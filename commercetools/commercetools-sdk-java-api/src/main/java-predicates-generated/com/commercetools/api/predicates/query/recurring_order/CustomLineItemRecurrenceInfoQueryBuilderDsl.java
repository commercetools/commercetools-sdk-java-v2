
package com.commercetools.api.predicates.query.recurring_order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomLineItemRecurrenceInfoQueryBuilderDsl {
    public CustomLineItemRecurrenceInfoQueryBuilderDsl() {
    }

    public static CustomLineItemRecurrenceInfoQueryBuilderDsl of() {
        return new CustomLineItemRecurrenceInfoQueryBuilderDsl();
    }

    public CombinationQueryPredicate<CustomLineItemRecurrenceInfoQueryBuilderDsl> recurrencePolicy(
            Function<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("recurrencePolicy"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyReferenceQueryBuilderDsl
                            .of())),
            CustomLineItemRecurrenceInfoQueryBuilderDsl::of);
    }

}
