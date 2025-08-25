
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitAddShippingAddressIdAction" rel="nofollow">Add Shipping Address Identifier</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitShippingAddressAddedMessage businessUnitShippingAddressAddedMessage = BusinessUnitShippingAddressAddedMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("BusinessUnitShippingAddressAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitShippingAddressAddedMessageImpl.class)
public interface BusinessUnitShippingAddressAddedMessage extends Message {

    /**
     * discriminator value for BusinessUnitShippingAddressAddedMessage
     */
    String BUSINESS_UNIT_SHIPPING_ADDRESS_ADDED = "BusinessUnitShippingAddressAdded";

    /**
     *  <p>The address that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> as shipping address.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>The address that was added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> as shipping address.</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     * factory method
     * @return instance of BusinessUnitShippingAddressAddedMessage
     */
    public static BusinessUnitShippingAddressAddedMessage of() {
        return new BusinessUnitShippingAddressAddedMessageImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitShippingAddressAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitShippingAddressAddedMessage of(final BusinessUnitShippingAddressAddedMessage template) {
        BusinessUnitShippingAddressAddedMessageImpl instance = new BusinessUnitShippingAddressAddedMessageImpl();
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

    public BusinessUnitShippingAddressAddedMessage copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnitShippingAddressAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitShippingAddressAddedMessage deepCopy(
            @Nullable final BusinessUnitShippingAddressAddedMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitShippingAddressAddedMessageImpl instance = new BusinessUnitShippingAddressAddedMessageImpl();
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
     * builder factory method for BusinessUnitShippingAddressAddedMessage
     * @return builder
     */
    public static BusinessUnitShippingAddressAddedMessageBuilder builder() {
        return BusinessUnitShippingAddressAddedMessageBuilder.of();
    }

    /**
     * create builder for BusinessUnitShippingAddressAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitShippingAddressAddedMessageBuilder builder(
            final BusinessUnitShippingAddressAddedMessage template) {
        return BusinessUnitShippingAddressAddedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitShippingAddressAddedMessage(
            Function<BusinessUnitShippingAddressAddedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitShippingAddressAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitShippingAddressAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitShippingAddressAddedMessage>";
            }
        };
    }
}
