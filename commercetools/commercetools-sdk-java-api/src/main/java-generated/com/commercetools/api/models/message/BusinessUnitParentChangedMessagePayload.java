
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnitKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 *  <p>Generated after a successful Change Parent Unit update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitParentChangedMessagePayload businessUnitParentChangedMessagePayload = BusinessUnitParentChangedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitParentChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitParentChangedMessagePayloadImpl.class)
public interface BusinessUnitParentChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitParentChangedMessagePayload
     */
    String BUSINESS_UNIT_PARENT_CHANGED = "BusinessUnitParentChanged";

    /**
     *  <p>Parent unit of the Business Unit before the Change Parent Unit update action.</p>
     * @return oldParentUnit
     */
    @Valid
    @JsonProperty("oldParentUnit")
    public BusinessUnitKeyReference getOldParentUnit();

    /**
     *  <p>Parent unit of the Business Unit after the Change Parent Unit update action.</p>
     * @return newParentUnit
     */
    @Valid
    @JsonProperty("newParentUnit")
    public BusinessUnitKeyReference getNewParentUnit();

    /**
     *  <p>Parent unit of the Business Unit before the Change Parent Unit update action.</p>
     * @param oldParentUnit value to be set
     */

    public void setOldParentUnit(final BusinessUnitKeyReference oldParentUnit);

    /**
     *  <p>Parent unit of the Business Unit after the Change Parent Unit update action.</p>
     * @param newParentUnit value to be set
     */

    public void setNewParentUnit(final BusinessUnitKeyReference newParentUnit);

    /**
     * factory method
     * @return instance of BusinessUnitParentChangedMessagePayload
     */
    public static BusinessUnitParentChangedMessagePayload of() {
        return new BusinessUnitParentChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitParentChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitParentChangedMessagePayload of(final BusinessUnitParentChangedMessagePayload template) {
        BusinessUnitParentChangedMessagePayloadImpl instance = new BusinessUnitParentChangedMessagePayloadImpl();
        instance.setOldParentUnit(template.getOldParentUnit());
        instance.setNewParentUnit(template.getNewParentUnit());
        return instance;
    }

    public BusinessUnitParentChangedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitParentChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitParentChangedMessagePayload deepCopy(
            @Nullable final BusinessUnitParentChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitParentChangedMessagePayloadImpl instance = new BusinessUnitParentChangedMessagePayloadImpl();
        instance.setOldParentUnit(
            com.commercetools.api.models.business_unit.BusinessUnitKeyReference.deepCopy(template.getOldParentUnit()));
        instance.setNewParentUnit(
            com.commercetools.api.models.business_unit.BusinessUnitKeyReference.deepCopy(template.getNewParentUnit()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitParentChangedMessagePayload
     * @return builder
     */
    public static BusinessUnitParentChangedMessagePayloadBuilder builder() {
        return BusinessUnitParentChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitParentChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitParentChangedMessagePayloadBuilder builder(
            final BusinessUnitParentChangedMessagePayload template) {
        return BusinessUnitParentChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitParentChangedMessagePayload(
            Function<BusinessUnitParentChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitParentChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitParentChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitParentChangedMessagePayload>";
            }
        };
    }
}
