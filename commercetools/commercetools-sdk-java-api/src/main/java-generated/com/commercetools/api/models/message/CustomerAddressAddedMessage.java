
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
@JsonDeserialize(as = CustomerAddressAddedMessageImpl.class)
public interface CustomerAddressAddedMessage extends Message {

    String CUSTOMER_ADDRESS_ADDED = "CustomerAddressAdded";

    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static CustomerAddressAddedMessage of() {
        return new CustomerAddressAddedMessageImpl();
    }

    public static CustomerAddressAddedMessage of(final CustomerAddressAddedMessage template) {
        CustomerAddressAddedMessageImpl instance = new CustomerAddressAddedMessageImpl();
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

    public static CustomerAddressAddedMessageBuilder builder() {
        return CustomerAddressAddedMessageBuilder.of();
    }

    public static CustomerAddressAddedMessageBuilder builder(final CustomerAddressAddedMessage template) {
        return CustomerAddressAddedMessageBuilder.of(template);
    }

    default <T> T withCustomerAddressAddedMessage(Function<CustomerAddressAddedMessage, T> helper) {
        return helper.apply(this);
    }
}
