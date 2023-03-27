
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Delete Customer request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerDeletedMessagePayload customerDeletedMessagePayload = CustomerDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerDeletedMessagePayloadImpl.class)
public interface CustomerDeletedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerDeletedMessagePayload
     */
    String CUSTOMER_DELETED = "CustomerDeleted";

    /**
     * factory method
     * @return instance of CustomerDeletedMessagePayload
     */
    public static CustomerDeletedMessagePayload of() {
        return new CustomerDeletedMessagePayloadImpl();
    }

    /**
     * factory method to copy an instance of CustomerDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerDeletedMessagePayload of(final CustomerDeletedMessagePayload template) {
        CustomerDeletedMessagePayloadImpl instance = new CustomerDeletedMessagePayloadImpl();
        return instance;
    }

    /**
     * builder factory method for CustomerDeletedMessagePayload
     * @return builder
     */
    public static CustomerDeletedMessagePayloadBuilder builder() {
        return CustomerDeletedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerDeletedMessagePayloadBuilder builder(final CustomerDeletedMessagePayload template) {
        return CustomerDeletedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerDeletedMessagePayload(Function<CustomerDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerDeletedMessagePayload>";
            }
        };
    }
}
