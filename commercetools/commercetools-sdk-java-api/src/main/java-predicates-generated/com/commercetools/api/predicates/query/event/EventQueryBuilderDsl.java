
package com.commercetools.api.predicates.query.event;

import java.util.function.Function;

import com.commercetools.api.predicates.query.*;

public class EventQueryBuilderDsl {
    public EventQueryBuilderDsl() {
    }

    public static EventQueryBuilderDsl of() {
        return new EventQueryBuilderDsl();
    }

    public StringComparisonPredicateBuilder<EventQueryBuilderDsl> id() {
        return new StringComparisonPredicateBuilder<>(BinaryQueryPredicate.of().left(new ConstantQueryPredicate("id")),
            p -> new CombinationQueryPredicate<>(p, EventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<EventQueryBuilderDsl> notificationType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("notificationType")),
            p -> new CombinationQueryPredicate<>(p, EventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<EventQueryBuilderDsl> resourceType() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("resourceType")),
            p -> new CombinationQueryPredicate<>(p, EventQueryBuilderDsl::of));
    }

    public StringComparisonPredicateBuilder<EventQueryBuilderDsl> type() {
        return new StringComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("type")),
            p -> new CombinationQueryPredicate<>(p, EventQueryBuilderDsl::of));
    }

    public DateTimeComparisonPredicateBuilder<EventQueryBuilderDsl> createdAt() {
        return new DateTimeComparisonPredicateBuilder<>(
            BinaryQueryPredicate.of().left(new ConstantQueryPredicate("createdAt")),
            p -> new CombinationQueryPredicate<>(p, EventQueryBuilderDsl::of));
    }

    public CombinationQueryPredicate<EventQueryBuilderDsl> asImportContainerCreated(
            Function<com.commercetools.api.predicates.query.event.ImportContainerCreatedEventQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.event.ImportContainerCreatedEventQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.event.ImportContainerCreatedEventQueryBuilderDsl.of()),
            EventQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<EventQueryBuilderDsl> asImportContainerDeleted(
            Function<com.commercetools.api.predicates.query.event.ImportContainerDeletedEventQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.event.ImportContainerDeletedEventQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.event.ImportContainerDeletedEventQueryBuilderDsl.of()),
            EventQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<EventQueryBuilderDsl> asImportOperationRejected(
            Function<com.commercetools.api.predicates.query.event.ImportOperationRejectedEventQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.event.ImportOperationRejectedEventQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.event.ImportOperationRejectedEventQueryBuilderDsl.of()),
            EventQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<EventQueryBuilderDsl> asImportUnresolved(
            Function<com.commercetools.api.predicates.query.event.ImportUnresolvedEventQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.event.ImportUnresolvedEventQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.event.ImportUnresolvedEventQueryBuilderDsl.of()),
            EventQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<EventQueryBuilderDsl> asImportValidationFailed(
            Function<com.commercetools.api.predicates.query.event.ImportValidationFailedEventQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.event.ImportValidationFailedEventQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.event.ImportValidationFailedEventQueryBuilderDsl.of()),
            EventQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<EventQueryBuilderDsl> asImportWaitForMasterVariant(
            Function<com.commercetools.api.predicates.query.event.ImportWaitForMasterVariantEventQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.event.ImportWaitForMasterVariantEventQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.event.ImportWaitForMasterVariantEventQueryBuilderDsl.of()),
            EventQueryBuilderDsl::of);
    }
}
