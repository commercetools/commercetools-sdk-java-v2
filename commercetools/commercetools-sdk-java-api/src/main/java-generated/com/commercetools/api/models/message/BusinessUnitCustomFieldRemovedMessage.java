
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after removing a Custom Field from a Business Unit using the Set CustomField update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitCustomFieldRemovedMessage businessUnitCustomFieldRemovedMessage = BusinessUnitCustomFieldRemovedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitCustomFieldRemovedMessageImpl.class)
public interface BusinessUnitCustomFieldRemovedMessage extends Message {

    /**
     * discriminator value for BusinessUnitCustomFieldRemovedMessage
     */
    String BUSINESS_UNIT_CUSTOM_FIELD_REMOVED = "BusinessUnitCustomFieldRemoved";

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of BusinessUnitCustomFieldRemovedMessage
     */
    public static BusinessUnitCustomFieldRemovedMessage of() {
        return new BusinessUnitCustomFieldRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitCustomFieldRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitCustomFieldRemovedMessage of(final BusinessUnitCustomFieldRemovedMessage template) {
        BusinessUnitCustomFieldRemovedMessageImpl instance = new BusinessUnitCustomFieldRemovedMessageImpl();
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
        instance.setName(template.getName());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitCustomFieldRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitCustomFieldRemovedMessage deepCopy(
            @Nullable final BusinessUnitCustomFieldRemovedMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitCustomFieldRemovedMessageImpl instance = new BusinessUnitCustomFieldRemovedMessageImpl();
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
        instance.setName(template.getName());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitCustomFieldRemovedMessage
     * @return builder
     */
    public static BusinessUnitCustomFieldRemovedMessageBuilder builder() {
        return BusinessUnitCustomFieldRemovedMessageBuilder.of();
    }

    /**
     * create builder for BusinessUnitCustomFieldRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitCustomFieldRemovedMessageBuilder builder(
            final BusinessUnitCustomFieldRemovedMessage template) {
        return BusinessUnitCustomFieldRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitCustomFieldRemovedMessage(Function<BusinessUnitCustomFieldRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCustomFieldRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCustomFieldRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitCustomFieldRemovedMessage>";
            }
        };
    }
}
