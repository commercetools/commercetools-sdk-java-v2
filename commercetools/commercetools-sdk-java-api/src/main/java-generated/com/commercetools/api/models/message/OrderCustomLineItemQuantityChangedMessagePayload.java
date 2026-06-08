
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderChangeCustomLineItemQuantityAction" rel="nofollow">Change CustomLineItem Quantity</a> update action.</p>
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
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a>.</p>
     * @return customLineItemId
     */
    @NotNull
    @JsonProperty("customLineItemId")
    public String getCustomLineItemId();

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a>.</p>
     * @return customLineItemKey
     */

    @JsonProperty("customLineItemKey")
    public String getCustomLineItemKey();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a> quantity after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderChangeCustomLineItemQuantityAction" rel="nofollow">Change Custom Line Item Quantity</a> update action.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a> quantity before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderChangeCustomLineItemQuantityAction" rel="nofollow">Change Custom Line Item Quantity</a> update action.</p>
     * @return oldQuantity
     */
    @NotNull
    @JsonProperty("oldQuantity")
    public Long getOldQuantity();

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a>.</p>
     * @param customLineItemId value to be set
     */

    public void setCustomLineItemId(final String customLineItemId);

    /**
     *  <p>User-defined unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a>.</p>
     * @param customLineItemKey value to be set
     */

    public void setCustomLineItemKey(final String customLineItemKey);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a> quantity after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderChangeCustomLineItemQuantityAction" rel="nofollow">Change Custom Line Item Quantity</a> update action.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a> quantity before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderChangeCustomLineItemQuantityAction" rel="nofollow">Change Custom Line Item Quantity</a> update action.</p>
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
