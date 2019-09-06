package com.commercetools.models.OrderEdit;

import com.commercetools.models.OrderEdit.OrderEditUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.OrderEdit.OrderEditSetCustomFieldActionImpl;

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
@JsonDeserialize(as = OrderEditSetCustomFieldActionImpl.class)
public interface OrderEditSetCustomFieldAction extends OrderEditUpdateAction {

   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   
   @JsonProperty("value")
   public Object getValue();

   public void setName(final String name);
   
   public void setValue(final Object value);
   
   public static OrderEditSetCustomFieldActionImpl of(){
      return new OrderEditSetCustomFieldActionImpl();
   }
   

   public static OrderEditSetCustomFieldActionImpl of(final OrderEditSetCustomFieldAction template) {
      OrderEditSetCustomFieldActionImpl instance = new OrderEditSetCustomFieldActionImpl();
      instance.setName(template.getName());
      instance.setValue(template.getValue());
      return instance;
   }

}