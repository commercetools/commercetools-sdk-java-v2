
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
 *  <p>Generated when an attempt to cancel a payment authorization fails in Checkout. This could happen if the authorization has already been expired, been captured already or no longer valid.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CheckoutPaymentCancelAuthorizationFailedEvent checkoutPaymentCancelAuthorizationFailedEvent = CheckoutPaymentCancelAuthorizationFailedEvent.builder()
 *             .id("{id}")
 *             .notificationType("{notificationType}")
 *             .resourceType(EventSubscriptionResourceTypeId.CHECKOUT)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .data(dataBuilder -> dataBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CheckoutPaymentCancelAuthorizationFailed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CheckoutPaymentCancelAuthorizationFailedEventImpl.class)
public interface CheckoutPaymentCancelAuthorizationFailedEvent extends Event {

    /**
     * discriminator value for CheckoutPaymentCancelAuthorizationFailedEvent
     */
    String CHECKOUT_PAYMENT_CANCEL_AUTHORIZATION_FAILED = "CheckoutPaymentCancelAuthorizationFailed";

    /**
     *
     * @return resourceType
     */
    @NotNull
    @JsonProperty("resourceType")
    public EventSubscriptionResourceTypeId getResourceType();

    /**
     *  <p>An object containing details of the payment authorization that could not be cancelled.</p>
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
     *  <p>An object containing details of the payment authorization that could not be cancelled.</p>
     * @param data value to be set
     */

    public void setData(final CheckoutMessagePaymentsPayloadBaseData data);

    /**
     * factory method
     * @return instance of CheckoutPaymentCancelAuthorizationFailedEvent
     */
    public static CheckoutPaymentCancelAuthorizationFailedEvent of() {
        return new CheckoutPaymentCancelAuthorizationFailedEventImpl();
    }

    /**
     * factory method to create a shallow copy CheckoutPaymentCancelAuthorizationFailedEvent
     * @param template instance to be copied
     * @return copy instance
     */
    public static CheckoutPaymentCancelAuthorizationFailedEvent of(
            final CheckoutPaymentCancelAuthorizationFailedEvent template) {
        CheckoutPaymentCancelAuthorizationFailedEventImpl instance = new CheckoutPaymentCancelAuthorizationFailedEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(template.getData());
        return instance;
    }

    public CheckoutPaymentCancelAuthorizationFailedEvent copyDeep();

    /**
     * factory method to create a deep copy of CheckoutPaymentCancelAuthorizationFailedEvent
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CheckoutPaymentCancelAuthorizationFailedEvent deepCopy(
            @Nullable final CheckoutPaymentCancelAuthorizationFailedEvent template) {
        if (template == null) {
            return null;
        }
        CheckoutPaymentCancelAuthorizationFailedEventImpl instance = new CheckoutPaymentCancelAuthorizationFailedEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(
            com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseData.deepCopy(template.getData()));
        return instance;
    }

    /**
     * builder factory method for CheckoutPaymentCancelAuthorizationFailedEvent
     * @return builder
     */
    public static CheckoutPaymentCancelAuthorizationFailedEventBuilder builder() {
        return CheckoutPaymentCancelAuthorizationFailedEventBuilder.of();
    }

    /**
     * create builder for CheckoutPaymentCancelAuthorizationFailedEvent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CheckoutPaymentCancelAuthorizationFailedEventBuilder builder(
            final CheckoutPaymentCancelAuthorizationFailedEvent template) {
        return CheckoutPaymentCancelAuthorizationFailedEventBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCheckoutPaymentCancelAuthorizationFailedEvent(
            Function<CheckoutPaymentCancelAuthorizationFailedEvent, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CheckoutPaymentCancelAuthorizationFailedEvent> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CheckoutPaymentCancelAuthorizationFailedEvent>() {
            @Override
            public String toString() {
                return "TypeReference<CheckoutPaymentCancelAuthorizationFailedEvent>";
            }
        };
    }
}
