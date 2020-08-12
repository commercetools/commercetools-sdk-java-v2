package com.commercetools.api.models.order;

import com.commercetools.api.models.order.ReturnItem;
import com.commercetools.api.models.order.CustomLineItemReturnItemImpl;

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
      instance.setId(template.getId());
      instance.setQuantity(template.getQuantity());
      instance.setComment(template.getComment());
      instance.setShipmentState(template.getShipmentState());
      instance.setPaymentState(template.getPaymentState());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setCreatedAt(template.getCreatedAt());
      instance.setCustomLineItemId(template.getCustomLineItemId());
      return instance;
   }

}
