
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
 *  <p>Generated after a successful Add Associate update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAssociateAddedMessage businessUnitAssociateAddedMessage = BusinessUnitAssociateAddedMessage.builder()
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
@JsonDeserialize(as = BusinessUnitAssociateAddedMessageImpl.class)
public interface BusinessUnitAssociateAddedMessage extends Message {

    String BUSINESS_UNIT_ASSOCIATE_ADDED = "BusinessUnitAssociateAdded";

    /**
     *  <p>The Associate that was added to the Business Unit.</p>
     * @return associate
     */
    @NotNull
    @Valid
    @JsonProperty("associate")
    public Associate getAssociate();

    public void setAssociate(final Associate associate);

    public static BusinessUnitAssociateAddedMessage of() {
        return new BusinessUnitAssociateAddedMessageImpl();
    }

    public static BusinessUnitAssociateAddedMessage of(final BusinessUnitAssociateAddedMessage template) {
        BusinessUnitAssociateAddedMessageImpl instance = new BusinessUnitAssociateAddedMessageImpl();
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

    public static BusinessUnitAssociateAddedMessageBuilder builder() {
        return BusinessUnitAssociateAddedMessageBuilder.of();
    }

    public static BusinessUnitAssociateAddedMessageBuilder builder(final BusinessUnitAssociateAddedMessage template) {
        return BusinessUnitAssociateAddedMessageBuilder.of(template);
    }

    default <T> T withBusinessUnitAssociateAddedMessage(Function<BusinessUnitAssociateAddedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociateAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociateAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAssociateAddedMessage>";
            }
        };
    }
}
