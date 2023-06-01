package com.commercetools.api.models.customer;


import com.commercetools.api.models.customer.CustomerEmailVerify;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerEmailVerifyBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerEmailVerify customerEmailVerify = CustomerEmailVerify.builder()
 *             .tokenValue("{tokenValue}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerEmailVerifyBuilder implements Builder<CustomerEmailVerify> {

    
    @Nullable
    private Long version;
    
    
    
    private String tokenValue;

    
    /**
     *  <p>Expected version of the Customer.</p>
     * @param version value to be set
     * @return Builder
     */
    
    public CustomerEmailVerifyBuilder version(@Nullable final Long version) {
        this.version = version;
        return this;
    }
    
    
    
    
    /**
     *  <p>Value of the token to verify Customer email.</p>
     * @param tokenValue value to be set
     * @return Builder
     */
    
    public CustomerEmailVerifyBuilder tokenValue( final String tokenValue) {
        this.tokenValue = tokenValue;
        return this;
    }
    
    

    /**
     *  <p>Expected version of the Customer.</p>
     * @return version
     */
    
    @Nullable
    public Long getVersion(){
        return this.version;
    }
    
    /**
     *  <p>Value of the token to verify Customer email.</p>
     * @return tokenValue
     */
    
    
    public String getTokenValue(){
        return this.tokenValue;
    }

    /**
     * builds CustomerEmailVerify with checking for non-null required values
     * @return CustomerEmailVerify
     */
    public CustomerEmailVerify build() {
        Objects.requireNonNull(tokenValue, CustomerEmailVerify.class + ": tokenValue is missing");
        return new CustomerEmailVerifyImpl(version, tokenValue);
    }
    
    /**
     * builds CustomerEmailVerify without checking for non-null required values
     * @return CustomerEmailVerify
     */
    public CustomerEmailVerify buildUnchecked() {
        return new CustomerEmailVerifyImpl(version, tokenValue);
    }

    /**
     * factory method for an instance of CustomerEmailVerifyBuilder
     * @return builder 
     */
    public static CustomerEmailVerifyBuilder of() {
        return new CustomerEmailVerifyBuilder();
    }

    /**
     * create builder for CustomerEmailVerify instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerEmailVerifyBuilder of(final CustomerEmailVerify template) {
        CustomerEmailVerifyBuilder builder = new CustomerEmailVerifyBuilder();
        builder.version = template.getVersion();
        builder.tokenValue = template.getTokenValue();
        return builder;
    }

}
