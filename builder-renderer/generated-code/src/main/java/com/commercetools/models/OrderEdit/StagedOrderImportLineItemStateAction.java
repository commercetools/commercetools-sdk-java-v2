package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.ItemState;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderImportLineItemStateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderImportLineItemStateActionImpl.class)
public interface StagedOrderImportLineItemStateAction extends StagedOrderUpdateAction {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();
   
   @NotNull
   @Valid
   @JsonProperty("state")
   public List<ItemState> getState();

   public void setLineItemId(final String lineItemId);
   
   public void setState(final List<ItemState> state);
   
   public static StagedOrderImportLineItemStateActionImpl of(){
      return new StagedOrderImportLineItemStateActionImpl();
   }
   

   public static StagedOrderImportLineItemStateActionImpl of(final StagedOrderImportLineItemStateAction template) {
      StagedOrderImportLineItemStateActionImpl instance = new StagedOrderImportLineItemStateActionImpl();
      instance.setLineItemId(template.getLineItemId());
      instance.setState(template.getState());
      return instance;
   }

}