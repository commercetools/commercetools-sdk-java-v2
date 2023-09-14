
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after adding a Custom Type to a Customer using the Set Custom Type update action with empty parameters.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerCustomTypeRemovedMessagePayload customerCustomTypeRemovedMessagePayload = CustomerCustomTypeRemovedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerCustomTypeRemovedMessagePayloadImpl.class)
public interface CustomerCustomTypeRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerCustomTypeRemovedMessagePayload
     */
    String CUSTOMER_CUSTOM_TYPE_REMOVED = "CustomerCustomTypeRemoved";

    /**
     *  <p><code>id</code> of the Custom Type that has been removed.</p>
     *  <p>Absent when there has not been a Custom Type before.</p>
     * @return previousTypeId
     */

    @JsonProperty("previousTypeId")
    public String getPreviousTypeId();

    /**
     *  <p><code>id</code> of the Custom Type that has been removed.</p>
     *  <p>Absent when there has not been a Custom Type before.</p>
     * @param previousTypeId value to be set
     */

    public void setPreviousTypeId(final String previousTypeId);

    /**
     * factory method
     * @return instance of CustomerCustomTypeRemovedMessagePayload
     */
    public static CustomerCustomTypeRemovedMessagePayload of() {
        return new CustomerCustomTypeRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerCustomTypeRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerCustomTypeRemovedMessagePayload of(final CustomerCustomTypeRemovedMessagePayload template) {
        CustomerCustomTypeRemovedMessagePayloadImpl instance = new CustomerCustomTypeRemovedMessagePayloadImpl();
        instance.setPreviousTypeId(template.getPreviousTypeId());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerCustomTypeRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerCustomTypeRemovedMessagePayload deepCopy(
            @Nullable final CustomerCustomTypeRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerCustomTypeRemovedMessagePayloadImpl instance = new CustomerCustomTypeRemovedMessagePayloadImpl();
        instance.setPreviousTypeId(template.getPreviousTypeId());
        return instance;
    }

    /**
     * builder factory method for CustomerCustomTypeRemovedMessagePayload
     * @return builder
     */
    public static CustomerCustomTypeRemovedMessagePayloadBuilder builder() {
        return CustomerCustomTypeRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerCustomTypeRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerCustomTypeRemovedMessagePayloadBuilder builder(
            final CustomerCustomTypeRemovedMessagePayload template) {
        return CustomerCustomTypeRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerCustomTypeRemovedMessagePayload(
            Function<CustomerCustomTypeRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerCustomTypeRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerCustomTypeRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerCustomTypeRemovedMessagePayload>";
            }
        };
    }
}
