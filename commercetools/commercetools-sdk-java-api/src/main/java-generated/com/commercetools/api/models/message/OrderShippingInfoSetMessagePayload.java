package com.commercetools.api.models.message;

import com.commercetools.api.models.cart.ShippingInfo;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.OrderShippingInfoSetMessagePayloadImpl;

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
@JsonDeserialize(as = OrderShippingInfoSetMessagePayloadImpl.class)
public interface OrderShippingInfoSetMessagePayload extends MessagePayload {

    
    @Valid
    @JsonProperty("shippingInfo")
    public ShippingInfo getShippingInfo();
    
    @Valid
    @JsonProperty("oldShippingInfo")
    public ShippingInfo getOldShippingInfo();

    public void setShippingInfo(final ShippingInfo shippingInfo);
    
    public void setOldShippingInfo(final ShippingInfo oldShippingInfo);

    public static OrderShippingInfoSetMessagePayloadImpl of(){
        return new OrderShippingInfoSetMessagePayloadImpl();
    }
    

    public static OrderShippingInfoSetMessagePayloadImpl of(final OrderShippingInfoSetMessagePayload template) {
        OrderShippingInfoSetMessagePayloadImpl instance = new OrderShippingInfoSetMessagePayloadImpl();
        instance.setShippingInfo(template.getShippingInfo());
        instance.setOldShippingInfo(template.getOldShippingInfo());
        return instance;
    }

    default <T> T withOrderShippingInfoSetMessagePayload(Function<OrderShippingInfoSetMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
