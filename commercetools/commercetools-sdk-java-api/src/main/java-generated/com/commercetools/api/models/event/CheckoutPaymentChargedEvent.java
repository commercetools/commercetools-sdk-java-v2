
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
 *  <p>Generated when a payment is successfully charged in Checkout. This event indicates that the authorized amount has been successfully debited from your customer's account.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CheckoutPaymentChargedEvent checkoutPaymentChargedEvent = CheckoutPaymentChargedEvent.builder()
 *             .id("{id}")
 *             .notificationType("{notificationType}")
 *             .resourceType(EventSubscriptionResourceTypeId.CHECKOUT)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .data(dataBuilder -> dataBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CheckoutPaymentCharged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CheckoutPaymentChargedEventImpl.class)
public interface CheckoutPaymentChargedEvent extends Event {

    /**
     * discriminator value for CheckoutPaymentChargedEvent
     */
    String CHECKOUT_PAYMENT_CHARGED = "CheckoutPaymentCharged";

    /**
     *
     * @return resourceType
     */
    @NotNull
    @JsonProperty("resourceType")
    public EventSubscriptionResourceTypeId getResourceType();

    /**
     *  <p>An object containing details of the successful payment charge.</p>
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
     *  <p>An object containing details of the successful payment charge.</p>
     * @param data value to be set
     */

    public void setData(final CheckoutMessagePaymentsPayloadBaseData data);

    /**
     * factory method
     * @return instance of CheckoutPaymentChargedEvent
     */
    public static CheckoutPaymentChargedEvent of() {
        return new CheckoutPaymentChargedEventImpl();
    }

    /**
     * factory method to create a shallow copy CheckoutPaymentChargedEvent
     * @param template instance to be copied
     * @return copy instance
     */
    public static CheckoutPaymentChargedEvent of(final CheckoutPaymentChargedEvent template) {
        CheckoutPaymentChargedEventImpl instance = new CheckoutPaymentChargedEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(template.getData());
        return instance;
    }

    public CheckoutPaymentChargedEvent copyDeep();

    /**
     * factory method to create a deep copy of CheckoutPaymentChargedEvent
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CheckoutPaymentChargedEvent deepCopy(@Nullable final CheckoutPaymentChargedEvent template) {
        if (template == null) {
            return null;
        }
        CheckoutPaymentChargedEventImpl instance = new CheckoutPaymentChargedEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(
            com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseData.deepCopy(template.getData()));
        return instance;
    }

    /**
     * builder factory method for CheckoutPaymentChargedEvent
     * @return builder
     */
    public static CheckoutPaymentChargedEventBuilder builder() {
        return CheckoutPaymentChargedEventBuilder.of();
    }

    /**
     * create builder for CheckoutPaymentChargedEvent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CheckoutPaymentChargedEventBuilder builder(final CheckoutPaymentChargedEvent template) {
        return CheckoutPaymentChargedEventBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCheckoutPaymentChargedEvent(Function<CheckoutPaymentChargedEvent, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CheckoutPaymentChargedEvent> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CheckoutPaymentChargedEvent>() {
            @Override
            public String toString() {
                return "TypeReference<CheckoutPaymentChargedEvent>";
            }
        };
    }
}
