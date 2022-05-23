
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderChangePaymentStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderChangePaymentStateAction stagedOrderChangePaymentStateAction = StagedOrderChangePaymentStateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderChangePaymentStateActionBuilder implements Builder<StagedOrderChangePaymentStateAction> {

    @Nullable
    private com.commercetools.api.models.order.PaymentState paymentState;

    /**
     <>
     */

    public StagedOrderChangePaymentStateActionBuilder paymentState(
            @Nullable final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.order.PaymentState getPaymentState() {
        return this.paymentState;
    }

    public StagedOrderChangePaymentStateAction build() {
        return new StagedOrderChangePaymentStateActionImpl(paymentState);
    }

    /**
     * builds StagedOrderChangePaymentStateAction without checking for non null required values
     */
    public StagedOrderChangePaymentStateAction buildUnchecked() {
        return new StagedOrderChangePaymentStateActionImpl(paymentState);
    }

    public static StagedOrderChangePaymentStateActionBuilder of() {
        return new StagedOrderChangePaymentStateActionBuilder();
    }

    public static StagedOrderChangePaymentStateActionBuilder of(final StagedOrderChangePaymentStateAction template) {
        StagedOrderChangePaymentStateActionBuilder builder = new StagedOrderChangePaymentStateActionBuilder();
        builder.paymentState = template.getPaymentState();
        return builder;
    }

}
