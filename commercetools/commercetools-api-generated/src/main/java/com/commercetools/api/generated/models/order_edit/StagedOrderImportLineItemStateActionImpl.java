package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.ItemState;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StagedOrderImportLineItemStateActionImpl implements StagedOrderImportLineItemStateAction {

   private String action;
   
   private String lineItemId;
   
   private java.util.List<com.commercetools.api.generated.models.order.ItemState> state;

   @JsonCreator
   StagedOrderImportLineItemStateActionImpl(@JsonProperty("lineItemId") final String lineItemId, @JsonProperty("state") final java.util.List<com.commercetools.api.generated.models.order.ItemState> state) {
      this.lineItemId = lineItemId;
      this.state = state;
      this.action = "importLineItemState";
   }
   public StagedOrderImportLineItemStateActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public String getLineItemId(){
      return this.lineItemId;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.order.ItemState> getState(){
      return this.state;
   }

   public void setLineItemId(final String lineItemId){
      this.lineItemId = lineItemId;
   }
   
   public void setState(final java.util.List<com.commercetools.api.generated.models.order.ItemState> state){
      this.state = state;
   }

}