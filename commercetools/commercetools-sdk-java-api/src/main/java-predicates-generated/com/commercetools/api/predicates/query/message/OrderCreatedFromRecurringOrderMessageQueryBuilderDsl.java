
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class OrderCreatedFromRecurringOrderMessageQueryBuilderDsl {
    public OrderCreatedFromRecurringOrderMessageQueryBuilderDsl() {
    }

    public static OrderCreatedFromRecurringOrderMessageQueryBuilderDsl of() {
        return new OrderCreatedFromRecurringOrderMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<OrderCreatedFromRecurringOrderMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, OrderCreatedFromRecurringOrderMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<OrderCreatedFromRecurringOrderMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, OrderCreatedFromRecurringOrderMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderCreatedFromRecurringOrderMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, OrderCreatedFromRecurringOrderMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<OrderCreatedFromRecurringOrderMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, OrderCreatedFromRecurringOrderMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderCreatedFromRecurringOrderMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            OrderCreatedFromRecurringOrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderCreatedFromRecurringOrderMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            OrderCreatedFromRecurringOrderMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderCreatedFromRecurringOrderMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, OrderCreatedFromRecurringOrderMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderCreatedFromRecurringOrderMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            OrderCreatedFromRecurringOrderMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<OrderCreatedFromRecurringOrderMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, OrderCreatedFromRecurringOrderMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<OrderCreatedFromRecurringOrderMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, OrderCreatedFromRecurringOrderMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<OrderCreatedFromRecurringOrderMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            OrderCreatedFromRecurringOrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderCreatedFromRecurringOrderMessageQueryBuilderDsl> order(
            Function<com.commercetools.api.predicates.query.order.OrderQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.order.OrderQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("order"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.order.OrderQueryBuilderDsl.of())),
            OrderCreatedFromRecurringOrderMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<OrderCreatedFromRecurringOrderMessageQueryBuilderDsl> recurringOrderRef(
            Function<com.commercetools.api.predicates.query.recurring_order.RecurringOrderReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.RecurringOrderReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(ContainerQueryPredicate.of()
                .parent(ConstantQueryPredicate.of().constant("recurringOrderRef"))
                .inner(fn.apply(
                    com.commercetools.api.predicates.query.recurring_order.RecurringOrderReferenceQueryBuilderDsl
                            .of())),
            OrderCreatedFromRecurringOrderMessageQueryBuilderDsl::of);
    }

}
