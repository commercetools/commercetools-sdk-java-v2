
package com.commercetools.api.predicates.query.recurring_order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderScopeQueryBuilderDsl {
    public RecurringOrderScopeQueryBuilderDsl() {
    }

    public static RecurringOrderScopeQueryBuilderDsl of() {
        return new RecurringOrderScopeQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderScopeQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderScopeQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderScopeQueryBuilderDsl> asAnyOrder(
            Function<com.commercetools.api.predicates.query.recurring_order.AnyOrderQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.AnyOrderQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.recurring_order.AnyOrderQueryBuilderDsl.of()),
            RecurringOrderScopeQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderScopeQueryBuilderDsl> asApplicableRecurrencePolicies(
            Function<com.commercetools.api.predicates.query.recurring_order.ApplicableRecurrencePoliciesQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.ApplicableRecurrencePoliciesQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.recurring_order.ApplicableRecurrencePoliciesQueryBuilderDsl.of()),
            RecurringOrderScopeQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderScopeQueryBuilderDsl> asNonRecurringOrdersOnly(
            Function<com.commercetools.api.predicates.query.recurring_order.NonRecurringOrdersOnlyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.NonRecurringOrdersOnlyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.recurring_order.NonRecurringOrdersOnlyQueryBuilderDsl.of()),
            RecurringOrderScopeQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderScopeQueryBuilderDsl> asRecurringOrdersOnly(
            Function<com.commercetools.api.predicates.query.recurring_order.RecurringOrdersOnlyQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.RecurringOrdersOnlyQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.recurring_order.RecurringOrdersOnlyQueryBuilderDsl.of()),
            RecurringOrderScopeQueryBuilderDsl::of);
    }
}
