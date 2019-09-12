package com.commercetools.models.Message;

import com.commercetools.models.Cart.ShippingInfo;
import com.commercetools.models.Message.Message;
import com.commercetools.models.Message.OrderShippingInfoSetMessageImpl;

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
@JsonDeserialize(as = OrderShippingInfoSetMessageImpl.class)
public interface OrderShippingInfoSetMessage extends Message {

   
   @Valid
   @JsonProperty("shippingInfo")
   public ShippingInfo getShippingInfo();
   
   @Valid
   @JsonProperty("oldShippingInfo")
   public ShippingInfo getOldShippingInfo();

   public void setShippingInfo(final ShippingInfo shippingInfo);
   
   public void setOldShippingInfo(final ShippingInfo oldShippingInfo);
   
   public static OrderShippingInfoSetMessageImpl of(){
      return new OrderShippingInfoSetMessageImpl();
   }
   

   public static OrderShippingInfoSetMessageImpl of(final OrderShippingInfoSetMessage template) {
      OrderShippingInfoSetMessageImpl instance = new OrderShippingInfoSetMessageImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setType(template.getType());
      instance.setShippingInfo(template.getShippingInfo());
      instance.setOldShippingInfo(template.getOldShippingInfo());
      return instance;
   }

}