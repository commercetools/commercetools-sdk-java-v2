
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentState" rel="nofollow">PaymentState</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderChangePaymentStateAction" rel="nofollow">Change Payment State</a> update action.</p>
     * @param paymentState value to be set
     * @return Builder
     */

    public OrderPaymentStateChangedMessagePayloadBuilder paymentState(
            final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentState" rel="nofollow">PaymentState</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderChangePaymentStateAction" rel="nofollow">Change Payment State</a> update action.</p>
     * @param oldPaymentState value to be set
     * @return Builder
     */

    public OrderPaymentStateChangedMessagePayloadBuilder oldPaymentState(
            @Nullable final com.commercetools.api.models.order.PaymentState oldPaymentState) {
        this.oldPaymentState = oldPaymentState;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentState" rel="nofollow">PaymentState</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderChangePaymentStateAction" rel="nofollow">Change Payment State</a> update action.</p>
     * @return paymentState
     */

    public com.commercetools.api.models.order.PaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentState" rel="nofollow">PaymentState</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderChangePaymentStateAction" rel="nofollow">Change Payment State</a> update action.</p>
     * @return oldPaymentState
     */

    @Nullable
    public com.commercetools.api.models.order.PaymentState getOldPaymentState() {
        return this.oldPaymentState;
    }

    /**
     * builds OrderPaymentStateChangedMessagePayload with checking for non-null required values
     * @return OrderPaymentStateChangedMessagePayload
     */
    public OrderPaymentStateChangedMessagePayload build() {
        Objects.requireNonNull(paymentState,
            OrderPaymentStateChangedMessagePayload.class + ": paymentState is missing");
        return new OrderPaymentStateChangedMessagePayloadImpl(paymentState, oldPaymentState);
    }

    /**
     * builds OrderPaymentStateChangedMessagePayload without checking for non-null required values
     * @return OrderPaymentStateChangedMessagePayload
     */
    public OrderPaymentStateChangedMessagePayload buildUnchecked() {
        return new OrderPaymentStateChangedMessagePayloadImpl(paymentState, oldPaymentState);
    }

    /**
     * factory method for an instance of OrderPaymentStateChangedMessagePayloadBuilder
     * @return builder
     */
    public static OrderPaymentStateChangedMessagePayloadBuilder of() {
        return new OrderPaymentStateChangedMessagePayloadBuilder();
    }

    /**
     * create builder for OrderPaymentStateChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderPaymentStateChangedMessagePayloadBuilder of(
            final OrderPaymentStateChangedMessagePayload template) {
        OrderPaymentStateChangedMessagePayloadBuilder builder = new OrderPaymentStateChangedMessagePayloadBuilder();
        builder.paymentState = template.getPaymentState();
        builder.oldPaymentState = template.getOldPaymentState();
        return builder;
    }

}
