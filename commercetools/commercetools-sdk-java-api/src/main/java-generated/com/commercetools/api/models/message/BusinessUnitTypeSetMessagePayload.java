
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnitKeyReference;
import com.commercetools.api.models.business_unit.BusinessUnitType;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Set Unit Type update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitTypeSetMessagePayload businessUnitTypeSetMessagePayload = BusinessUnitTypeSetMessagePayload.builder()
 *             .unitType(BusinessUnitType.COMPANY)
 *             .oldUnitType(BusinessUnitType.COMPANY)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitTypeSetMessagePayloadImpl.class)
public interface BusinessUnitTypeSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for BusinessUnitTypeSetMessagePayload
     */
    String BUSINESS_UNIT_TYPE_SET = "BusinessUnitTypeSet";

    /**
     *  <p>Parent unit of the Business Unit after the Set Unit Type update action.</p>
     * @return parentUnit
     */
    @Valid
    @JsonProperty("parentUnit")
    public BusinessUnitKeyReference getParentUnit();

    /**
     *  <p>Parent unit of the Business Unit before the Set Unit Type update action.</p>
     * @return oldParentUnit
     */
    @Valid
    @JsonProperty("oldParentUnit")
    public BusinessUnitKeyReference getOldParentUnit();

    /**
     *  <p>Type of the Business Unit after the Set Unit Type update action.</p>
     * @return unitType
     */
    @NotNull
    @JsonProperty("unitType")
    public BusinessUnitType getUnitType();

    /**
     *  <p>Type of the Business Unit before the Set Unit Type update action.</p>
     * @return oldUnitType
     */
    @NotNull
    @JsonProperty("oldUnitType")
    public BusinessUnitType getOldUnitType();

    /**
     *  <p>Parent unit of the Business Unit after the Set Unit Type update action.</p>
     * @param parentUnit value to be set
     */

    public void setParentUnit(final BusinessUnitKeyReference parentUnit);

    /**
     *  <p>Parent unit of the Business Unit before the Set Unit Type update action.</p>
     * @param oldParentUnit value to be set
     */

    public void setOldParentUnit(final BusinessUnitKeyReference oldParentUnit);

    /**
     *  <p>Type of the Business Unit after the Set Unit Type update action.</p>
     * @param unitType value to be set
     */

    public void setUnitType(final BusinessUnitType unitType);

    /**
     *  <p>Type of the Business Unit before the Set Unit Type update action.</p>
     * @param oldUnitType value to be set
     */

    public void setOldUnitType(final BusinessUnitType oldUnitType);

    /**
     * factory method
     * @return instance of BusinessUnitTypeSetMessagePayload
     */
    public static BusinessUnitTypeSetMessagePayload of() {
        return new BusinessUnitTypeSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitTypeSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitTypeSetMessagePayload of(final BusinessUnitTypeSetMessagePayload template) {
        BusinessUnitTypeSetMessagePayloadImpl instance = new BusinessUnitTypeSetMessagePayloadImpl();
        instance.setParentUnit(template.getParentUnit());
        instance.setOldParentUnit(template.getOldParentUnit());
        instance.setUnitType(template.getUnitType());
        instance.setOldUnitType(template.getOldUnitType());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitTypeSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitTypeSetMessagePayload deepCopy(
            @Nullable final BusinessUnitTypeSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        BusinessUnitTypeSetMessagePayloadImpl instance = new BusinessUnitTypeSetMessagePayloadImpl();
        instance.setParentUnit(
            com.commercetools.api.models.business_unit.BusinessUnitKeyReference.deepCopy(template.getParentUnit()));
        instance.setOldParentUnit(
            com.commercetools.api.models.business_unit.BusinessUnitKeyReference.deepCopy(template.getOldParentUnit()));
        instance.setUnitType(template.getUnitType());
        instance.setOldUnitType(template.getOldUnitType());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitTypeSetMessagePayload
     * @return builder
     */
    public static BusinessUnitTypeSetMessagePayloadBuilder builder() {
        return BusinessUnitTypeSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for BusinessUnitTypeSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitTypeSetMessagePayloadBuilder builder(final BusinessUnitTypeSetMessagePayload template) {
        return BusinessUnitTypeSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitTypeSetMessagePayload(Function<BusinessUnitTypeSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitTypeSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitTypeSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitTypeSetMessagePayload>";
            }
        };
    }
}
