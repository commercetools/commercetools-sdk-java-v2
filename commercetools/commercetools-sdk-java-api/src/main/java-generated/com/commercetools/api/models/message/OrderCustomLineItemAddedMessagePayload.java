
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.CustomLineItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Add CustomLineItem update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomLineItemAddedMessagePayload orderCustomLineItemAddedMessagePayload = OrderCustomLineItemAddedMessagePayload.builder()
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCustomLineItemAddedMessagePayloadImpl.class)
public interface OrderCustomLineItemAddedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderCustomLineItemAddedMessagePayload
     */
    String ORDER_CUSTOM_LINE_ITEM_ADDED = "OrderCustomLineItemAdded";

    /**
     *  <p>Custom Line Item that was added to the Order.</p>
     * @return customLineItem
     */
    @NotNull
    @Valid
    @JsonProperty("customLineItem")
    public CustomLineItem getCustomLineItem();

    /**
     *  <p>Custom Line Item that was added to the Order.</p>
     * @param customLineItem value to be set
     */

    public void setCustomLineItem(final CustomLineItem customLineItem);

    /**
     * factory method
     * @return instance of OrderCustomLineItemAddedMessagePayload
     */
    public static OrderCustomLineItemAddedMessagePayload of() {
        return new OrderCustomLineItemAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderCustomLineItemAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCustomLineItemAddedMessagePayload of(final OrderCustomLineItemAddedMessagePayload template) {
        OrderCustomLineItemAddedMessagePayloadImpl instance = new OrderCustomLineItemAddedMessagePayloadImpl();
        instance.setCustomLineItem(template.getCustomLineItem());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderCustomLineItemAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCustomLineItemAddedMessagePayload deepCopy(
            @Nullable final OrderCustomLineItemAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderCustomLineItemAddedMessagePayloadImpl instance = new OrderCustomLineItemAddedMessagePayloadImpl();
        instance.setCustomLineItem(
            com.commercetools.api.models.cart.CustomLineItem.deepCopy(template.getCustomLineItem()));
        return instance;
    }

    /**
     * builder factory method for OrderCustomLineItemAddedMessagePayload
     * @return builder
     */
    public static OrderCustomLineItemAddedMessagePayloadBuilder builder() {
        return OrderCustomLineItemAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderCustomLineItemAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomLineItemAddedMessagePayloadBuilder builder(
            final OrderCustomLineItemAddedMessagePayload template) {
        return OrderCustomLineItemAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCustomLineItemAddedMessagePayload(
            Function<OrderCustomLineItemAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomLineItemAddedMessagePayload>";
            }
        };
    }
}
