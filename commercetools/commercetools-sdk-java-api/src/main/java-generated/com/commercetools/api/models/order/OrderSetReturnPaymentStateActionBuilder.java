package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.ReturnPaymentState;
import com.commercetools.api.models.order.OrderSetReturnPaymentStateAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSetReturnPaymentStateActionBuilder implements Builder<OrderSetReturnPaymentStateAction> {

    
    
    private String returnItemId;
    
    
    
    private com.commercetools.api.models.order.ReturnPaymentState paymentState;

    
    /**
     * set the value to the returnItemId
     * @param returnItemId value to be set
     * @return Builder
     */
    
    public OrderSetReturnPaymentStateActionBuilder returnItemId( final String returnItemId) {
        this.returnItemId = returnItemId;
        return this;
    }
    
    
    
    
    /**
     * set the value to the paymentState
     * @param paymentState value to be set
     * @return Builder
     */
    
    public OrderSetReturnPaymentStateActionBuilder paymentState( final com.commercetools.api.models.order.ReturnPaymentState paymentState) {
        this.paymentState = paymentState;
        return this;
    }
    
    

    /**
     * value of returnItemId}
     * @return returnItemId
     */
    
    
    public String getReturnItemId(){
        return this.returnItemId;
    }
    
    /**
     * value of paymentState}
     * @return paymentState
     */
    
    
    public com.commercetools.api.models.order.ReturnPaymentState getPaymentState(){
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
        builder.paymentState = template.getPaymentState();
        return builder;
    }

}
