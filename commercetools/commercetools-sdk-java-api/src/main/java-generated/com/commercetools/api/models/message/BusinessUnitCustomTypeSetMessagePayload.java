
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
 *  <p>Generated after adding a Custom Type to a Business Unit using the Set Custom Type update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitCustomTypeSetMessagePayload businessUnitCustomTypeSetMessagePayload = BusinessUnitCustomTypeSetMessagePayload.builder()
 *             .customFields(customFieldsBuilder -> customFieldsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitCustomTypeSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitCustomTypeSetMessagePayloadImpl.class)
public interface BusinessUnitCustomTypeSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitCustomTypeSetMessagePayload
     */
    String BUSINESS_UNIT_CUSTOM_TYPE_SET = "BusinessUnitCustomTypeSet";

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
     * @return instance of BusinessUnitCustomTypeSetMessagePayload
     */
    public static BusinessUnitCustomTypeSetMessagePayload of() {
        return new BusinessUnitCustomTypeSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitCustomTypeSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitCustomTypeSetMessagePayload of(final BusinessUnitCustomTypeSetMessagePayload template) {
        BusinessUnitCustomTypeSetMessagePayloadImpl instance = new BusinessUnitCustomTypeSetMessagePayloadImpl();
        instance.setCustomFields(template.getCustomFields());
        instance.setOldTypeId(template.getOldTypeId());
        return instance;
    }

    public BusinessUnitCustomTypeSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitCustomTypeSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitCustomTypeSetMessagePayload deepCopy(
            @Nullable final BusinessUnitCustomTypeSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitCustomTypeSetMessagePayloadImpl instance = new BusinessUnitCustomTypeSetMessagePayloadImpl();
        instance.setCustomFields(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustomFields()));
        instance.setOldTypeId(template.getOldTypeId());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitCustomTypeSetMessagePayload
     * @return builder
     */
    public static BusinessUnitCustomTypeSetMessagePayloadBuilder builder() {
        return BusinessUnitCustomTypeSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitCustomTypeSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitCustomTypeSetMessagePayloadBuilder builder(
            final BusinessUnitCustomTypeSetMessagePayload template) {
        return BusinessUnitCustomTypeSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitCustomTypeSetMessagePayload(
            Function<BusinessUnitCustomTypeSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCustomTypeSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCustomTypeSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitCustomTypeSetMessagePayload>";
            }
        };
    }
}
