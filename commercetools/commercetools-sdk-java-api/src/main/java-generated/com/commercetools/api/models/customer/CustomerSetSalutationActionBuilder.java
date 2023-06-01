package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetSalutationAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetSalutationActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetSalutationAction customerSetSalutationAction = CustomerSetSalutationAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerSetSalutationActionBuilder implements Builder<CustomerSetSalutationAction> {

    
    @Nullable
    private String salutation;

    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param salutation value to be set
     * @return Builder
     */
    
    public CustomerSetSalutationActionBuilder salutation(@Nullable final String salutation) {
        this.salutation = salutation;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return salutation
     */
    
    @Nullable
    public String getSalutation(){
        return this.salutation;
    }

    /**
     * builds CustomerSetSalutationAction with checking for non-null required values
     * @return CustomerSetSalutationAction
     */
    public CustomerSetSalutationAction build() {
        return new CustomerSetSalutationActionImpl(salutation);
    }
    
    /**
     * builds CustomerSetSalutationAction without checking for non-null required values
     * @return CustomerSetSalutationAction
     */
    public CustomerSetSalutationAction buildUnchecked() {
        return new CustomerSetSalutationActionImpl(salutation);
    }

    /**
     * factory method for an instance of CustomerSetSalutationActionBuilder
     * @return builder 
     */
    public static CustomerSetSalutationActionBuilder of() {
        return new CustomerSetSalutationActionBuilder();
    }

    /**
     * create builder for CustomerSetSalutationAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetSalutationActionBuilder of(final CustomerSetSalutationAction template) {
        CustomerSetSalutationActionBuilder builder = new CustomerSetSalutationActionBuilder();
        builder.salutation = template.getSalutation();
        return builder;
    }

}
