
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after removing a Custom Type from an Address of a Customer using the Set Custom Type in Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddressCustomTypeRemovedMessagePayload customerAddressCustomTypeRemovedMessagePayload = CustomerAddressCustomTypeRemovedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerAddressCustomTypeRemovedMessagePayloadImpl.class)
public interface CustomerAddressCustomTypeRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerAddressCustomTypeRemovedMessagePayload
     */
    String CUSTOMER_ADDRESS_CUSTOM_TYPE_REMOVED = "CustomerAddressCustomTypeRemoved";

    /**
     *  <p><code>id</code> of the Custom Type that was removed. Absent if there was no previous Custom Type present.</p>
     * @return previousTypeId
     */

    @JsonProperty("previousTypeId")
    public String getPreviousTypeId();

    /**
     *  <p><code>id</code> of the Custom Type that was removed. Absent if there was no previous Custom Type present.</p>
     * @param previousTypeId value to be set
     */

    public void setPreviousTypeId(final String previousTypeId);

    /**
     * factory method
     * @return instance of CustomerAddressCustomTypeRemovedMessagePayload
     */
    public static CustomerAddressCustomTypeRemovedMessagePayload of() {
        return new CustomerAddressCustomTypeRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerAddressCustomTypeRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerAddressCustomTypeRemovedMessagePayload of(
            final CustomerAddressCustomTypeRemovedMessagePayload template) {
        CustomerAddressCustomTypeRemovedMessagePayloadImpl instance = new CustomerAddressCustomTypeRemovedMessagePayloadImpl();
        instance.setPreviousTypeId(template.getPreviousTypeId());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerAddressCustomTypeRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerAddressCustomTypeRemovedMessagePayload deepCopy(
            @Nullable final CustomerAddressCustomTypeRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerAddressCustomTypeRemovedMessagePayloadImpl instance = new CustomerAddressCustomTypeRemovedMessagePayloadImpl();
        instance.setPreviousTypeId(template.getPreviousTypeId());
        return instance;
    }

    /**
     * builder factory method for CustomerAddressCustomTypeRemovedMessagePayload
     * @return builder
     */
    public static CustomerAddressCustomTypeRemovedMessagePayloadBuilder builder() {
        return CustomerAddressCustomTypeRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerAddressCustomTypeRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddressCustomTypeRemovedMessagePayloadBuilder builder(
            final CustomerAddressCustomTypeRemovedMessagePayload template) {
        return CustomerAddressCustomTypeRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerAddressCustomTypeRemovedMessagePayload(
            Function<CustomerAddressCustomTypeRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerAddressCustomTypeRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerAddressCustomTypeRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerAddressCustomTypeRemovedMessagePayload>";
            }
        };
    }
}
