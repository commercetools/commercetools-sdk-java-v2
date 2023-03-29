
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
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

    /**
     * discriminator value for BusinessUnitAssociateRemovedMessage
     */
    String BUSINESS_UNIT_ASSOCIATE_REMOVED = "BusinessUnitAssociateRemoved";

    /**
     *  <p>The Associate that was removed from the Business Unit.</p>
     * @return associate
     */
    @NotNull
    @Valid
    @JsonProperty("associate")
    public Associate getAssociate();

    /**
     *  <p>The Associate that was removed from the Business Unit.</p>
     * @param associate value to be set
     */

    public void setAssociate(final Associate associate);

    /**
     * factory method
     * @return instance of BusinessUnitAssociateRemovedMessage
     */
    public static BusinessUnitAssociateRemovedMessage of() {
        return new BusinessUnitAssociateRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitAssociateRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
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

    /**
     * factory method to create a deep copy of BusinessUnitAssociateRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitAssociateRemovedMessage deepCopy(
            @Nullable final BusinessUnitAssociateRemovedMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitAssociateRemovedMessageImpl instance = new BusinessUnitAssociateRemovedMessageImpl();
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
        instance.setAssociate(Optional.ofNullable(template.getAssociate())
                .map(com.commercetools.api.models.business_unit.Associate::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAssociateRemovedMessage
     * @return builder
     */
    public static BusinessUnitAssociateRemovedMessageBuilder builder() {
        return BusinessUnitAssociateRemovedMessageBuilder.of();
    }

    /**
     * create builder for BusinessUnitAssociateRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAssociateRemovedMessageBuilder builder(
            final BusinessUnitAssociateRemovedMessage template) {
        return BusinessUnitAssociateRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAssociateRemovedMessage(Function<BusinessUnitAssociateRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociateRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociateRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAssociateRemovedMessage>";
            }
        };
    }
}
