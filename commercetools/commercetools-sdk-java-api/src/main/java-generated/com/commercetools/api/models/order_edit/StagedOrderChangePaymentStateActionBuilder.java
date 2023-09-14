
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderChangePaymentStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderChangePaymentStateAction stagedOrderChangePaymentStateAction = StagedOrderChangePaymentStateAction.builder()
 *             .paymentState(PaymentState.BALANCE_DUE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderChangePaymentStateActionBuilder implements Builder<StagedOrderChangePaymentStateAction> {

    private com.commercetools.api.models.order.PaymentState paymentState;

    /**
     *  <p>New payment status of the Order.</p>
     * @param paymentState value to be set
     * @return Builder
     */

    public StagedOrderChangePaymentStateActionBuilder paymentState(
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
     * builds StagedOrderChangePaymentStateAction with checking for non-null required values
     * @return StagedOrderChangePaymentStateAction
     */
    public StagedOrderChangePaymentStateAction build() {
        Objects.requireNonNull(paymentState, StagedOrderChangePaymentStateAction.class + ": paymentState is missing");
        return new StagedOrderChangePaymentStateActionImpl(paymentState);
    }

    /**
     * builds StagedOrderChangePaymentStateAction without checking for non-null required values
     * @return StagedOrderChangePaymentStateAction
     */
    public StagedOrderChangePaymentStateAction buildUnchecked() {
        return new StagedOrderChangePaymentStateActionImpl(paymentState);
    }

    /**
     * factory method for an instance of StagedOrderChangePaymentStateActionBuilder
     * @return builder
     */
    public static StagedOrderChangePaymentStateActionBuilder of() {
        return new StagedOrderChangePaymentStateActionBuilder();
    }

    /**
     * create builder for StagedOrderChangePaymentStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderChangePaymentStateActionBuilder of(final StagedOrderChangePaymentStateAction template) {
        StagedOrderChangePaymentStateActionBuilder builder = new StagedOrderChangePaymentStateActionBuilder();
        builder.paymentState = template.getPaymentState();
        return builder;
    }

}
