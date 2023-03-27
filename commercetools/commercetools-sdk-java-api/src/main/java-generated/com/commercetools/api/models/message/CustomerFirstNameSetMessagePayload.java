
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set First Name update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerFirstNameSetMessagePayload customerFirstNameSetMessagePayload = CustomerFirstNameSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerFirstNameSetMessagePayloadImpl.class)
public interface CustomerFirstNameSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerFirstNameSetMessagePayload
     */
    String CUSTOMER_FIRST_NAME_SET = "CustomerFirstNameSet";

    /**
     *  <p>The <code>firstName</code> that was set during the Set First Name update action.</p>
     * @return firstName
     */

    @JsonProperty("firstName")
    public String getFirstName();

    /**
     *  <p>The <code>firstName</code> that was set during the Set First Name update action.</p>
     * @param firstName value to be set
     */

    public void setFirstName(final String firstName);

    /**
     * factory method
     * @return instance of CustomerFirstNameSetMessagePayload
     */
    public static CustomerFirstNameSetMessagePayload of() {
        return new CustomerFirstNameSetMessagePayloadImpl();
    }

    /**
     * factory method to copy an instance of CustomerFirstNameSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerFirstNameSetMessagePayload of(final CustomerFirstNameSetMessagePayload template) {
        CustomerFirstNameSetMessagePayloadImpl instance = new CustomerFirstNameSetMessagePayloadImpl();
        instance.setFirstName(template.getFirstName());
        return instance;
    }

    /**
     * builder factory method for CustomerFirstNameSetMessagePayload
     * @return builder
     */
    public static CustomerFirstNameSetMessagePayloadBuilder builder() {
        return CustomerFirstNameSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerFirstNameSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerFirstNameSetMessagePayloadBuilder builder(final CustomerFirstNameSetMessagePayload template) {
        return CustomerFirstNameSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerFirstNameSetMessagePayload(Function<CustomerFirstNameSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerFirstNameSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerFirstNameSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerFirstNameSetMessagePayload>";
            }
        };
    }
}
