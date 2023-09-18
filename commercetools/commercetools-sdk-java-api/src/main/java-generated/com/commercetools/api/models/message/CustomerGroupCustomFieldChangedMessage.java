
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
 *  <p>Generated after changing an existing Custom Field on a Customer Group using the Set CustomField update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupCustomFieldChangedMessage customerGroupCustomFieldChangedMessage = CustomerGroupCustomFieldChangedMessage.builder()
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
@JsonDeserialize(as = CustomerGroupCustomFieldChangedMessageImpl.class)
public interface CustomerGroupCustomFieldChangedMessage extends Message {

    /**
     * discriminator value for CustomerGroupCustomFieldChangedMessage
     */
    String CUSTOMER_GROUP_CUSTOM_FIELD_CHANGED = "CustomerGroupCustomFieldChanged";

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>CustomFieldValue based on the FieldType after the Set CustomField update action.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action.</p>
     * @return oldValue
     */

    @JsonProperty("oldValue")
    public Object getOldValue();

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>CustomFieldValue based on the FieldType after the Set CustomField update action.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action.</p>
     * @param oldValue value to be set
     */

    public void setOldValue(final Object oldValue);

    /**
     * factory method
     * @return instance of CustomerGroupCustomFieldChangedMessage
     */
    public static CustomerGroupCustomFieldChangedMessage of() {
        return new CustomerGroupCustomFieldChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy CustomerGroupCustomFieldChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerGroupCustomFieldChangedMessage of(final CustomerGroupCustomFieldChangedMessage template) {
        CustomerGroupCustomFieldChangedMessageImpl instance = new CustomerGroupCustomFieldChangedMessageImpl();
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
        instance.setOldValue(template.getOldValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerGroupCustomFieldChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroupCustomFieldChangedMessage deepCopy(
            @Nullable final CustomerGroupCustomFieldChangedMessage template) {
        if (template == null) {
            return null;
        }
        CustomerGroupCustomFieldChangedMessageImpl instance = new CustomerGroupCustomFieldChangedMessageImpl();
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
        instance.setOldValue(template.getOldValue());
        return instance;
    }

    /**
     * builder factory method for CustomerGroupCustomFieldChangedMessage
     * @return builder
     */
    public static CustomerGroupCustomFieldChangedMessageBuilder builder() {
        return CustomerGroupCustomFieldChangedMessageBuilder.of();
    }

    /**
     * create builder for CustomerGroupCustomFieldChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupCustomFieldChangedMessageBuilder builder(
            final CustomerGroupCustomFieldChangedMessage template) {
        return CustomerGroupCustomFieldChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupCustomFieldChangedMessage(
            Function<CustomerGroupCustomFieldChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupCustomFieldChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupCustomFieldChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupCustomFieldChangedMessage>";
            }
        };
    }
}
