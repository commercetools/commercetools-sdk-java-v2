
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetEstimatedDeliveryActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetEstimatedDeliveryAction orderSetEstimatedDeliveryAction = OrderSetEstimatedDeliveryAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetEstimatedDeliveryActionBuilder implements Builder<OrderSetEstimatedDeliveryAction> {

    @Nullable
    private String shippingKey;

    @Nullable
    private com.commercetools.api.models.cart.EstimatedDelivery estimatedDelivery;

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a> to update. This is required and valid only for Orders with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. An <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned if <code>shippingKey</code> is provided for Orders with <code>Single</code> ShippingMode, or omitted for Orders with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public OrderSetEstimatedDeliveryActionBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the estimatedDelivery value
     * @return Builder
     */

    public OrderSetEstimatedDeliveryActionBuilder estimatedDelivery(
            Function<com.commercetools.api.models.cart.EstimatedDeliveryBuilder, com.commercetools.api.models.cart.EstimatedDeliveryBuilder> builder) {
        this.estimatedDelivery = builder.apply(com.commercetools.api.models.cart.EstimatedDeliveryBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the estimatedDelivery value
     * @return Builder
     */

    public OrderSetEstimatedDeliveryActionBuilder withEstimatedDelivery(
            Function<com.commercetools.api.models.cart.EstimatedDeliveryBuilder, com.commercetools.api.models.cart.EstimatedDelivery> builder) {
        this.estimatedDelivery = builder.apply(com.commercetools.api.models.cart.EstimatedDeliveryBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param estimatedDelivery value to be set
     * @return Builder
     */

    public OrderSetEstimatedDeliveryActionBuilder estimatedDelivery(
            @Nullable final com.commercetools.api.models.cart.EstimatedDelivery estimatedDelivery) {
        this.estimatedDelivery = estimatedDelivery;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a> to update. This is required and valid only for Orders with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. An <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned if <code>shippingKey</code> is provided for Orders with <code>Single</code> ShippingMode, or omitted for Orders with <code>Multiple</code> ShippingMode.</p>
     * @return shippingKey
     */

    @Nullable
    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return estimatedDelivery
     */

    @Nullable
    public com.commercetools.api.models.cart.EstimatedDelivery getEstimatedDelivery() {
        return this.estimatedDelivery;
    }

    /**
     * builds OrderSetEstimatedDeliveryAction with checking for non-null required values
     * @return OrderSetEstimatedDeliveryAction
     */
    public OrderSetEstimatedDeliveryAction build() {
        return new OrderSetEstimatedDeliveryActionImpl(shippingKey, estimatedDelivery);
    }

    /**
     * builds OrderSetEstimatedDeliveryAction without checking for non-null required values
     * @return OrderSetEstimatedDeliveryAction
     */
    public OrderSetEstimatedDeliveryAction buildUnchecked() {
        return new OrderSetEstimatedDeliveryActionImpl(shippingKey, estimatedDelivery);
    }

    /**
     * factory method for an instance of OrderSetEstimatedDeliveryActionBuilder
     * @return builder
     */
    public static OrderSetEstimatedDeliveryActionBuilder of() {
        return new OrderSetEstimatedDeliveryActionBuilder();
    }

    /**
     * create builder for OrderSetEstimatedDeliveryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetEstimatedDeliveryActionBuilder of(final OrderSetEstimatedDeliveryAction template) {
        OrderSetEstimatedDeliveryActionBuilder builder = new OrderSetEstimatedDeliveryActionBuilder();
        builder.shippingKey = template.getShippingKey();
        builder.estimatedDelivery = template.getEstimatedDelivery();
        return builder;
    }

}
