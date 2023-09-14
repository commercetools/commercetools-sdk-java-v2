
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
 *  <p>Generated after removing a Custom Field from an Address of a Customer using the Set CustomField in Address update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddressCustomFieldRemovedMessage customerAddressCustomFieldRemovedMessage = CustomerAddressCustomFieldRemovedMessage.builder()
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
@JsonDeserialize(as = CustomerAddressCustomFieldRemovedMessageImpl.class)
public interface CustomerAddressCustomFieldRemovedMessage extends Message {

    /**
     * discriminator value for CustomerAddressCustomFieldRemovedMessage
     */
    String CUSTOMER_ADDRESS_CUSTOM_FIELD_REMOVED = "CustomerAddressCustomFieldRemoved";

    /**
     *  <p>Name of the Custom Field that has been removed.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Name of the Custom Field that has been removed.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     * factory method
     * @return instance of CustomerAddressCustomFieldRemovedMessage
     */
    public static CustomerAddressCustomFieldRemovedMessage of() {
        return new CustomerAddressCustomFieldRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy CustomerAddressCustomFieldRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerAddressCustomFieldRemovedMessage of(final CustomerAddressCustomFieldRemovedMessage template) {
        CustomerAddressCustomFieldRemovedMessageImpl instance = new CustomerAddressCustomFieldRemovedMessageImpl();
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
     * factory method to create a deep copy of CustomerAddressCustomFieldRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerAddressCustomFieldRemovedMessage deepCopy(
            @Nullable final CustomerAddressCustomFieldRemovedMessage template) {
        if (template == null) {
            return null;
        }
        CustomerAddressCustomFieldRemovedMessageImpl instance = new CustomerAddressCustomFieldRemovedMessageImpl();
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
     * builder factory method for CustomerAddressCustomFieldRemovedMessage
     * @return builder
     */
    public static CustomerAddressCustomFieldRemovedMessageBuilder builder() {
        return CustomerAddressCustomFieldRemovedMessageBuilder.of();
    }

    /**
     * create builder for CustomerAddressCustomFieldRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddressCustomFieldRemovedMessageBuilder builder(
            final CustomerAddressCustomFieldRemovedMessage template) {
        return CustomerAddressCustomFieldRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerAddressCustomFieldRemovedMessage(
            Function<CustomerAddressCustomFieldRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerAddressCustomFieldRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerAddressCustomFieldRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerAddressCustomFieldRemovedMessage>";
            }
        };
    }
}
