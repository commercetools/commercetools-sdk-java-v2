package com.commercetools.api.models.customer;

import com.commercetools.api.models.customer.CustomerUpdateAction;
import com.commercetools.api.models.customer.CustomerSetTitleAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerSetTitleActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerSetTitleAction customerSetTitleAction = CustomerSetTitleAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerSetTitleActionBuilder implements Builder<CustomerSetTitleAction> {

    
    @Nullable
    private String title;

    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param title value to be set
     * @return Builder
     */
    
    public CustomerSetTitleActionBuilder title(@Nullable final String title) {
        this.title = title;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return title
     */
    
    @Nullable
    public String getTitle(){
        return this.title;
    }

    /**
     * builds CustomerSetTitleAction with checking for non-null required values
     * @return CustomerSetTitleAction
     */
    public CustomerSetTitleAction build() {
        return new CustomerSetTitleActionImpl(title);
    }
    
    /**
     * builds CustomerSetTitleAction without checking for non-null required values
     * @return CustomerSetTitleAction
     */
    public CustomerSetTitleAction buildUnchecked() {
        return new CustomerSetTitleActionImpl(title);
    }

    /**
     * factory method for an instance of CustomerSetTitleActionBuilder
     * @return builder 
     */
    public static CustomerSetTitleActionBuilder of() {
        return new CustomerSetTitleActionBuilder();
    }

    /**
     * create builder for CustomerSetTitleAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerSetTitleActionBuilder of(final CustomerSetTitleAction template) {
        CustomerSetTitleActionBuilder builder = new CustomerSetTitleActionBuilder();
        builder.title = template.getTitle();
        return builder;
    }

}
