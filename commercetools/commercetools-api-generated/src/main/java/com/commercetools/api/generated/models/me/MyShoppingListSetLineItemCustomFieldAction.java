package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.generated.models.me.MyShoppingListSetLineItemCustomFieldActionImpl;

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
@JsonDeserialize(as = MyShoppingListSetLineItemCustomFieldActionImpl.class)
public interface MyShoppingListSetLineItemCustomFieldAction extends MyShoppingListUpdateAction {

   
   @NotNull
   @JsonProperty("lineItemId")
   public String getLineItemId();
   
   @NotNull
   @JsonProperty("name")
   public String getName();
   
   
   @JsonProperty("value")
   public Object getValue();

   public void setLineItemId(final String lineItemId);
   
   public void setName(final String name);
   
   public void setValue(final Object value);
   
   public static MyShoppingListSetLineItemCustomFieldActionImpl of(){
      return new MyShoppingListSetLineItemCustomFieldActionImpl();
   }
   

   public static MyShoppingListSetLineItemCustomFieldActionImpl of(final MyShoppingListSetLineItemCustomFieldAction template) {
      MyShoppingListSetLineItemCustomFieldActionImpl instance = new MyShoppingListSetLineItemCustomFieldActionImpl();
      instance.setLineItemId(template.getLineItemId());
      instance.setName(template.getName());
      instance.setValue(template.getValue());
      return instance;
   }

}