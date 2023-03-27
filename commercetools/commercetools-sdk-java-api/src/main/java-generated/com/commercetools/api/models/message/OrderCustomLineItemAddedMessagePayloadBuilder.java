
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCustomLineItemAddedMessagePayloadBuilder
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
public class OrderCustomLineItemAddedMessagePayloadBuilder implements Builder<OrderCustomLineItemAddedMessagePayload> {

    private com.commercetools.api.models.cart.CustomLineItem customLineItem;

    /**
     *  <p>Custom Line Item that was added to the Order.</p>
     * @param builder function to build the customLineItem value
     * @return Builder
     */

    public OrderCustomLineItemAddedMessagePayloadBuilder customLineItem(
            Function<com.commercetools.api.models.cart.CustomLineItemBuilder, com.commercetools.api.models.cart.CustomLineItemBuilder> builder) {
        this.customLineItem = builder.apply(com.commercetools.api.models.cart.CustomLineItemBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Line Item that was added to the Order.</p>
     * @param customLineItem value to be set
     * @return Builder
     */

    public OrderCustomLineItemAddedMessagePayloadBuilder customLineItem(
            final com.commercetools.api.models.cart.CustomLineItem customLineItem) {
        this.customLineItem = customLineItem;
        return this;
    }

    /**
     *  <p>Custom Line Item that was added to the Order.</p>
     * @return customLineItem
     */

    public com.commercetools.api.models.cart.CustomLineItem getCustomLineItem() {
        return this.customLineItem;
    }

    /**
     * builds OrderCustomLineItemAddedMessagePayload with checking for non-null required values
     * @return OrderCustomLineItemAddedMessagePayload
     */
    public OrderCustomLineItemAddedMessagePayload build() {
        Objects.requireNonNull(customLineItem,
            OrderCustomLineItemAddedMessagePayload.class + ": customLineItem is missing");
        return new OrderCustomLineItemAddedMessagePayloadImpl(customLineItem);
    }

    /**
     * builds OrderCustomLineItemAddedMessagePayload without checking for non-null required values
     * @return OrderCustomLineItemAddedMessagePayload
     */
    public OrderCustomLineItemAddedMessagePayload buildUnchecked() {
        return new OrderCustomLineItemAddedMessagePayloadImpl(customLineItem);
    }

    /**
     * factory method for an instance of OrderCustomLineItemAddedMessagePayloadBuilder
     * @return builder
     */
    public static OrderCustomLineItemAddedMessagePayloadBuilder of() {
        return new OrderCustomLineItemAddedMessagePayloadBuilder();
    }

    /**
     * create builder for OrderCustomLineItemAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomLineItemAddedMessagePayloadBuilder of(
            final OrderCustomLineItemAddedMessagePayload template) {
        OrderCustomLineItemAddedMessagePayloadBuilder builder = new OrderCustomLineItemAddedMessagePayloadBuilder();
        builder.customLineItem = template.getCustomLineItem();
        return builder;
    }

}
