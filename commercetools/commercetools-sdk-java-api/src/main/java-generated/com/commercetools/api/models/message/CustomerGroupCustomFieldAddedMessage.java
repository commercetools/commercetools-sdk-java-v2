
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
 *  <p>Generated after adding a Custom Field to a Customer Group using the Set CustomField update action. If a Custom Field already exists with the same name, a CustomerGroupCustomFieldChanged Message is generated instead.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupCustomFieldAddedMessage customerGroupCustomFieldAddedMessage = CustomerGroupCustomFieldAddedMessage.builder()
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
@JsonDeserialize(as = CustomerGroupCustomFieldAddedMessageImpl.class)
public interface CustomerGroupCustomFieldAddedMessage extends Message {

    /**
     * discriminator value for CustomerGroupCustomFieldAddedMessage
     */
    String CUSTOMER_GROUP_CUSTOM_FIELD_ADDED = "CustomerGroupCustomFieldAdded";

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
     * @return instance of CustomerGroupCustomFieldAddedMessage
     */
    public static CustomerGroupCustomFieldAddedMessage of() {
        return new CustomerGroupCustomFieldAddedMessageImpl();
    }

    /**
     * factory method to create a shallow copy CustomerGroupCustomFieldAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerGroupCustomFieldAddedMessage of(final CustomerGroupCustomFieldAddedMessage template) {
        CustomerGroupCustomFieldAddedMessageImpl instance = new CustomerGroupCustomFieldAddedMessageImpl();
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
     * factory method to create a deep copy of CustomerGroupCustomFieldAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroupCustomFieldAddedMessage deepCopy(
            @Nullable final CustomerGroupCustomFieldAddedMessage template) {
        if (template == null) {
            return null;
        }
        CustomerGroupCustomFieldAddedMessageImpl instance = new CustomerGroupCustomFieldAddedMessageImpl();
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
     * builder factory method for CustomerGroupCustomFieldAddedMessage
     * @return builder
     */
    public static CustomerGroupCustomFieldAddedMessageBuilder builder() {
        return CustomerGroupCustomFieldAddedMessageBuilder.of();
    }

    /**
     * create builder for CustomerGroupCustomFieldAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupCustomFieldAddedMessageBuilder builder(
            final CustomerGroupCustomFieldAddedMessage template) {
        return CustomerGroupCustomFieldAddedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupCustomFieldAddedMessage(Function<CustomerGroupCustomFieldAddedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupCustomFieldAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupCustomFieldAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupCustomFieldAddedMessage>";
            }
        };
    }
}
