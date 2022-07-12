
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCustomLineItemRemovedMessagePayloadBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderCustomLineItemRemovedMessagePayloadBuilder
        implements Builder<OrderCustomLineItemRemovedMessagePayload> {

    private String customLineItemId;

    private com.commercetools.api.models.cart.CustomLineItem customLineItem;

    /**
     *
     */

    public OrderCustomLineItemRemovedMessagePayloadBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *
     */

    public OrderCustomLineItemRemovedMessagePayloadBuilder customLineItem(
            Function<com.commercetools.api.models.cart.CustomLineItemBuilder, com.commercetools.api.models.cart.CustomLineItemBuilder> builder) {
        this.customLineItem = builder.apply(com.commercetools.api.models.cart.CustomLineItemBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public OrderCustomLineItemRemovedMessagePayloadBuilder customLineItem(
            final com.commercetools.api.models.cart.CustomLineItem customLineItem) {
        this.customLineItem = customLineItem;
        return this;
    }

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public com.commercetools.api.models.cart.CustomLineItem getCustomLineItem() {
        return this.customLineItem;
    }

    public OrderCustomLineItemRemovedMessagePayload build() {
        Objects.requireNonNull(customLineItemId,
            OrderCustomLineItemRemovedMessagePayload.class + ": customLineItemId is missing");
        Objects.requireNonNull(customLineItem,
            OrderCustomLineItemRemovedMessagePayload.class + ": customLineItem is missing");
        return new OrderCustomLineItemRemovedMessagePayloadImpl(customLineItemId, customLineItem);
    }

    /**
     * builds OrderCustomLineItemRemovedMessagePayload without checking for non null required values
     */
    public OrderCustomLineItemRemovedMessagePayload buildUnchecked() {
        return new OrderCustomLineItemRemovedMessagePayloadImpl(customLineItemId, customLineItem);
    }

    public static OrderCustomLineItemRemovedMessagePayloadBuilder of() {
        return new OrderCustomLineItemRemovedMessagePayloadBuilder();
    }

    public static OrderCustomLineItemRemovedMessagePayloadBuilder of(
            final OrderCustomLineItemRemovedMessagePayload template) {
        OrderCustomLineItemRemovedMessagePayloadBuilder builder = new OrderCustomLineItemRemovedMessagePayloadBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.customLineItem = template.getCustomLineItem();
        return builder;
    }

}
