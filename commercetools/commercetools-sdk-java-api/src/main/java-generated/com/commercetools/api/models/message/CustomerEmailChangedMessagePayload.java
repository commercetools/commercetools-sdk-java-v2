
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Change Email update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerEmailChangedMessagePayload customerEmailChangedMessagePayload = CustomerEmailChangedMessagePayload.builder()
 *             .email("{email}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerEmailChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerEmailChangedMessagePayloadImpl.class)
public interface CustomerEmailChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerEmailChangedMessagePayload
     */
    String CUSTOMER_EMAIL_CHANGED = "CustomerEmailChanged";

    /**
     *  <p>The <code>email</code> that was set during the Change Email update action.</p>
     * @return email
     */
    @NotNull
    @JsonProperty("email")
    public String getEmail();

    /**
     *  <p>The <code>email</code> that was set during the Change Email update action.</p>
     * @param email value to be set
     */

    public void setEmail(final String email);

    /**
     * factory method
     * @return instance of CustomerEmailChangedMessagePayload
     */
    public static CustomerEmailChangedMessagePayload of() {
        return new CustomerEmailChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerEmailChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerEmailChangedMessagePayload of(final CustomerEmailChangedMessagePayload template) {
        CustomerEmailChangedMessagePayloadImpl instance = new CustomerEmailChangedMessagePayloadImpl();
        instance.setEmail(template.getEmail());
        return instance;
    }

    public CustomerEmailChangedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CustomerEmailChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerEmailChangedMessagePayload deepCopy(
            @Nullable final CustomerEmailChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerEmailChangedMessagePayloadImpl instance = new CustomerEmailChangedMessagePayloadImpl();
        instance.setEmail(template.getEmail());
        return instance;
    }

    /**
     * builder factory method for CustomerEmailChangedMessagePayload
     * @return builder
     */
    public static CustomerEmailChangedMessagePayloadBuilder builder() {
        return CustomerEmailChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerEmailChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerEmailChangedMessagePayloadBuilder builder(final CustomerEmailChangedMessagePayload template) {
        return CustomerEmailChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerEmailChangedMessagePayload(Function<CustomerEmailChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerEmailChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerEmailChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerEmailChangedMessagePayload>";
            }
        };
    }
}
