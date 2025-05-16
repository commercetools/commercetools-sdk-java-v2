
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.CustomLineItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Remove CustomLineItem update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomLineItemRemovedMessagePayload orderCustomLineItemRemovedMessagePayload = OrderCustomLineItemRemovedMessagePayload.builder()
 *             .customLineItemId("{customLineItemId}")
 *             .customLineItem(customLineItemBuilder -> customLineItemBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("OrderCustomLineItemRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderCustomLineItemRemovedMessagePayloadImpl.class)
public interface OrderCustomLineItemRemovedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderCustomLineItemRemovedMessagePayload
     */
    String ORDER_CUSTOM_LINE_ITEM_REMOVED = "OrderCustomLineItemRemoved";

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
     *  <p>Custom Line Item that was removed from the Order.</p>
     * @return customLineItem
     */
    @NotNull
    @Valid
    @JsonProperty("customLineItem")
    public CustomLineItem getCustomLineItem();

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
     *  <p>Custom Line Item that was removed from the Order.</p>
     * @param customLineItem value to be set
     */

    public void setCustomLineItem(final CustomLineItem customLineItem);

    /**
     * factory method
     * @return instance of OrderCustomLineItemRemovedMessagePayload
     */
    public static OrderCustomLineItemRemovedMessagePayload of() {
        return new OrderCustomLineItemRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderCustomLineItemRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderCustomLineItemRemovedMessagePayload of(final OrderCustomLineItemRemovedMessagePayload template) {
        OrderCustomLineItemRemovedMessagePayloadImpl instance = new OrderCustomLineItemRemovedMessagePayloadImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setCustomLineItem(template.getCustomLineItem());
        return instance;
    }

    public OrderCustomLineItemRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of OrderCustomLineItemRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderCustomLineItemRemovedMessagePayload deepCopy(
            @Nullable final OrderCustomLineItemRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderCustomLineItemRemovedMessagePayloadImpl instance = new OrderCustomLineItemRemovedMessagePayloadImpl();
        instance.setCustomLineItemId(template.getCustomLineItemId());
        instance.setCustomLineItemKey(template.getCustomLineItemKey());
        instance.setCustomLineItem(
            com.commercetools.api.models.cart.CustomLineItem.deepCopy(template.getCustomLineItem()));
        return instance;
    }

    /**
     * builder factory method for OrderCustomLineItemRemovedMessagePayload
     * @return builder
     */
    public static OrderCustomLineItemRemovedMessagePayloadBuilder builder() {
        return OrderCustomLineItemRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderCustomLineItemRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomLineItemRemovedMessagePayloadBuilder builder(
            final OrderCustomLineItemRemovedMessagePayload template) {
        return OrderCustomLineItemRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderCustomLineItemRemovedMessagePayload(
            Function<OrderCustomLineItemRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderCustomLineItemRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderCustomLineItemRemovedMessagePayload>";
            }
        };
    }
}
