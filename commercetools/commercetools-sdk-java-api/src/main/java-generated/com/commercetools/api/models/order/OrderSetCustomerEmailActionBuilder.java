package com.commercetools.api.models.order;

import com.commercetools.api.models.order.OrderUpdateAction;
import com.commercetools.api.models.order.OrderSetCustomerEmailAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetCustomerEmailActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetCustomerEmailAction orderSetCustomerEmailAction = OrderSetCustomerEmailAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderSetCustomerEmailActionBuilder implements Builder<OrderSetCustomerEmailAction> {

    
    @Nullable
    private String email;

    
    /**
     * set the value to the email
     * @param email value to be set
     * @return Builder
     */
    
    public OrderSetCustomerEmailActionBuilder email(@Nullable final String email) {
        this.email = email;
        return this;
    }
    
    

    /**
     * value of email}
     * @return email
     */
    
    @Nullable
    public String getEmail(){
        return this.email;
    }

    /**
     * builds OrderSetCustomerEmailAction with checking for non-null required values
     * @return OrderSetCustomerEmailAction
     */
    public OrderSetCustomerEmailAction build() {
        return new OrderSetCustomerEmailActionImpl(email);
    }
    
    /**
     * builds OrderSetCustomerEmailAction without checking for non-null required values
     * @return OrderSetCustomerEmailAction
     */
    public OrderSetCustomerEmailAction buildUnchecked() {
        return new OrderSetCustomerEmailActionImpl(email);
    }

    /**
     * factory method for an instance of OrderSetCustomerEmailActionBuilder
     * @return builder 
     */
    public static OrderSetCustomerEmailActionBuilder of() {
        return new OrderSetCustomerEmailActionBuilder();
    }

    /**
     * create builder for OrderSetCustomerEmailAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetCustomerEmailActionBuilder of(final OrderSetCustomerEmailAction template) {
        OrderSetCustomerEmailActionBuilder builder = new OrderSetCustomerEmailActionBuilder();
        builder.email = template.getEmail();
        return builder;
    }

}
