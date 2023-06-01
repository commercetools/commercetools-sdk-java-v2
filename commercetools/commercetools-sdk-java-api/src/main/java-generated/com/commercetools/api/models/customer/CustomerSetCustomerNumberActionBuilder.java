package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetCustomerNumberAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetCustomerNumberActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetCustomerNumberAction customerSetCustomerNumberAction = CustomerSetCustomerNumberAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerSetCustomerNumberActionBuilder implements Builder<CustomerSetCustomerNumberAction> {

    
    @Nullable
    private String customerNumber;

    
    /**
     *  <p>Value to set. Once set, it cannot be changed.</p>
     * @param customerNumber value to be set
     * @return Builder
     */
    
    public CustomerSetCustomerNumberActionBuilder customerNumber(@Nullable final String customerNumber) {
        this.customerNumber = customerNumber;
        return this;
    }
    
    

    /**
     *  <p>Value to set. Once set, it cannot be changed.</p>
     * @return customerNumber
     */
    
    @Nullable
    public String getCustomerNumber(){
        return this.customerNumber;
    }

    /**
     * builds CustomerSetCustomerNumberAction with checking for non-null required values
     * @return CustomerSetCustomerNumberAction
     */
    public CustomerSetCustomerNumberAction build() {
        return new CustomerSetCustomerNumberActionImpl(customerNumber);
    }
    
    /**
     * builds CustomerSetCustomerNumberAction without checking for non-null required values
     * @return CustomerSetCustomerNumberAction
     */
    public CustomerSetCustomerNumberAction buildUnchecked() {
        return new CustomerSetCustomerNumberActionImpl(customerNumber);
    }

    /**
     * factory method for an instance of CustomerSetCustomerNumberActionBuilder
     * @return builder 
     */
    public static CustomerSetCustomerNumberActionBuilder of() {
        return new CustomerSetCustomerNumberActionBuilder();
    }

    /**
     * create builder for CustomerSetCustomerNumberAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetCustomerNumberActionBuilder of(final CustomerSetCustomerNumberAction template) {
        CustomerSetCustomerNumberActionBuilder builder = new CustomerSetCustomerNumberActionBuilder();
        builder.customerNumber = template.getCustomerNumber();
        return builder;
    }

}
