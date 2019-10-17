package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.OrderEditUpdateAction;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OrderEditSetStagedActionsActionImpl implements OrderEditSetStagedActionsAction {

   private String action;
   
   private java.util.List<com.commercetools.api.generated.models.order.StagedOrderUpdateAction> stagedActions;

   @JsonCreator
   OrderEditSetStagedActionsActionImpl(@JsonProperty("stagedActions") final java.util.List<com.commercetools.api.generated.models.order.StagedOrderUpdateAction> stagedActions) {
      this.stagedActions = stagedActions;
      this.action = "setStagedActions";
   }
   public OrderEditSetStagedActionsActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.order.StagedOrderUpdateAction> getStagedActions(){
      return this.stagedActions;
   }

   public void setStagedActions(final java.util.List<com.commercetools.api.generated.models.order.StagedOrderUpdateAction> stagedActions){
      this.stagedActions = stagedActions;
   }

}