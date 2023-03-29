
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set Last Name update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerLastNameSetMessagePayload customerLastNameSetMessagePayload = CustomerLastNameSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerLastNameSetMessagePayloadImpl.class)
public interface CustomerLastNameSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerLastNameSetMessagePayload
     */
    String CUSTOMER_LAST_NAME_SET = "CustomerLastNameSet";

    /**
     *  <p>The <code>lastName</code> that was set during the Set Last Name update action.</p>
     * @return lastName
     */

    @JsonProperty("lastName")
    public String getLastName();

    /**
     *  <p>The <code>lastName</code> that was set during the Set Last Name update action.</p>
     * @param lastName value to be set
     */

    public void setLastName(final String lastName);

    /**
     * factory method
     * @return instance of CustomerLastNameSetMessagePayload
     */
    public static CustomerLastNameSetMessagePayload of() {
        return new CustomerLastNameSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerLastNameSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerLastNameSetMessagePayload of(final CustomerLastNameSetMessagePayload template) {
        CustomerLastNameSetMessagePayloadImpl instance = new CustomerLastNameSetMessagePayloadImpl();
        instance.setLastName(template.getLastName());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerLastNameSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerLastNameSetMessagePayload deepCopy(
            @Nullable final CustomerLastNameSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerLastNameSetMessagePayloadImpl instance = new CustomerLastNameSetMessagePayloadImpl();
        instance.setLastName(template.getLastName());
        return instance;
    }

    /**
     * builder factory method for CustomerLastNameSetMessagePayload
     * @return builder
     */
    public static CustomerLastNameSetMessagePayloadBuilder builder() {
        return CustomerLastNameSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerLastNameSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerLastNameSetMessagePayloadBuilder builder(final CustomerLastNameSetMessagePayload template) {
        return CustomerLastNameSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerLastNameSetMessagePayload(Function<CustomerLastNameSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerLastNameSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerLastNameSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerLastNameSetMessagePayload>";
            }
        };
    }
}
