package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.customer.CustomerSetCustomerGroupAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetCustomerGroupActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetCustomerGroupAction customerSetCustomerGroupAction = CustomerSetCustomerGroupAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerSetCustomerGroupActionBuilder implements Builder<CustomerSetCustomerGroupAction> {

    
    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */
    
    public CustomerSetCustomerGroupActionBuilder customerGroup(Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder> builder) {
        this.customerGroup = builder.apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */
    
    public CustomerSetCustomerGroupActionBuilder withCustomerGroup(Function<com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder, com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier> builder) {
        this.customerGroup = builder.apply(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param customerGroup value to be set
     * @return Builder
     */
    
    public CustomerSetCustomerGroupActionBuilder customerGroup(@Nullable final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return customerGroup
     */
    
    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup(){
        return this.customerGroup;
    }

    /**
     * builds CustomerSetCustomerGroupAction with checking for non-null required values
     * @return CustomerSetCustomerGroupAction
     */
    public CustomerSetCustomerGroupAction build() {
        return new CustomerSetCustomerGroupActionImpl(customerGroup);
    }
    
    /**
     * builds CustomerSetCustomerGroupAction without checking for non-null required values
     * @return CustomerSetCustomerGroupAction
     */
    public CustomerSetCustomerGroupAction buildUnchecked() {
        return new CustomerSetCustomerGroupActionImpl(customerGroup);
    }

    /**
     * factory method for an instance of CustomerSetCustomerGroupActionBuilder
     * @return builder 
     */
    public static CustomerSetCustomerGroupActionBuilder of() {
        return new CustomerSetCustomerGroupActionBuilder();
    }

    /**
     * create builder for CustomerSetCustomerGroupAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetCustomerGroupActionBuilder of(final CustomerSetCustomerGroupAction template) {
        CustomerSetCustomerGroupActionBuilder builder = new CustomerSetCustomerGroupActionBuilder();
        builder.customerGroup = template.getCustomerGroup();
        return builder;
    }

}
