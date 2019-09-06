package com.commercetools.models.Order;

import com.commercetools.models.Order.OrderUpdateAction;
import com.commercetools.models.State.StateResourceIdentifier;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.Order.OrderTransitionStateActionImpl;

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
@JsonDeserialize(as = OrderTransitionStateActionImpl.class)
public interface OrderTransitionStateAction extends OrderUpdateAction {

   
   @NotNull
   @Valid
   @JsonProperty("state")
   public StateResourceIdentifier getState();
   
   
   @JsonProperty("force")
   public Boolean getForce();

   public void setState(final StateResourceIdentifier state);
   
   public void setForce(final Boolean force);
   
   public static OrderTransitionStateActionImpl of(){
      return new OrderTransitionStateActionImpl();
   }
   

   public static OrderTransitionStateActionImpl of(final OrderTransitionStateAction template) {
      OrderTransitionStateActionImpl instance = new OrderTransitionStateActionImpl();
      instance.setForce(template.getForce());
      instance.setState(template.getState());
      return instance;
   }

}