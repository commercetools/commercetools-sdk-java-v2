
package com.commercetools.api.predicates.query.recurring_order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderScopeDraftQueryBuilderDsl {
    public RecurringOrderScopeDraftQueryBuilderDsl() {
    }

    public static RecurringOrderScopeDraftQueryBuilderDsl of() {
        return new RecurringOrderScopeDraftQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderScopeDraftQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderScopeDraftQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderScopeDraftQueryBuilderDsl> asAnyOrder(
            Function<com.commercetools.api.predicates.query.recurring_order.AnyOrderDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.AnyOrderDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.recurring_order.AnyOrderDraftQueryBuilderDsl.of()),
            RecurringOrderScopeDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderScopeDraftQueryBuilderDsl> asApplicableRecurrencePolicies(
            Function<com.commercetools.api.predicates.query.recurring_order.ApplicableRecurrencePoliciesDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.ApplicableRecurrencePoliciesDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.recurring_order.ApplicableRecurrencePoliciesDraftQueryBuilderDsl
                    .of()),
            RecurringOrderScopeDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderScopeDraftQueryBuilderDsl> asNonRecurringOrdersOnly(
            Function<com.commercetools.api.predicates.query.recurring_order.NonRecurringOrdersOnlyDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.NonRecurringOrdersOnlyDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.recurring_order.NonRecurringOrdersOnlyDraftQueryBuilderDsl.of()),
            RecurringOrderScopeDraftQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderScopeDraftQueryBuilderDsl> asRecurringOrdersOnly(
            Function<com.commercetools.api.predicates.query.recurring_order.RecurringOrdersOnlyDraftQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.RecurringOrdersOnlyDraftQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(
                com.commercetools.api.predicates.query.recurring_order.RecurringOrdersOnlyDraftQueryBuilderDsl.of()),
            RecurringOrderScopeDraftQueryBuilderDsl::of);
    }
}
