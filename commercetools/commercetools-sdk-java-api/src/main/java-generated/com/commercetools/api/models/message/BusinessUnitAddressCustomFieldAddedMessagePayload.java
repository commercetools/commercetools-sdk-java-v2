
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after adding a Custom Field to an address of a Business Unit using the Set Address CustomField update action. If a Custom Field exists already exists with the same name, a BusinessUnitAddressCustomFieldChanged Message is generated instead.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddressCustomFieldAddedMessagePayload businessUnitAddressCustomFieldAddedMessagePayload = BusinessUnitAddressCustomFieldAddedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAddressCustomFieldAddedMessagePayloadImpl.class)
public interface BusinessUnitAddressCustomFieldAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitAddressCustomFieldAddedMessagePayload
     */
    String BUSINESS_UNIT_ADDRESS_CUSTOM_FIELD_ADDED = "BusinessUnitAddressCustomFieldAdded";

    /**
     *  <p>Name of the Custom Field that has been added.</p>
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
     *  <p>Name of the Custom Field that has been added.</p>
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
     * @return instance of BusinessUnitAddressCustomFieldAddedMessagePayload
     */
    public static BusinessUnitAddressCustomFieldAddedMessagePayload of() {
        return new BusinessUnitAddressCustomFieldAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitAddressCustomFieldAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAddressCustomFieldAddedMessagePayload of(
            final BusinessUnitAddressCustomFieldAddedMessagePayload template) {
        BusinessUnitAddressCustomFieldAddedMessagePayloadImpl instance = new BusinessUnitAddressCustomFieldAddedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitAddressCustomFieldAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitAddressCustomFieldAddedMessagePayload deepCopy(
            @Nullable final BusinessUnitAddressCustomFieldAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitAddressCustomFieldAddedMessagePayloadImpl instance = new BusinessUnitAddressCustomFieldAddedMessagePayloadImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAddressCustomFieldAddedMessagePayload
     * @return builder
     */
    public static BusinessUnitAddressCustomFieldAddedMessagePayloadBuilder builder() {
        return BusinessUnitAddressCustomFieldAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitAddressCustomFieldAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddressCustomFieldAddedMessagePayloadBuilder builder(
            final BusinessUnitAddressCustomFieldAddedMessagePayload template) {
        return BusinessUnitAddressCustomFieldAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAddressCustomFieldAddedMessagePayload(
            Function<BusinessUnitAddressCustomFieldAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressCustomFieldAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressCustomFieldAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAddressCustomFieldAddedMessagePayload>";
            }
        };
    }
}
