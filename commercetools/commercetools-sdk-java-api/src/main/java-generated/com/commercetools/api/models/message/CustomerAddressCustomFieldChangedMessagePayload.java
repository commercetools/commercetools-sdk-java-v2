
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
 *  <p>Generated after changing an existing Custom Field on an Address of a Customer using the Set CustomField in Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddressCustomFieldChangedMessagePayload customerAddressCustomFieldChangedMessagePayload = CustomerAddressCustomFieldChangedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerAddressCustomFieldChangedMessagePayloadImpl.class)
public interface CustomerAddressCustomFieldChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerAddressCustomFieldChangedMessagePayload
     */
    String CUSTOMER_ADDRESS_CUSTOM_FIELD_CHANGED = "CustomerAddressCustomFieldChanged";

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>CustomFieldValue based on the FieldType after the Set CustomField update action.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action. When there has not been a Custom Field with the <code>name</code> on the Customer Address before, a Customer Address Custom Field Added Message is generated instead.</p>
     * @return previousValue
     */

    @JsonProperty("previousValue")
    public Object getPreviousValue();

    /**
     *  <p><code>id</code> of the Address of which the Custom Field was changed.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>CustomFieldValue based on the FieldType after the Set CustomField update action.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action. When there has not been a Custom Field with the <code>name</code> on the Customer Address before, a Customer Address Custom Field Added Message is generated instead.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Object previousValue);

    /**
     *  <p><code>id</code> of the Address of which the Custom Field was changed.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     * factory method
     * @return instance of CustomerAddressCustomFieldChangedMessagePayload
     */
    public static CustomerAddressCustomFieldChangedMessagePayload of() {
        return new CustomerAddressCustomFieldChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerAddressCustomFieldChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerAddressCustomFieldChangedMessagePayload of(
            final CustomerAddressCustomFieldChangedMessagePayload template) {
        CustomerAddressCustomFieldChangedMessagePayloadImpl instance = new CustomerAddressCustomFieldChangedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerAddressCustomFieldChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerAddressCustomFieldChangedMessagePayload deepCopy(
            @Nullable final CustomerAddressCustomFieldChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerAddressCustomFieldChangedMessagePayloadImpl instance = new CustomerAddressCustomFieldChangedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    /**
     * builder factory method for CustomerAddressCustomFieldChangedMessagePayload
     * @return builder
     */
    public static CustomerAddressCustomFieldChangedMessagePayloadBuilder builder() {
        return CustomerAddressCustomFieldChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerAddressCustomFieldChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddressCustomFieldChangedMessagePayloadBuilder builder(
            final CustomerAddressCustomFieldChangedMessagePayload template) {
        return CustomerAddressCustomFieldChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerAddressCustomFieldChangedMessagePayload(
            Function<CustomerAddressCustomFieldChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerAddressCustomFieldChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerAddressCustomFieldChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerAddressCustomFieldChangedMessagePayload>";
            }
        };
    }
}
