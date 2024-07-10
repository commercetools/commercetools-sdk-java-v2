
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
 *  <p>Generated after changing an existing Custom Field on an Address of a Customer using the Set CustomField in Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddressCustomFieldChangedMessage customerAddressCustomFieldChangedMessage = CustomerAddressCustomFieldChangedMessage.builder()
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
@JsonDeserialize(as = CustomerAddressCustomFieldChangedMessageImpl.class)
public interface CustomerAddressCustomFieldChangedMessage extends Message {

    /**
     * discriminator value for CustomerAddressCustomFieldChangedMessage
     */
    String CUSTOMER_ADDRESS_CUSTOM_FIELD_CHANGED = "CustomerAddressCustomFieldChanged";

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
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action. When there has not been a Custom Field with the <code>name</code> on the Customer Address before, a Customer Address Custom Field Added Message is generated instead.</p>
     * @return previousValue
     */

    @JsonProperty("previousValue")
    public Object getPreviousValue();

    /**
     *  <p><code>id</code> of the Address of which the Custom Field was changed.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

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
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action. When there has not been a Custom Field with the <code>name</code> on the Customer Address before, a Customer Address Custom Field Added Message is generated instead.</p>
     * @param previousValue value to be set
     */

    public void setPreviousValue(final Object previousValue);

    /**
     *  <p><code>id</code> of the Address of which the Custom Field was changed.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     * factory method
     * @return instance of CustomerAddressCustomFieldChangedMessage
     */
    public static CustomerAddressCustomFieldChangedMessage of() {
        return new CustomerAddressCustomFieldChangedMessageImpl();
    }

    /**
     * factory method to create a shallow copy CustomerAddressCustomFieldChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerAddressCustomFieldChangedMessage of(final CustomerAddressCustomFieldChangedMessage template) {
        CustomerAddressCustomFieldChangedMessageImpl instance = new CustomerAddressCustomFieldChangedMessageImpl();
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
        instance.setPreviousValue(template.getPreviousValue());
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomerAddressCustomFieldChangedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerAddressCustomFieldChangedMessage deepCopy(
            @Nullable final CustomerAddressCustomFieldChangedMessage template) {
        if (template == null) {
            return null;
        }
        CustomerAddressCustomFieldChangedMessageImpl instance = new CustomerAddressCustomFieldChangedMessageImpl();
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
        instance.setPreviousValue(template.getPreviousValue());
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    /**
     * builder factory method for CustomerAddressCustomFieldChangedMessage
     * @return builder
     */
    public static CustomerAddressCustomFieldChangedMessageBuilder builder() {
        return CustomerAddressCustomFieldChangedMessageBuilder.of();
    }

    /**
     * create builder for CustomerAddressCustomFieldChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddressCustomFieldChangedMessageBuilder builder(
            final CustomerAddressCustomFieldChangedMessage template) {
        return CustomerAddressCustomFieldChangedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerAddressCustomFieldChangedMessage(
            Function<CustomerAddressCustomFieldChangedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerAddressCustomFieldChangedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerAddressCustomFieldChangedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerAddressCustomFieldChangedMessage>";
            }
        };
    }
}
