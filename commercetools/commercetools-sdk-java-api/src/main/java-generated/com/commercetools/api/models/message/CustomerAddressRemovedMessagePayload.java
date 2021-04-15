package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.CustomerAddressRemovedMessagePayloadImpl;

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
@JsonDeserialize(as = CustomerAddressRemovedMessagePayloadImpl.class)
public interface CustomerAddressRemovedMessagePayload extends MessagePayload {

    String CUSTOMER_ADDRESS_REMOVED = "CustomerAddressRemoved";

    
    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    
    public void setAddress(final Address address);
    

    public static CustomerAddressRemovedMessagePayload of(){
        return new CustomerAddressRemovedMessagePayloadImpl();
    }
    

    public static CustomerAddressRemovedMessagePayload of(final CustomerAddressRemovedMessagePayload template) {
        CustomerAddressRemovedMessagePayloadImpl instance = new CustomerAddressRemovedMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        return instance;
    }

    public static CustomerAddressRemovedMessagePayloadBuilder builder(){
        return CustomerAddressRemovedMessagePayloadBuilder.of();
    }
    
    public static CustomerAddressRemovedMessagePayloadBuilder builder(final CustomerAddressRemovedMessagePayload template){
        return CustomerAddressRemovedMessagePayloadBuilder.of(template);
    }
    

    default <T> T withCustomerAddressRemovedMessagePayload(Function<CustomerAddressRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
