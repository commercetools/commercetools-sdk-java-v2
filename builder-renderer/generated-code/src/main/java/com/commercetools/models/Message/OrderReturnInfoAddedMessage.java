package com.commercetools.models.Message;

import com.commercetools.models.Message.Message;
import com.commercetools.models.Order.ReturnInfo;
import com.commercetools.models.Message.OrderReturnInfoAddedMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OrderReturnInfoAddedMessageImpl.class)
public interface OrderReturnInfoAddedMessage extends Message {

   
   @NotNull
   @Valid
   @JsonProperty("returnInfo")
   public ReturnInfo getReturnInfo();

   public void setReturnInfo(final ReturnInfo returnInfo);
   
   public static OrderReturnInfoAddedMessageImpl of(){
      return new OrderReturnInfoAddedMessageImpl();
   }
   

   public static OrderReturnInfoAddedMessageImpl of(final OrderReturnInfoAddedMessage template) {
      OrderReturnInfoAddedMessageImpl instance = new OrderReturnInfoAddedMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      instance.setReturnInfo(template.getReturnInfo());
      return instance;
   }

}