
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Change CustomLineItem Quantity update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomLineItemQuantityChangedMessagePayload orderCustomLineItemQuantityChangedMessagePayload = OrderCustomLineItemQuantityChangedMessagePayload.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .quantity(0.3)
 *             .oldQuantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("OrderCustomLineItemQuantityChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCustomLineItemQuantityChangedMessagePayloadImpl.class)
public interface OrderCustomLineItemQuantityChangedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderCustomLineItemQuantityChangedMessagePayload
     */
    String ORDER_CUSTOM_LINE_ITEM_QUANTITY_CHANGED = "OrderCustomLineItemQuantityChanged";

    /**
     *  <p>Unique identifier of the Custom Line Item.</p>
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p>User-defined unique identifier of the Custom Line Item.</p>
     * @return customLineItemKey
     */

    @JsonProperty("customLineItemKey")
    public String getCustomLineItemKey();

    /**
     *  <p>Custom Line Item quantity after the Change Custom Line Item Quantity update action.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>Custom Line Item quantity before the Change Custom Line Item Quantity update action.</p>
     * @return oldQuantity
     */
    @NotNull
    @JsonProperty("oldQuantity")
    public Long getOldQuantity();

    /**
     *  <p>Unique identifier of the Custom Line Item.</p>
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     *  <p>User-defined unique identifier of the Custom Line Item.</p>
     * @param customLineItemKey value to be set
     */

    public void setCustomLineItemKey(final String customLineItemKey);

    /**
     *  <p>Custom Line Item quantity after the Change Custom Line Item Quantity update action.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     *  <p>Custom Line Item quantity before the Change Custom Line Item Quantity update action.</p>
     * @param oldQuantity value to be set
     */

    public void setOldQuantity(final Long oldQuantity);

    /**
     * factory method
     * @return instance of OrderCustomLineItemQuantityChangedMessagePayload
     */
    public static OrderCustomLineItemQuantityChangedMessagePayload of() {
        return new OrderCustomLineItemQuantityChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderCustomLineItemQuantityChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCustomLineItemQuantityChangedMessagePayload of(
            final OrderCustomLineItemQuantityChangedMessagePayload template) {
        OrderCustomLineItemQuantityChangedMessagePayloadImpl instance = new OrderCustomLineItemQuantityChangedMessagePayloadImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setQuantity(template.getQuantity());
        instance.setOldQuantity(template.getOldQuantity());
        return instance;
    }

    public OrderCustomLineItemQuantityChangedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of OrderCustomLineItemQuantityChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCustomLineItemQuantityChangedMessagePayload deepCopy(
            @Nullable final OrderCustomLineItemQuantityChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderCustomLineItemQuantityChangedMessagePayloadImpl instance = new OrderCustomLineItemQuantityChangedMessagePayloadImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setQuantity(template.getQuantity());
        instance.setOldQuantity(template.getOldQuantity());
        return instance;
    }

    /**
     * builder factory method for OrderCustomLineItemQuantityChangedMessagePayload
     * @return builder
     */
    public static OrderCustomLineItemQuantityChangedMessagePayloadBuilder builder() {
        return OrderCustomLineItemQuantityChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderCustomLineItemQuantityChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomLineItemQuantityChangedMessagePayloadBuilder builder(
            final OrderCustomLineItemQuantityChangedMessagePayload template) {
        return OrderCustomLineItemQuantityChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCustomLineItemQuantityChangedMessagePayload(
            Function<OrderCustomLineItemQuantityChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemQuantityChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemQuantityChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomLineItemQuantityChangedMessagePayload>";
            }
        };
    }
}
