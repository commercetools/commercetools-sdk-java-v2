
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
     *
     */

    public OrderCustomLineItemAddedMessagePayloadBuilder customLineItem(
            Function<com.commercetools.api.models.cart.CustomLineItemBuilder, com.commercetools.api.models.cart.CustomLineItemBuilder> builder) {
        this.customLineItem = builder.apply(com.commercetools.api.models.cart.CustomLineItemBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public OrderCustomLineItemAddedMessagePayloadBuilder customLineItem(
            final com.commercetools.api.models.cart.CustomLineItem customLineItem) {
        this.customLineItem = customLineItem;
        return this;
    }

    public com.commercetools.api.models.cart.CustomLineItem getCustomLineItem() {
        return this.customLineItem;
    }

    public OrderCustomLineItemAddedMessagePayload build() {
        Objects.requireNonNull(customLineItem,
            OrderCustomLineItemAddedMessagePayload.class + ": customLineItem is missing");
        return new OrderCustomLineItemAddedMessagePayloadImpl(customLineItem);
    }

    /**
     * builds OrderCustomLineItemAddedMessagePayload without checking for non null required values
     */
    public OrderCustomLineItemAddedMessagePayload buildUnchecked() {
        return new OrderCustomLineItemAddedMessagePayloadImpl(customLineItem);
    }

    public static OrderCustomLineItemAddedMessagePayloadBuilder of() {
        return new OrderCustomLineItemAddedMessagePayloadBuilder();
    }

    public static OrderCustomLineItemAddedMessagePayloadBuilder of(
            final OrderCustomLineItemAddedMessagePayload template) {
        OrderCustomLineItemAddedMessagePayloadBuilder builder = new OrderCustomLineItemAddedMessagePayloadBuilder();
        builder.customLineItem = template.getCustomLineItem();
        return builder;
    }

}
