package com.commercetools.api.generated.models.message;

import com.commercetools.api.generated.models.message.Message;
import com.commercetools.api.generated.models.order.ReturnInfo;
import com.commercetools.api.generated.models.message.OrderReturnInfoAddedMessageImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setReturnInfo(template.getReturnInfo());
      return instance;
   }

}