
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
 *  <p>Generated when a payment is successfully authorized in Checkout. This event indicates the payment has been validated and the amount has been reserved but not yet charged.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CheckoutPaymentAuthorizedEvent checkoutPaymentAuthorizedEvent = CheckoutPaymentAuthorizedEvent.builder()
 *             .id("{id}")
 *             .notificationType("{notificationType}")
 *             .resourceType(EventSubscriptionResourceTypeId.CHECKOUT)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .data(dataBuilder -> dataBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CheckoutPaymentAuthorized")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CheckoutPaymentAuthorizedEventImpl.class)
public interface CheckoutPaymentAuthorizedEvent extends Event {

    /**
     * discriminator value for CheckoutPaymentAuthorizedEvent
     */
    String CHECKOUT_PAYMENT_AUTHORIZED = "CheckoutPaymentAuthorized";

    /**
     *
     * @return resourceType
     */
    @NotNull
    @JsonProperty("resourceType")
    public EventSubscriptionResourceTypeId getResourceType();

    /**
     *  <p>An object containing details of the successful payment authorization.</p>
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
     *  <p>An object containing details of the successful payment authorization.</p>
     * @param data value to be set
     */

    public void setData(final CheckoutMessagePaymentsPayloadBaseData data);

    /**
     * factory method
     * @return instance of CheckoutPaymentAuthorizedEvent
     */
    public static CheckoutPaymentAuthorizedEvent of() {
        return new CheckoutPaymentAuthorizedEventImpl();
    }

    /**
     * factory method to create a shallow copy CheckoutPaymentAuthorizedEvent
     * @param template instance to be copied
     * @return copy instance
     */
    public static CheckoutPaymentAuthorizedEvent of(final CheckoutPaymentAuthorizedEvent template) {
        CheckoutPaymentAuthorizedEventImpl instance = new CheckoutPaymentAuthorizedEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(template.getData());
        return instance;
    }

    public CheckoutPaymentAuthorizedEvent copyDeep();

    /**
     * factory method to create a deep copy of CheckoutPaymentAuthorizedEvent
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CheckoutPaymentAuthorizedEvent deepCopy(@Nullable final CheckoutPaymentAuthorizedEvent template) {
        if (template == null) {
            return null;
        }
        CheckoutPaymentAuthorizedEventImpl instance = new CheckoutPaymentAuthorizedEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(
            com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseData.deepCopy(template.getData()));
        return instance;
    }

    /**
     * builder factory method for CheckoutPaymentAuthorizedEvent
     * @return builder
     */
    public static CheckoutPaymentAuthorizedEventBuilder builder() {
        return CheckoutPaymentAuthorizedEventBuilder.of();
    }

    /**
     * create builder for CheckoutPaymentAuthorizedEvent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CheckoutPaymentAuthorizedEventBuilder builder(final CheckoutPaymentAuthorizedEvent template) {
        return CheckoutPaymentAuthorizedEventBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCheckoutPaymentAuthorizedEvent(Function<CheckoutPaymentAuthorizedEvent, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CheckoutPaymentAuthorizedEvent> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CheckoutPaymentAuthorizedEvent>() {
            @Override
            public String toString() {
                return "TypeReference<CheckoutPaymentAuthorizedEvent>";
            }
        };
    }
}
