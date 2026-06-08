
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
 *  <p>Generated when an order creation attempt fails in Checkout. This event includes information about why the order could not be created.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CheckoutOrderCreationFailedEvent checkoutOrderCreationFailedEvent = CheckoutOrderCreationFailedEvent.builder()
 *             .id("{id}")
 *             .notificationType("{notificationType}")
 *             .resourceType(EventSubscriptionResourceTypeId.CHECKOUT)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .data(dataBuilder -> dataBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CheckoutOrderCreationFailed")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CheckoutOrderCreationFailedEventImpl.class)
public interface CheckoutOrderCreationFailedEvent extends Event {

    /**
     * discriminator value for CheckoutOrderCreationFailedEvent
     */
    String CHECKOUT_ORDER_CREATION_FAILED = "CheckoutOrderCreationFailed";

    /**
     *
     * @return resourceType
     */
    @NotNull
    @JsonProperty("resourceType")
    public EventSubscriptionResourceTypeId getResourceType();

    /**
     *  <p>An object containing details of the order which could not be created.</p>
     * @return data
     */
    @NotNull
    @Valid
    @JsonProperty("data")
    public CheckoutMessageOrderPayloadBaseData getData();

    /**
     * set resourceType
     * @param resourceType value to be set
     */

    public void setResourceType(final EventSubscriptionResourceTypeId resourceType);

    /**
     *  <p>An object containing details of the order which could not be created.</p>
     * @param data value to be set
     */

    public void setData(final CheckoutMessageOrderPayloadBaseData data);

    /**
     * factory method
     * @return instance of CheckoutOrderCreationFailedEvent
     */
    public static CheckoutOrderCreationFailedEvent of() {
        return new CheckoutOrderCreationFailedEventImpl();
    }

    /**
     * factory method to create a shallow copy CheckoutOrderCreationFailedEvent
     * @param template instance to be copied
     * @return copy instance
     */
    public static CheckoutOrderCreationFailedEvent of(final CheckoutOrderCreationFailedEvent template) {
        CheckoutOrderCreationFailedEventImpl instance = new CheckoutOrderCreationFailedEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(template.getData());
        return instance;
    }

    public CheckoutOrderCreationFailedEvent copyDeep();

    /**
     * factory method to create a deep copy of CheckoutOrderCreationFailedEvent
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CheckoutOrderCreationFailedEvent deepCopy(@Nullable final CheckoutOrderCreationFailedEvent template) {
        if (template == null) {
            return null;
        }
        CheckoutOrderCreationFailedEventImpl instance = new CheckoutOrderCreationFailedEventImpl();
        instance.setId(template.getId());
        instance.setNotificationType(template.getNotificationType());
        instance.setResourceType(template.getResourceType());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setData(
            com.commercetools.api.models.event.CheckoutMessageOrderPayloadBaseData.deepCopy(template.getData()));
        return instance;
    }

    /**
     * builder factory method for CheckoutOrderCreationFailedEvent
     * @return builder
     */
    public static CheckoutOrderCreationFailedEventBuilder builder() {
        return CheckoutOrderCreationFailedEventBuilder.of();
    }

    /**
     * create builder for CheckoutOrderCreationFailedEvent instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CheckoutOrderCreationFailedEventBuilder builder(final CheckoutOrderCreationFailedEvent template) {
        return CheckoutOrderCreationFailedEventBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCheckoutOrderCreationFailedEvent(Function<CheckoutOrderCreationFailedEvent, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CheckoutOrderCreationFailedEvent> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CheckoutOrderCreationFailedEvent>() {
            @Override
            public String toString() {
                return "TypeReference<CheckoutOrderCreationFailedEvent>";
            }
        };
    }
}
