package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.OrderState;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderChangeOrderStateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderChangeOrderStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderChangeOrderStateAction stagedOrderChangeOrderStateAction = StagedOrderChangeOrderStateAction.builder()
 *             .orderState(OrderState.OPEN)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderChangeOrderStateActionBuilder implements Builder<StagedOrderChangeOrderStateAction> {

    
    
    private com.commercetools.api.models.order.OrderState orderState;

    
    /**
     * set the value to the orderState
     * @param orderState value to be set
     * @return Builder
     */
    
    public StagedOrderChangeOrderStateActionBuilder orderState( final com.commercetools.api.models.order.OrderState orderState) {
        this.orderState = orderState;
        return this;
    }
    
    

    /**
     * value of orderState}
     * @return orderState
     */
    
    
    public com.commercetools.api.models.order.OrderState getOrderState(){
        return this.orderState;
    }

    /**
     * builds StagedOrderChangeOrderStateAction with checking for non-null required values
     * @return StagedOrderChangeOrderStateAction
     */
    public StagedOrderChangeOrderStateAction build() {
        Objects.requireNonNull(orderState, StagedOrderChangeOrderStateAction.class + ": orderState is missing");
        return new StagedOrderChangeOrderStateActionImpl(orderState);
    }
    
    /**
     * builds StagedOrderChangeOrderStateAction without checking for non-null required values
     * @return StagedOrderChangeOrderStateAction
     */
    public StagedOrderChangeOrderStateAction buildUnchecked() {
        return new StagedOrderChangeOrderStateActionImpl(orderState);
    }

    /**
     * factory method for an instance of StagedOrderChangeOrderStateActionBuilder
     * @return builder 
     */
    public static StagedOrderChangeOrderStateActionBuilder of() {
        return new StagedOrderChangeOrderStateActionBuilder();
    }

    /**
     * create builder for StagedOrderChangeOrderStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderChangeOrderStateActionBuilder of(final StagedOrderChangeOrderStateAction template) {
        StagedOrderChangeOrderStateActionBuilder builder = new StagedOrderChangeOrderStateActionBuilder();
        builder.orderState = template.getOrderState();
        return builder;
    }

}
