package com.commercetools.api.models.message;

import com.commercetools.api.models.cart.ShippingInfo;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.OrderShippingInfoSetMessageImpl;

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
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setSequenceNumber(template.getSequenceNumber());
      instance.setResource(template.getResource());
      instance.setResourceVersion(template.getResourceVersion());
      instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
      instance.setShippingInfo(template.getShippingInfo());
      instance.setOldShippingInfo(template.getOldShippingInfo());
      return instance;
   }

}
