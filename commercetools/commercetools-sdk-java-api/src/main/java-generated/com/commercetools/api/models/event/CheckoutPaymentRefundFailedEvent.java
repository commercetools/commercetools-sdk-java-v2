
package com.commercetools.api.models.event;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated when an attempt to refund a payment refund fails in Checkout. This failure indicates that the planned refund amount was not successfully sent to your customer’s account.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CheckoutPaymentRefundFailedEvent checkoutPaymentRefundFailedEvent = CheckoutPaymentRefundFailedEvent.builder()
 *             .id("{id}")
 *             .notificationType("{notificationType}")
 *             .resourceType(EventSubscriptionResourceTypeId.CHECKOUT)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .data(dataBuilder -> dataBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CheckoutPaymentRefundFailed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CheckoutPaymentRefundFailedEventImpl.class)
public interface CheckoutPaymentRefundFailedEvent extends Event {

    /**
     * discriminator value for CheckoutPaymentRefundFailedEvent
     */
    String CHECKOUT_PAYMENT_REFUND_FAILED = "CheckoutPaymentRefundFailed";

    /**
     *
     * @return resourceType
     */
    @NotNull
    @JsonProperty("resourceType")
    public EventSubscriptionResourceTypeId getResourceType();

    /**
     *  <p>An object containing details of the failed payment refund attempt.</p>
     * @return data
     */
    @NotNull
    @Valid
    @JsonProperty("data")
    public CheckoutMessagePaymentsPayloadBaseData getData();

    /**
     * set resourceType
     * @param resourceType value to be set
     */

    public void setResourceType(final EventSubscriptionResourceTypeId resourceType);

    /**
     *  <p>An object containing details of the failed payment refund attempt.</p>
     * @param data value to be set
     */

    public void setData(final CheckoutMessagePaymentsPayloadBaseData data);

    /**
     * factory method
     * @return instance of CheckoutPaymentRefundFailedEvent
     */
    public static CheckoutPaymentRefundFailedEvent of() {
        return new CheckoutPaymentRefundFailedEventImpl();
    }

    /**
     * factory method to create a shallow copy CheckoutPaymentRefundFailedEvent
     * @param template instance to be copied
     * @return copy instance
     */
    public static CheckoutPaymentRefundFailedEvent of(final CheckoutPaymentRefundFailedEvent template) {
        CheckoutPaymentRefundFailedEventImpl instance = new CheckoutPaymentRefundFailedEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(template.getData());
        return instance;
    }

    public CheckoutPaymentRefundFailedEvent copyDeep();

    /**
     * factory method to create a deep copy of CheckoutPaymentRefundFailedEvent
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CheckoutPaymentRefundFailedEvent deepCopy(@Nullable final CheckoutPaymentRefundFailedEvent template) {
        if (template == null) {
            return null;
        }
        CheckoutPaymentRefundFailedEventImpl instance = new CheckoutPaymentRefundFailedEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(
            com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseData.deepCopy(template.getData()));
        return instance;
    }

    /**
     * builder factory method for CheckoutPaymentRefundFailedEvent
     * @return builder
     */
    public static CheckoutPaymentRefundFailedEventBuilder builder() {
        return CheckoutPaymentRefundFailedEventBuilder.of();
    }

    /**
     * create builder for CheckoutPaymentRefundFailedEvent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CheckoutPaymentRefundFailedEventBuilder builder(final CheckoutPaymentRefundFailedEvent template) {
        return CheckoutPaymentRefundFailedEventBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCheckoutPaymentRefundFailedEvent(Function<CheckoutPaymentRefundFailedEvent, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CheckoutPaymentRefundFailedEvent> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CheckoutPaymentRefundFailedEvent>() {
            @Override
            public String toString() {
                return "TypeReference<CheckoutPaymentRefundFailedEvent>";
            }
        };
    }
}
