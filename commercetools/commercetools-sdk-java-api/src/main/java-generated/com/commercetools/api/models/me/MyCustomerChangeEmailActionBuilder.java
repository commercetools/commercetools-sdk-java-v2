package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyCustomerUpdateAction;
import com.commercetools.api.models.me.MyCustomerChangeEmailAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerChangeEmailActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerChangeEmailAction myCustomerChangeEmailAction = MyCustomerChangeEmailAction.builder()
 *             .email("{email}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyCustomerChangeEmailActionBuilder implements Builder<MyCustomerChangeEmailAction> {

    
    
    private String email;

    
    /**
     *  <p>New value to set.</p>
     * @param email value to be set
     * @return Builder
     */
    
    public MyCustomerChangeEmailActionBuilder email( final String email) {
        this.email = email;
        return this;
    }
    
    

    /**
     *  <p>New value to set.</p>
     * @return email
     */
    
    
    public String getEmail(){
        return this.email;
    }

    /**
     * builds MyCustomerChangeEmailAction with checking for non-null required values
     * @return MyCustomerChangeEmailAction
     */
    public MyCustomerChangeEmailAction build() {
        Objects.requireNonNull(email, MyCustomerChangeEmailAction.class + ": email is missing");
        return new MyCustomerChangeEmailActionImpl(email);
    }
    
    /**
     * builds MyCustomerChangeEmailAction without checking for non-null required values
     * @return MyCustomerChangeEmailAction
     */
    public MyCustomerChangeEmailAction buildUnchecked() {
        return new MyCustomerChangeEmailActionImpl(email);
    }

    /**
     * factory method for an instance of MyCustomerChangeEmailActionBuilder
     * @return builder 
     */
    public static MyCustomerChangeEmailActionBuilder of() {
        return new MyCustomerChangeEmailActionBuilder();
    }

    /**
     * create builder for MyCustomerChangeEmailAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerChangeEmailActionBuilder of(final MyCustomerChangeEmailAction template) {
        MyCustomerChangeEmailActionBuilder builder = new MyCustomerChangeEmailActionBuilder();
        builder.email = template.getEmail();
        return builder;
    }

}
