
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
 *  <p>Generated after adding a Custom Field to an Address of a Customer using the Set CustomField in Address update action. If a Custom Field already exists with the same name, a CustomerAddressCustomFieldChanged Message is generated instead.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddressCustomFieldAddedMessagePayload customerAddressCustomFieldAddedMessagePayload = CustomerAddressCustomFieldAddedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerAddressCustomFieldAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerAddressCustomFieldAddedMessagePayloadImpl.class)
public interface CustomerAddressCustomFieldAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerAddressCustomFieldAddedMessagePayload
     */
    String CUSTOMER_ADDRESS_CUSTOM_FIELD_ADDED = "CustomerAddressCustomFieldAdded";

    /**
     *  <p>Name of the Custom Field that was added.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>The added CustomFieldValue based on the FieldType.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p><code>id</code> of the Address to which the Custom Field was added.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p>Name of the Custom Field that was added.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>The added CustomFieldValue based on the FieldType.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     *  <p><code>id</code> of the Address to which the Custom Field was added.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     * factory method
     * @return instance of CustomerAddressCustomFieldAddedMessagePayload
     */
    public static CustomerAddressCustomFieldAddedMessagePayload of() {
        return new CustomerAddressCustomFieldAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerAddressCustomFieldAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerAddressCustomFieldAddedMessagePayload of(
            final CustomerAddressCustomFieldAddedMessagePayload template) {
        CustomerAddressCustomFieldAddedMessagePayloadImpl instance = new CustomerAddressCustomFieldAddedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    public CustomerAddressCustomFieldAddedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CustomerAddressCustomFieldAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerAddressCustomFieldAddedMessagePayload deepCopy(
            @Nullable final CustomerAddressCustomFieldAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerAddressCustomFieldAddedMessagePayloadImpl instance = new CustomerAddressCustomFieldAddedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    /**
     * builder factory method for CustomerAddressCustomFieldAddedMessagePayload
     * @return builder
     */
    public static CustomerAddressCustomFieldAddedMessagePayloadBuilder builder() {
        return CustomerAddressCustomFieldAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerAddressCustomFieldAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddressCustomFieldAddedMessagePayloadBuilder builder(
            final CustomerAddressCustomFieldAddedMessagePayload template) {
        return CustomerAddressCustomFieldAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerAddressCustomFieldAddedMessagePayload(
            Function<CustomerAddressCustomFieldAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerAddressCustomFieldAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerAddressCustomFieldAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerAddressCustomFieldAddedMessagePayload>";
            }
        };
    }
}
