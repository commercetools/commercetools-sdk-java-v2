
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
 *  <p>Generated when an attempt to charge a payment fails in Checkout. Even if a payment was previously authorized, charging it may still fail.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CheckoutPaymentChargeFailedEvent checkoutPaymentChargeFailedEvent = CheckoutPaymentChargeFailedEvent.builder()
 *             .id("{id}")
 *             .notificationType("{notificationType}")
 *             .resourceType(EventSubscriptionResourceTypeId.CHECKOUT)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .data(dataBuilder -> dataBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CheckoutPaymentChargeFailed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CheckoutPaymentChargeFailedEventImpl.class)
public interface CheckoutPaymentChargeFailedEvent extends Event {

    /**
     * discriminator value for CheckoutPaymentChargeFailedEvent
     */
    String CHECKOUT_PAYMENT_CHARGE_FAILED = "CheckoutPaymentChargeFailed";

    /**
     *
     * @return resourceType
     */
    @NotNull
    @JsonProperty("resourceType")
    public EventSubscriptionResourceTypeId getResourceType();

    /**
     *  <p>An object containing details of the failed payment charge.</p>
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
     *  <p>An object containing details of the failed payment charge.</p>
     * @param data value to be set
     */

    public void setData(final CheckoutMessagePaymentsPayloadBaseData data);

    /**
     * factory method
     * @return instance of CheckoutPaymentChargeFailedEvent
     */
    public static CheckoutPaymentChargeFailedEvent of() {
        return new CheckoutPaymentChargeFailedEventImpl();
    }

    /**
     * factory method to create a shallow copy CheckoutPaymentChargeFailedEvent
     * @param template instance to be copied
     * @return copy instance
     */
    public static CheckoutPaymentChargeFailedEvent of(final CheckoutPaymentChargeFailedEvent template) {
        CheckoutPaymentChargeFailedEventImpl instance = new CheckoutPaymentChargeFailedEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(template.getData());
        return instance;
    }

    public CheckoutPaymentChargeFailedEvent copyDeep();

    /**
     * factory method to create a deep copy of CheckoutPaymentChargeFailedEvent
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CheckoutPaymentChargeFailedEvent deepCopy(@Nullable final CheckoutPaymentChargeFailedEvent template) {
        if (template == null) {
            return null;
        }
        CheckoutPaymentChargeFailedEventImpl instance = new CheckoutPaymentChargeFailedEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(
            com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseData.deepCopy(template.getData()));
        return instance;
    }

    /**
     * builder factory method for CheckoutPaymentChargeFailedEvent
     * @return builder
     */
    public static CheckoutPaymentChargeFailedEventBuilder builder() {
        return CheckoutPaymentChargeFailedEventBuilder.of();
    }

    /**
     * create builder for CheckoutPaymentChargeFailedEvent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CheckoutPaymentChargeFailedEventBuilder builder(final CheckoutPaymentChargeFailedEvent template) {
        return CheckoutPaymentChargeFailedEventBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCheckoutPaymentChargeFailedEvent(Function<CheckoutPaymentChargeFailedEvent, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CheckoutPaymentChargeFailedEvent> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CheckoutPaymentChargeFailedEvent>() {
            @Override
            public String toString() {
                return "TypeReference<CheckoutPaymentChargeFailedEvent>";
            }
        };
    }
}
