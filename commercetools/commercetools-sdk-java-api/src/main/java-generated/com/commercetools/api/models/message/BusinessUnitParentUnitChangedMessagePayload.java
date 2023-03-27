
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.business_unit.BusinessUnitKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Change Parent Unit update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitParentUnitChangedMessagePayload businessUnitParentUnitChangedMessagePayload = BusinessUnitParentUnitChangedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitParentUnitChangedMessagePayloadImpl.class)
public interface BusinessUnitParentUnitChangedMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitParentUnitChangedMessagePayload
     */
    String BUSINESS_UNIT_PARENT_UNIT_CHANGED = "BusinessUnitParentUnitChanged";

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
     * @return instance of BusinessUnitParentUnitChangedMessagePayload
     */
    public static BusinessUnitParentUnitChangedMessagePayload of() {
        return new BusinessUnitParentUnitChangedMessagePayloadImpl();
    }

    /**
     * factory method to copy an instance of BusinessUnitParentUnitChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitParentUnitChangedMessagePayload of(
            final BusinessUnitParentUnitChangedMessagePayload template) {
        BusinessUnitParentUnitChangedMessagePayloadImpl instance = new BusinessUnitParentUnitChangedMessagePayloadImpl();
        instance.setOldParentUnit(template.getOldParentUnit());
        instance.setNewParentUnit(template.getNewParentUnit());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitParentUnitChangedMessagePayload
     * @return builder
     */
    public static BusinessUnitParentUnitChangedMessagePayloadBuilder builder() {
        return BusinessUnitParentUnitChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitParentUnitChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitParentUnitChangedMessagePayloadBuilder builder(
            final BusinessUnitParentUnitChangedMessagePayload template) {
        return BusinessUnitParentUnitChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitParentUnitChangedMessagePayload(
            Function<BusinessUnitParentUnitChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitParentUnitChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitParentUnitChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitParentUnitChangedMessagePayload>";
            }
        };
    }
}
