package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetExternalIdAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetExternalIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetExternalIdAction customerSetExternalIdAction = CustomerSetExternalIdAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerSetExternalIdActionBuilder implements Builder<CustomerSetExternalIdAction> {

    
    @Nullable
    private String externalId;

    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param externalId value to be set
     * @return Builder
     */
    
    public CustomerSetExternalIdActionBuilder externalId(@Nullable final String externalId) {
        this.externalId = externalId;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return externalId
     */
    
    @Nullable
    public String getExternalId(){
        return this.externalId;
    }

    /**
     * builds CustomerSetExternalIdAction with checking for non-null required values
     * @return CustomerSetExternalIdAction
     */
    public CustomerSetExternalIdAction build() {
        return new CustomerSetExternalIdActionImpl(externalId);
    }
    
    /**
     * builds CustomerSetExternalIdAction without checking for non-null required values
     * @return CustomerSetExternalIdAction
     */
    public CustomerSetExternalIdAction buildUnchecked() {
        return new CustomerSetExternalIdActionImpl(externalId);
    }

    /**
     * factory method for an instance of CustomerSetExternalIdActionBuilder
     * @return builder 
     */
    public static CustomerSetExternalIdActionBuilder of() {
        return new CustomerSetExternalIdActionBuilder();
    }

    /**
     * create builder for CustomerSetExternalIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetExternalIdActionBuilder of(final CustomerSetExternalIdAction template) {
        CustomerSetExternalIdActionBuilder builder = new CustomerSetExternalIdActionBuilder();
        builder.externalId = template.getExternalId();
        return builder;
    }

}
