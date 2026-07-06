
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderShippingInfoSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderShippingInfoSetMessagePayload orderShippingInfoSetMessagePayload = OrderShippingInfoSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderShippingInfoSetMessagePayloadBuilder implements Builder<OrderShippingInfoSetMessagePayload> {

    @Nullable
    private com.commercetools.api.models.cart.ShippingInfo shippingInfo;

    @Nullable
    private com.commercetools.api.models.cart.ShippingInfo oldShippingInfo;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetShippingMethodAction" rel="nofollow">Set Shipping Method</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetCustomShippingMethodAction" rel="nofollow">Set Custom Shipping Method</a> update action.</p>
     * @param builder function to build the shippingInfo value
     * @return Builder
     */

    public OrderShippingInfoSetMessagePayloadBuilder shippingInfo(
            Function<com.commercetools.api.models.cart.ShippingInfoBuilder, com.commercetools.api.models.cart.ShippingInfoBuilder> builder) {
        this.shippingInfo = builder.apply(com.commercetools.api.models.cart.ShippingInfoBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetShippingMethodAction" rel="nofollow">Set Shipping Method</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetCustomShippingMethodAction" rel="nofollow">Set Custom Shipping Method</a> update action.</p>
     * @param builder function to build the shippingInfo value
     * @return Builder
     */

    public OrderShippingInfoSetMessagePayloadBuilder withShippingInfo(
            Function<com.commercetools.api.models.cart.ShippingInfoBuilder, com.commercetools.api.models.cart.ShippingInfo> builder) {
        this.shippingInfo = builder.apply(com.commercetools.api.models.cart.ShippingInfoBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetShippingMethodAction" rel="nofollow">Set Shipping Method</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetCustomShippingMethodAction" rel="nofollow">Set Custom Shipping Method</a> update action.</p>
     * @param shippingInfo value to be set
     * @return Builder
     */

    public OrderShippingInfoSetMessagePayloadBuilder shippingInfo(
            @Nullable final com.commercetools.api.models.cart.ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetShippingMethodAction" rel="nofollow">Set Shipping Method</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetCustomShippingMethodAction" rel="nofollow">Set Custom Shipping Method</a> update action.</p>
     * @param builder function to build the oldShippingInfo value
     * @return Builder
     */

    public OrderShippingInfoSetMessagePayloadBuilder oldShippingInfo(
            Function<com.commercetools.api.models.cart.ShippingInfoBuilder, com.commercetools.api.models.cart.ShippingInfoBuilder> builder) {
        this.oldShippingInfo = builder.apply(com.commercetools.api.models.cart.ShippingInfoBuilder.of()).build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetShippingMethodAction" rel="nofollow">Set Shipping Method</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetCustomShippingMethodAction" rel="nofollow">Set Custom Shipping Method</a> update action.</p>
     * @param builder function to build the oldShippingInfo value
     * @return Builder
     */

    public OrderShippingInfoSetMessagePayloadBuilder withOldShippingInfo(
            Function<com.commercetools.api.models.cart.ShippingInfoBuilder, com.commercetools.api.models.cart.ShippingInfo> builder) {
        this.oldShippingInfo = builder.apply(com.commercetools.api.models.cart.ShippingInfoBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetShippingMethodAction" rel="nofollow">Set Shipping Method</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetCustomShippingMethodAction" rel="nofollow">Set Custom Shipping Method</a> update action.</p>
     * @param oldShippingInfo value to be set
     * @return Builder
     */

    public OrderShippingInfoSetMessagePayloadBuilder oldShippingInfo(
            @Nullable final com.commercetools.api.models.cart.ShippingInfo oldShippingInfo) {
        this.oldShippingInfo = oldShippingInfo;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetShippingMethodAction" rel="nofollow">Set Shipping Method</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetCustomShippingMethodAction" rel="nofollow">Set Custom Shipping Method</a> update action.</p>
     * @return shippingInfo
     */

    @Nullable
    public com.commercetools.api.models.cart.ShippingInfo getShippingInfo() {
        return this.shippingInfo;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetShippingMethodAction" rel="nofollow">Set Shipping Method</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetCustomShippingMethodAction" rel="nofollow">Set Custom Shipping Method</a> update action.</p>
     * @return oldShippingInfo
     */

    @Nullable
    public com.commercetools.api.models.cart.ShippingInfo getOldShippingInfo() {
        return this.oldShippingInfo;
    }

    /**
     * builds OrderShippingInfoSetMessagePayload with checking for non-null required values
     * @return OrderShippingInfoSetMessagePayload
     */
    public OrderShippingInfoSetMessagePayload build() {
        return new OrderShippingInfoSetMessagePayloadImpl(shippingInfo, oldShippingInfo);
    }

    /**
     * builds OrderShippingInfoSetMessagePayload without checking for non-null required values
     * @return OrderShippingInfoSetMessagePayload
     */
    public OrderShippingInfoSetMessagePayload buildUnchecked() {
        return new OrderShippingInfoSetMessagePayloadImpl(shippingInfo, oldShippingInfo);
    }

    /**
     * factory method for an instance of OrderShippingInfoSetMessagePayloadBuilder
     * @return builder
     */
    public static OrderShippingInfoSetMessagePayloadBuilder of() {
        return new OrderShippingInfoSetMessagePayloadBuilder();
    }

    /**
     * create builder for OrderShippingInfoSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderShippingInfoSetMessagePayloadBuilder of(final OrderShippingInfoSetMessagePayload template) {
        OrderShippingInfoSetMessagePayloadBuilder builder = new OrderShippingInfoSetMessagePayloadBuilder();
        builder.shippingInfo = template.getShippingInfo();
        builder.oldShippingInfo = template.getOldShippingInfo();
        return builder;
    }

}
