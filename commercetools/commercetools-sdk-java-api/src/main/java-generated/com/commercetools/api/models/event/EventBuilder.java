
package com.commercetools.api.models.event;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * EventBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class EventBuilder {

    public com.commercetools.api.models.event.CheckoutOrderCreationFailedEventBuilder checkoutOrderCreationFailedBuilder() {
        return com.commercetools.api.models.event.CheckoutOrderCreationFailedEventBuilder.of();
    }

    public com.commercetools.api.models.event.CheckoutPaymentAuthorizationCancelledEventBuilder checkoutPaymentAuthorizationCancelledBuilder() {
        return com.commercetools.api.models.event.CheckoutPaymentAuthorizationCancelledEventBuilder.of();
    }

    public com.commercetools.api.models.event.CheckoutPaymentAuthorizationFailedEventBuilder checkoutPaymentAuthorizationFailedBuilder() {
        return com.commercetools.api.models.event.CheckoutPaymentAuthorizationFailedEventBuilder.of();
    }

    public com.commercetools.api.models.event.CheckoutPaymentAuthorizedEventBuilder checkoutPaymentAuthorizedBuilder() {
        return com.commercetools.api.models.event.CheckoutPaymentAuthorizedEventBuilder.of();
    }

    public com.commercetools.api.models.event.CheckoutPaymentCancelAuthorizationFailedEventBuilder checkoutPaymentCancelAuthorizationFailedBuilder() {
        return com.commercetools.api.models.event.CheckoutPaymentCancelAuthorizationFailedEventBuilder.of();
    }

    public com.commercetools.api.models.event.CheckoutPaymentChargeFailedEventBuilder checkoutPaymentChargeFailedBuilder() {
        return com.commercetools.api.models.event.CheckoutPaymentChargeFailedEventBuilder.of();
    }

    public com.commercetools.api.models.event.CheckoutPaymentChargedEventBuilder checkoutPaymentChargedBuilder() {
        return com.commercetools.api.models.event.CheckoutPaymentChargedEventBuilder.of();
    }

    public com.commercetools.api.models.event.CheckoutPaymentRefundFailedEventBuilder checkoutPaymentRefundFailedBuilder() {
        return com.commercetools.api.models.event.CheckoutPaymentRefundFailedEventBuilder.of();
    }

    public com.commercetools.api.models.event.CheckoutPaymentRefundedEventBuilder checkoutPaymentRefundedBuilder() {
        return com.commercetools.api.models.event.CheckoutPaymentRefundedEventBuilder.of();
    }

    public com.commercetools.api.models.event.ImportContainerCreatedEventBuilder importContainerCreatedBuilder() {
        return com.commercetools.api.models.event.ImportContainerCreatedEventBuilder.of();
    }

    public com.commercetools.api.models.event.ImportContainerDeletedEventBuilder importContainerDeletedBuilder() {
        return com.commercetools.api.models.event.ImportContainerDeletedEventBuilder.of();
    }

    public com.commercetools.api.models.event.ImportOperationRejectedEventBuilder importOperationRejectedBuilder() {
        return com.commercetools.api.models.event.ImportOperationRejectedEventBuilder.of();
    }

    public com.commercetools.api.models.event.ImportUnresolvedEventBuilder importUnresolvedBuilder() {
        return com.commercetools.api.models.event.ImportUnresolvedEventBuilder.of();
    }

    public com.commercetools.api.models.event.ImportValidationFailedEventBuilder importValidationFailedBuilder() {
        return com.commercetools.api.models.event.ImportValidationFailedEventBuilder.of();
    }

    public com.commercetools.api.models.event.ImportWaitForMasterVariantEventBuilder importWaitForMasterVariantBuilder() {
        return com.commercetools.api.models.event.ImportWaitForMasterVariantEventBuilder.of();
    }

    /**
     * factory method for an instance of EventBuilder
     * @return builder
     */
    public static EventBuilder of() {
        return new EventBuilder();
    }

}
