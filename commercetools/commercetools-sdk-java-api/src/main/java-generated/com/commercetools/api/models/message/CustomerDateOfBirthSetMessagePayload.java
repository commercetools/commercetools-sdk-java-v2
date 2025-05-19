
package com.commercetools.api.models.message;

import java.time.*;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Date of Birth update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerDateOfBirthSetMessagePayload customerDateOfBirthSetMessagePayload = CustomerDateOfBirthSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerDateOfBirthSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerDateOfBirthSetMessagePayloadImpl.class)
public interface CustomerDateOfBirthSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerDateOfBirthSetMessagePayload
     */
    String CUSTOMER_DATE_OF_BIRTH_SET = "CustomerDateOfBirthSet";

    /**
     *  <p>The <code>dateOfBirth</code> that was set during the Set Date of Birth update action.</p>
     * @return dateOfBirth
     */

    @JsonProperty("dateOfBirth")
    public LocalDate getDateOfBirth();

    /**
     *  <p>The <code>dateOfBirth</code> that was set during the Set Date of Birth update action.</p>
     * @param dateOfBirth value to be set
     */

    public void setDateOfBirth(final LocalDate dateOfBirth);

    /**
     * factory method
     * @return instance of CustomerDateOfBirthSetMessagePayload
     */
    public static CustomerDateOfBirthSetMessagePayload of() {
        return new CustomerDateOfBirthSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerDateOfBirthSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerDateOfBirthSetMessagePayload of(final CustomerDateOfBirthSetMessagePayload template) {
        CustomerDateOfBirthSetMessagePayloadImpl instance = new CustomerDateOfBirthSetMessagePayloadImpl();
        instance.setDateOfBirth(template.getDateOfBirth());
        return instance;
    }

    public CustomerDateOfBirthSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CustomerDateOfBirthSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerDateOfBirthSetMessagePayload deepCopy(
            @Nullable final CustomerDateOfBirthSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerDateOfBirthSetMessagePayloadImpl instance = new CustomerDateOfBirthSetMessagePayloadImpl();
        instance.setDateOfBirth(template.getDateOfBirth());
        return instance;
    }

    /**
     * builder factory method for CustomerDateOfBirthSetMessagePayload
     * @return builder
     */
    public static CustomerDateOfBirthSetMessagePayloadBuilder builder() {
        return CustomerDateOfBirthSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerDateOfBirthSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerDateOfBirthSetMessagePayloadBuilder builder(
            final CustomerDateOfBirthSetMessagePayload template) {
        return CustomerDateOfBirthSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerDateOfBirthSetMessagePayload(Function<CustomerDateOfBirthSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerDateOfBirthSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerDateOfBirthSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerDateOfBirthSetMessagePayload>";
            }
        };
    }
}
