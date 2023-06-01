package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetVatIdAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetVatIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetVatIdAction customerSetVatIdAction = CustomerSetVatIdAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerSetVatIdActionBuilder implements Builder<CustomerSetVatIdAction> {

    
    @Nullable
    private String vatId;

    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param vatId value to be set
     * @return Builder
     */
    
    public CustomerSetVatIdActionBuilder vatId(@Nullable final String vatId) {
        this.vatId = vatId;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return vatId
     */
    
    @Nullable
    public String getVatId(){
        return this.vatId;
    }

    /**
     * builds CustomerSetVatIdAction with checking for non-null required values
     * @return CustomerSetVatIdAction
     */
    public CustomerSetVatIdAction build() {
        return new CustomerSetVatIdActionImpl(vatId);
    }
    
    /**
     * builds CustomerSetVatIdAction without checking for non-null required values
     * @return CustomerSetVatIdAction
     */
    public CustomerSetVatIdAction buildUnchecked() {
        return new CustomerSetVatIdActionImpl(vatId);
    }

    /**
     * factory method for an instance of CustomerSetVatIdActionBuilder
     * @return builder 
     */
    public static CustomerSetVatIdActionBuilder of() {
        return new CustomerSetVatIdActionBuilder();
    }

    /**
     * create builder for CustomerSetVatIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetVatIdActionBuilder of(final CustomerSetVatIdAction template) {
        CustomerSetVatIdActionBuilder builder = new CustomerSetVatIdActionBuilder();
        builder.vatId = template.getVatId();
        return builder;
    }

}
