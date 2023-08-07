
package com.commercetools.api.models.order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderChangePaymentStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderChangePaymentStateAction orderChangePaymentStateAction = OrderChangePaymentStateAction.builder()
 *             .paymentState(PaymentState.BALANCE_DUE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderChangePaymentStateActionBuilder implements Builder<OrderChangePaymentStateAction> {

    private com.commercetools.api.models.order.PaymentState paymentState;

    /**
     *  <p>New payment status of the Order.</p>
     * @param paymentState value to be set
     * @return Builder
     */

    public OrderChangePaymentStateActionBuilder paymentState(
            final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    /**
     *  <p>New payment status of the Order.</p>
     * @return paymentState
     */

    public com.commercetools.api.models.order.PaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
     * builds OrderChangePaymentStateAction with checking for non-null required values
     * @return OrderChangePaymentStateAction
     */
    public OrderChangePaymentStateAction build() {
        Objects.requireNonNull(paymentState, OrderChangePaymentStateAction.class + ": paymentState is missing");
        return new OrderChangePaymentStateActionImpl(paymentState);
    }

    /**
     * builds OrderChangePaymentStateAction without checking for non-null required values
     * @return OrderChangePaymentStateAction
     */
    public OrderChangePaymentStateAction buildUnchecked() {
        return new OrderChangePaymentStateActionImpl(paymentState);
    }

    /**
     * factory method for an instance of OrderChangePaymentStateActionBuilder
     * @return builder
     */
    public static OrderChangePaymentStateActionBuilder of() {
        return new OrderChangePaymentStateActionBuilder();
    }

    /**
     * create builder for OrderChangePaymentStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderChangePaymentStateActionBuilder of(final OrderChangePaymentStateAction template) {
        OrderChangePaymentStateActionBuilder builder = new OrderChangePaymentStateActionBuilder();
        builder.paymentState = template.getPaymentState();
        return builder;
    }

}
