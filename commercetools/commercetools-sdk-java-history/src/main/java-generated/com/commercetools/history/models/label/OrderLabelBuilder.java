package com.commercetools.history.models.label;

import com.commercetools.history.models.label.Label;
import com.commercetools.history.models.label.OrderLabel;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderLabelBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderLabel orderLabel = OrderLabel.builder()
 *             .customerEmail("{customerEmail}")
 *             .orderNumber("{orderNumber}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderLabelBuilder implements Builder<OrderLabel> {

    
    
    private String customerEmail;
    
    
    
    private String orderNumber;

    
    /**
     * set the value to the customerEmail
     * @param customerEmail value to be set
     * @return Builder
     */
    
    public OrderLabelBuilder customerEmail( final String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }
    
    
    
    
    /**
     * set the value to the orderNumber
     * @param orderNumber value to be set
     * @return Builder
     */
    
    public OrderLabelBuilder orderNumber( final String orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }
    
    

    /**
     * value of customerEmail}
     * @return customerEmail
     */
    
    
    public String getCustomerEmail(){
        return this.customerEmail;
    }
    
    /**
     * value of orderNumber}
     * @return orderNumber
     */
    
    
    public String getOrderNumber(){
        return this.orderNumber;
    }

    /**
     * builds OrderLabel with checking for non-null required values
     * @return OrderLabel
     */
    public OrderLabel build() {
        Objects.requireNonNull(customerEmail, OrderLabel.class + ": customerEmail is missing");
        Objects.requireNonNull(orderNumber, OrderLabel.class + ": orderNumber is missing");
        return new OrderLabelImpl(customerEmail, orderNumber);
    }
    
    /**
     * builds OrderLabel without checking for non-null required values
     * @return OrderLabel
     */
    public OrderLabel buildUnchecked() {
        return new OrderLabelImpl(customerEmail, orderNumber);
    }

    /**
     * factory method for an instance of OrderLabelBuilder
     * @return builder 
     */
    public static OrderLabelBuilder of() {
        return new OrderLabelBuilder();
    }

    /**
     * create builder for OrderLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderLabelBuilder of(final OrderLabel template) {
        OrderLabelBuilder builder = new OrderLabelBuilder();
        builder.customerEmail = template.getCustomerEmail();
        builder.orderNumber = template.getOrderNumber();
        return builder;
    }

}
