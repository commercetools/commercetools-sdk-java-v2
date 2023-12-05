
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
 *  <p>Generated after removing a Custom Field from a Business Unit using the Set CustomField update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitCustomFieldRemovedMessagePayload businessUnitCustomFieldRemovedMessagePayload = BusinessUnitCustomFieldRemovedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitCustomFieldRemovedMessagePayloadImpl.class)
public interface BusinessUnitCustomFieldRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitCustomFieldRemovedMessagePayload
     */
    String BUSINESS_UNIT_CUSTOM_FIELD_REMOVED = "BusinessUnitCustomFieldRemoved";

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of BusinessUnitCustomFieldRemovedMessagePayload
     */
    public static BusinessUnitCustomFieldRemovedMessagePayload of() {
        return new BusinessUnitCustomFieldRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitCustomFieldRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitCustomFieldRemovedMessagePayload of(
            final BusinessUnitCustomFieldRemovedMessagePayload template) {
        BusinessUnitCustomFieldRemovedMessagePayloadImpl instance = new BusinessUnitCustomFieldRemovedMessagePayloadImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitCustomFieldRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitCustomFieldRemovedMessagePayload deepCopy(
            @Nullable final BusinessUnitCustomFieldRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitCustomFieldRemovedMessagePayloadImpl instance = new BusinessUnitCustomFieldRemovedMessagePayloadImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitCustomFieldRemovedMessagePayload
     * @return builder
     */
    public static BusinessUnitCustomFieldRemovedMessagePayloadBuilder builder() {
        return BusinessUnitCustomFieldRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitCustomFieldRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitCustomFieldRemovedMessagePayloadBuilder builder(
            final BusinessUnitCustomFieldRemovedMessagePayload template) {
        return BusinessUnitCustomFieldRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitCustomFieldRemovedMessagePayload(
            Function<BusinessUnitCustomFieldRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCustomFieldRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCustomFieldRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitCustomFieldRemovedMessagePayload>";
            }
        };
    }
}
