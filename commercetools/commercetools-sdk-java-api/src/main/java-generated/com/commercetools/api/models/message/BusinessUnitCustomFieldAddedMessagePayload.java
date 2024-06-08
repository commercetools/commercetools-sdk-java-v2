
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
 *  <p>Generated after adding a Custom Field to a Business Unit using the Set CustomField update action. If a Custom Field already exists with the same name, a BusinessUnitCustomFieldChanged Message is generated instead.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitCustomFieldAddedMessagePayload businessUnitCustomFieldAddedMessagePayload = BusinessUnitCustomFieldAddedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitCustomFieldAddedMessagePayloadImpl.class)
public interface BusinessUnitCustomFieldAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitCustomFieldAddedMessagePayload
     */
    String BUSINESS_UNIT_CUSTOM_FIELD_ADDED = "BusinessUnitCustomFieldAdded";

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
     * factory method
     * @return instance of BusinessUnitCustomFieldAddedMessagePayload
     */
    public static BusinessUnitCustomFieldAddedMessagePayload of() {
        return new BusinessUnitCustomFieldAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitCustomFieldAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitCustomFieldAddedMessagePayload of(
            final BusinessUnitCustomFieldAddedMessagePayload template) {
        BusinessUnitCustomFieldAddedMessagePayloadImpl instance = new BusinessUnitCustomFieldAddedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitCustomFieldAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitCustomFieldAddedMessagePayload deepCopy(
            @Nullable final BusinessUnitCustomFieldAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitCustomFieldAddedMessagePayloadImpl instance = new BusinessUnitCustomFieldAddedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitCustomFieldAddedMessagePayload
     * @return builder
     */
    public static BusinessUnitCustomFieldAddedMessagePayloadBuilder builder() {
        return BusinessUnitCustomFieldAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitCustomFieldAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitCustomFieldAddedMessagePayloadBuilder builder(
            final BusinessUnitCustomFieldAddedMessagePayload template) {
        return BusinessUnitCustomFieldAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitCustomFieldAddedMessagePayload(
            Function<BusinessUnitCustomFieldAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCustomFieldAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCustomFieldAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitCustomFieldAddedMessagePayload>";
            }
        };
    }
}
