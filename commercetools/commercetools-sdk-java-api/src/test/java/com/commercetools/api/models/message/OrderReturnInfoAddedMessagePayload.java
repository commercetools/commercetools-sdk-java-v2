package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.order.ReturnInfo;
import com.commercetools.api.models.message.OrderReturnInfoAddedMessagePayloadImpl;

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
@JsonDeserialize(as = OrderReturnInfoAddedMessagePayloadImpl.class)
public interface OrderReturnInfoAddedMessagePayload extends MessagePayload {

    String RETURN_INFO_ADDED = "ReturnInfoAdded";

    
    @NotNull
    @Valid
    @JsonProperty("returnInfo")
    public ReturnInfo getReturnInfo();

    
    public void setReturnInfo(final ReturnInfo returnInfo);
    

    public static OrderReturnInfoAddedMessagePayload of(){
        return new OrderReturnInfoAddedMessagePayloadImpl();
    }
    

    public static OrderReturnInfoAddedMessagePayload of(final OrderReturnInfoAddedMessagePayload template) {
        OrderReturnInfoAddedMessagePayloadImpl instance = new OrderReturnInfoAddedMessagePayloadImpl();
        instance.setReturnInfo(template.getReturnInfo());
        return instance;
    }

    public static OrderReturnInfoAddedMessagePayloadBuilder builder(){
        return OrderReturnInfoAddedMessagePayloadBuilder.of();
    }
    
    public static OrderReturnInfoAddedMessagePayloadBuilder builder(final OrderReturnInfoAddedMessagePayload template){
        return OrderReturnInfoAddedMessagePayloadBuilder.of(template);
    }
    

    default <T> T withOrderReturnInfoAddedMessagePayload(Function<OrderReturnInfoAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
