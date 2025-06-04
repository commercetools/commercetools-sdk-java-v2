
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
 *  <p>Generated when an attempt to authorize a payment fails in Checkout. This failure could result from insufficient funds, incorrect payment details, expired cards, or risk related rejections.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CheckoutPaymentAuthorizationFailedEvent checkoutPaymentAuthorizationFailedEvent = CheckoutPaymentAuthorizationFailedEvent.builder()
 *             .id("{id}")
 *             .notificationType("{notificationType}")
 *             .resourceType(EventSubscriptionResourceTypeId.CHECKOUT)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .data(dataBuilder -> dataBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CheckoutPaymentAuthorizationFailed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CheckoutPaymentAuthorizationFailedEventImpl.class)
public interface CheckoutPaymentAuthorizationFailedEvent extends Event {

    /**
     * discriminator value for CheckoutPaymentAuthorizationFailedEvent
     */
    String CHECKOUT_PAYMENT_AUTHORIZATION_FAILED = "CheckoutPaymentAuthorizationFailed";

    /**
     *
     * @return resourceType
     */
    @NotNull
    @JsonProperty("resourceType")
    public EventSubscriptionResourceTypeId getResourceType();

    /**
     *  <p>An object containing details of the payment authorization that failed.</p>
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
     *  <p>An object containing details of the payment authorization that failed.</p>
     * @param data value to be set
     */

    public void setData(final CheckoutMessagePaymentsPayloadBaseData data);

    /**
     * factory method
     * @return instance of CheckoutPaymentAuthorizationFailedEvent
     */
    public static CheckoutPaymentAuthorizationFailedEvent of() {
        return new CheckoutPaymentAuthorizationFailedEventImpl();
    }

    /**
     * factory method to create a shallow copy CheckoutPaymentAuthorizationFailedEvent
     * @param template instance to be copied
     * @return copy instance
     */
    public static CheckoutPaymentAuthorizationFailedEvent of(final CheckoutPaymentAuthorizationFailedEvent template) {
        CheckoutPaymentAuthorizationFailedEventImpl instance = new CheckoutPaymentAuthorizationFailedEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(template.getData());
        return instance;
    }

    public CheckoutPaymentAuthorizationFailedEvent copyDeep();

    /**
     * factory method to create a deep copy of CheckoutPaymentAuthorizationFailedEvent
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CheckoutPaymentAuthorizationFailedEvent deepCopy(
            @Nullable final CheckoutPaymentAuthorizationFailedEvent template) {
        if (template == null) {
            return null;
        }
        CheckoutPaymentAuthorizationFailedEventImpl instance = new CheckoutPaymentAuthorizationFailedEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(
            com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseData.deepCopy(template.getData()));
        return instance;
    }

    /**
     * builder factory method for CheckoutPaymentAuthorizationFailedEvent
     * @return builder
     */
    public static CheckoutPaymentAuthorizationFailedEventBuilder builder() {
        return CheckoutPaymentAuthorizationFailedEventBuilder.of();
    }

    /**
     * create builder for CheckoutPaymentAuthorizationFailedEvent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CheckoutPaymentAuthorizationFailedEventBuilder builder(
            final CheckoutPaymentAuthorizationFailedEvent template) {
        return CheckoutPaymentAuthorizationFailedEventBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCheckoutPaymentAuthorizationFailedEvent(
            Function<CheckoutPaymentAuthorizationFailedEvent, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CheckoutPaymentAuthorizationFailedEvent> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CheckoutPaymentAuthorizationFailedEvent>() {
            @Override
            public String toString() {
                return "TypeReference<CheckoutPaymentAuthorizationFailedEvent>";
            }
        };
    }
}
