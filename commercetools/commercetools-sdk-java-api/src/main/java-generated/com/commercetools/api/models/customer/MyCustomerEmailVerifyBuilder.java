package com.commercetools.api.models.customer;


import com.commercetools.api.models.customer.MyCustomerEmailVerify;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCustomerEmailVerifyBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerEmailVerify myCustomerEmailVerify = MyCustomerEmailVerify.builder()
 *             .tokenValue("{tokenValue}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MyCustomerEmailVerifyBuilder implements Builder<MyCustomerEmailVerify> {

    
    
    private String tokenValue;

    
    /**
     *  <p>Value of the token to verify Customer email.</p>
     * @param tokenValue value to be set
     * @return Builder
     */
    
    public MyCustomerEmailVerifyBuilder tokenValue( final String tokenValue) {
        this.tokenValue = tokenValue;
        return this;
    }
    
    

    /**
     *  <p>Value of the token to verify Customer email.</p>
     * @return tokenValue
     */
    
    
    public String getTokenValue(){
        return this.tokenValue;
    }

    /**
     * builds MyCustomerEmailVerify with checking for non-null required values
     * @return MyCustomerEmailVerify
     */
    public MyCustomerEmailVerify build() {
        Objects.requireNonNull(tokenValue, MyCustomerEmailVerify.class + ": tokenValue is missing");
        return new MyCustomerEmailVerifyImpl(tokenValue);
    }
    
    /**
     * builds MyCustomerEmailVerify without checking for non-null required values
     * @return MyCustomerEmailVerify
     */
    public MyCustomerEmailVerify buildUnchecked() {
        return new MyCustomerEmailVerifyImpl(tokenValue);
    }

    /**
     * factory method for an instance of MyCustomerEmailVerifyBuilder
     * @return builder 
     */
    public static MyCustomerEmailVerifyBuilder of() {
        return new MyCustomerEmailVerifyBuilder();
    }

    /**
     * create builder for MyCustomerEmailVerify instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerEmailVerifyBuilder of(final MyCustomerEmailVerify template) {
        MyCustomerEmailVerifyBuilder builder = new MyCustomerEmailVerifyBuilder();
        builder.tokenValue = template.getTokenValue();
        return builder;
    }

}
