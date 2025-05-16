
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
 *  <p>Generated after changing an existing Custom Field on a Business Unit using the Set CustomField update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitCustomFieldChangedMessagePayload businessUnitCustomFieldChangedMessagePayload = BusinessUnitCustomFieldChangedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitCustomFieldChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitCustomFieldChangedMessagePayloadImpl.class)
public interface BusinessUnitCustomFieldChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitCustomFieldChangedMessagePayload
     */
    String BUSINESS_UNIT_CUSTOM_FIELD_CHANGED = "BusinessUnitCustomFieldChanged";

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
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action.</p>
     * @return oldValue
     */

    @JsonProperty("oldValue")
    public Object getOldValue();

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
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action.</p>
     * @param oldValue value to be set
     */

    public void setOldValue(final Object oldValue);

    /**
     * factory method
     * @return instance of BusinessUnitCustomFieldChangedMessagePayload
     */
    public static BusinessUnitCustomFieldChangedMessagePayload of() {
        return new BusinessUnitCustomFieldChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitCustomFieldChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitCustomFieldChangedMessagePayload of(
            final BusinessUnitCustomFieldChangedMessagePayload template) {
        BusinessUnitCustomFieldChangedMessagePayloadImpl instance = new BusinessUnitCustomFieldChangedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setOldValue(template.getOldValue());
        return instance;
    }

    public BusinessUnitCustomFieldChangedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitCustomFieldChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitCustomFieldChangedMessagePayload deepCopy(
            @Nullable final BusinessUnitCustomFieldChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitCustomFieldChangedMessagePayloadImpl instance = new BusinessUnitCustomFieldChangedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        instance.setOldValue(template.getOldValue());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitCustomFieldChangedMessagePayload
     * @return builder
     */
    public static BusinessUnitCustomFieldChangedMessagePayloadBuilder builder() {
        return BusinessUnitCustomFieldChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitCustomFieldChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitCustomFieldChangedMessagePayloadBuilder builder(
            final BusinessUnitCustomFieldChangedMessagePayload template) {
        return BusinessUnitCustomFieldChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitCustomFieldChangedMessagePayload(
            Function<BusinessUnitCustomFieldChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCustomFieldChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCustomFieldChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitCustomFieldChangedMessagePayload>";
            }
        };
    }
}
