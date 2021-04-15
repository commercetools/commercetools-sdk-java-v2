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
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomerAddressChangedMessagePayloadImpl.class)
public interface CustomerAddressChangedMessagePayload extends MessagePayload {

    String CUSTOMER_ADDRESS_CHANGED = "CustomerAddressChanged";

    
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    
    public void setAddress(final Address address);
    

    public static CustomerAddressChangedMessagePayload of(){
        return new CustomerAddressChangedMessagePayloadImpl();
    }
    

    public static CustomerAddressChangedMessagePayload of(final CustomerAddressChangedMessagePayload template) {
        CustomerAddressChangedMessagePayloadImpl instance = new CustomerAddressChangedMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static CustomerAddressChangedMessagePayloadBuilder builder(){
        return CustomerAddressChangedMessagePayloadBuilder.of();
    }
    
    public static CustomerAddressChangedMessagePayloadBuilder builder(final CustomerAddressChangedMessagePayload template){
        return CustomerAddressChangedMessagePayloadBuilder.of(template);
    }
    

    default <T> T withCustomerAddressChangedMessagePayload(Function<CustomerAddressChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
