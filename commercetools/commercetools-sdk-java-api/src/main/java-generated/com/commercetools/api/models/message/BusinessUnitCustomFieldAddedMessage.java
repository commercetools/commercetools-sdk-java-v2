
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after adding a Custom Field to a Business Unit using the Set CustomField update action. If a Custom Field already exists with the same name, a BusinessUnitCustomFieldChanged Message is generated instead.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitCustomFieldAddedMessage businessUnitCustomFieldAddedMessage = BusinessUnitCustomFieldAddedMessage.builder()
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
@JsonDeserialize(as = BusinessUnitCustomFieldAddedMessageImpl.class)
public interface BusinessUnitCustomFieldAddedMessage extends Message {

    /**
     * discriminator value for BusinessUnitCustomFieldAddedMessage
     */
    String BUSINESS_UNIT_CUSTOM_FIELD_ADDED = "BusinessUnitCustomFieldAdded";

    /**
     *  <p>Name of the Custom Field that was added.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>The added CustomFieldValue based on the FieldType.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>Name of the Custom Field that was added.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>The added CustomFieldValue based on the FieldType.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     * factory method
     * @return instance of BusinessUnitCustomFieldAddedMessage
     */
    public static BusinessUnitCustomFieldAddedMessage of() {
        return new BusinessUnitCustomFieldAddedMessageImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitCustomFieldAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitCustomFieldAddedMessage of(final BusinessUnitCustomFieldAddedMessage template) {
        BusinessUnitCustomFieldAddedMessageImpl instance = new BusinessUnitCustomFieldAddedMessageImpl();
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
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitCustomFieldAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitCustomFieldAddedMessage deepCopy(
            @Nullable final BusinessUnitCustomFieldAddedMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitCustomFieldAddedMessageImpl instance = new BusinessUnitCustomFieldAddedMessageImpl();
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
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitCustomFieldAddedMessage
     * @return builder
     */
    public static BusinessUnitCustomFieldAddedMessageBuilder builder() {
        return BusinessUnitCustomFieldAddedMessageBuilder.of();
    }

    /**
     * create builder for BusinessUnitCustomFieldAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitCustomFieldAddedMessageBuilder builder(
            final BusinessUnitCustomFieldAddedMessage template) {
        return BusinessUnitCustomFieldAddedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitCustomFieldAddedMessage(Function<BusinessUnitCustomFieldAddedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCustomFieldAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitCustomFieldAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitCustomFieldAddedMessage>";
            }
        };
    }
}
