
package com.commercetools.api.models.order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetReturnPaymentStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetReturnPaymentStateAction orderSetReturnPaymentStateAction = OrderSetReturnPaymentStateAction.builder()
 *             .returnItemId("{returnItemId}")
 *             .paymentState(ReturnPaymentState.NON_REFUNDABLE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetReturnPaymentStateActionBuilder implements Builder<OrderSetReturnPaymentStateAction> {

    private String returnItemId;

    private com.commercetools.api.models.order.ReturnPaymentState paymentState;

    /**
     *
     * @param returnItemId value to be set
     * @return Builder
     */

    public OrderSetReturnPaymentStateActionBuilder returnItemId(final String returnItemId) {
        this.returnItemId = returnItemId;
        return this;
    }

    /**
     *
     * @param paymentState value to be set
     * @return Builder
     */

    public OrderSetReturnPaymentStateActionBuilder paymentState(
            final com.commercetools.api.models.order.ReturnPaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    public String getReturnItemId() {
        return this.returnItemId;
    }

    public com.commercetools.api.models.order.ReturnPaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
     * builds OrderSetReturnPaymentStateAction with checking for non-null required values
     * @return OrderSetReturnPaymentStateAction
     */
    public OrderSetReturnPaymentStateAction build() {
        Objects.requireNonNull(returnItemId, OrderSetReturnPaymentStateAction.class + ": returnItemId is missing");
        Objects.requireNonNull(paymentState, OrderSetReturnPaymentStateAction.class + ": paymentState is missing");
        return new OrderSetReturnPaymentStateActionImpl(returnItemId, paymentState);
    }

    /**
     * builds OrderSetReturnPaymentStateAction without checking for non-null required values
     * @return OrderSetReturnPaymentStateAction
     */
    public OrderSetReturnPaymentStateAction buildUnchecked() {
        return new OrderSetReturnPaymentStateActionImpl(returnItemId, paymentState);
    }

    public static OrderSetReturnPaymentStateActionBuilder of() {
        return new OrderSetReturnPaymentStateActionBuilder();
    }

    public static OrderSetReturnPaymentStateActionBuilder of(final OrderSetReturnPaymentStateAction template) {
        OrderSetReturnPaymentStateActionBuilder builder = new OrderSetReturnPaymentStateActionBuilder();
        builder.returnItemId = template.getReturnItemId();
        builder.paymentState = template.getPaymentState();
        return builder;
    }

}
