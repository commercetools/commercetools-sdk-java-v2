
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.business_unit.Associate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Remove Associate update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAssociateRemovedMessage businessUnitAssociateRemovedMessage = BusinessUnitAssociateRemovedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .associate(associateBuilder -> associateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitAssociateRemovedMessageImpl.class)
public interface BusinessUnitAssociateRemovedMessage extends Message {

    String BUSINESS_UNIT_ASSOCIATE_REMOVED = "BusinessUnitAssociateRemoved";

    /**
     *  <p>The Associate that was removed from the Business Unit.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("associate")
    public Associate getAssociate();

    public void setAssociate(final Associate associate);

    public static BusinessUnitAssociateRemovedMessage of() {
        return new BusinessUnitAssociateRemovedMessageImpl();
    }

    public static BusinessUnitAssociateRemovedMessage of(final BusinessUnitAssociateRemovedMessage template) {
        BusinessUnitAssociateRemovedMessageImpl instance = new BusinessUnitAssociateRemovedMessageImpl();
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
        instance.setAssociate(template.getAssociate());
        return instance;
    }

    public static BusinessUnitAssociateRemovedMessageBuilder builder() {
        return BusinessUnitAssociateRemovedMessageBuilder.of();
    }

    public static BusinessUnitAssociateRemovedMessageBuilder builder(
            final BusinessUnitAssociateRemovedMessage template) {
        return BusinessUnitAssociateRemovedMessageBuilder.of(template);
    }

    default <T> T withBusinessUnitAssociateRemovedMessage(Function<BusinessUnitAssociateRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociateRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociateRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAssociateRemovedMessage>";
            }
        };
    }
}
