package com.commercetools.api.models.message;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.OrderShippingAddressSetMessagePayloadImpl;

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
@JsonDeserialize(as = OrderShippingAddressSetMessagePayloadImpl.class)
public interface OrderShippingAddressSetMessagePayload extends MessagePayload {

    
    @Valid
    @JsonProperty("address")
    public Address getAddress();
    
    @Valid
    @JsonProperty("oldAddress")
    public Address getOldAddress();

    public void setAddress(final Address address);
    
    public void setOldAddress(final Address oldAddress);

    public static OrderShippingAddressSetMessagePayloadImpl of(){
        return new OrderShippingAddressSetMessagePayloadImpl();
    }
    

    public static OrderShippingAddressSetMessagePayloadImpl of(final OrderShippingAddressSetMessagePayload template) {
        OrderShippingAddressSetMessagePayloadImpl instance = new OrderShippingAddressSetMessagePayloadImpl();
        instance.setAddress(template.getAddress());
        instance.setOldAddress(template.getOldAddress());
        return instance;
    }

    default <T> T withOrderShippingAddressSetMessagePayload(Function<OrderShippingAddressSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
