package com.commercetools.api.models.order;

import com.commercetools.api.models.order.ReturnItem;
import com.commercetools.api.models.order.LineItemReturnItemImpl;

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
      instance.setId(template.getId());
      instance.setQuantity(template.getQuantity());
      instance.setComment(template.getComment());
      instance.setShipmentState(template.getShipmentState());
      instance.setPaymentState(template.getPaymentState());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLineItemId(template.getLineItemId());
      return instance;
   }

}
