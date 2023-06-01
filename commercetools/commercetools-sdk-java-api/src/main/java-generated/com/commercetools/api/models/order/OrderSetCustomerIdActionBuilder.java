package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderSetCustomerIdAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetCustomerIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetCustomerIdAction orderSetCustomerIdAction = OrderSetCustomerIdAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSetCustomerIdActionBuilder implements Builder<OrderSetCustomerIdAction> {

    
    @Nullable
    private String customerId;

    
    /**
     * set the value to the customerId
     * @param customerId value to be set
     * @return Builder
     */
    
    public OrderSetCustomerIdActionBuilder customerId(@Nullable final String customerId) {
        this.customerId = customerId;
        return this;
    }
    
    

    /**
     * value of customerId}
     * @return customerId
     */
    
    @Nullable
    public String getCustomerId(){
        return this.customerId;
    }

    /**
     * builds OrderSetCustomerIdAction with checking for non-null required values
     * @return OrderSetCustomerIdAction
     */
    public OrderSetCustomerIdAction build() {
        return new OrderSetCustomerIdActionImpl(customerId);
    }
    
    /**
     * builds OrderSetCustomerIdAction without checking for non-null required values
     * @return OrderSetCustomerIdAction
     */
    public OrderSetCustomerIdAction buildUnchecked() {
        return new OrderSetCustomerIdActionImpl(customerId);
    }

    /**
     * factory method for an instance of OrderSetCustomerIdActionBuilder
     * @return builder 
     */
    public static OrderSetCustomerIdActionBuilder of() {
        return new OrderSetCustomerIdActionBuilder();
    }

    /**
     * create builder for OrderSetCustomerIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetCustomerIdActionBuilder of(final OrderSetCustomerIdAction template) {
        OrderSetCustomerIdActionBuilder builder = new OrderSetCustomerIdActionBuilder();
        builder.customerId = template.getCustomerId();
        return builder;
    }

}
