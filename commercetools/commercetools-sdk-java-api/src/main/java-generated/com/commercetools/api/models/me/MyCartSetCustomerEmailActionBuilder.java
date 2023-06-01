package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCartUpdateAction;
import com.commercetools.api.models.me.MyCartSetCustomerEmailAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartSetCustomerEmailActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetCustomerEmailAction myCartSetCustomerEmailAction = MyCartSetCustomerEmailAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyCartSetCustomerEmailActionBuilder implements Builder<MyCartSetCustomerEmailAction> {

    
    @Nullable
    private String email;

    
    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @param email value to be set
     * @return Builder
     */
    
    public MyCartSetCustomerEmailActionBuilder email(@Nullable final String email) {
        this.email = email;
        return this;
    }
    
    

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     * @return email
     */
    
    @Nullable
    public String getEmail(){
        return this.email;
    }

    /**
     * builds MyCartSetCustomerEmailAction with checking for non-null required values
     * @return MyCartSetCustomerEmailAction
     */
    public MyCartSetCustomerEmailAction build() {
        return new MyCartSetCustomerEmailActionImpl(email);
    }
    
    /**
     * builds MyCartSetCustomerEmailAction without checking for non-null required values
     * @return MyCartSetCustomerEmailAction
     */
    public MyCartSetCustomerEmailAction buildUnchecked() {
        return new MyCartSetCustomerEmailActionImpl(email);
    }

    /**
     * factory method for an instance of MyCartSetCustomerEmailActionBuilder
     * @return builder 
     */
    public static MyCartSetCustomerEmailActionBuilder of() {
        return new MyCartSetCustomerEmailActionBuilder();
    }

    /**
     * create builder for MyCartSetCustomerEmailAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartSetCustomerEmailActionBuilder of(final MyCartSetCustomerEmailAction template) {
        MyCartSetCustomerEmailActionBuilder builder = new MyCartSetCustomerEmailActionBuilder();
        builder.email = template.getEmail();
        return builder;
    }

}
