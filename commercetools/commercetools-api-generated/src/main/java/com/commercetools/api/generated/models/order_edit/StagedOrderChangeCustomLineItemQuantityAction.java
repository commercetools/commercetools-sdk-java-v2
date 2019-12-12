package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangeCustomLineItemQuantityActionImpl;

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
@JsonDeserialize(as = StagedOrderChangeCustomLineItemQuantityActionImpl.class)
public interface StagedOrderChangeCustomLineItemQuantityAction extends StagedOrderUpdateAction {

   
   @NotNull
   @JsonProperty("customLineItemId")
   public String getCustomLineItemId();
   
   @NotNull
   @JsonProperty("quantity")
   public Integer getQuantity();

   public void setCustomLineItemId(final String customLineItemId);
   
   public void setQuantity(final Integer quantity);
   
   public static StagedOrderChangeCustomLineItemQuantityActionImpl of(){
      return new StagedOrderChangeCustomLineItemQuantityActionImpl();
   }
   

   public static StagedOrderChangeCustomLineItemQuantityActionImpl of(final StagedOrderChangeCustomLineItemQuantityAction template) {
      StagedOrderChangeCustomLineItemQuantityActionImpl instance = new StagedOrderChangeCustomLineItemQuantityActionImpl();
      instance.setCustomLineItemId(template.getCustomLineItemId());
      instance.setQuantity(template.getQuantity());
      return instance;
   }

}