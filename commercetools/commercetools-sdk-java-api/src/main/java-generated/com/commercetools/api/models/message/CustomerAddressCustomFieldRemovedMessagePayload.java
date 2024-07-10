
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
 *  <p>Generated after removing a Custom Field from an Address of a Customer using the Set CustomField in Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddressCustomFieldRemovedMessagePayload customerAddressCustomFieldRemovedMessagePayload = CustomerAddressCustomFieldRemovedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerAddressCustomFieldRemovedMessagePayloadImpl.class)
public interface CustomerAddressCustomFieldRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerAddressCustomFieldRemovedMessagePayload
     */
    String CUSTOMER_ADDRESS_CUSTOM_FIELD_REMOVED = "CustomerAddressCustomFieldRemoved";

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p><code>id</code> of the Address from which the Custom Field was removed.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p><code>id</code> of the Address from which the Custom Field was removed.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     * factory method
     * @return instance of CustomerAddressCustomFieldRemovedMessagePayload
     */
    public static CustomerAddressCustomFieldRemovedMessagePayload of() {
        return new CustomerAddressCustomFieldRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerAddressCustomFieldRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerAddressCustomFieldRemovedMessagePayload of(
            final CustomerAddressCustomFieldRemovedMessagePayload template) {
        CustomerAddressCustomFieldRemovedMessagePayloadImpl instance = new CustomerAddressCustomFieldRemovedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerAddressCustomFieldRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerAddressCustomFieldRemovedMessagePayload deepCopy(
            @Nullable final CustomerAddressCustomFieldRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerAddressCustomFieldRemovedMessagePayloadImpl instance = new CustomerAddressCustomFieldRemovedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    /**
     * builder factory method for CustomerAddressCustomFieldRemovedMessagePayload
     * @return builder
     */
    public static CustomerAddressCustomFieldRemovedMessagePayloadBuilder builder() {
        return CustomerAddressCustomFieldRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerAddressCustomFieldRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddressCustomFieldRemovedMessagePayloadBuilder builder(
            final CustomerAddressCustomFieldRemovedMessagePayload template) {
        return CustomerAddressCustomFieldRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerAddressCustomFieldRemovedMessagePayload(
            Function<CustomerAddressCustomFieldRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerAddressCustomFieldRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerAddressCustomFieldRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerAddressCustomFieldRemovedMessagePayload>";
            }
        };
    }
}
