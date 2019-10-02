package com.commercetools.models.message;

import com.commercetools.models.discount_code.DiscountCodeReference;
import com.commercetools.models.message.Message;
import com.commercetools.models.message.OrderDiscountCodeAddedMessageImpl;

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
@JsonDeserialize(as = OrderDiscountCodeAddedMessageImpl.class)
public interface OrderDiscountCodeAddedMessage extends Message {

   
   @NotNull
   @Valid
   @JsonProperty("discountCode")
   public DiscountCodeReference getDiscountCode();

   public void setDiscountCode(final DiscountCodeReference discountCode);
   
   public static OrderDiscountCodeAddedMessageImpl of(){
      return new OrderDiscountCodeAddedMessageImpl();
   }
   

   public static OrderDiscountCodeAddedMessageImpl of(final OrderDiscountCodeAddedMessage template) {
      OrderDiscountCodeAddedMessageImpl instance = new OrderDiscountCodeAddedMessageImpl();
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
      instance.setDiscountCode(template.getDiscountCode());
      return instance;
   }

}