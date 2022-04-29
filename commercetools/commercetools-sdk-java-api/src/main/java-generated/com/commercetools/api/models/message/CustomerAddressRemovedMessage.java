
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerAddressRemovedMessageImpl.class)
public interface CustomerAddressRemovedMessage extends Message {

    String CUSTOMER_ADDRESS_REMOVED = "CustomerAddressRemoved";

    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static CustomerAddressRemovedMessage of() {
        return new CustomerAddressRemovedMessageImpl();
    }

    public static CustomerAddressRemovedMessage of(final CustomerAddressRemovedMessage template) {
        CustomerAddressRemovedMessageImpl instance = new CustomerAddressRemovedMessageImpl();
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

    public static CustomerAddressRemovedMessageBuilder builder() {
        return CustomerAddressRemovedMessageBuilder.of();
    }

    public static CustomerAddressRemovedMessageBuilder builder(final CustomerAddressRemovedMessage template) {
        return CustomerAddressRemovedMessageBuilder.of(template);
    }

    default <T> T withCustomerAddressRemovedMessage(Function<CustomerAddressRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerAddressRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerAddressRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerAddressRemovedMessage>";
            }
        };
    }
}
