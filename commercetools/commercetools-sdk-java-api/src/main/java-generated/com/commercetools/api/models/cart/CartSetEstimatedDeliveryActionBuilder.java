
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetEstimatedDeliveryActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetEstimatedDeliveryAction cartSetEstimatedDeliveryAction = CartSetEstimatedDeliveryAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetEstimatedDeliveryActionBuilder implements Builder<CartSetEstimatedDeliveryAction> {

    @Nullable
    private String shippingKey;

    @Nullable
    private com.commercetools.api.models.cart.EstimatedDelivery estimatedDelivery;

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a> to update. This is required and valid only for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. An <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned if <code>shippingKey</code> is provided for Carts with <code>Single</code> ShippingMode, or omitted for Carts with <code>Multiple</code> ShippingMode.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public CartSetEstimatedDeliveryActionBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the estimatedDelivery value
     * @return Builder
     */

    public CartSetEstimatedDeliveryActionBuilder estimatedDelivery(
            Function<com.commercetools.api.models.cart.EstimatedDeliveryBuilder, com.commercetools.api.models.cart.EstimatedDeliveryBuilder> builder) {
        this.estimatedDelivery = builder.apply(com.commercetools.api.models.cart.EstimatedDeliveryBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the estimatedDelivery value
     * @return Builder
     */

    public CartSetEstimatedDeliveryActionBuilder withEstimatedDelivery(
            Function<com.commercetools.api.models.cart.EstimatedDeliveryBuilder, com.commercetools.api.models.cart.EstimatedDelivery> builder) {
        this.estimatedDelivery = builder.apply(com.commercetools.api.models.cart.EstimatedDeliveryBuilder.of());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param estimatedDelivery value to be set
     * @return Builder
     */

    public CartSetEstimatedDeliveryActionBuilder estimatedDelivery(
            @Nullable final com.commercetools.api.models.cart.EstimatedDelivery estimatedDelivery) {
        this.estimatedDelivery = estimatedDelivery;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a> to update. This is required and valid only for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>. An <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned if <code>shippingKey</code> is provided for Carts with <code>Single</code> ShippingMode, or omitted for Carts with <code>Multiple</code> ShippingMode.</p>
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
     * builds CartSetEstimatedDeliveryAction with checking for non-null required values
     * @return CartSetEstimatedDeliveryAction
     */
    public CartSetEstimatedDeliveryAction build() {
        return new CartSetEstimatedDeliveryActionImpl(shippingKey, estimatedDelivery);
    }

    /**
     * builds CartSetEstimatedDeliveryAction without checking for non-null required values
     * @return CartSetEstimatedDeliveryAction
     */
    public CartSetEstimatedDeliveryAction buildUnchecked() {
        return new CartSetEstimatedDeliveryActionImpl(shippingKey, estimatedDelivery);
    }

    /**
     * factory method for an instance of CartSetEstimatedDeliveryActionBuilder
     * @return builder
     */
    public static CartSetEstimatedDeliveryActionBuilder of() {
        return new CartSetEstimatedDeliveryActionBuilder();
    }

    /**
     * create builder for CartSetEstimatedDeliveryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetEstimatedDeliveryActionBuilder of(final CartSetEstimatedDeliveryAction template) {
        CartSetEstimatedDeliveryActionBuilder builder = new CartSetEstimatedDeliveryActionBuilder();
        builder.shippingKey = template.getShippingKey();
        builder.estimatedDelivery = template.getEstimatedDelivery();
        return builder;
    }

}
