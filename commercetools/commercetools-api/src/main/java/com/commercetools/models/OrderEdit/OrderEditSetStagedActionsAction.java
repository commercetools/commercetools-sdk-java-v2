package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.StagedOrderUpdateAction;
import com.commercetools.models.OrderEdit.OrderEditUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.OrderEditSetStagedActionsActionImpl;

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
@JsonDeserialize(as = OrderEditSetStagedActionsActionImpl.class)
public interface OrderEditSetStagedActionsAction extends OrderEditUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("stagedActions")
   public List<StagedOrderUpdateAction> getStagedActions();

   public void setStagedActions(final List<StagedOrderUpdateAction> stagedActions);
   
   public static OrderEditSetStagedActionsActionImpl of(){
      return new OrderEditSetStagedActionsActionImpl();
   }
   

   public static OrderEditSetStagedActionsActionImpl of(final OrderEditSetStagedActionsAction template) {
      OrderEditSetStagedActionsActionImpl instance = new OrderEditSetStagedActionsActionImpl();
      instance.setStagedActions(template.getStagedActions());
      return instance;
   }

}