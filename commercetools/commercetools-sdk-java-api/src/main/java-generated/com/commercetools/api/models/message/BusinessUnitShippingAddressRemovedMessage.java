
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Remove Shipping Address Identifier update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitShippingAddressRemovedMessage businessUnitShippingAddressRemovedMessage = BusinessUnitShippingAddressRemovedMessage.builder()
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
@JsonDeserialize(as = BusinessUnitShippingAddressRemovedMessageImpl.class)
public interface BusinessUnitShippingAddressRemovedMessage extends Message {

    String BUSINESS_UNIT_SHIPPING_ADDRESS_REMOVED = "BusinessUnitShippingAddressRemoved";

    /**
     *  <p>The address that was removed from shipping addresses of the Business Unit.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static BusinessUnitShippingAddressRemovedMessage of() {
        return new BusinessUnitShippingAddressRemovedMessageImpl();
    }

    public static BusinessUnitShippingAddressRemovedMessage of(
            final BusinessUnitShippingAddressRemovedMessage template) {
        BusinessUnitShippingAddressRemovedMessageImpl instance = new BusinessUnitShippingAddressRemovedMessageImpl();
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

    public static BusinessUnitShippingAddressRemovedMessageBuilder builder() {
        return BusinessUnitShippingAddressRemovedMessageBuilder.of();
    }

    public static BusinessUnitShippingAddressRemovedMessageBuilder builder(
            final BusinessUnitShippingAddressRemovedMessage template) {
        return BusinessUnitShippingAddressRemovedMessageBuilder.of(template);
    }

    default <T> T withBusinessUnitShippingAddressRemovedMessage(
            Function<BusinessUnitShippingAddressRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitShippingAddressRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitShippingAddressRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitShippingAddressRemovedMessage>";
            }
        };
    }
}
