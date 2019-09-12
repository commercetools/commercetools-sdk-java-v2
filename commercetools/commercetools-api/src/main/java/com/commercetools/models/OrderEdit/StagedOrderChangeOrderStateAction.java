package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.OrderState;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderChangeOrderStateActionImpl;

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
@JsonDeserialize(as = StagedOrderChangeOrderStateActionImpl.class)
public interface StagedOrderChangeOrderStateAction extends StagedOrderUpdateAction {

   
   @NotNull
   @JsonProperty("orderState")
   public OrderState getOrderState();

   public void setOrderState(final OrderState orderState);
   
   public static StagedOrderChangeOrderStateActionImpl of(){
      return new StagedOrderChangeOrderStateActionImpl();
   }
   

   public static StagedOrderChangeOrderStateActionImpl of(final StagedOrderChangeOrderStateAction template) {
      StagedOrderChangeOrderStateActionImpl instance = new StagedOrderChangeOrderStateActionImpl();
      instance.setOrderState(template.getOrderState());
      return instance;
   }

}