package com.commercetools.models.order;

import com.commercetools.models.order.ReturnItem;
import java.lang.String;
import com.commercetools.models.order.LineItemReturnItemImpl;

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
@JsonDeserialize(as = LineItemReturnItemImpl.class)
public interface LineItemReturnItem extends ReturnItem {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();

   public void setLineItemId(final String lineItemId);
   
   public static LineItemReturnItemImpl of(){
      return new LineItemReturnItemImpl();
   }
   

   public static LineItemReturnItemImpl of(final LineItemReturnItem template) {
      LineItemReturnItemImpl instance = new LineItemReturnItemImpl();
      instance.setShipmentState(template.getShipmentState());
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setQuantity(template.getQuantity());
      instance.setComment(template.getComment());
      instance.setId(template.getId());
      instance.setPaymentState(template.getPaymentState());
      instance.setLineItemId(template.getLineItemId());
      return instance;
   }

}