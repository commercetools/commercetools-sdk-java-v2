package com.commercetools.api.models.customer_group;

import com.commercetools.api.models.customer_group.CustomerGroupUpdateAction;
import com.commercetools.api.models.customer_group.CustomerGroupSetKeyAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerGroupSetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupSetKeyAction customerGroupSetKeyAction = CustomerGroupSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerGroupSetKeyActionBuilder implements Builder<CustomerGroupSetKeyAction> {

    
    @Nullable
    private String key;

    
    /**
     *  <p>If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     * @param key value to be set
     * @return Builder
     */
    
    public CustomerGroupSetKeyActionBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }
    
    

    /**
     *  <p>If <code>key</code> is absent or <code>null</code>, the existing key, if any, will be removed.</p>
     * @return key
     */
    
    @Nullable
    public String getKey(){
        return this.key;
    }

    /**
     * builds CustomerGroupSetKeyAction with checking for non-null required values
     * @return CustomerGroupSetKeyAction
     */
    public CustomerGroupSetKeyAction build() {
        return new CustomerGroupSetKeyActionImpl(key);
    }
    
    /**
     * builds CustomerGroupSetKeyAction without checking for non-null required values
     * @return CustomerGroupSetKeyAction
     */
    public CustomerGroupSetKeyAction buildUnchecked() {
        return new CustomerGroupSetKeyActionImpl(key);
    }

    /**
     * factory method for an instance of CustomerGroupSetKeyActionBuilder
     * @return builder 
     */
    public static CustomerGroupSetKeyActionBuilder of() {
        return new CustomerGroupSetKeyActionBuilder();
    }

    /**
     * create builder for CustomerGroupSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupSetKeyActionBuilder of(final CustomerGroupSetKeyAction template) {
        CustomerGroupSetKeyActionBuilder builder = new CustomerGroupSetKeyActionBuilder();
        builder.key = template.getKey();
        return builder;
    }

}
