
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
 *     BusinessUnitParentChangedMessage businessUnitParentChangedMessage = BusinessUnitParentChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitParentChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitParentChangedMessageImpl.class)
public interface BusinessUnitParentChangedMessage extends Message {

    /**
     * discriminator value for BusinessUnitParentChangedMessage
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
     * @return instance of BusinessUnitParentChangedMessage
     */
    public static BusinessUnitParentChangedMessage of() {
        return new BusinessUnitParentChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitParentChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitParentChangedMessage of(final BusinessUnitParentChangedMessage template) {
        BusinessUnitParentChangedMessageImpl instance = new BusinessUnitParentChangedMessageImpl();
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
        instance.setOldParentUnit(template.getOldParentUnit());
        instance.setNewParentUnit(template.getNewParentUnit());
        return instance;
    }

    public BusinessUnitParentChangedMessage copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitParentChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitParentChangedMessage deepCopy(@Nullable final BusinessUnitParentChangedMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitParentChangedMessageImpl instance = new BusinessUnitParentChangedMessageImpl();
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
        instance.setOldParentUnit(
            com.commercetools.api.models.business_unit.BusinessUnitKeyReference.deepCopy(template.getOldParentUnit()));
        instance.setNewParentUnit(
            com.commercetools.api.models.business_unit.BusinessUnitKeyReference.deepCopy(template.getNewParentUnit()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitParentChangedMessage
     * @return builder
     */
    public static BusinessUnitParentChangedMessageBuilder builder() {
        return BusinessUnitParentChangedMessageBuilder.of();
    }

    /**
     * create builder for BusinessUnitParentChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitParentChangedMessageBuilder builder(final BusinessUnitParentChangedMessage template) {
        return BusinessUnitParentChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitParentChangedMessage(Function<BusinessUnitParentChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitParentChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitParentChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitParentChangedMessage>";
            }
        };
    }
}
