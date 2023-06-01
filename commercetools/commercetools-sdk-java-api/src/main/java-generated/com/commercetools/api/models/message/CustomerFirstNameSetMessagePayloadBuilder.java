package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.CustomerFirstNameSetMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerFirstNameSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerFirstNameSetMessagePayload customerFirstNameSetMessagePayload = CustomerFirstNameSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerFirstNameSetMessagePayloadBuilder implements Builder<CustomerFirstNameSetMessagePayload> {

    
    @Nullable
    private String firstName;

    
    /**
     *  <p>The <code>firstName</code> that was set during the Set First Name update action.</p>
     * @param firstName value to be set
     * @return Builder
     */
    
    public CustomerFirstNameSetMessagePayloadBuilder firstName(@Nullable final String firstName) {
        this.firstName = firstName;
        return this;
    }
    
    

    /**
     *  <p>The <code>firstName</code> that was set during the Set First Name update action.</p>
     * @return firstName
     */
    
    @Nullable
    public String getFirstName(){
        return this.firstName;
    }

    /**
     * builds CustomerFirstNameSetMessagePayload with checking for non-null required values
     * @return CustomerFirstNameSetMessagePayload
     */
    public CustomerFirstNameSetMessagePayload build() {
        return new CustomerFirstNameSetMessagePayloadImpl(firstName);
    }
    
    /**
     * builds CustomerFirstNameSetMessagePayload without checking for non-null required values
     * @return CustomerFirstNameSetMessagePayload
     */
    public CustomerFirstNameSetMessagePayload buildUnchecked() {
        return new CustomerFirstNameSetMessagePayloadImpl(firstName);
    }

    /**
     * factory method for an instance of CustomerFirstNameSetMessagePayloadBuilder
     * @return builder 
     */
    public static CustomerFirstNameSetMessagePayloadBuilder of() {
        return new CustomerFirstNameSetMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerFirstNameSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerFirstNameSetMessagePayloadBuilder of(final CustomerFirstNameSetMessagePayload template) {
        CustomerFirstNameSetMessagePayloadBuilder builder = new CustomerFirstNameSetMessagePayloadBuilder();
        builder.firstName = template.getFirstName();
        return builder;
    }

}
