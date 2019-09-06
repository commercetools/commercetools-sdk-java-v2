package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Cart.CartSetCustomLineItemCustomFieldActionImpl;

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
@JsonDeserialize(as = CartSetCustomLineItemCustomFieldActionImpl.class)
public interface CartSetCustomLineItemCustomFieldAction extends CartUpdateAction {

   
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
   
   public static CartSetCustomLineItemCustomFieldActionImpl of(){
      return new CartSetCustomLineItemCustomFieldActionImpl();
   }
   

   public static CartSetCustomLineItemCustomFieldActionImpl of(final CartSetCustomLineItemCustomFieldAction template) {
      CartSetCustomLineItemCustomFieldActionImpl instance = new CartSetCustomLineItemCustomFieldActionImpl();
      instance.setCustomLineItemId(template.getCustomLineItemId());
      instance.setName(template.getName());
      instance.setValue(template.getValue());
      return instance;
   }

}