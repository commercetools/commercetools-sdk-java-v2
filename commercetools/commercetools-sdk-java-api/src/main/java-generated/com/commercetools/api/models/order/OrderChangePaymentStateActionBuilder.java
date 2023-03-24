
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderChangePaymentStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderChangePaymentStateAction orderChangePaymentStateAction = OrderChangePaymentStateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderChangePaymentStateActionBuilder implements Builder<OrderChangePaymentStateAction> {

    @Nullable
    private com.commercetools.api.models.order.PaymentState paymentState;

    /**
     *
     * @param paymentState value to be set
     * @return Builder
     */

    public OrderChangePaymentStateActionBuilder paymentState(
            @Nullable final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.order.PaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
     * builds OrderChangePaymentStateAction with checking for non-null required values
     * @return OrderChangePaymentStateAction
     */
    public OrderChangePaymentStateAction build() {
        return new OrderChangePaymentStateActionImpl(paymentState);
    }

    /**
     * builds OrderChangePaymentStateAction without checking for non-null required values
     * @return OrderChangePaymentStateAction
     */
    public OrderChangePaymentStateAction buildUnchecked() {
        return new OrderChangePaymentStateActionImpl(paymentState);
    }

    public static OrderChangePaymentStateActionBuilder of() {
        return new OrderChangePaymentStateActionBuilder();
    }

    public static OrderChangePaymentStateActionBuilder of(final OrderChangePaymentStateAction template) {
        OrderChangePaymentStateActionBuilder builder = new OrderChangePaymentStateActionBuilder();
        builder.paymentState = template.getPaymentState();
        return builder;
    }

}
