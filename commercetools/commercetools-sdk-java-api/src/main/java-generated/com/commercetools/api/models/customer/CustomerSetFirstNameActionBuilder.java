package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetFirstNameAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetFirstNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetFirstNameAction customerSetFirstNameAction = CustomerSetFirstNameAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerSetFirstNameActionBuilder implements Builder<CustomerSetFirstNameAction> {

    
    @Nullable
    private String firstName;

    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param firstName value to be set
     * @return Builder
     */
    
    public CustomerSetFirstNameActionBuilder firstName(@Nullable final String firstName) {
        this.firstName = firstName;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return firstName
     */
    
    @Nullable
    public String getFirstName(){
        return this.firstName;
    }

    /**
     * builds CustomerSetFirstNameAction with checking for non-null required values
     * @return CustomerSetFirstNameAction
     */
    public CustomerSetFirstNameAction build() {
        return new CustomerSetFirstNameActionImpl(firstName);
    }
    
    /**
     * builds CustomerSetFirstNameAction without checking for non-null required values
     * @return CustomerSetFirstNameAction
     */
    public CustomerSetFirstNameAction buildUnchecked() {
        return new CustomerSetFirstNameActionImpl(firstName);
    }

    /**
     * factory method for an instance of CustomerSetFirstNameActionBuilder
     * @return builder 
     */
    public static CustomerSetFirstNameActionBuilder of() {
        return new CustomerSetFirstNameActionBuilder();
    }

    /**
     * create builder for CustomerSetFirstNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetFirstNameActionBuilder of(final CustomerSetFirstNameAction template) {
        CustomerSetFirstNameActionBuilder builder = new CustomerSetFirstNameActionBuilder();
        builder.firstName = template.getFirstName();
        return builder;
    }

}
