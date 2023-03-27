
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderShippingRateInputSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderShippingRateInputSetMessagePayload orderShippingRateInputSetMessagePayload = OrderShippingRateInputSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderShippingRateInputSetMessagePayloadBuilder
        implements Builder<OrderShippingRateInputSetMessagePayload> {

    @Nullable
    private com.commercetools.api.models.cart.ShippingRateInput shippingRateInput;

    @Nullable
    private com.commercetools.api.models.cart.ShippingRateInput oldShippingRateInput;

    /**
     *  <p>ShippingRateInput after the Set ShippingRateInput update action.</p>
     * @param shippingRateInput value to be set
     * @return Builder
     */

    public OrderShippingRateInputSetMessagePayloadBuilder shippingRateInput(
            @Nullable final com.commercetools.api.models.cart.ShippingRateInput shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
        return this;
    }

    /**
     *  <p>ShippingRateInput after the Set ShippingRateInput update action.</p>
     * @param builder function to build the shippingRateInput value
     * @return Builder
     */

    public OrderShippingRateInputSetMessagePayloadBuilder shippingRateInput(
            Function<com.commercetools.api.models.cart.ShippingRateInputBuilder, Builder<? extends com.commercetools.api.models.cart.ShippingRateInput>> builder) {
        this.shippingRateInput = builder.apply(com.commercetools.api.models.cart.ShippingRateInputBuilder.of()).build();
        return this;
    }

    /**
     *  <p>ShippingRateInput before the Set ShippingRateInput update action.</p>
     * @param oldShippingRateInput value to be set
     * @return Builder
     */

    public OrderShippingRateInputSetMessagePayloadBuilder oldShippingRateInput(
            @Nullable final com.commercetools.api.models.cart.ShippingRateInput oldShippingRateInput) {
        this.oldShippingRateInput = oldShippingRateInput;
        return this;
    }

    /**
     *  <p>ShippingRateInput before the Set ShippingRateInput update action.</p>
     * @param builder function to build the oldShippingRateInput value
     * @return Builder
     */

    public OrderShippingRateInputSetMessagePayloadBuilder oldShippingRateInput(
            Function<com.commercetools.api.models.cart.ShippingRateInputBuilder, Builder<? extends com.commercetools.api.models.cart.ShippingRateInput>> builder) {
        this.oldShippingRateInput = builder.apply(com.commercetools.api.models.cart.ShippingRateInputBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ShippingRateInput after the Set ShippingRateInput update action.</p>
     * @return shippingRateInput
     */

    @Nullable
    public com.commercetools.api.models.cart.ShippingRateInput getShippingRateInput() {
        return this.shippingRateInput;
    }

    /**
     *  <p>ShippingRateInput before the Set ShippingRateInput update action.</p>
     * @return oldShippingRateInput
     */

    @Nullable
    public com.commercetools.api.models.cart.ShippingRateInput getOldShippingRateInput() {
        return this.oldShippingRateInput;
    }

    /**
     * builds OrderShippingRateInputSetMessagePayload with checking for non-null required values
     * @return OrderShippingRateInputSetMessagePayload
     */
    public OrderShippingRateInputSetMessagePayload build() {
        return new OrderShippingRateInputSetMessagePayloadImpl(shippingRateInput, oldShippingRateInput);
    }

    /**
     * builds OrderShippingRateInputSetMessagePayload without checking for non-null required values
     * @return OrderShippingRateInputSetMessagePayload
     */
    public OrderShippingRateInputSetMessagePayload buildUnchecked() {
        return new OrderShippingRateInputSetMessagePayloadImpl(shippingRateInput, oldShippingRateInput);
    }

    /**
     * factory method for an instance of OrderShippingRateInputSetMessagePayloadBuilder
     * @return builder
     */
    public static OrderShippingRateInputSetMessagePayloadBuilder of() {
        return new OrderShippingRateInputSetMessagePayloadBuilder();
    }

    /**
     * create builder for OrderShippingRateInputSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderShippingRateInputSetMessagePayloadBuilder of(
            final OrderShippingRateInputSetMessagePayload template) {
        OrderShippingRateInputSetMessagePayloadBuilder builder = new OrderShippingRateInputSetMessagePayloadBuilder();
        builder.shippingRateInput = template.getShippingRateInput();
        builder.oldShippingRateInput = template.getOldShippingRateInput();
        return builder;
    }

}
