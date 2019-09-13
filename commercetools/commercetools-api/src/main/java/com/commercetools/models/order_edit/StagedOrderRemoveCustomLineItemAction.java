package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderRemoveCustomLineItemActionImpl;

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
@JsonDeserialize(as = StagedOrderRemoveCustomLineItemActionImpl.class)
public interface StagedOrderRemoveCustomLineItemAction extends StagedOrderUpdateAction {

   
   @NotNull
   @JsonProperty("customLineItemId")
   public String getCustomLineItemId();

   public void setCustomLineItemId(final String customLineItemId);
   
   public static StagedOrderRemoveCustomLineItemActionImpl of(){
      return new StagedOrderRemoveCustomLineItemActionImpl();
   }
   

   public static StagedOrderRemoveCustomLineItemActionImpl of(final StagedOrderRemoveCustomLineItemAction template) {
      StagedOrderRemoveCustomLineItemActionImpl instance = new StagedOrderRemoveCustomLineItemActionImpl();
      instance.setCustomLineItemId(template.getCustomLineItemId());
      return instance;
   }

}