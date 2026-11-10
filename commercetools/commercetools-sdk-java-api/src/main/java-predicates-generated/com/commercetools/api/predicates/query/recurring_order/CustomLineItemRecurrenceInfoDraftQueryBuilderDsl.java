
package com.commercetools.api.predicates.query.recurring_order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class CustomLineItemRecurrenceInfoDraftQueryBuilderDsl {
    public CustomLineItemRecurrenceInfoDraftQueryBuilderDsl() {
    }

    public static CustomLineItemRecurrenceInfoDraftQueryBuilderDsl of() {
        return new CustomLineItemRecurrenceInfoDraftQueryBuilderDsl();
    }

    public CombinationQueryPredicate<CustomLineItemRecurrenceInfoDraftQueryBuilderDsl> recurrencePolicy(
            Function<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyResourceIdentifierQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyResourceIdentifierQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("recurrencePolicy"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyResourceIdentifierQueryBuilderDsl
                            .of())),
            CustomLineItemRecurrenceInfoDraftQueryBuilderDsl::of);
    }

}
