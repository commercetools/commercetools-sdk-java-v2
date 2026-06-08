
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
 *  <p>Generated when a payment is successfully refunded in Checkout. This event confirms that the refund has been processed and sent to your customer.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CheckoutPaymentRefundedEvent checkoutPaymentRefundedEvent = CheckoutPaymentRefundedEvent.builder()
 *             .id("{id}")
 *             .notificationType("{notificationType}")
 *             .resourceType(EventSubscriptionResourceTypeId.CHECKOUT)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .data(dataBuilder -> dataBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CheckoutPaymentRefunded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CheckoutPaymentRefundedEventImpl.class)
public interface CheckoutPaymentRefundedEvent extends Event {

    /**
     * discriminator value for CheckoutPaymentRefundedEvent
     */
    String CHECKOUT_PAYMENT_REFUNDED = "CheckoutPaymentRefunded";

    /**
     *
     * @return resourceType
     */
    @NotNull
    @JsonProperty("resourceType")
    public EventSubscriptionResourceTypeId getResourceType();

    /**
     *  <p>An object containing details of the successful payment refund.</p>
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
     *  <p>An object containing details of the successful payment refund.</p>
     * @param data value to be set
     */

    public void setData(final CheckoutMessagePaymentsPayloadBaseData data);

    /**
     * factory method
     * @return instance of CheckoutPaymentRefundedEvent
     */
    public static CheckoutPaymentRefundedEvent of() {
        return new CheckoutPaymentRefundedEventImpl();
    }

    /**
     * factory method to create a shallow copy CheckoutPaymentRefundedEvent
     * @param template instance to be copied
     * @return copy instance
     */
    public static CheckoutPaymentRefundedEvent of(final CheckoutPaymentRefundedEvent template) {
        CheckoutPaymentRefundedEventImpl instance = new CheckoutPaymentRefundedEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(template.getData());
        return instance;
    }

    public CheckoutPaymentRefundedEvent copyDeep();

    /**
     * factory method to create a deep copy of CheckoutPaymentRefundedEvent
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CheckoutPaymentRefundedEvent deepCopy(@Nullable final CheckoutPaymentRefundedEvent template) {
        if (template == null) {
            return null;
        }
        CheckoutPaymentRefundedEventImpl instance = new CheckoutPaymentRefundedEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(
            com.commercetools.api.models.event.CheckoutMessagePaymentsPayloadBaseData.deepCopy(template.getData()));
        return instance;
    }

    /**
     * builder factory method for CheckoutPaymentRefundedEvent
     * @return builder
     */
    public static CheckoutPaymentRefundedEventBuilder builder() {
        return CheckoutPaymentRefundedEventBuilder.of();
    }

    /**
     * create builder for CheckoutPaymentRefundedEvent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CheckoutPaymentRefundedEventBuilder builder(final CheckoutPaymentRefundedEvent template) {
        return CheckoutPaymentRefundedEventBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCheckoutPaymentRefundedEvent(Function<CheckoutPaymentRefundedEvent, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CheckoutPaymentRefundedEvent> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CheckoutPaymentRefundedEvent>() {
            @Override
            public String toString() {
                return "TypeReference<CheckoutPaymentRefundedEvent>";
            }
        };
    }
}
