
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
 *  <p>Generated after removing a Custom Field from an address of a Business Unit using the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetAddressCustomFieldAction" rel="nofollow">Set Address CustomField</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddressCustomFieldRemovedMessagePayload businessUnitAddressCustomFieldRemovedMessagePayload = BusinessUnitAddressCustomFieldRemovedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitAddressCustomFieldRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAddressCustomFieldRemovedMessagePayloadImpl.class)
public interface BusinessUnitAddressCustomFieldRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitAddressCustomFieldRemovedMessagePayload
     */
    String BUSINESS_UNIT_ADDRESS_CUSTOM_FIELD_REMOVED = "BusinessUnitAddressCustomFieldRemoved";

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> from which the Custom Field was removed.</p>
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
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> from which the Custom Field was removed.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     * factory method
     * @return instance of BusinessUnitAddressCustomFieldRemovedMessagePayload
     */
    public static BusinessUnitAddressCustomFieldRemovedMessagePayload of() {
        return new BusinessUnitAddressCustomFieldRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitAddressCustomFieldRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAddressCustomFieldRemovedMessagePayload of(
            final BusinessUnitAddressCustomFieldRemovedMessagePayload template) {
        BusinessUnitAddressCustomFieldRemovedMessagePayloadImpl instance = new BusinessUnitAddressCustomFieldRemovedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    public BusinessUnitAddressCustomFieldRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitAddressCustomFieldRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitAddressCustomFieldRemovedMessagePayload deepCopy(
            @Nullable final BusinessUnitAddressCustomFieldRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitAddressCustomFieldRemovedMessagePayloadImpl instance = new BusinessUnitAddressCustomFieldRemovedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAddressCustomFieldRemovedMessagePayload
     * @return builder
     */
    public static BusinessUnitAddressCustomFieldRemovedMessagePayloadBuilder builder() {
        return BusinessUnitAddressCustomFieldRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitAddressCustomFieldRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddressCustomFieldRemovedMessagePayloadBuilder builder(
            final BusinessUnitAddressCustomFieldRemovedMessagePayload template) {
        return BusinessUnitAddressCustomFieldRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAddressCustomFieldRemovedMessagePayload(
            Function<BusinessUnitAddressCustomFieldRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressCustomFieldRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressCustomFieldRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAddressCustomFieldRemovedMessagePayload>";
            }
        };
    }
}
