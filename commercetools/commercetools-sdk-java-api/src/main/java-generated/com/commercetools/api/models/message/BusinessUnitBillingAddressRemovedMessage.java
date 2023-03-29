
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Remove Billing Address Identifier update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitBillingAddressRemovedMessage businessUnitBillingAddressRemovedMessage = BusinessUnitBillingAddressRemovedMessage.builder()
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = BusinessUnitBillingAddressRemovedMessageImpl.class)
public interface BusinessUnitBillingAddressRemovedMessage extends Message {

    /**
     * discriminator value for BusinessUnitBillingAddressRemovedMessage
     */
    String BUSINESS_UNIT_BILLING_ADDRESS_REMOVED = "BusinessUnitBillingAddressRemoved";

    /**
     *  <p>The address that was removed from the billing addresses of the Business Unit.</p>
     * @return address
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    /**
     *  <p>The address that was removed from the billing addresses of the Business Unit.</p>
     * @param address value to be set
     */

    public void setAddress(final Address address);

    /**
     * factory method
     * @return instance of BusinessUnitBillingAddressRemovedMessage
     */
    public static BusinessUnitBillingAddressRemovedMessage of() {
        return new BusinessUnitBillingAddressRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy BusinessUnitBillingAddressRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static BusinessUnitBillingAddressRemovedMessage of(final BusinessUnitBillingAddressRemovedMessage template) {
        BusinessUnitBillingAddressRemovedMessageImpl instance = new BusinessUnitBillingAddressRemovedMessageImpl();
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

    /**
     * factory method to create a deep copy of BusinessUnitBillingAddressRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnitBillingAddressRemovedMessage deepCopy(
            @Nullable final BusinessUnitBillingAddressRemovedMessage template) {
        if (template == null) {
            return null;
        }
        BusinessUnitBillingAddressRemovedMessageImpl instance = new BusinessUnitBillingAddressRemovedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(Optional.ofNullable(template.getLastModifiedBy())
                .map(com.commercetools.api.models.common.LastModifiedBy::deepCopy)
                .orElse(null));
        instance.setCreatedBy(Optional.ofNullable(template.getCreatedBy())
                .map(com.commercetools.api.models.common.CreatedBy::deepCopy)
                .orElse(null));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(Optional.ofNullable(template.getResource())
                .map(com.commercetools.api.models.common.Reference::deepCopy)
                .orElse(null));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(Optional.ofNullable(template.getResourceUserProvidedIdentifiers())
                .map(com.commercetools.api.models.message.UserProvidedIdentifiers::deepCopy)
                .orElse(null));
        instance.setAddress(Optional.ofNullable(template.getAddress())
                .map(com.commercetools.api.models.common.Address::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for BusinessUnitBillingAddressRemovedMessage
     * @return builder
     */
    public static BusinessUnitBillingAddressRemovedMessageBuilder builder() {
        return BusinessUnitBillingAddressRemovedMessageBuilder.of();
    }

    /**
     * create builder for BusinessUnitBillingAddressRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitBillingAddressRemovedMessageBuilder builder(
            final BusinessUnitBillingAddressRemovedMessage template) {
        return BusinessUnitBillingAddressRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnitBillingAddressRemovedMessage(
            Function<BusinessUnitBillingAddressRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitBillingAddressRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitBillingAddressRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitBillingAddressRemovedMessage>";
            }
        };
    }
}
