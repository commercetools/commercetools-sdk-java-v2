
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
 *  <p>Generated after changing an existing Custom Field on an address of a Business Unit using the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetAddressCustomFieldAction" rel="nofollow">Set Address CustomField</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddressCustomFieldChangedMessagePayload businessUnitAddressCustomFieldChangedMessagePayload = BusinessUnitAddressCustomFieldChangedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitAddressCustomFieldChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAddressCustomFieldChangedMessagePayloadImpl.class)
public interface BusinessUnitAddressCustomFieldChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitAddressCustomFieldChangedMessagePayload
     */
    String BUSINESS_UNIT_ADDRESS_CUSTOM_FIELD_CHANGED = "BusinessUnitAddressCustomFieldChanged";

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetAddressCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetAddressCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
     * @return oldValue
     */

    @JsonProperty("oldValue")
    public Object getOldValue();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> of which the Custom Field was changed.</p>
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetAddressCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetAddressCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
     * @param oldValue value to be set
     */

    public void setOldValue(final Object oldValue);

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> of which the Custom Field was changed.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     * factory method
     * @return instance of BusinessUnitAddressCustomFieldChangedMessagePayload
     */
    public static BusinessUnitAddressCustomFieldChangedMessagePayload of() {
        return new BusinessUnitAddressCustomFieldChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitAddressCustomFieldChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAddressCustomFieldChangedMessagePayload of(
            final BusinessUnitAddressCustomFieldChangedMessagePayload template) {
        BusinessUnitAddressCustomFieldChangedMessagePayloadImpl instance = new BusinessUnitAddressCustomFieldChangedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setOldValue(template.getOldValue());
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    public BusinessUnitAddressCustomFieldChangedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitAddressCustomFieldChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitAddressCustomFieldChangedMessagePayload deepCopy(
            @Nullable final BusinessUnitAddressCustomFieldChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitAddressCustomFieldChangedMessagePayloadImpl instance = new BusinessUnitAddressCustomFieldChangedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setOldValue(template.getOldValue());
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAddressCustomFieldChangedMessagePayload
     * @return builder
     */
    public static BusinessUnitAddressCustomFieldChangedMessagePayloadBuilder builder() {
        return BusinessUnitAddressCustomFieldChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitAddressCustomFieldChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddressCustomFieldChangedMessagePayloadBuilder builder(
            final BusinessUnitAddressCustomFieldChangedMessagePayload template) {
        return BusinessUnitAddressCustomFieldChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAddressCustomFieldChangedMessagePayload(
            Function<BusinessUnitAddressCustomFieldChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressCustomFieldChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressCustomFieldChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAddressCustomFieldChangedMessagePayload>";
            }
        };
    }
}
