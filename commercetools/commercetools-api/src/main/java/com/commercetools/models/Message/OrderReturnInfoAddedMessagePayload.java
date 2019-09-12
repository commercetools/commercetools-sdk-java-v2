package com.commercetools.models.Message;

import com.commercetools.models.Message.MessagePayload;
import com.commercetools.models.Order.ReturnInfo;
import java.lang.String;
import com.commercetools.models.Message.OrderReturnInfoAddedMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderReturnInfoAddedMessagePayloadImpl.class)
public interface OrderReturnInfoAddedMessagePayload extends MessagePayload {

   
   @NotNull
   @Valid
   @JsonProperty("returnInfo")
   public ReturnInfo getReturnInfo();

   public void setReturnInfo(final ReturnInfo returnInfo);
   
   public static OrderReturnInfoAddedMessagePayloadImpl of(){
      return new OrderReturnInfoAddedMessagePayloadImpl();
   }
   

   public static OrderReturnInfoAddedMessagePayloadImpl of(final OrderReturnInfoAddedMessagePayload template) {
      OrderReturnInfoAddedMessagePayloadImpl instance = new OrderReturnInfoAddedMessagePayloadImpl();
      instance.setReturnInfo(template.getReturnInfo());
      return instance;
   }

}