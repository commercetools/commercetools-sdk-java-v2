
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

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerSetDefaultShippingAddressAction" rel="nofollow">Set Default Shipping Address</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerDefaultShippingAddressSetMessage customerDefaultShippingAddressSetMessage = CustomerDefaultShippingAddressSetMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("CustomerDefaultShippingAddressSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerDefaultShippingAddressSetMessageImpl.class)
public interface CustomerDefaultShippingAddressSetMessage extends Message {

    /**
     * discriminator value for CustomerDefaultShippingAddressSetMessage
     */
    String CUSTOMER_DEFAULT_SHIPPING_ADDRESS_SET = "CustomerDefaultShippingAddressSet";

    /**
     *  <p>The address that was set as the default shipping address.</p>
     * @return address
     */
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>The address that was set as the default shipping address.</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     * factory method
     * @return instance of CustomerDefaultShippingAddressSetMessage
     */
    public static CustomerDefaultShippingAddressSetMessage of() {
        return new CustomerDefaultShippingAddressSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy CustomerDefaultShippingAddressSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerDefaultShippingAddressSetMessage of(final CustomerDefaultShippingAddressSetMessage template) {
        CustomerDefaultShippingAddressSetMessageImpl instance = new CustomerDefaultShippingAddressSetMessageImpl();
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

    public CustomerDefaultShippingAddressSetMessage copyDeep();

    /**
     * factory method to create a deep copy of CustomerDefaultShippingAddressSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomerDefaultShippingAddressSetMessage deepCopy(
            @Nullable final CustomerDefaultShippingAddressSetMessage template) {
        if (template == null) {
            return null;
        }
        CustomerDefaultShippingAddressSetMessageImpl instance = new CustomerDefaultShippingAddressSetMessageImpl();
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
     * builder factory method for CustomerDefaultShippingAddressSetMessage
     * @return builder
     */
    public static CustomerDefaultShippingAddressSetMessageBuilder builder() {
        return CustomerDefaultShippingAddressSetMessageBuilder.of();
    }

    /**
     * create builder for CustomerDefaultShippingAddressSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerDefaultShippingAddressSetMessageBuilder builder(
            final CustomerDefaultShippingAddressSetMessage template) {
        return CustomerDefaultShippingAddressSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerDefaultShippingAddressSetMessage(
            Function<CustomerDefaultShippingAddressSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerDefaultShippingAddressSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerDefaultShippingAddressSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerDefaultShippingAddressSetMessage>";
            }
        };
    }
}
