
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartEstimatedDeliverySetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartEstimatedDeliverySetMessagePayload cartEstimatedDeliverySetMessagePayload = CartEstimatedDeliverySetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartEstimatedDeliverySetMessagePayloadBuilder implements Builder<CartEstimatedDeliverySetMessagePayload> {

    @Nullable
    private com.commercetools.api.models.cart.EstimatedDelivery estimatedDelivery;

    @Nullable
    private String shippingKey;

    /**
     *  <p>Estimated delivery window on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetEstimatedDeliveryAction" rel="nofollow">Set Estimated Delivery</a> update action.</p>
     * @param builder function to build the estimatedDelivery value
     * @return Builder
     */

    public CartEstimatedDeliverySetMessagePayloadBuilder estimatedDelivery(
            Function<com.commercetools.api.models.cart.EstimatedDeliveryBuilder, com.commercetools.api.models.cart.EstimatedDeliveryBuilder> builder) {
        this.estimatedDelivery = builder.apply(com.commercetools.api.models.cart.EstimatedDeliveryBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Estimated delivery window on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetEstimatedDeliveryAction" rel="nofollow">Set Estimated Delivery</a> update action.</p>
     * @param builder function to build the estimatedDelivery value
     * @return Builder
     */

    public CartEstimatedDeliverySetMessagePayloadBuilder withEstimatedDelivery(
            Function<com.commercetools.api.models.cart.EstimatedDeliveryBuilder, com.commercetools.api.models.cart.EstimatedDelivery> builder) {
        this.estimatedDelivery = builder.apply(com.commercetools.api.models.cart.EstimatedDeliveryBuilder.of());
        return this;
    }

    /**
     *  <p>Estimated delivery window on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetEstimatedDeliveryAction" rel="nofollow">Set Estimated Delivery</a> update action.</p>
     * @param estimatedDelivery value to be set
     * @return Builder
     */

    public CartEstimatedDeliverySetMessagePayloadBuilder estimatedDelivery(
            @Nullable final com.commercetools.api.models.cart.EstimatedDelivery estimatedDelivery) {
        this.estimatedDelivery = estimatedDelivery;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a> that was updated. Only present for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @param shippingKey value to be set
     * @return Builder
     */

    public CartEstimatedDeliverySetMessagePayloadBuilder shippingKey(@Nullable final String shippingKey) {
        this.shippingKey = shippingKey;
        return this;
    }

    /**
     *  <p>Estimated delivery window on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetEstimatedDeliveryAction" rel="nofollow">Set Estimated Delivery</a> update action.</p>
     * @return estimatedDelivery
     */

    @Nullable
    public com.commercetools.api.models.cart.EstimatedDelivery getEstimatedDelivery() {
        return this.estimatedDelivery;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Shipping" rel="nofollow">Shipping</a> that was updated. Only present for Carts with <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     * @return shippingKey
     */

    @Nullable
    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     * builds CartEstimatedDeliverySetMessagePayload with checking for non-null required values
     * @return CartEstimatedDeliverySetMessagePayload
     */
    public CartEstimatedDeliverySetMessagePayload build() {
        return new CartEstimatedDeliverySetMessagePayloadImpl(estimatedDelivery, shippingKey);
    }

    /**
     * builds CartEstimatedDeliverySetMessagePayload without checking for non-null required values
     * @return CartEstimatedDeliverySetMessagePayload
     */
    public CartEstimatedDeliverySetMessagePayload buildUnchecked() {
        return new CartEstimatedDeliverySetMessagePayloadImpl(estimatedDelivery, shippingKey);
    }

    /**
     * factory method for an instance of CartEstimatedDeliverySetMessagePayloadBuilder
     * @return builder
     */
    public static CartEstimatedDeliverySetMessagePayloadBuilder of() {
        return new CartEstimatedDeliverySetMessagePayloadBuilder();
    }

    /**
     * create builder for CartEstimatedDeliverySetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartEstimatedDeliverySetMessagePayloadBuilder of(
            final CartEstimatedDeliverySetMessagePayload template) {
        CartEstimatedDeliverySetMessagePayloadBuilder builder = new CartEstimatedDeliverySetMessagePayloadBuilder();
        builder.estimatedDelivery = template.getEstimatedDelivery();
        builder.shippingKey = template.getShippingKey();
        return builder;
    }

}
