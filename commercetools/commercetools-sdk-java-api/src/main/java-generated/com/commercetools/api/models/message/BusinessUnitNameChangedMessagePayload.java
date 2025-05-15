
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
 *  <p>Generated after a successful Change Name update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitNameChangedMessagePayload businessUnitNameChangedMessagePayload = BusinessUnitNameChangedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitNameChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitNameChangedMessagePayloadImpl.class)
public interface BusinessUnitNameChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitNameChangedMessagePayload
     */
    String BUSINESS_UNIT_NAME_CHANGED = "BusinessUnitNameChanged";

    /**
     *  <p>Updated name of the Business Unit.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Updated name of the Business Unit.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of BusinessUnitNameChangedMessagePayload
     */
    public static BusinessUnitNameChangedMessagePayload of() {
        return new BusinessUnitNameChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitNameChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitNameChangedMessagePayload of(final BusinessUnitNameChangedMessagePayload template) {
        BusinessUnitNameChangedMessagePayloadImpl instance = new BusinessUnitNameChangedMessagePayloadImpl();
        instance.setName(template.getName());
        return instance;
    }

    public BusinessUnitNameChangedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitNameChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitNameChangedMessagePayload deepCopy(
            @Nullable final BusinessUnitNameChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitNameChangedMessagePayloadImpl instance = new BusinessUnitNameChangedMessagePayloadImpl();
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitNameChangedMessagePayload
     * @return builder
     */
    public static BusinessUnitNameChangedMessagePayloadBuilder builder() {
        return BusinessUnitNameChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitNameChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitNameChangedMessagePayloadBuilder builder(
            final BusinessUnitNameChangedMessagePayload template) {
        return BusinessUnitNameChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitNameChangedMessagePayload(Function<BusinessUnitNameChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitNameChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitNameChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitNameChangedMessagePayload>";
            }
        };
    }
}
