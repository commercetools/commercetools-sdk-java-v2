
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.LineItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Add Line Item update action.</p>
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderLineItemAddedMessagePayloadImpl.class)
public interface OrderLineItemAddedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderLineItemAddedMessagePayload
     */
    String ORDER_LINE_ITEM_ADDED = "OrderLineItemAdded";

    /**
     *  <p>Line Item that was added to the Order.</p>
     * @return lineItem
     */
    @NotNull
    @Valid
    @JsonProperty("lineItem")
    public LineItem getLineItem();

    /**
     *  <p>Quantity of Line Items that were added to the Order.</p>
     * @return addedQuantity
     */
    @NotNull
    @JsonProperty("addedQuantity")
    public Long getAddedQuantity();

    /**
     *  <p>Line Item that was added to the Order.</p>
     * @param lineItem value to be set
     */

    public void setLineItem(final LineItem lineItem);

    /**
     *  <p>Quantity of Line Items that were added to the Order.</p>
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
