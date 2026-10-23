
package com.commercetools.api.predicates.query.message;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class RecurringOrderNowRequestedMessageQueryBuilderDsl {
    public RecurringOrderNowRequestedMessageQueryBuilderDsl() {
    }

    public static RecurringOrderNowRequestedMessageQueryBuilderDsl of() {
        return new RecurringOrderNowRequestedMessageQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<RecurringOrderNowRequestedMessageQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderNowRequestedMessageQueryBuilderDsl::of));
    }

    public LongComparisonPredicateBuilder<RecurringOrderNowRequestedMessageQueryBuilderDsl> version() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("version")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderNowRequestedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderNowRequestedMessageQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderNowRequestedMessageQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderNowRequestedMessageQueryBuilderDsl> lastModifiedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("lastModifiedAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderNowRequestedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderNowRequestedMessageQueryBuilderDsl> lastModifiedBy(
            Function<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("lastModifiedBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.LastModifiedByQueryBuilderDsl.of())),
            RecurringOrderNowRequestedMessageQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<RecurringOrderNowRequestedMessageQueryBuilderDsl> createdBy(
            Function<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("createdBy"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.CreatedByQueryBuilderDsl.of())),
            RecurringOrderNowRequestedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<RecurringOrderNowRequestedMessageQueryBuilderDsl> sequenceNumber() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("sequenceNumber")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderNowRequestedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderNowRequestedMessageQueryBuilderDsl> resource(
            Function<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resource"))
                    .inner(fn.apply(com.commercetools.api.predicates.query.common.ReferenceQueryBuilderDsl.of())),
            RecurringOrderNowRequestedMessageQueryBuilderDsl::of);
    }

    public LongComparisonPredicateBuilder<RecurringOrderNowRequestedMessageQueryBuilderDsl> resourceVersion() {
        return new LongComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceVersion")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderNowRequestedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurringOrderNowRequestedMessageQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderNowRequestedMessageQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<RecurringOrderNowRequestedMessageQueryBuilderDsl> resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            ContainerQueryPredicate.of()
                    .parent(ConstantQueryPredicate.of().constant("resourceUserProvidedIdentifiers"))
                    .inner(fn.apply(
                        com.commercetools.api.predicates.query.message.UserProvidedIdentifiersQueryBuilderDsl.of())),
            RecurringOrderNowRequestedMessageQueryBuilderDsl::of);
    }

    public DateTimeComparisonPredicateBuilder<RecurringOrderNowRequestedMessageQueryBuilderDsl> requestedAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("requestedAt")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderNowRequestedMessageQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<RecurringOrderNowRequestedMessageQueryBuilderDsl> reason() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("reason")),
            p -> new CombinationQueryPredicate<>(p, RecurringOrderNowRequestedMessageQueryBuilderDsl::of));
    }

}
