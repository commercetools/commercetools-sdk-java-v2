
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after removing a Custom Type from an Address of a Customer using the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetAddressCustomTypeAction" rel="nofollow">Set Custom Type in Address</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerAddressCustomTypeRemovedMessage customerAddressCustomTypeRemovedMessage = CustomerAddressCustomTypeRemovedMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("CustomerAddressCustomTypeRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerAddressCustomTypeRemovedMessageImpl.class)
public interface CustomerAddressCustomTypeRemovedMessage extends Message {

    /**
     * discriminator value for CustomerAddressCustomTypeRemovedMessage
     */
    String CUSTOMER_ADDRESS_CUSTOM_TYPE_REMOVED = "CustomerAddressCustomTypeRemoved";

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a> that was removed. Absent if there was no previous Custom Type present.</p>
     * @return previousTypeId
     */

    @JsonProperty("previousTypeId")
    public String getPreviousTypeId();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> from which the Custom Type was removed.</p>
     * @return addressId
     */

    @JsonProperty("addressId")
    public String getAddressId();

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Custom Type</a> that was removed. Absent if there was no previous Custom Type present.</p>
     * @param previousTypeId value to be set
     */

    public void setPreviousTypeId(final String previousTypeId);

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Address" rel="nofollow">Address</a> from which the Custom Type was removed.</p>
     * @param addressId value to be set
     */

    public void setAddressId(final String addressId);

    /**
     * factory method
     * @return instance of CustomerAddressCustomTypeRemovedMessage
     */
    public static CustomerAddressCustomTypeRemovedMessage of() {
        return new CustomerAddressCustomTypeRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy CustomerAddressCustomTypeRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerAddressCustomTypeRemovedMessage of(final CustomerAddressCustomTypeRemovedMessage template) {
        CustomerAddressCustomTypeRemovedMessageImpl instance = new CustomerAddressCustomTypeRemovedMessageImpl();
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
        instance.setPreviousTypeId(template.getPreviousTypeId());
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    public CustomerAddressCustomTypeRemovedMessage copyDeep();

    /**
     * factory method to create a deep copy of CustomerAddressCustomTypeRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerAddressCustomTypeRemovedMessage deepCopy(
            @Nullable final CustomerAddressCustomTypeRemovedMessage template) {
        if (template == null) {
            return null;
        }
        CustomerAddressCustomTypeRemovedMessageImpl instance = new CustomerAddressCustomTypeRemovedMessageImpl();
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
        instance.setPreviousTypeId(template.getPreviousTypeId());
        instance.setAddressId(template.getAddressId());
        return instance;
    }

    /**
     * builder factory method for CustomerAddressCustomTypeRemovedMessage
     * @return builder
     */
    public static CustomerAddressCustomTypeRemovedMessageBuilder builder() {
        return CustomerAddressCustomTypeRemovedMessageBuilder.of();
    }

    /**
     * create builder for CustomerAddressCustomTypeRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerAddressCustomTypeRemovedMessageBuilder builder(
            final CustomerAddressCustomTypeRemovedMessage template) {
        return CustomerAddressCustomTypeRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerAddressCustomTypeRemovedMessage(
            Function<CustomerAddressCustomTypeRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerAddressCustomTypeRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerAddressCustomTypeRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerAddressCustomTypeRemovedMessage>";
            }
        };
    }
}
