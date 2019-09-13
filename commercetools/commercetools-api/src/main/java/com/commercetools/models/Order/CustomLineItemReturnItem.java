package com.commercetools.models.order;

import com.commercetools.models.order.ReturnItem;
import java.lang.String;
import com.commercetools.models.order.CustomLineItemReturnItemImpl;

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
@JsonDeserialize(as = CustomLineItemReturnItemImpl.class)
public interface CustomLineItemReturnItem extends ReturnItem {

   
   @NotNull
   @JsonProperty("customLineItemId")
   public String getCustomLineItemId();

   public void setCustomLineItemId(final String customLineItemId);
   
   public static CustomLineItemReturnItemImpl of(){
      return new CustomLineItemReturnItemImpl();
   }
   

   public static CustomLineItemReturnItemImpl of(final CustomLineItemReturnItem template) {
      CustomLineItemReturnItemImpl instance = new CustomLineItemReturnItemImpl();
      instance.setShipmentState(template.getShipmentState());
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setQuantity(template.getQuantity());
      instance.setComment(template.getComment());
      instance.setId(template.getId());
      instance.setPaymentState(template.getPaymentState());
      instance.setCustomLineItemId(template.getCustomLineItemId());
      return instance;
   }

}