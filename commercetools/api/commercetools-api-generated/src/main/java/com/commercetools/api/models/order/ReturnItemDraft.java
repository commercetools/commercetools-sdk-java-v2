package com.commercetools.api.models.order;

import com.commercetools.api.models.order.ReturnShipmentState;
import com.commercetools.api.models.order.ReturnItemDraftImpl;

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
@JsonDeserialize(as = ReturnItemDraftImpl.class)
public interface ReturnItemDraft  {


   @NotNull
   @JsonProperty("quantity")
   public Long getQuantity();


   @JsonProperty("lineItemId")
   public String getLineItemId();


   @JsonProperty("customLineItemId")
   public String getCustomLineItemId();


   @JsonProperty("comment")
   public String getComment();

   @NotNull
   @JsonProperty("shipmentState")
   public ReturnShipmentState getShipmentState();

   public void setQuantity(final Long quantity);

   public void setLineItemId(final String lineItemId);

   public void setCustomLineItemId(final String customLineItemId);

   public void setComment(final String comment);

   public void setShipmentState(final ReturnShipmentState shipmentState);

   public static ReturnItemDraftImpl of(){
      return new ReturnItemDraftImpl();
   }


   public static ReturnItemDraftImpl of(final ReturnItemDraft template) {
      ReturnItemDraftImpl instance = new ReturnItemDraftImpl();
      instance.setShipmentState(template.getShipmentState());
      instance.setCustomLineItemId(template.getCustomLineItemId());
      instance.setQuantity(template.getQuantity());
      instance.setLineItemId(template.getLineItemId());
      instance.setComment(template.getComment());
      return instance;
   }

}
