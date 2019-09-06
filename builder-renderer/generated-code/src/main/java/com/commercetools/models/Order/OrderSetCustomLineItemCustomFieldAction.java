package com.commercetools.models.Order;

import com.commercetools.models.Order.OrderUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Order.OrderSetCustomLineItemCustomFieldActionImpl;

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
@JsonDeserialize(as = OrderSetCustomLineItemCustomFieldActionImpl.class)
public interface OrderSetCustomLineItemCustomFieldAction extends OrderUpdateAction {

   
   @NotNull
   @JsonProperty("customLineItemId")
   public String getCustomLineItemId();
   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   
   @JsonProperty("value")
   public Object getValue();

   public void setCustomLineItemId(final String customLineItemId);
   
   public void setName(final String name);
   
   public void setValue(final Object value);
   
   public static OrderSetCustomLineItemCustomFieldActionImpl of(){
      return new OrderSetCustomLineItemCustomFieldActionImpl();
   }
   

   public static OrderSetCustomLineItemCustomFieldActionImpl of(final OrderSetCustomLineItemCustomFieldAction template) {
      OrderSetCustomLineItemCustomFieldActionImpl instance = new OrderSetCustomLineItemCustomFieldActionImpl();
      instance.setCustomLineItemId(template.getCustomLineItemId());
      instance.setName(template.getName());
      instance.setValue(template.getValue());
      return instance;
   }

}