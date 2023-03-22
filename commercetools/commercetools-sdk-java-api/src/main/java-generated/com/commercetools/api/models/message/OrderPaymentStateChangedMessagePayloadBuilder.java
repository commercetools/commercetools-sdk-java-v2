
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderPaymentStateChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderPaymentStateChangedMessagePayload orderPaymentStateChangedMessagePayload = OrderPaymentStateChangedMessagePayload.builder()
 *             .paymentState(PaymentState.BALANCE_DUE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderPaymentStateChangedMessagePayloadBuilder implements Builder<OrderPaymentStateChangedMessagePayload> {

    private com.commercetools.api.models.order.PaymentState paymentState;

    @Nullable
    private com.commercetools.api.models.order.PaymentState oldPaymentState;

    /**
     *  <p>PaymentState after the Change Payment State update action.</p>
     * @param paymentState
     * @return Builder
     */

    public OrderPaymentStateChangedMessagePayloadBuilder paymentState(
            final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    /**
     *  <p>PaymentState before the Change Payment State update action.</p>
     * @param oldPaymentState
     * @return Builder
     */

    public OrderPaymentStateChangedMessagePayloadBuilder oldPaymentState(
            @Nullable final com.commercetools.api.models.order.PaymentState oldPaymentState) {
        this.oldPaymentState = oldPaymentState;
        return this;
    }

    public com.commercetools.api.models.order.PaymentState getPaymentState() {
        return this.paymentState;
    }

    @Nullable
    public com.commercetools.api.models.order.PaymentState getOldPaymentState() {
        return this.oldPaymentState;
    }

    public OrderPaymentStateChangedMessagePayload build() {
        Objects.requireNonNull(paymentState,
            OrderPaymentStateChangedMessagePayload.class + ": paymentState is missing");
        return new OrderPaymentStateChangedMessagePayloadImpl(paymentState, oldPaymentState);
    }

    /**
     * builds OrderPaymentStateChangedMessagePayload without checking for non null required values
     */
    public OrderPaymentStateChangedMessagePayload buildUnchecked() {
        return new OrderPaymentStateChangedMessagePayloadImpl(paymentState, oldPaymentState);
    }

    public static OrderPaymentStateChangedMessagePayloadBuilder of() {
        return new OrderPaymentStateChangedMessagePayloadBuilder();
    }

    public static OrderPaymentStateChangedMessagePayloadBuilder of(
            final OrderPaymentStateChangedMessagePayload template) {
        OrderPaymentStateChangedMessagePayloadBuilder builder = new OrderPaymentStateChangedMessagePayloadBuilder();
        builder.paymentState = template.getPaymentState();
        builder.oldPaymentState = template.getOldPaymentState();
        return builder;
    }

}
