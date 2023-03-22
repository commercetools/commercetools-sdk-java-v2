
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

    public void setOldParentUnit(final BusinessUnitKeyReference oldParentUnit);

    public void setNewParentUnit(final BusinessUnitKeyReference newParentUnit);

    public static BusinessUnitParentUnitChangedMessage of() {
        return new BusinessUnitParentUnitChangedMessageImpl();
    }

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

    public static BusinessUnitParentUnitChangedMessageBuilder builder() {
        return BusinessUnitParentUnitChangedMessageBuilder.of();
    }

    public static BusinessUnitParentUnitChangedMessageBuilder builder(
            final BusinessUnitParentUnitChangedMessage template) {
        return BusinessUnitParentUnitChangedMessageBuilder.of(template);
    }

    default <T> T withBusinessUnitParentUnitChangedMessage(Function<BusinessUnitParentUnitChangedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitParentUnitChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitParentUnitChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitParentUnitChangedMessage>";
            }
        };
    }
}
