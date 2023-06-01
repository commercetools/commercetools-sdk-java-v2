package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerSetCompanyNameAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerSetCompanyNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerSetCompanyNameAction myCustomerSetCompanyNameAction = MyCustomerSetCompanyNameAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyCustomerSetCompanyNameActionBuilder implements Builder<MyCustomerSetCompanyNameAction> {

    
    @Nullable
    private String companyName;

    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param companyName value to be set
     * @return Builder
     */
    
    public MyCustomerSetCompanyNameActionBuilder companyName(@Nullable final String companyName) {
        this.companyName = companyName;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return companyName
     */
    
    @Nullable
    public String getCompanyName(){
        return this.companyName;
    }

    /**
     * builds MyCustomerSetCompanyNameAction with checking for non-null required values
     * @return MyCustomerSetCompanyNameAction
     */
    public MyCustomerSetCompanyNameAction build() {
        return new MyCustomerSetCompanyNameActionImpl(companyName);
    }
    
    /**
     * builds MyCustomerSetCompanyNameAction without checking for non-null required values
     * @return MyCustomerSetCompanyNameAction
     */
    public MyCustomerSetCompanyNameAction buildUnchecked() {
        return new MyCustomerSetCompanyNameActionImpl(companyName);
    }

    /**
     * factory method for an instance of MyCustomerSetCompanyNameActionBuilder
     * @return builder 
     */
    public static MyCustomerSetCompanyNameActionBuilder of() {
        return new MyCustomerSetCompanyNameActionBuilder();
    }

    /**
     * create builder for MyCustomerSetCompanyNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerSetCompanyNameActionBuilder of(final MyCustomerSetCompanyNameAction template) {
        MyCustomerSetCompanyNameActionBuilder builder = new MyCustomerSetCompanyNameActionBuilder();
        builder.companyName = template.getCompanyName();
        return builder;
    }

}
