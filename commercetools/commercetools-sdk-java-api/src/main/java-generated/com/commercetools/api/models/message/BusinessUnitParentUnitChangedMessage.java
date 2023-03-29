
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
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
 *     BusinessUnitParentUnitChangedMessage businessUnitParentUnitChangedMessage = BusinessUnitParentUnitChangedMessage.builder()
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitParentUnitChangedMessageImpl.class)
public interface BusinessUnitParentUnitChangedMessage extends Message {

    /**
     * discriminator value for BusinessUnitParentUnitChangedMessage
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
     * @return instance of BusinessUnitParentUnitChangedMessage
     */
    public static BusinessUnitParentUnitChangedMessage of() {
        return new BusinessUnitParentUnitChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitParentUnitChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitParentUnitChangedMessage of(final BusinessUnitParentUnitChangedMessage template) {
        BusinessUnitParentUnitChangedMessageImpl instance = new BusinessUnitParentUnitChangedMessageImpl();
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

    /**
     * factory method to create a deep copy of BusinessUnitParentUnitChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitParentUnitChangedMessage deepCopy(
            @Nullable final BusinessUnitParentUnitChangedMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitParentUnitChangedMessageImpl instance = new BusinessUnitParentUnitChangedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(Optional.ofNullable(template.getLastModifiedBy())
                .map(com.commercetools.api.models.common.LastModifiedBy::deepCopy)
                .orElse(null));
        instance.setCreatedBy(Optional.ofNullable(template.getCreatedBy())
                .map(com.commercetools.api.models.common.CreatedBy::deepCopy)
                .orElse(null));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(Optional.ofNullable(template.getResource())
                .map(com.commercetools.api.models.common.Reference::deepCopy)
                .orElse(null));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(Optional.ofNullable(template.getResourceUserProvidedIdentifiers())
                .map(com.commercetools.api.models.message.UserProvidedIdentifiers::deepCopy)
                .orElse(null));
        instance.setOldParentUnit(Optional.ofNullable(template.getOldParentUnit())
                .map(com.commercetools.api.models.business_unit.BusinessUnitKeyReference::deepCopy)
                .orElse(null));
        instance.setNewParentUnit(Optional.ofNullable(template.getNewParentUnit())
                .map(com.commercetools.api.models.business_unit.BusinessUnitKeyReference::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitParentUnitChangedMessage
     * @return builder
     */
    public static BusinessUnitParentUnitChangedMessageBuilder builder() {
        return BusinessUnitParentUnitChangedMessageBuilder.of();
    }

    /**
     * create builder for BusinessUnitParentUnitChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitParentUnitChangedMessageBuilder builder(
            final BusinessUnitParentUnitChangedMessage template) {
        return BusinessUnitParentUnitChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitParentUnitChangedMessage(Function<BusinessUnitParentUnitChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitParentUnitChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitParentUnitChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitParentUnitChangedMessage>";
            }
        };
    }
}
