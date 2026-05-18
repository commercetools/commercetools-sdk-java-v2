
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerRemoveBillingAddressIdAction" rel="nofollow">Remove Billing Address ID</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerBillingAddressRemovedMessage customerBillingAddressRemovedMessage = CustomerBillingAddressRemovedMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("CustomerBillingAddressRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerBillingAddressRemovedMessageImpl.class)
public interface CustomerBillingAddressRemovedMessage extends Message {

    /**
     * discriminator value for CustomerBillingAddressRemovedMessage
     */
    String CUSTOMER_BILLING_ADDRESS_REMOVED = "CustomerBillingAddressRemoved";

    /**
     *  <p>The address that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>billingAddressIds</code>.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>The address that was removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> <code>billingAddressIds</code>.</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     * factory method
     * @return instance of CustomerBillingAddressRemovedMessage
     */
    public static CustomerBillingAddressRemovedMessage of() {
        return new CustomerBillingAddressRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy CustomerBillingAddressRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerBillingAddressRemovedMessage of(final CustomerBillingAddressRemovedMessage template) {
        CustomerBillingAddressRemovedMessageImpl instance = new CustomerBillingAddressRemovedMessageImpl();
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

    public CustomerBillingAddressRemovedMessage copyDeep();

    /**
     * factory method to create a deep copy of CustomerBillingAddressRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerBillingAddressRemovedMessage deepCopy(
            @Nullable final CustomerBillingAddressRemovedMessage template) {
        if (template == null) {
            return null;
        }
        CustomerBillingAddressRemovedMessageImpl instance = new CustomerBillingAddressRemovedMessageImpl();
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
     * builder factory method for CustomerBillingAddressRemovedMessage
     * @return builder
     */
    public static CustomerBillingAddressRemovedMessageBuilder builder() {
        return CustomerBillingAddressRemovedMessageBuilder.of();
    }

    /**
     * create builder for CustomerBillingAddressRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerBillingAddressRemovedMessageBuilder builder(
            final CustomerBillingAddressRemovedMessage template) {
        return CustomerBillingAddressRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerBillingAddressRemovedMessage(Function<CustomerBillingAddressRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerBillingAddressRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerBillingAddressRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerBillingAddressRemovedMessage>";
            }
        };
    }
}
