package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import java.time.LocalDate;
import com.commercetools.api.models.message.CustomerDateOfBirthSetMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerDateOfBirthSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerDateOfBirthSetMessagePayload customerDateOfBirthSetMessagePayload = CustomerDateOfBirthSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CustomerDateOfBirthSetMessagePayloadBuilder implements Builder<CustomerDateOfBirthSetMessagePayload> {

    
    @Nullable
    private java.time.LocalDate dateOfBirth;

    
    /**
     *  <p>The <code>dateOfBirth</code> that was set during the Set Date of Birth update action.</p>
     * @param dateOfBirth value to be set
     * @return Builder
     */
    
    public CustomerDateOfBirthSetMessagePayloadBuilder dateOfBirth(@Nullable final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
        return this;
    }
    
    

    /**
     *  <p>The <code>dateOfBirth</code> that was set during the Set Date of Birth update action.</p>
     * @return dateOfBirth
     */
    
    @Nullable
    public java.time.LocalDate getDateOfBirth(){
        return this.dateOfBirth;
    }

    /**
     * builds CustomerDateOfBirthSetMessagePayload with checking for non-null required values
     * @return CustomerDateOfBirthSetMessagePayload
     */
    public CustomerDateOfBirthSetMessagePayload build() {
        return new CustomerDateOfBirthSetMessagePayloadImpl(dateOfBirth);
    }
    
    /**
     * builds CustomerDateOfBirthSetMessagePayload without checking for non-null required values
     * @return CustomerDateOfBirthSetMessagePayload
     */
    public CustomerDateOfBirthSetMessagePayload buildUnchecked() {
        return new CustomerDateOfBirthSetMessagePayloadImpl(dateOfBirth);
    }

    /**
     * factory method for an instance of CustomerDateOfBirthSetMessagePayloadBuilder
     * @return builder 
     */
    public static CustomerDateOfBirthSetMessagePayloadBuilder of() {
        return new CustomerDateOfBirthSetMessagePayloadBuilder();
    }

    /**
     * create builder for CustomerDateOfBirthSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerDateOfBirthSetMessagePayloadBuilder of(final CustomerDateOfBirthSetMessagePayload template) {
        CustomerDateOfBirthSetMessagePayloadBuilder builder = new CustomerDateOfBirthSetMessagePayloadBuilder();
        builder.dateOfBirth = template.getDateOfBirth();
        return builder;
    }

}
