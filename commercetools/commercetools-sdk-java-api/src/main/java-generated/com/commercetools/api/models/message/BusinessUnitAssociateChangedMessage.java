
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.Associate;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Change Associate update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAssociateChangedMessage businessUnitAssociateChangedMessage = BusinessUnitAssociateChangedMessage.builder()
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
@JsonDeserialize(as = BusinessUnitAssociateChangedMessageImpl.class)
public interface BusinessUnitAssociateChangedMessage extends Message {

    /**
     * discriminator value for BusinessUnitAssociateChangedMessage
     */
    String BUSINESS_UNIT_ASSOCIATE_CHANGED = "BusinessUnitAssociateChanged";

    /**
     *  <p>The Associate that was updated.</p>
     * @return associate
     */
    @NotNull
    @Valid
    @JsonProperty("associate")
    public Associate getAssociate();

    /**
     *  <p>The Associate that was updated.</p>
     * @param associate value to be set
     */

    public void setAssociate(final Associate associate);

    /**
     * factory method
     * @return instance of BusinessUnitAssociateChangedMessage
     */
    public static BusinessUnitAssociateChangedMessage of() {
        return new BusinessUnitAssociateChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitAssociateChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAssociateChangedMessage of(final BusinessUnitAssociateChangedMessage template) {
        BusinessUnitAssociateChangedMessageImpl instance = new BusinessUnitAssociateChangedMessageImpl();
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
     * factory method to create a deep copy of BusinessUnitAssociateChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitAssociateChangedMessage deepCopy(
            @Nullable final BusinessUnitAssociateChangedMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitAssociateChangedMessageImpl instance = new BusinessUnitAssociateChangedMessageImpl();
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
        instance.setAssociate(com.commercetools.api.models.business_unit.Associate.deepCopy(template.getAssociate()));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAssociateChangedMessage
     * @return builder
     */
    public static BusinessUnitAssociateChangedMessageBuilder builder() {
        return BusinessUnitAssociateChangedMessageBuilder.of();
    }

    /**
     * create builder for BusinessUnitAssociateChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAssociateChangedMessageBuilder builder(
            final BusinessUnitAssociateChangedMessage template) {
        return BusinessUnitAssociateChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAssociateChangedMessage(Function<BusinessUnitAssociateChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociateChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAssociateChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAssociateChangedMessage>";
            }
        };
    }
}
