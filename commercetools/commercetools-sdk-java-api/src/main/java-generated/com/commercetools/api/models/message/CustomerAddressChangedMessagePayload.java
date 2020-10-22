package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.CustomerAddressChangedMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomerAddressChangedMessagePayloadImpl.class)
public interface CustomerAddressChangedMessagePayload extends MessagePayload {

    
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    public void setAddress(final Address address);

    public static CustomerAddressChangedMessagePayloadImpl of(){
        return new CustomerAddressChangedMessagePayloadImpl();
    }
    

    public static CustomerAddressChangedMessagePayloadImpl of(final CustomerAddressChangedMessagePayload template) {
        CustomerAddressChangedMessagePayloadImpl instance = new CustomerAddressChangedMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    default <T extends Accessor<CustomerAddressChangedMessagePayload>> T withCustomerAddressChangedMessagePayload(Function<CustomerAddressChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
