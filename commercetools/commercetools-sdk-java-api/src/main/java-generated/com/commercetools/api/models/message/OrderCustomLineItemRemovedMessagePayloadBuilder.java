
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
     *  <p>Unique identifier of the Custom Line Item.</p>
     * @param customLineItemId value to be set
     * @return Builder
     */

    public OrderCustomLineItemRemovedMessagePayloadBuilder customLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        return this;
    }

    /**
     *  <p>Custom Line Item that was removed from the Order.</p>
     * @param builder function to build the customLineItem value
     * @return Builder
     */

    public OrderCustomLineItemRemovedMessagePayloadBuilder customLineItem(
            Function<com.commercetools.api.models.cart.CustomLineItemBuilder, com.commercetools.api.models.cart.CustomLineItemBuilder> builder) {
        this.customLineItem = builder.apply(com.commercetools.api.models.cart.CustomLineItemBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Line Item that was removed from the Order.</p>
     * @param builder function to build the customLineItem value
     * @return Builder
     */

    public OrderCustomLineItemRemovedMessagePayloadBuilder withCustomLineItem(
            Function<com.commercetools.api.models.cart.CustomLineItemBuilder, com.commercetools.api.models.cart.CustomLineItem> builder) {
        this.customLineItem = builder.apply(com.commercetools.api.models.cart.CustomLineItemBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Line Item that was removed from the Order.</p>
     * @param customLineItem value to be set
     * @return Builder
     */

    public OrderCustomLineItemRemovedMessagePayloadBuilder customLineItem(
            final com.commercetools.api.models.cart.CustomLineItem customLineItem) {
        this.customLineItem = customLineItem;
        return this;
    }

    /**
     *  <p>Unique identifier of the Custom Line Item.</p>
     * @return customLineItemId
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p>Custom Line Item that was removed from the Order.</p>
     * @return customLineItem
     */

    public com.commercetools.api.models.cart.CustomLineItem getCustomLineItem() {
        return this.customLineItem;
    }

    /**
     * builds OrderCustomLineItemRemovedMessagePayload with checking for non-null required values
     * @return OrderCustomLineItemRemovedMessagePayload
     */
    public OrderCustomLineItemRemovedMessagePayload build() {
        Objects.requireNonNull(customLineItemId,
            OrderCustomLineItemRemovedMessagePayload.class + ": customLineItemId is missing");
        Objects.requireNonNull(customLineItem,
            OrderCustomLineItemRemovedMessagePayload.class + ": customLineItem is missing");
        return new OrderCustomLineItemRemovedMessagePayloadImpl(customLineItemId, customLineItem);
    }

    /**
     * builds OrderCustomLineItemRemovedMessagePayload without checking for non-null required values
     * @return OrderCustomLineItemRemovedMessagePayload
     */
    public OrderCustomLineItemRemovedMessagePayload buildUnchecked() {
        return new OrderCustomLineItemRemovedMessagePayloadImpl(customLineItemId, customLineItem);
    }

    /**
     * factory method for an instance of OrderCustomLineItemRemovedMessagePayloadBuilder
     * @return builder
     */
    public static OrderCustomLineItemRemovedMessagePayloadBuilder of() {
        return new OrderCustomLineItemRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for OrderCustomLineItemRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomLineItemRemovedMessagePayloadBuilder of(
            final OrderCustomLineItemRemovedMessagePayload template) {
        OrderCustomLineItemRemovedMessagePayloadBuilder builder = new OrderCustomLineItemRemovedMessagePayloadBuilder();
        builder.customLineItemId = template.getCustomLineItemId();
        builder.customLineItem = template.getCustomLineItem();
        return builder;
    }

}
