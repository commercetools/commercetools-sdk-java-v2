
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerAddShippingAddressIdAction" rel="nofollow">Add Shipping Address ID</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerShippingAddressAddedMessage customerShippingAddressAddedMessage = CustomerShippingAddressAddedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CustomerShippingAddressAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerShippingAddressAddedMessageImpl.class)
public interface CustomerShippingAddressAddedMessage extends Message {

    /**
     * discriminator value for CustomerShippingAddressAddedMessage
     */
    String CUSTOMER_SHIPPING_ADDRESS_ADDED = "CustomerShippingAddressAdded";

    /**
     *  <p>The address that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>shippingAddressIds</code>.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>The address that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>shippingAddressIds</code>.</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     * factory method
     * @return instance of CustomerShippingAddressAddedMessage
     */
    public static CustomerShippingAddressAddedMessage of() {
        return new CustomerShippingAddressAddedMessageImpl();
    }

    /**
     * factory method to create a shallow copy CustomerShippingAddressAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerShippingAddressAddedMessage of(final CustomerShippingAddressAddedMessage template) {
        CustomerShippingAddressAddedMessageImpl instance = new CustomerShippingAddressAddedMessageImpl();
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
        instance.setAddress(template.getAddress());
        return instance;
    }

    public CustomerShippingAddressAddedMessage copyDeep();

    /**
     * factory method to create a deep copy of CustomerShippingAddressAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerShippingAddressAddedMessage deepCopy(
            @Nullable final CustomerShippingAddressAddedMessage template) {
        if (template == null) {
            return null;
        }
        CustomerShippingAddressAddedMessageImpl instance = new CustomerShippingAddressAddedMessageImpl();
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
        instance.setAddress(com.commercetools.api.models.common.Address.deepCopy(template.getAddress()));
        return instance;
    }

    /**
     * builder factory method for CustomerShippingAddressAddedMessage
     * @return builder
     */
    public static CustomerShippingAddressAddedMessageBuilder builder() {
        return CustomerShippingAddressAddedMessageBuilder.of();
    }

    /**
     * create builder for CustomerShippingAddressAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerShippingAddressAddedMessageBuilder builder(
            final CustomerShippingAddressAddedMessage template) {
        return CustomerShippingAddressAddedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerShippingAddressAddedMessage(Function<CustomerShippingAddressAddedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerShippingAddressAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerShippingAddressAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerShippingAddressAddedMessage>";
            }
        };
    }
}
