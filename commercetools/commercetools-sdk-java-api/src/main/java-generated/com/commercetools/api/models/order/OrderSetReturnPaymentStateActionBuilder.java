
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetReturnPaymentStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetReturnPaymentStateAction orderSetReturnPaymentStateAction = OrderSetReturnPaymentStateAction.builder()
 *             .paymentState(ReturnPaymentState.NON_REFUNDABLE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetReturnPaymentStateActionBuilder implements Builder<OrderSetReturnPaymentStateAction> {

    @Nullable
    private String returnItemId;

    @Nullable
    private String returnItemKey;

    private com.commercetools.api.models.order.ReturnPaymentState paymentState;

    /**
     *  <p><code>id</code> of the ReturnItem to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @param returnItemId value to be set
     * @return Builder
     */

    public OrderSetReturnPaymentStateActionBuilder returnItemId(@Nullable final String returnItemId) {
        this.returnItemId = returnItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the ReturnItem to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @param returnItemKey value to be set
     * @return Builder
     */

    public OrderSetReturnPaymentStateActionBuilder returnItemKey(@Nullable final String returnItemKey) {
        this.returnItemKey = returnItemKey;
        return this;
    }

    /**
     *  <p>New Payment status of the ReturnItem.</p>
     * @param paymentState value to be set
     * @return Builder
     */

    public OrderSetReturnPaymentStateActionBuilder paymentState(
            final com.commercetools.api.models.order.ReturnPaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    /**
     *  <p><code>id</code> of the ReturnItem to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @return returnItemId
     */

    @Nullable
    public String getReturnItemId() {
        return this.returnItemId;
    }

    /**
     *  <p><code>key</code> of the ReturnItem to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @return returnItemKey
     */

    @Nullable
    public String getReturnItemKey() {
        return this.returnItemKey;
    }

    /**
     *  <p>New Payment status of the ReturnItem.</p>
     * @return paymentState
     */

    public com.commercetools.api.models.order.ReturnPaymentState getPaymentState() {
        return this.paymentState;
    }

    /**
     * builds OrderSetReturnPaymentStateAction with checking for non-null required values
     * @return OrderSetReturnPaymentStateAction
     */
    public OrderSetReturnPaymentStateAction build() {
        Objects.requireNonNull(paymentState, OrderSetReturnPaymentStateAction.class + ": paymentState is missing");
        return new OrderSetReturnPaymentStateActionImpl(returnItemId, returnItemKey, paymentState);
    }

    /**
     * builds OrderSetReturnPaymentStateAction without checking for non-null required values
     * @return OrderSetReturnPaymentStateAction
     */
    public OrderSetReturnPaymentStateAction buildUnchecked() {
        return new OrderSetReturnPaymentStateActionImpl(returnItemId, returnItemKey, paymentState);
    }

    /**
     * factory method for an instance of OrderSetReturnPaymentStateActionBuilder
     * @return builder
     */
    public static OrderSetReturnPaymentStateActionBuilder of() {
        return new OrderSetReturnPaymentStateActionBuilder();
    }

    /**
     * create builder for OrderSetReturnPaymentStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetReturnPaymentStateActionBuilder of(final OrderSetReturnPaymentStateAction template) {
        OrderSetReturnPaymentStateActionBuilder builder = new OrderSetReturnPaymentStateActionBuilder();
        builder.returnItemId = template.getReturnItemId();
        builder.returnItemKey = template.getReturnItemKey();
        builder.paymentState = template.getPaymentState();
        return builder;
    }

}
