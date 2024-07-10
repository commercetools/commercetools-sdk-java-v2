
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
 *  <p>Generated after adding a Custom Field to an address of a Business Unit using the Set Address CustomField update action. If a Custom Field already exists with the same name, a BusinessUnitAddressCustomFieldChanged Message is generated instead.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddressCustomFieldAddedMessage businessUnitAddressCustomFieldAddedMessage = BusinessUnitAddressCustomFieldAddedMessage.builder()
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
@JsonDeserialize(as = BusinessUnitAddressCustomFieldAddedMessageImpl.class)
public interface BusinessUnitAddressCustomFieldAddedMessage extends Message {

    /**
     * discriminator value for BusinessUnitAddressCustomFieldAddedMessage
     */
    String BUSINESS_UNIT_ADDRESS_CUSTOM_FIELD_ADDED = "BusinessUnitAddressCustomFieldAdded";

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
     *  <p><code>id</code> of the Address to which the Custom Field was added.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

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
     *  <p><code>id</code> of the Address to which the Custom Field was added.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     * factory method
     * @return instance of BusinessUnitAddressCustomFieldAddedMessage
     */
    public static BusinessUnitAddressCustomFieldAddedMessage of() {
        return new BusinessUnitAddressCustomFieldAddedMessageImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitAddressCustomFieldAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitAddressCustomFieldAddedMessage of(
            final BusinessUnitAddressCustomFieldAddedMessage template) {
        BusinessUnitAddressCustomFieldAddedMessageImpl instance = new BusinessUnitAddressCustomFieldAddedMessageImpl();
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
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    /**
     * factory method to create a deep copy of BusinessUnitAddressCustomFieldAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitAddressCustomFieldAddedMessage deepCopy(
            @Nullable final BusinessUnitAddressCustomFieldAddedMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitAddressCustomFieldAddedMessageImpl instance = new BusinessUnitAddressCustomFieldAddedMessageImpl();
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
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    /**
     * builder factory method for BusinessUnitAddressCustomFieldAddedMessage
     * @return builder
     */
    public static BusinessUnitAddressCustomFieldAddedMessageBuilder builder() {
        return BusinessUnitAddressCustomFieldAddedMessageBuilder.of();
    }

    /**
     * create builder for BusinessUnitAddressCustomFieldAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddressCustomFieldAddedMessageBuilder builder(
            final BusinessUnitAddressCustomFieldAddedMessage template) {
        return BusinessUnitAddressCustomFieldAddedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitAddressCustomFieldAddedMessage(
            Function<BusinessUnitAddressCustomFieldAddedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressCustomFieldAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitAddressCustomFieldAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitAddressCustomFieldAddedMessage>";
            }
        };
    }
}
