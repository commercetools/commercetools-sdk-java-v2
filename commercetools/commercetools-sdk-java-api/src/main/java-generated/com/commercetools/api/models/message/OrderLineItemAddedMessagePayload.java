
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart.LineItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderAddLineItemAction" rel="nofollow">Add LineItem</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderLineItemAddedMessagePayload orderLineItemAddedMessagePayload = OrderLineItemAddedMessagePayload.builder()
 *             .lineItem(lineItemBuilder -> lineItemBuilder)
 *             .addedQuantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("OrderLineItemAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderLineItemAddedMessagePayloadImpl.class)
public interface OrderLineItemAddedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderLineItemAddedMessagePayload
     */
    String ORDER_LINE_ITEM_ADDED = "OrderLineItemAdded";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">Line Item</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @return lineItem
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LineItem getLineItem();

    /**
     *  <p>Quantity of <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">Line Items</a> that were added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @return addedQuantity
     */
    @NotNull
    @JsonProperty("addedQuantity")
    public Long getAddedQuantity();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">Line Item</a> that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param lineItem value to be set
     */

    public void setLineItem(final LineItem lineItem);

    /**
     *  <p>Quantity of <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">Line Items</a> that were added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Order</a>.</p>
     * @param addedQuantity value to be set
     */

    public void setAddedQuantity(final Long addedQuantity);

    /**
     * factory method
     * @return instance of OrderLineItemAddedMessagePayload
     */
    public static OrderLineItemAddedMessagePayload of() {
        return new OrderLineItemAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderLineItemAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderLineItemAddedMessagePayload of(final OrderLineItemAddedMessagePayload template) {
        OrderLineItemAddedMessagePayloadImpl instance = new OrderLineItemAddedMessagePayloadImpl();
        instance.setLineItem(template.getLineItem());
        instance.setAddedQuantity(template.getAddedQuantity());
        return instance;
    }

    public OrderLineItemAddedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of OrderLineItemAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderLineItemAddedMessagePayload deepCopy(@Nullable final OrderLineItemAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderLineItemAddedMessagePayloadImpl instance = new OrderLineItemAddedMessagePayloadImpl();
        instance.setLineItem(com.commercetools.api.models.cart.LineItem.deepCopy(template.getLineItem()));
        instance.setAddedQuantity(template.getAddedQuantity());
        return instance;
    }

    /**
     * builder factory method for OrderLineItemAddedMessagePayload
     * @return builder
     */
    public static OrderLineItemAddedMessagePayloadBuilder builder() {
        return OrderLineItemAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderLineItemAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderLineItemAddedMessagePayloadBuilder builder(final OrderLineItemAddedMessagePayload template) {
        return OrderLineItemAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderLineItemAddedMessagePayload(Function<OrderLineItemAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderLineItemAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderLineItemAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderLineItemAddedMessagePayload>";
            }
        };
    }
}
