
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Reset Customer's Password, Reset Customer's Password in a Store, Change Customer's Password, or Change Customer's Password in a Store request. This Message is also produced during equivalent requests to the My Customer Profile endpoint.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerPasswordUpdatedMessagePayload customerPasswordUpdatedMessagePayload = CustomerPasswordUpdatedMessagePayload.builder()
 *             .reset(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerPasswordUpdatedMessagePayloadImpl.class)
public interface CustomerPasswordUpdatedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerPasswordUpdatedMessagePayload
     */
    String CUSTOMER_PASSWORD_UPDATED = "CustomerPasswordUpdated";

    /**
     *  <p>Whether the Customer's password was updated during the Reset password or Change password flow.</p>
     * @return reset
     */
    @NotNull
    @JsonProperty("reset")
    public Boolean getReset();

    /**
     *  <p>Whether the Customer's password was updated during the Reset password or Change password flow.</p>
     * @param reset value to be set
     */

    public void setReset(final Boolean reset);

    /**
     * factory method
     * @return instance of CustomerPasswordUpdatedMessagePayload
     */
    public static CustomerPasswordUpdatedMessagePayload of() {
        return new CustomerPasswordUpdatedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerPasswordUpdatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerPasswordUpdatedMessagePayload of(final CustomerPasswordUpdatedMessagePayload template) {
        CustomerPasswordUpdatedMessagePayloadImpl instance = new CustomerPasswordUpdatedMessagePayloadImpl();
        instance.setReset(template.getReset());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerPasswordUpdatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerPasswordUpdatedMessagePayload deepCopy(
            @Nullable final CustomerPasswordUpdatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerPasswordUpdatedMessagePayloadImpl instance = new CustomerPasswordUpdatedMessagePayloadImpl();
        instance.setReset(template.getReset());
        return instance;
    }

    /**
     * builder factory method for CustomerPasswordUpdatedMessagePayload
     * @return builder
     */
    public static CustomerPasswordUpdatedMessagePayloadBuilder builder() {
        return CustomerPasswordUpdatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerPasswordUpdatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerPasswordUpdatedMessagePayloadBuilder builder(
            final CustomerPasswordUpdatedMessagePayload template) {
        return CustomerPasswordUpdatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerPasswordUpdatedMessagePayload(Function<CustomerPasswordUpdatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerPasswordUpdatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerPasswordUpdatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerPasswordUpdatedMessagePayload>";
            }
        };
    }
}
