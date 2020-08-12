package com.commercetools.api.models.message;

import com.commercetools.api.models.discount_code.DiscountCodeReference;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.OrderDiscountCodeRemovedMessageImpl;

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
@JsonDeserialize(as = OrderDiscountCodeRemovedMessageImpl.class)
public interface OrderDiscountCodeRemovedMessage extends Message {

   
   @NotNull
   @Valid
   @JsonProperty("discountCode")
   public DiscountCodeReference getDiscountCode();

   public void setDiscountCode(final DiscountCodeReference discountCode);
   
   public static OrderDiscountCodeRemovedMessageImpl of(){
      return new OrderDiscountCodeRemovedMessageImpl();
   }
   

   public static OrderDiscountCodeRemovedMessageImpl of(final OrderDiscountCodeRemovedMessage template) {
      OrderDiscountCodeRemovedMessageImpl instance = new OrderDiscountCodeRemovedMessageImpl();
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
      instance.setDiscountCode(template.getDiscountCode());
      return instance;
   }

}
