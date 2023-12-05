
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after removing a Custom Type from a Customer Group using the Set Custom Type update action with empty parameters.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupCustomTypeRemovedMessagePayload customerGroupCustomTypeRemovedMessagePayload = CustomerGroupCustomTypeRemovedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerGroupCustomTypeRemovedMessagePayloadImpl.class)
public interface CustomerGroupCustomTypeRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerGroupCustomTypeRemovedMessagePayload
     */
    String CUSTOMER_GROUP_CUSTOM_TYPE_REMOVED = "CustomerGroupCustomTypeRemoved";

    /**
     *  <p><code>id</code> of the Custom Type that was removed. Absent if there was no previous Custom Type present.</p>
     * @return oldTypeId
     */

    @JsonProperty("oldTypeId")
    public String getOldTypeId();

    /**
     *  <p><code>id</code> of the Custom Type that was removed. Absent if there was no previous Custom Type present.</p>
     * @param oldTypeId value to be set
     */

    public void setOldTypeId(final String oldTypeId);

    /**
     * factory method
     * @return instance of CustomerGroupCustomTypeRemovedMessagePayload
     */
    public static CustomerGroupCustomTypeRemovedMessagePayload of() {
        return new CustomerGroupCustomTypeRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerGroupCustomTypeRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerGroupCustomTypeRemovedMessagePayload of(
            final CustomerGroupCustomTypeRemovedMessagePayload template) {
        CustomerGroupCustomTypeRemovedMessagePayloadImpl instance = new CustomerGroupCustomTypeRemovedMessagePayloadImpl();
        instance.setOldTypeId(template.getOldTypeId());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerGroupCustomTypeRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroupCustomTypeRemovedMessagePayload deepCopy(
            @Nullable final CustomerGroupCustomTypeRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerGroupCustomTypeRemovedMessagePayloadImpl instance = new CustomerGroupCustomTypeRemovedMessagePayloadImpl();
        instance.setOldTypeId(template.getOldTypeId());
        return instance;
    }

    /**
     * builder factory method for CustomerGroupCustomTypeRemovedMessagePayload
     * @return builder
     */
    public static CustomerGroupCustomTypeRemovedMessagePayloadBuilder builder() {
        return CustomerGroupCustomTypeRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerGroupCustomTypeRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupCustomTypeRemovedMessagePayloadBuilder builder(
            final CustomerGroupCustomTypeRemovedMessagePayload template) {
        return CustomerGroupCustomTypeRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupCustomTypeRemovedMessagePayload(
            Function<CustomerGroupCustomTypeRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupCustomTypeRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupCustomTypeRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupCustomTypeRemovedMessagePayload>";
            }
        };
    }
}
