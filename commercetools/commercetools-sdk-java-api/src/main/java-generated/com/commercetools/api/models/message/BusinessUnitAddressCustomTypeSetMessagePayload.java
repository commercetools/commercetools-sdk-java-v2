
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
 *  <p>Generated after adding a Custom Type to an address of a Business Unit using the Set Custom Type in Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddressCustomTypeSetMessagePayload businessUnitAddressCustomTypeSetMessagePayload = BusinessUnitAddressCustomTypeSetMessagePayload.builder()
 *             .customFields(customFieldsBuilder -> customFieldsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAddressCustomTypeSetMessagePayloadImpl.class)
public interface BusinessUnitAddressCustomTypeSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitAddressCustomTypeSetMessagePayload
     */
    String BUSINESS_UNIT_ADDRESS_CUSTOM_TYPE_SET = "BusinessUnitAddressCustomTypeSet";

    /**
     *  <p>The Custom Fields that were set.</p>
     * @return customFields
     */
    @NotNull
    @Valid
    @JsonProperty("customFields")
    public CustomFields getCustomFields();

    /**
     *  <p><code>id</code> of the previous Custom Type. Absent if there was no previous Custom Type present.</p>
     * @return oldTypeId
     */

    @JsonProperty("oldTypeId")
    public String getOldTypeId();

    /**
     *  <p>The Custom Fields that were set.</p>
     * @param customFields value to be set
     */

    public void setCustomFields(final CustomFields customFields);

    /**
     *  <p><code>id</code> of the previous Custom Type. Absent if there was no previous Custom Type present.</p>
     * @param oldTypeId value to be set
     */

    public void setOldTypeId(final String oldTypeId);

    /**
     * factory method
     * @return instance of BusinessUnitAddressCustomTypeSetMessagePayload
     */
    public static BusinessUnitAddressCustomTypeSetMessagePayload of() {
        return new BusinessUnitAddressCustomTypeSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitAddressCustomTypeSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAddressCustomTypeSetMessagePayload of(
            final BusinessUnitAddressCustomTypeSetMessagePayload template) {
        BusinessUnitAddressCustomTypeSetMessagePayloadImpl instance = new BusinessUnitAddressCustomTypeSetMessagePayloadImpl();
        instance.setCustomFields(template.getCustomFields());
        instance.setOldTypeId(template.getOldTypeId());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitAddressCustomTypeSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitAddressCustomTypeSetMessagePayload deepCopy(
            @Nullable final BusinessUnitAddressCustomTypeSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitAddressCustomTypeSetMessagePayloadImpl instance = new BusinessUnitAddressCustomTypeSetMessagePayloadImpl();
        instance.setCustomFields(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustomFields()));
        instance.setOldTypeId(template.getOldTypeId());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAddressCustomTypeSetMessagePayload
     * @return builder
     */
    public static BusinessUnitAddressCustomTypeSetMessagePayloadBuilder builder() {
        return BusinessUnitAddressCustomTypeSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitAddressCustomTypeSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddressCustomTypeSetMessagePayloadBuilder builder(
            final BusinessUnitAddressCustomTypeSetMessagePayload template) {
        return BusinessUnitAddressCustomTypeSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAddressCustomTypeSetMessagePayload(
            Function<BusinessUnitAddressCustomTypeSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressCustomTypeSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressCustomTypeSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAddressCustomTypeSetMessagePayload>";
            }
        };
    }
}
