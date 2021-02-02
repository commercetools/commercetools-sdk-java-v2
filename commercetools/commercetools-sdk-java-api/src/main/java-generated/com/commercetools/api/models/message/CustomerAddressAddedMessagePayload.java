
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
@JsonDeserialize(as = CustomerAddressAddedMessagePayloadImpl.class)
public interface CustomerAddressAddedMessagePayload extends MessagePayload {

    String CUSTOMER_ADDRESS_ADDED = "CustomerAddressAdded";

    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static CustomerAddressAddedMessagePayload of() {
        return new CustomerAddressAddedMessagePayloadImpl();
    }

    public static CustomerAddressAddedMessagePayload of(final CustomerAddressAddedMessagePayload template) {
        CustomerAddressAddedMessagePayloadImpl instance = new CustomerAddressAddedMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static CustomerAddressAddedMessagePayloadBuilder builder() {
        return CustomerAddressAddedMessagePayloadBuilder.of();
    }

    public static CustomerAddressAddedMessagePayloadBuilder builder(final CustomerAddressAddedMessagePayload template) {
        return CustomerAddressAddedMessagePayloadBuilder.of(template);
    }

    default <T> T withCustomerAddressAddedMessagePayload(Function<CustomerAddressAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
