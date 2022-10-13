
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

    String BUSINESS_UNIT_BILLING_ADDRESS_REMOVED = "BusinessUnitBillingAddressRemoved";

    /**
     *  <p>The address that was removed from the billing addresses of the Business Unit.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static BusinessUnitBillingAddressRemovedMessage of() {
        return new BusinessUnitBillingAddressRemovedMessageImpl();
    }

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

    public static BusinessUnitBillingAddressRemovedMessageBuilder builder() {
        return BusinessUnitBillingAddressRemovedMessageBuilder.of();
    }

    public static BusinessUnitBillingAddressRemovedMessageBuilder builder(
            final BusinessUnitBillingAddressRemovedMessage template) {
        return BusinessUnitBillingAddressRemovedMessageBuilder.of(template);
    }

    default <T> T withBusinessUnitBillingAddressRemovedMessage(
            Function<BusinessUnitBillingAddressRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnitBillingAddressRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnitBillingAddressRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnitBillingAddressRemovedMessage>";
            }
        };
    }
}
