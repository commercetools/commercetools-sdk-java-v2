package com.commercetools.api.generated.models.order_edit;

import com.commercetools.api.generated.models.order.OrderState;
import com.commercetools.api.generated.models.order.StagedOrderUpdateAction;
import com.commercetools.api.generated.models.order_edit.StagedOrderChangeOrderStateActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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