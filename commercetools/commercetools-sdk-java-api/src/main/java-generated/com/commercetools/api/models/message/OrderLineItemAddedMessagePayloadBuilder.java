
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderLineItemAddedMessagePayloadBuilder
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
public class OrderLineItemAddedMessagePayloadBuilder implements Builder<OrderLineItemAddedMessagePayload> {

    private com.commercetools.api.models.cart.LineItem lineItem;

    private Long addedQuantity;

    /**
     *  <p>Line Item that was added to the Order.</p>
     * @param builder function to build the lineItem value
     * @return Builder
     */

    public OrderLineItemAddedMessagePayloadBuilder lineItem(
            Function<com.commercetools.api.models.cart.LineItemBuilder, com.commercetools.api.models.cart.LineItemBuilder> builder) {
        this.lineItem = builder.apply(com.commercetools.api.models.cart.LineItemBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Line Item that was added to the Order.</p>
     * @param lineItem value to be set
     * @return Builder
     */

    public OrderLineItemAddedMessagePayloadBuilder lineItem(final com.commercetools.api.models.cart.LineItem lineItem) {
        this.lineItem = lineItem;
        return this;
    }

    /**
     *  <p>Quantity of Line Items that were added to the Order.</p>
     * @param addedQuantity value to be set
     * @return Builder
     */

    public OrderLineItemAddedMessagePayloadBuilder addedQuantity(final Long addedQuantity) {
        this.addedQuantity = addedQuantity;
        return this;
    }

    public com.commercetools.api.models.cart.LineItem getLineItem() {
        return this.lineItem;
    }

    public Long getAddedQuantity() {
        return this.addedQuantity;
    }

    /**
     * builds OrderLineItemAddedMessagePayload with checking for non-null required values
     * @return OrderLineItemAddedMessagePayload
     */
    public OrderLineItemAddedMessagePayload build() {
        Objects.requireNonNull(lineItem, OrderLineItemAddedMessagePayload.class + ": lineItem is missing");
        Objects.requireNonNull(addedQuantity, OrderLineItemAddedMessagePayload.class + ": addedQuantity is missing");
        return new OrderLineItemAddedMessagePayloadImpl(lineItem, addedQuantity);
    }

    /**
     * builds OrderLineItemAddedMessagePayload without checking for non-null required values
     * @return OrderLineItemAddedMessagePayload
     */
    public OrderLineItemAddedMessagePayload buildUnchecked() {
        return new OrderLineItemAddedMessagePayloadImpl(lineItem, addedQuantity);
    }

    public static OrderLineItemAddedMessagePayloadBuilder of() {
        return new OrderLineItemAddedMessagePayloadBuilder();
    }

    public static OrderLineItemAddedMessagePayloadBuilder of(final OrderLineItemAddedMessagePayload template) {
        OrderLineItemAddedMessagePayloadBuilder builder = new OrderLineItemAddedMessagePayloadBuilder();
        builder.lineItem = template.getLineItem();
        builder.addedQuantity = template.getAddedQuantity();
        return builder;
    }

}
