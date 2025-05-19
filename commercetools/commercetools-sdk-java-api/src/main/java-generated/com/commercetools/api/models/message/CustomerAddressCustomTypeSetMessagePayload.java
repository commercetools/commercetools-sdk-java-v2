
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after adding a Custom Type to an Address of a Customer using the Set Custom Type in Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddressCustomTypeSetMessagePayload customerAddressCustomTypeSetMessagePayload = CustomerAddressCustomTypeSetMessagePayload.builder()
 *             .customFields(customFieldsBuilder -> customFieldsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerAddressCustomTypeSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerAddressCustomTypeSetMessagePayloadImpl.class)
public interface CustomerAddressCustomTypeSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for CustomerAddressCustomTypeSetMessagePayload
     */
    String CUSTOMER_ADDRESS_CUSTOM_TYPE_SET = "CustomerAddressCustomTypeSet";

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @return customFields
     */
    @NotNull
    @Valid
    @JsonProperty("customFields")
    public CustomFields getCustomFields();

    /**
     *  <p><code>id</code> of the previous Custom Type. Absent if there was no previous Custom Type present.</p>
     * @return previousTypeId
     */

    @JsonProperty("previousTypeId")
    public String getPreviousTypeId();

    /**
     *  <p><code>id</code> of the Address on which the Custom Field was set.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p>The Custom Fields that have been set.</p>
     * @param customFields value to be set
     */

    public void setCustomFields(final CustomFields customFields);

    /**
     *  <p><code>id</code> of the previous Custom Type. Absent if there was no previous Custom Type present.</p>
     * @param previousTypeId value to be set
     */

    public void setPreviousTypeId(final String previousTypeId);

    /**
     *  <p><code>id</code> of the Address on which the Custom Field was set.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     * factory method
     * @return instance of CustomerAddressCustomTypeSetMessagePayload
     */
    public static CustomerAddressCustomTypeSetMessagePayload of() {
        return new CustomerAddressCustomTypeSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CustomerAddressCustomTypeSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerAddressCustomTypeSetMessagePayload of(
            final CustomerAddressCustomTypeSetMessagePayload template) {
        CustomerAddressCustomTypeSetMessagePayloadImpl instance = new CustomerAddressCustomTypeSetMessagePayloadImpl();
        instance.setCustomFields(template.getCustomFields());
        instance.setPreviousTypeId(template.getPreviousTypeId());
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    public CustomerAddressCustomTypeSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CustomerAddressCustomTypeSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerAddressCustomTypeSetMessagePayload deepCopy(
            @Nullable final CustomerAddressCustomTypeSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        CustomerAddressCustomTypeSetMessagePayloadImpl instance = new CustomerAddressCustomTypeSetMessagePayloadImpl();
        instance.setCustomFields(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustomFields()));
        instance.setPreviousTypeId(template.getPreviousTypeId());
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    /**
     * builder factory method for CustomerAddressCustomTypeSetMessagePayload
     * @return builder
     */
    public static CustomerAddressCustomTypeSetMessagePayloadBuilder builder() {
        return CustomerAddressCustomTypeSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for CustomerAddressCustomTypeSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddressCustomTypeSetMessagePayloadBuilder builder(
            final CustomerAddressCustomTypeSetMessagePayload template) {
        return CustomerAddressCustomTypeSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerAddressCustomTypeSetMessagePayload(
            Function<CustomerAddressCustomTypeSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerAddressCustomTypeSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerAddressCustomTypeSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerAddressCustomTypeSetMessagePayload>";
            }
        };
    }
}
