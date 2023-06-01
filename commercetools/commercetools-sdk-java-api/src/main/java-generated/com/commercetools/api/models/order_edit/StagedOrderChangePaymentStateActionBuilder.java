package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.PaymentState;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderChangePaymentStateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderChangePaymentStateActionBuilder implements Builder<StagedOrderChangePaymentStateAction> {

    
    @Nullable
    private com.commercetools.api.models.order.PaymentState paymentState;

    
    /**
     * set the value to the paymentState
     * @param paymentState value to be set
     * @return Builder
     */
    
    public StagedOrderChangePaymentStateActionBuilder paymentState(@Nullable final com.commercetools.api.models.order.PaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }
    
    

    /**
     * value of paymentState}
     * @return paymentState
     */
    
    @Nullable
    public com.commercetools.api.models.order.PaymentState getPaymentState(){
        return this.paymentState;
    }

    /**
     * builds StagedOrderChangePaymentStateAction with checking for non-null required values
     * @return StagedOrderChangePaymentStateAction
     */
    public StagedOrderChangePaymentStateAction build() {
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
