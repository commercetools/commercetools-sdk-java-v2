
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderCreatedMessageQueryBuilderDsl {
    public RecurringOrderCreatedMessageQueryBuilderDsl() {
    }

    public static RecurringOrderCreatedMessageQueryBuilderDsl of() {
        return new RecurringOrderCreatedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderCreatedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderCreatedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<RecurringOrderCreatedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderCreatedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderCreatedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderCreatedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderCreatedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderCreatedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            RecurringOrderCreatedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderCreatedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            RecurringOrderCreatedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<RecurringOrderCreatedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderCreatedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            RecurringOrderCreatedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<RecurringOrderCreatedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderCreatedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurringOrderCreatedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderCreatedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderCreatedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            RecurringOrderCreatedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderCreatedMessageQueryBuilderDsl> recurringOrder(
            Function<com.commercetools.api.predicates.query.recurring_order.RecurringOrderQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.recurring_order.RecurringOrderQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("recurringOrder"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.recurring_order.RecurringOrderQueryBuilderDsl.of())),
            RecurringOrderCreatedMessageQueryBuilderDsl::of);
    }

}
