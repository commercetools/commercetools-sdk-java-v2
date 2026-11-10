
package com.commercetools.api.predicates.query.recurring_order;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderQueryBuilderDsl {
    public RecurringOrderQueryBuilderDsl() {
    }

    public static RecurringOrderQueryBuilderDsl of() {
        return new RecurringOrderQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<RecurringOrderQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurringOrderQueryBuilderDsl> key() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("key")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderQueryBuilderDsl> cart(
            Function<com.commercetools.api.predicates.query.cart.CartReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.cart.CartReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("cart"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.cart.CartReferenceQueryBuilderDsl.of())),
            RecurringOrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderQueryBuilderDsl> originOrder(
            Function<com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("originOrder"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderReferenceQueryBuilderDsl.of())),
            RecurringOrderQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderQueryBuilderDsl> startsAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("startsAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderQueryBuilderDsl> resumesAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resumesAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderQueryBuilderDsl> expiresAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("expiresAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderQueryBuilderDsl> lastOrderAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastOrderAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderQueryBuilderDsl> nextOrderAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("nextOrderAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderQueryBuilderDsl> skipConfiguration(
            Function<com.commercetools.api.predicates.query.recurring_order.SkipConfigurationQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.SkipConfigurationQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("skipConfiguration"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.recurring_order.SkipConfigurationQueryBuilderDsl.of())),
            RecurringOrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderQueryBuilderDsl> store(
            Function<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("store"))
                .inner(fn.apply(com.commercetools.api.predicates.query.store.StoreKeyReferenceQueryBuilderDsl.of())),
            RecurringOrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderQueryBuilderDsl> businessUnit(
            Function<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("businessUnit"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.business_unit.BusinessUnitKeyReferenceQueryBuilderDsl.of())),
            RecurringOrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderQueryBuilderDsl> state(
            Function<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("state"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.state.StateReferenceQueryBuilderDsl.of())),
            RecurringOrderQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<RecurringOrderQueryBuilderDsl> recurringOrderState() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("recurringOrderState")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderQueryBuilderDsl> schedule(
            Function<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyScheduleQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyScheduleQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("schedule"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurrence_policy.RecurrencePolicyScheduleQueryBuilderDsl
                            .of())),
            RecurringOrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderQueryBuilderDsl> customer(
            Function<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("customer"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.customer.CustomerReferenceQueryBuilderDsl.of())),
            RecurringOrderQueryBuilderDsl::of);
    }

    public StringComparisonPredicateBuilder<RecurringOrderQueryBuilderDsl> customerEmail() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("customerEmail")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderQueryBuilderDsl> custom(
            Function<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("custom"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.type.CustomFieldsQueryBuilderDsl.of())),
            RecurringOrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            RecurringOrderQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            RecurringOrderQueryBuilderDsl::of);
    }

}
