
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
 *     BusinessUnitTypeSetMessage businessUnitTypeSetMessage = BusinessUnitTypeSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .unitType(BusinessUnitType.COMPANY)
 *             .oldUnitType(BusinessUnitType.COMPANY)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitTypeSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitTypeSetMessageImpl.class)
public interface BusinessUnitTypeSetMessage extends Message {

    /**
     * discriminator value for BusinessUnitTypeSetMessage
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
     * @return instance of BusinessUnitTypeSetMessage
     */
    public static BusinessUnitTypeSetMessage of() {
        return new BusinessUnitTypeSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitTypeSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitTypeSetMessage of(final BusinessUnitTypeSetMessage template) {
        BusinessUnitTypeSetMessageImpl instance = new BusinessUnitTypeSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setParentUnit(template.getParentUnit());
        instance.setOldParentUnit(template.getOldParentUnit());
        instance.setUnitType(template.getUnitType());
        instance.setOldUnitType(template.getOldUnitType());
        return instance;
    }

    public BusinessUnitTypeSetMessage copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitTypeSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitTypeSetMessage deepCopy(@Nullable final BusinessUnitTypeSetMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitTypeSetMessageImpl instance = new BusinessUnitTypeSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setParentUnit(
            com.commercetools.api.models.business_unit.BusinessUnitKeyReference.deepCopy(template.getParentUnit()));
        instance.setOldParentUnit(
            com.commercetools.api.models.business_unit.BusinessUnitKeyReference.deepCopy(template.getOldParentUnit()));
        instance.setUnitType(template.getUnitType());
        instance.setOldUnitType(template.getOldUnitType());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitTypeSetMessage
     * @return builder
     */
    public static BusinessUnitTypeSetMessageBuilder builder() {
        return BusinessUnitTypeSetMessageBuilder.of();
    }

    /**
     * create builder for BusinessUnitTypeSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitTypeSetMessageBuilder builder(final BusinessUnitTypeSetMessage template) {
        return BusinessUnitTypeSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitTypeSetMessage(Function<BusinessUnitTypeSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitTypeSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitTypeSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitTypeSetMessage>";
            }
        };
    }
}
