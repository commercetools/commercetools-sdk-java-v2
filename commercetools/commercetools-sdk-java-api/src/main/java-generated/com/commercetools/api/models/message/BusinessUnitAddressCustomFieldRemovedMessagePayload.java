
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
 *  <p>Generated after removing a Custom Field from an address of a Business Unit using the Set Address CustomField update action.</p>
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
     *  <p>Name of the Custom Field that was removed.</p>
     * @param name value to be set
     */

    public void setName(final String name);

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
        return instance;
    }

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
