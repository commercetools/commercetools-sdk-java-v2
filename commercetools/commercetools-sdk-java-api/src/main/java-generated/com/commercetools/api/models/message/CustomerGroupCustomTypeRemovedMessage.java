
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after removing a Custom Type from a Customer Group using the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroupSetCustomTypeAction" rel="nofollow">Set Custom Type</a> update action with empty parameters.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerGroupCustomTypeRemovedMessage customerGroupCustomTypeRemovedMessage = CustomerGroupCustomTypeRemovedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerGroupCustomTypeRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerGroupCustomTypeRemovedMessageImpl.class)
public interface CustomerGroupCustomTypeRemovedMessage extends Message {

    /**
     * discriminator value for CustomerGroupCustomTypeRemovedMessage
     */
    String CUSTOMER_GROUP_CUSTOM_TYPE_REMOVED = "CustomerGroupCustomTypeRemoved";

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a> that was removed. Absent if there was no previous Custom Type present.</p>
     * @return oldTypeId
     */

    @JsonProperty("oldTypeId")
    public String getOldTypeId();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a> that was removed. Absent if there was no previous Custom Type present.</p>
     * @param oldTypeId value to be set
     */

    public void setOldTypeId(final String oldTypeId);

    /**
     * factory method
     * @return instance of CustomerGroupCustomTypeRemovedMessage
     */
    public static CustomerGroupCustomTypeRemovedMessage of() {
        return new CustomerGroupCustomTypeRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy CustomerGroupCustomTypeRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerGroupCustomTypeRemovedMessage of(final CustomerGroupCustomTypeRemovedMessage template) {
        CustomerGroupCustomTypeRemovedMessageImpl instance = new CustomerGroupCustomTypeRemovedMessageImpl();
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
        instance.setOldTypeId(template.getOldTypeId());
        return instance;
    }

    public CustomerGroupCustomTypeRemovedMessage copyDeep();

    /**
     * factory method to create a deep copy of CustomerGroupCustomTypeRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerGroupCustomTypeRemovedMessage deepCopy(
            @Nullable final CustomerGroupCustomTypeRemovedMessage template) {
        if (template == null) {
            return null;
        }
        CustomerGroupCustomTypeRemovedMessageImpl instance = new CustomerGroupCustomTypeRemovedMessageImpl();
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
        instance.setOldTypeId(template.getOldTypeId());
        return instance;
    }

    /**
     * builder factory method for CustomerGroupCustomTypeRemovedMessage
     * @return builder
     */
    public static CustomerGroupCustomTypeRemovedMessageBuilder builder() {
        return CustomerGroupCustomTypeRemovedMessageBuilder.of();
    }

    /**
     * create builder for CustomerGroupCustomTypeRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerGroupCustomTypeRemovedMessageBuilder builder(
            final CustomerGroupCustomTypeRemovedMessage template) {
        return CustomerGroupCustomTypeRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerGroupCustomTypeRemovedMessage(Function<CustomerGroupCustomTypeRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerGroupCustomTypeRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerGroupCustomTypeRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerGroupCustomTypeRemovedMessage>";
            }
        };
    }
}
