package com.commercetools.history.models.label;

import com.commercetools.history.models.label.Label;
import com.commercetools.history.models.label.CustomerLabel;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerLabelBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerLabel customerLabel = CustomerLabel.builder()
 *             .firstName("{firstName}")
 *             .lastName("{lastName}")
 *             .customerNumber("{customerNumber}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerLabelBuilder implements Builder<CustomerLabel> {

    
    
    private String firstName;
    
    
    
    private String lastName;
    
    
    
    private String customerNumber;

    
    /**
     * set the value to the firstName
     * @param firstName value to be set
     * @return Builder
     */
    
    public CustomerLabelBuilder firstName( final String firstName) {
        this.firstName = firstName;
        return this;
    }
    
    
    
    
    /**
     * set the value to the lastName
     * @param lastName value to be set
     * @return Builder
     */
    
    public CustomerLabelBuilder lastName( final String lastName) {
        this.lastName = lastName;
        return this;
    }
    
    
    
    
    /**
     * set the value to the customerNumber
     * @param customerNumber value to be set
     * @return Builder
     */
    
    public CustomerLabelBuilder customerNumber( final String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }
    
    

    /**
     * value of firstName}
     * @return firstName
     */
    
    
    public String getFirstName(){
        return this.firstName;
    }
    
    /**
     * value of lastName}
     * @return lastName
     */
    
    
    public String getLastName(){
        return this.lastName;
    }
    
    /**
     * value of customerNumber}
     * @return customerNumber
     */
    
    
    public String getCustomerNumber(){
        return this.customerNumber;
    }

    /**
     * builds CustomerLabel with checking for non-null required values
     * @return CustomerLabel
     */
    public CustomerLabel build() {
        Objects.requireNonNull(firstName, CustomerLabel.class + ": firstName is missing");
        Objects.requireNonNull(lastName, CustomerLabel.class + ": lastName is missing");
        Objects.requireNonNull(customerNumber, CustomerLabel.class + ": customerNumber is missing");
        return new CustomerLabelImpl(firstName, lastName, customerNumber);
    }
    
    /**
     * builds CustomerLabel without checking for non-null required values
     * @return CustomerLabel
     */
    public CustomerLabel buildUnchecked() {
        return new CustomerLabelImpl(firstName, lastName, customerNumber);
    }

    /**
     * factory method for an instance of CustomerLabelBuilder
     * @return builder 
     */
    public static CustomerLabelBuilder of() {
        return new CustomerLabelBuilder();
    }

    /**
     * create builder for CustomerLabel instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerLabelBuilder of(final CustomerLabel template) {
        CustomerLabelBuilder builder = new CustomerLabelBuilder();
        builder.firstName = template.getFirstName();
        builder.lastName = template.getLastName();
        builder.customerNumber = template.getCustomerNumber();
        return builder;
    }

}
