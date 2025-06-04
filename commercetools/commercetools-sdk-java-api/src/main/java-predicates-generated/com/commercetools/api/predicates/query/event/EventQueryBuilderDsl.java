
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

    public CombinationQueryPredicate<EventQueryBuilderDsl> asCheckoutOrderCreationFailed(
            Function<com.commercetools.api.predicates.query.event.CheckoutOrderCreationFailedEventQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.event.CheckoutOrderCreationFailedEventQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.event.CheckoutOrderCreationFailedEventQueryBuilderDsl.of()),
            EventQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<EventQueryBuilderDsl> asCheckoutPaymentAuthorizationCancelled(
            Function<com.commercetools.api.predicates.query.event.CheckoutPaymentAuthorizationCancelledEventQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.event.CheckoutPaymentAuthorizationCancelledEventQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.event.CheckoutPaymentAuthorizationCancelledEventQueryBuilderDsl
                    .of()),
            EventQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<EventQueryBuilderDsl> asCheckoutPaymentAuthorizationFailed(
            Function<com.commercetools.api.predicates.query.event.CheckoutPaymentAuthorizationFailedEventQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.event.CheckoutPaymentAuthorizationFailedEventQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.event.CheckoutPaymentAuthorizationFailedEventQueryBuilderDsl.of()),
            EventQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<EventQueryBuilderDsl> asCheckoutPaymentAuthorized(
            Function<com.commercetools.api.predicates.query.event.CheckoutPaymentAuthorizedEventQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.event.CheckoutPaymentAuthorizedEventQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.event.CheckoutPaymentAuthorizedEventQueryBuilderDsl.of()),
            EventQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<EventQueryBuilderDsl> asCheckoutPaymentCancelAuthorizationFailed(
            Function<com.commercetools.api.predicates.query.event.CheckoutPaymentCancelAuthorizationFailedEventQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.event.CheckoutPaymentCancelAuthorizationFailedEventQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(fn.apply(
            com.commercetools.api.predicates.query.event.CheckoutPaymentCancelAuthorizationFailedEventQueryBuilderDsl
                    .of()),
            EventQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<EventQueryBuilderDsl> asCheckoutPaymentChargeFailed(
            Function<com.commercetools.api.predicates.query.event.CheckoutPaymentChargeFailedEventQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.event.CheckoutPaymentChargeFailedEventQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.event.CheckoutPaymentChargeFailedEventQueryBuilderDsl.of()),
            EventQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<EventQueryBuilderDsl> asCheckoutPaymentCharged(
            Function<com.commercetools.api.predicates.query.event.CheckoutPaymentChargedEventQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.event.CheckoutPaymentChargedEventQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.event.CheckoutPaymentChargedEventQueryBuilderDsl.of()),
            EventQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<EventQueryBuilderDsl> asCheckoutPaymentRefundFailed(
            Function<com.commercetools.api.predicates.query.event.CheckoutPaymentRefundFailedEventQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.event.CheckoutPaymentRefundFailedEventQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.event.CheckoutPaymentRefundFailedEventQueryBuilderDsl.of()),
            EventQueryBuilderDsl::of);
    }

    public CombinationQueryPredicate<EventQueryBuilderDsl> asCheckoutPaymentRefunded(
            Function<com.commercetools.api.predicates.query.event.CheckoutPaymentRefundedEventQueryBuilderDsl, CombinationQueryPredicate<com.commercetools.api.predicates.query.event.CheckoutPaymentRefundedEventQueryBuilderDsl>> fn) {
        return new CombinationQueryPredicate<>(
            fn.apply(com.commercetools.api.predicates.query.event.CheckoutPaymentRefundedEventQueryBuilderDsl.of()),
            EventQueryBuilderDsl::of);
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
